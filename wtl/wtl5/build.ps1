# Build and Deploy Script for E-bookshop (Windows Version)

$TOMCAT_PATH = "C:\xampp\tomcat"
$JDK_PATH = "C:\Program Files\Java\jdk1.8.0_481"
$PROJECT_ROOT = Get-Location
$WEB_INF_LIB = Join-Path $PROJECT_ROOT "webapp\WEB-INF\lib"
$WEB_INF_CLASSES = Join-Path $PROJECT_ROOT "webapp\WEB-INF\classes"
$SERVLET_API = Join-Path $TOMCAT_PATH "lib\servlet-api.jar"
$DEPLOY_PATH = Join-Path $TOMCAT_PATH "webapps\wtl5"

# 1. Ensure directories exist
if (-not (Test-Path $WEB_INF_LIB)) {
    New-Item -ItemType Directory -Path $WEB_INF_LIB
}

# 2. Download MySQL Connector and JSTL if missing
$MYSQL_JAR = Join-Path $WEB_INF_LIB "mysql-connector-j-8.3.0.jar"
$JSTL_JAR = Join-Path $WEB_INF_LIB "jstl-1.2.jar"

if (-not (Test-Path $MYSQL_JAR)) {
    Write-Host "Downloading MySQL Connector..."
    Invoke-WebRequest -Uri "https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.3.0/mysql-connector-j-8.3.0.jar" -OutFile $MYSQL_JAR
}

if (-not (Test-Path $JSTL_JAR)) {
    Write-Host "Downloading JSTL 1.2..."
    Invoke-WebRequest -Uri "https://repo1.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar" -OutFile $JSTL_JAR
}

# 3. Clean up
Write-Host "Cleaning up project..."
if (Test-Path $WEB_INF_CLASSES) {
    Remove-Item -Recurse -Force "$WEB_INF_CLASSES\*"
} else {
    New-Item -ItemType Directory -Path $WEB_INF_CLASSES
}

# 4. Compile Java Source
Write-Host "Compiling Java source files..."
$SOURCE_FILES = Get-ChildItem -Path (Join-Path $PROJECT_ROOT "src\main\java") -Filter *.java -Recurse | Select-Object -ExpandProperty FullName
$CLASSPATH = "$SERVLET_API;$MYSQL_JAR"

$JAVAC = Join-Path $JDK_PATH "bin\javac.exe"

& $JAVAC -cp "$CLASSPATH" -d "$WEB_INF_CLASSES" $SOURCE_FILES

if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed!" -ForegroundColor Red
    exit 1
}

# 5. Deploy to Tomcat
Write-Host "Deploying to Tomcat ($DEPLOY_PATH)..."
if (Test-Path $DEPLOY_PATH) {
    Remove-Item -Recurse -Force $DEPLOY_PATH
}
New-Item -ItemType Directory -Path $DEPLOY_PATH

Copy-Item -Path (Join-Path $PROJECT_ROOT "webapp\*") -Destination $DEPLOY_PATH -Recurse

Write-Host "Deployment complete! Visit http://localhost:8080/wtl5" -ForegroundColor Green
