package ua.lesson6.demo;

public class Demo {

    private static final int BONUS = 200;

    public static void main(String[] args) {
        Employee employee = new Employee("seller", "Tom", 1000);
        int workYears = 5;

        Demo demo = new Demo();
        demo.hendleSalaru(employee, workYears);
        demo.changePosition(employee, "Manager");

        System.out.println("Employee");
    }

    public void hendleSalaru(Employee employee, int workYears){
        int totalBonus = workYears * BONUS;
        int newSalary = employee.getSalary() + totalBonus;
        employee.setSalary(newSalary);
    }

    public void changePosition(Employee employee, String pos){
        employee.setPosition(pos);
    }
}
