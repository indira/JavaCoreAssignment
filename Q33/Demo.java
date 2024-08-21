/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q33;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static void show(Employee employee) {
        employee.display();
    }

    public static void process(Employee employee) {
        employee.setId(101);
        employee.setName("Sam");
        employee.setSal(1000);
    }

    public static void main(String[] args) {
        //create empty employee object here
        Employee employee = new Employee();
        //add data into that empty object using process method
        process(employee);
        //display employee object with data in show method
        show(employee);
    }

}

class Employee {

    private int id;
    private String name;
    private int sal;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.sal = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void display() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee name:" + name);
        System.out.println("Employee sal:" + sal);

    }
}
