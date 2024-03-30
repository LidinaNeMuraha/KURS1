public class Main {
    public static void printEmployeeNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return totalSalary / count;
    }
    public static void findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        System.out.println("Employee with maximal salary: " + maxSalaryEmployee.toString());
    }
    public static void findMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        System.out.println("Employee with minimal salary: " + minSalaryEmployee.toString());
    }
    public static double calculateTotalSalary() {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }
    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Василий Пупкин", 1, 2000);
        employees[1] = new Employee("Григорий Смирнов", 2, 2500);
        employees[2] = new Employee("Александр Шикунец", 3, 3000);
        employees[3] = new Employee("Иоан Вассерман", 1, 2100);
        employees[4] = new Employee("Аркадий Смирнов", 2, 2200);

        System.out.println("Total monthly salary costs: " + calculateTotalSalary());
        findMinSalaryEmployee();
        findMaxSalaryEmployee();
        System.out.println("Average salary: " + calculateAverageSalary());
        printAllEmployees();
        printEmployeeNames();

    }
    }
