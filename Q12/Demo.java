/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q12;

/**
 *
 * @author lenovo
 */
//In below example, try to print total variable in different ways which explains different ways to call static variable
public class Demo {

    private static int total = 10;

    public static void main(String[] args) {
        //print total in different ways
        //1. Directly by variable name
        System.out.println(total);
        //Using the Demo class
        System.out.println(Demo.total);
        //Creating the demo object of Demo class
        Demo demo = new Demo();
        System.out.println(demo.total);
    }
}
