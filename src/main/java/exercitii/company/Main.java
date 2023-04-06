package exercitii.company;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Cluj-Napoca", "Republicii", 43);
        Address address2 = new Address("Cluj-Napoca", "Frunzisului", 33);
        Address address3 = new Address("Cluj-Napoca", "Observatorului", 50);
        Address address4 = new Address("Cluj-Napoca", "Eroilor", 72);
        Address address5 = new Address("Cluj-Napoca", "Primaverii", 25);
        Address address6 = new Address("Cluj-Napoca", "Fagului", 3);
        Employee employee1 = new Employee("Andrei", "Popescu", 7500, address1);
        Employee employee2 = new Employee("Ana", "Sandu", 8500, address2);
        Employee employee3 = new Employee("Mihai", "Farcas", 9500, address3);
        Employee employee4 = new Employee("Mihaela", "Ionescu", 10500, address4);
        Employee employee5 = new Employee("Eugen", "Borza", 11500, address5);
        Employee employee6 = new Employee("Alina", "Suciu", 12500, address6);
        Employee[] salesEmployees = new Employee[]{employee1, employee2, employee3};
        Employee[] techEmployees = new Employee[]{employee4, employee5, employee6};
        Department salesDepartment = new Department("vanzari", salesEmployees, 3);
        Department techDepartment = new Department("tehnologie", techEmployees, 3);
        Department[] companyDepartments = new Department[]{salesDepartment, techDepartment};
        Company company = new Company("JustCodeIT", 2021, companyDepartments, 2);
//        employee1.printEmployeeName();
//        employee2.printEmployeeStreet();
//        employee3.printEmployeeAddress();
//        salesDepartment.printNumberOfEmployees();
//        salesDepartment.printAllEmployees();
//        salesDepartment.printAllEmployeesStreets();
//        System.out.println(salesDepartment.findEmployeeAddressByName("Ana"));
//        System.out.println(salesDepartment.findEmployeeAddressByStreet("Republicii"));
        company.printAllDepartments();
        company.printAllEmployeesByDepartment("vanzari");
        company.printNumberOfEmployeesByDepartment("vanzari");
        company.printEmployeeStreetByDepartment("tehnologie");
        System.out.println(company.printStreetByEmployee("Andrei"));
        System.out.println(company.findEmployeeByNameAndDepartment("Andrei", "vanzari"));
        System.out.println(company.findEmployeeByNameAndDepartment("Andrei", "tehnologie"));
        company.printAllEmployeesfromCompany();
        System.out.println(company.printTotalNumberOfEmployees());
        System.out.println(company.findEmployeeByName("Alina"));
        System.out.println(company.findEmployeeWithHighestSalaryInTheCompany());
        System.out.println(company.findEmployeeWithBiggestSalaryInACertainDepartment("vanzari"));
        System.out.println(company.findEmployeeWithLowestSalaryInTheCompany());
    }
}
