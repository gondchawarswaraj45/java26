# AuraBooks | Premium E-bookshop

This project is a Java-based E-bookshop web application built with Servlets, JSPs, and MySQL. It features a modern Glassmorphism UI and a clean architecture.

## 🛠️ Prerequisites

Before you begin, ensure you have the following installed on your **Windows** machine:

1.  **Java Development Kit (JDK 8 or higher)**:
    - Path: `C:\Program Files\Java\jdk1.8.0_481` (or your specific version)
2.  **MySQL Server**:
    - Ensure MySQL is running.
3.  **Apache Tomcat (contained in XAMPP)**:
    - Path: `C:\xampp\tomcat`

## 🚀 How to Run the Project

Follow these steps to build and run the application:

### 1. Database Setup
1.  Open your MySQL client (e.g., MySQL Workbench or Command Line).
2.  Run the contents of [schema.sql](file:///c:/Users/hp/Desktop/JUST/just1/WTL/WTL/wtl5/schema.sql) to create the `ebookshop_db` database and populate initial data.

### 2. Build the Application
Open **PowerShell** in the `wtl5` directory and run the build script:

```powershell
.\build.ps1
```

This script will:
- Download missing JAR dependencies (MySQL Connector & JSTL).
- Compile all Java source files.
- Automatically deploy the compiled application to the Tomcat `webapps` folder.

### 3. Start Tomcat
1.  Open the **XAMPP Control Panel**.
2.  Start the **Tomcat** module.
    - *Alternatively, run `C:\xampp\tomcat\bin\startup.bat` from PowerShell.*

### 4. Access the Website
Once Tomcat has started, open your web browser and navigate to:

[**http://localhost:8080/wtl5**](http://localhost:8080/wtl5)

## 📁 Project Structure

- `src/main/java`: Java source files (Servlets, DAOs, Models).
- `webapp/`: Web assets (JSPs, CSS, JS, Images).
- `webapp/WEB-INF/lib`: External JAR dependencies.
- `build.ps1`: Windows PowerShell script for build and deployment.
- `schema.sql`: Database schema and initial seed data.

## 🔑 Default Credentials
- **Admin Username**: `admin`
- **Admin Password**: `admin123`
