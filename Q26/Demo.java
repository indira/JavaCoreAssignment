/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q26;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static void m1(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        //create Employee object here with 101,sam,1000 data
        Employee employee = new Employee(101,"Sam",1000);
        //call m1 method and pass employee id as parameter
        m1(employee.getId());
    }
}
