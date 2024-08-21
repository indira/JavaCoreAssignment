/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q25;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static void m1(Object o) {
        //Type casting of Employee
        Employee e = (Employee) o;
        System.out.println("Employee Id: " + e.getId());
        System.out.println("Employee name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSal());
    }

    public static void main(String[] args) {
        //create Employee object here with 101,sam,1000 data
        Employee employee = new Employee(101, "sam", 1000);
        //call m1 method by passing this Employee object
        m1(employee);
    }

}
