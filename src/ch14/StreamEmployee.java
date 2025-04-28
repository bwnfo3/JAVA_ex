package ch14;
import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String department;
    private int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() { return this.name;}
    public String getDepartment() { return this.department;}
    public int getSalary() { return this.salary;}
}
class StreamEmployee {
    public static void main(String[] args) {
        List<Employee> Employees = new ArrayList<>();
        Employees.add(new Employee("김똥개", "디자인부",3000));
        Employees.add(new Employee("어쩌구", "디자인부",4000));
        Employees.add(new Employee("박수고", "마케팅부",5500));
        Employees.add(new Employee("자바씨", "마케팅부",2200));
        Employees.add(new Employee("누구임", "마케팅부",5200));
        Employees.add(new Employee("최노트", "회계부",6200));

        Map<String, Double> getDisAverage = Employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingInt(Employee::getSalary)
                    ));
        System.out.println(getDisAverage);
    }
}
