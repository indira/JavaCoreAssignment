/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q30;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static Employee m1() {
        //create Employee object here and return
        Employee employee = new Employee(101,"Sam",1000);
        return employee;
    }

    public static void main(String[] args) {
        //call m1 method and catch returned employee object here
        Employee employee = m1();
         // Display returned Employee data
       employee.display();
    }

}
