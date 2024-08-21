/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q24;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static void m1(Employee e) {
        //display data here
        System.out.println("ID: "+e.getId());
        System.out.println("Name: "+e.getName());
        System.out.println("Salary: "+ e.getSal());
        
    }

    public static void main(String[] args) {
        //call m1 method from here
        Employee e  = new Employee(101, "sam",1000);
        m1(e);
        
    }
}
