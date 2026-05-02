class Employee {

    static String companyName;

    String empName;

    static {
        companyName = "GlobalTech Solutions";
        System.out.println("Static block");
    }

    static void showCompany() {
        System.out.println("Company Name is: " + companyName);
    }

    {
        System.out.println("Employee Object Created");
    }

    Employee(String name) {
        empName = name;
    }

    void showEmployee() {
        System.out.println("Employee name is: " + empName);
    }

    public static void main(String[] args) {

        Employee.showCompany();
        System.out.println();

        Employee em = new Employee("Rohan");
        em.showEmployee();
        System.out.println();

        Employee e1 = new Employee("Swaraj");
        e1.showEmployee();
    }
}
