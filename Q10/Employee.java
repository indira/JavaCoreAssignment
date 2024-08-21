/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q10;

/**
 *
 * @author lenovo
 */
class Employee {

    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public static void main(String[] args) {
        //create Employee object with 101,sam,1000 data
        Employee employee = new Employee(101, "sam", 1000);
        //display this object data by passing to show method
        employee.show(employee);
        //add 100 bonus in salary 
        employee.setSal(employee.sal + 100);
        //display this object data by passing to show method
        employee.show(employee);
    }
     public void show(Employee employee) {
        System.out.println("Employee id is: " + employee.id);
        System.out.println("Employee name is: " + employee.name);
        System.out.println("Employee id is: " + (employee.sal));
    }
}
