class MaharashtraGov {
    String stateName = "Maharashtra";
    String governmentType = "State Government";

    void showGovernmentInfo() {
        System.out.println("State Name: " + stateName);
        System.out.println("Government Type: " + governmentType);
    }
}

class EducationDepartment extends MaharashtraGov {
    void conductExams() {
        System.out.println("Education Department conducts exams.");
    }
}

class PoliceDepartment extends MaharashtraGov {
    void maintainSecurity() {
        System.out.println("Police Department maintains security.");
    }
}

class AgricultureDepartment extends MaharashtraGov {
    void supportFarmers() {
        System.out.println("Agriculture Department supports farmers.");
    }
}

class hierarchicalInher {

    public static void main(String[] args) {

        EducationDepartment e = new EducationDepartment();
        PoliceDepartment p = new PoliceDepartment();
        AgricultureDepartment a = new AgricultureDepartment();

        System.out.println("Education Department");
        e.showGovernmentInfo();
        e.conductExams();

        System.out.println();

        System.out.println("Police Department");
        p.showGovernmentInfo();
        p.maintainSecurity();

        System.out.println();

        System.out.println("Agriculture Department");
        a.showGovernmentInfo();
        a.supportFarmers();
    }
}
