/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q11;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static void main(String[] args) {
        //call show method in different ways
        //1. Directly by method name
        show();
        //2. Using the class name
        Demo.show();
        //3.Using the object of the class
        Demo demo = new Demo();
        demo.show();

    }

    public static void show() {
        System.out.println("show method");
    }
}
