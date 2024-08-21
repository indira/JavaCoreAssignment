/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q8;

/**
 *
 * @author lenovo
 */
public class Employee {

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
        Employee emp = new Employee(101, "sam", 1000);
        Employee.show(emp);
        System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSal());
    }

    public static void show(Employee ex) {
        System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
        ex.setId(102);
    }

}

/*The output is: 
101 sam 1000
102 sam 1000
*/
