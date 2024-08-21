/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q34;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class Demo {
    private int id;
    private String name;
    private int sal;
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        
        //Creating the instance of Demo to store and Display data
        Demo demo = new Demo();
        //Take userinput for id, name and sal
        System.out.println("Enter the Employee ID");
        demo.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the employee name.");
        demo.name = scanner.nextLine();
        
        System.out.println("Enter the employee salary");
        demo.sal = scanner.nextInt();
        // Display the data using the show method
        demo.show();
        //Close the scanner
        scanner.close();
    }

    public void show() {
        //display data here by doing required changes
        System.out.println("Employee id is: "+id);
        System.out.println("Employee name is: "+name);
        System.out.println("Employee sal is: "+sal);
    }

}
