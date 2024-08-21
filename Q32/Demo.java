/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q32;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static int m1(int i) {
        return i * i;
    }

    public static void main(String[] args) {
        //call m1 method from here in different ways
        //Catching the result value in the result variable
        int result = m1(10);
        System.out.println("The result is: "+result);
        //Withot catching a result value
        m1(10);
        //Calling the class Demo
        int result2 = Demo.m1(10);
        System.out.println("The result is 2: "+result2);
        //Creating the demo object may not be that appropriate
        Demo demo = new Demo();
        int result1 = demo.m1(10);
        System.out.println(result1);
        
    }

}
