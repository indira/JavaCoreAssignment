/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q29;

/**
 *
 * @author lenovo
 */
public class Demo {

    public static float m1(int i) {
        System.out.println("m1 called");
        return i * i;
    }

    public static void main(String[] args) {
        //call m1 method and pass some number
        int total = (int) (100 + m1(10));
        System.out.println(total);
    }

}
