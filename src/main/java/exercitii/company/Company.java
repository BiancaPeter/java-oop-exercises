package exercitii.company;

public class Company {
    private String name;
    private int yearFounded;
    private Department[] departments;

    private int numberOfDepartments;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartments) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    //10. scrie o metoda care printeaza toate departamentele din companie
    public void printAllDepartments() {
        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i]);
        }
    }

    //11. scrie o metoda care printeaza toti angajatii dintr-un anumit departament din companie
    public Department findDepartmentByName(String departmentName) {
        for (int i = 0; i < departments.length; i++) {
            if (departmentName.equals(departments[i].getDepartmentName())) {
                return departments[i];
            }
        }
        return new Department("", new Employee[10], 0);
    }

    public void printAllEmployeesByDepartment(String departmentName) {
        Department foundDepartment = findDepartmentByName(departmentName);
        for (int i = 0; i < foundDepartment.getEmployees().length; i++) {
            System.out.println(foundDepartment.getEmployees()[i]);
        }
    }

    //12. scrie o metoda care printeaza cati angajati are un anumit departament din companie
    public void printNumberOfEmployeesByDepartment(String departmentName) {
        Department foundDepartment = findDepartmentByName(departmentName);
        foundDepartment.printNumberOfEmployees();
    }

    //14. scrie o metoda care printeaza toate strazile adreselor angajatilor dintr-un anumit departament din companie
    public void printEmployeeStreetByDepartment(String departmentName) {
        Department foundDepartment = findDepartmentByName(departmentName);
        for (int i = 0; i < foundDepartment.getEmployees().length; i++) {
            System.out.println(foundDepartment.getEmployees()[i].getAddress().getStreet());
        }
    }

    //15. scrie o metoda care printeaza strada adresei unui anumit angajat din companie
    public String printStreetByEmployee(String employeeName) {
//        for (int i = 0; i < departments.length; i++) {
//            for (int j = 0; j < departments[i].getEmployees().length; j++) {
//                if (employeeName.equals(departments[i].getEmployees()[j].getFirstName())) {
//                    return departments[i].getEmployees()[j].getAddress().getStreet();
//                }
//            }
//        }
//        return "";
        for (int i = 0; i < departments.length; i++) {
            Employee foundEmployee = departments[i].findEmployeeByName(employeeName);
            if (!"".equals(foundEmployee.getFirstName())) {
                return foundEmployee.getAddress().getStreet();
            }
        }
        return "";
    }

    //17. scrie o metoda care cauta un angajat (dupa nume) intr-un anumit departament din companie si ii afiseaza numele, daca il gaseste
    public Employee findEmployeeByNameAndDepartment(String employeeName, String departmentName) {
//        for (int i = 0; i < departments.length; i++) {
//            if (departmentName.equals(departments[i].getDepartmentName())) {
//                Department foundDepartment = departments[i];
//                for (int j = 0; j < foundDepartment.getEmployees().length; j++) {
//                    if (employeeName.equals(foundDepartment.getEmployees()[j].getFirstName())) {
//                        Employee foundEmployee = foundDepartment.getEmployees()[j];
//                        return foundEmployee;
//                    }
//                }
//            }
//        }
//        return new Employee("","",0,new Address("","",0));

        Department foundDepartment = findDepartmentByName(departmentName);
        Employee foundEmployee = foundDepartment.findEmployeeByName(employeeName);
        if (!"".equals(foundEmployee.getFirstName())) {
            return foundEmployee;
        }
        return new Employee("", "", 0, new Address("", "", 0));
    }

    //18. scrie o metoda care printeaza toti angajatii din toate departamentele din companie
    public void printAllEmployeesfromCompany() {
        for (int i = 0; i < departments.length; i++) {
            Department currentDepartment = departments[i];
            for (int j = 0; j < currentDepartment.getEmployees().length; j++) {
                System.out.println(currentDepartment.getEmployees()[j]);
            }
        }
    }

    //19. scrie o metoda care printeaza numarul total de angajati din toate departamentele din companie
    public int printTotalNumberOfEmployees() {
        int totalNumberOfEmployee = 0;
        for (int i = 0; i < departments.length; i++) {
            totalNumberOfEmployee += departments[i].getNumberOfEmployeesInDepartment();
        }
        return totalNumberOfEmployee;
    }

    //20. scrie o metoda care cauta un angajat in toate departamentele din companie si ii afiseaza numele, daca il gaseste
    public String findEmployeeByName(String employeeName) {
        for (int i = 0; i < departments.length; i++) {
            Department currentDepartment = departments[i];
//            for (int j = 0; j < currentDepartment.getEmployees().length; j++) {
//                if (employeeName.equals(currentDepartment.getEmployees()[j].getFirstName())) {
//                    return currentDepartment.getEmployees()[j].getFirstName();
//                }
//            }
            Employee foundEmployee = currentDepartment.findEmployeeByName(employeeName);
            if (!"".equals(foundEmployee.getFirstName())) {
                return foundEmployee.getFirstName();
            }
        }
        return "";
    }

    //21. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu dintr-un anumit departament
    public String findEmployeeWithBiggestSalaryInACertainDepartment(String departmentName) {
        Employee maxSalaryEmployee = new Employee("", "", 0, new Address("", "", 0));
        Department foundDepartment = findDepartmentByName(departmentName);
        for (int i = 0; i < foundDepartment.getEmployees().length; i++) {
            if (maxSalaryEmployee.getSalary() < foundDepartment.getEmployees()[i].getSalary()) {
                maxSalaryEmployee = foundDepartment.getEmployees()[i];
            }
        }
        return maxSalaryEmployee.getFirstName();
    }

    //22. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu din companie
    public String findEmployeeWithHighestSalaryInTheCompany() {
        Employee maxSalaryEmployee = new Employee("", "", 0, new Address("", "", 0));
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments[i].getEmployees().length; j++) {
                if (maxSalaryEmployee.getSalary() < departments[i].getEmployees()[j].getSalary()) {
                    maxSalaryEmployee = departments[i].getEmployees()[j];
                }
            }
        }
        return maxSalaryEmployee.getFirstName();
    }

    //23. scrie o metoda care printeaza numele angajatului cu cel mai mic salariu din companie
    public String findEmployeeWithLowestSalaryInTheCompany() {
        Employee minSalaryEmployee = new Employee("", "", Integer.MAX_VALUE, new Address("", "", 0));
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments[i].getEmployees().length; j++) {
                if (minSalaryEmployee.getSalary() > departments[i].getEmployees()[j].getSalary()) {
                    minSalaryEmployee = departments[i].getEmployees()[j];
                }
            }
        }
        return minSalaryEmployee.getFirstName();
    }
}
