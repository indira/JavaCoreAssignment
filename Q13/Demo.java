/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q13;

/**
 *
 * @author lenovo
 */
public class Demo {

    int x = 10;

    public void show() {
        int x = 100;
        System.out.println(x);//this will print 100 becaiuse x refer to the local variable
        System.out.println(this.x);//this will print 10...here x refer to instance...this keyword refer to the current instance of the class
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
