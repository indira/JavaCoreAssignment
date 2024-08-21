/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q31;

import static Q30.Demo.m1;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static Object m1() {
        //create Employee object here and return
        Employee employee = new Employee(101,"Sam",1000);
        //don’t change m1 method prototype i.e return type or access specifier
        return employee;
    }

    public static void main(String[] args) {
         //call m1 method and catch returned employee object here
        Object obj = m1();
        Employee emp = (Employee) obj;
        emp.display();
    }

}
