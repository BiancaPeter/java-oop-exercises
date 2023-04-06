package exercitii.company;

public class Department {
    private String departmentName;

    private Employee[] employees;

    private int numberOfEmployeesInDepartment;

    public Department(String departmentName, Employee[] employees, int numberOfEmployeesInDepartment) {
        this.departmentName = departmentName;
        this.employees = employees;
        this.numberOfEmployeesInDepartment = numberOfEmployeesInDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployeesInDepartment() {
        return numberOfEmployeesInDepartment;
    }

    public void setNumberOfEmployeesInDepartment(int numberOfEmployeesInDepartment) {
        this.numberOfEmployeesInDepartment = numberOfEmployeesInDepartment;
    }

    //4. scrie un program care afiseaza numarul de angajati din departament
    public void printNumberOfEmployees() {
        System.out.println(this.numberOfEmployeesInDepartment);
    }

    //5. scrie o metoda care printeaza toti angajatii din departament
    public void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            employees[i].printEmployeeName();
        }
    }

    //6. scrie o metoda care printeaza toate strazile adreselor angajatilor din departament
    public void printAllEmployeesStreets() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getAddress().getStreet());
//            employees[i].printEmployeeStreet();
        }
    }

    //7. scrie o metoda care cauta un anumit angajat dupa nume in departament, si ii afiseaza numele daca il gaseste
    public Employee findEmployeeByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getFirstName())) {
                return employees[i];
            }
        }
        return new Employee("", "", 0, new Address("", "", 0));
    }

    //8. scrie o metoda care printeaza adresa unui anumit angajat din departament
    public Address findEmployeeAddressByName(String name) {
        Employee foundEmployees = findEmployeeByName(name);
        return foundEmployees.getAddress();
//        for (int i = 0; i < employees.length; i++) {
//            if (name.equals(employees[i].getFirstName())) {
//                return employees[i].getAddress();
//            }
//        }
//        return new Address("", "", 0);
    }

    //9. scrie o metoda care cauta o adresa (dupa strada) in lista de angajati a departamentului, si ii afiseaza strada daca o gaseste
    public Address findEmployeeAddressByStreet(String street) {
        for (int i = 0; i < employees.length; i++) {
            if (street.equals(employees[i].getAddress().getStreet())) {
                return employees[i].getAddress();
            }
        }
        return new Address("", "", 0);
    }

}

