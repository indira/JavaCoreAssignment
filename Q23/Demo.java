/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q23;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static void m1(Object o) {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        //Using integer object
        m1(100);
        //Using string object
        m1("Hello World");
        //Using the employee custom object
        Employee employee = new Employee();
        m1(employee);
        
    }
}
