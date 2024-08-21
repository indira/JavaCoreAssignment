/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q7;

/**
 *
 * @author lenovo
 */
/**
 *
 * @author lenovo
 */
public class Employee {

    private int id;
    private String name;
    private int sal;
    
    public Employee(int id, String name, int sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSal(){
        return sal;
    }
    public void setSal(int sal){
        this.sal = sal;
    }
    public static void main(String[] agrs){
        Employee employee1 = new Employee(101, "Sam", 1000);
        Employee employee2 = new Employee(102, "Alex", 2000);
        show(employee1, employee2);
    }
    
     public static void show(Employee employee1, Employee employee2){
       //display that data here
       System.out.println("Employee 1 id is: "+employee1.id);
       System.out.println("Employee 1 name is: "+employee1.name);
       System.out.println("Employee 1 salary is: "+employee1.sal);
       
       System.out.println("Employee 2 id is: "+employee2.id);
       System.out.println("Employee 2 name is: "+employee2.name);
       System.out.println("Employee 2 salary is: "+employee2.sal);
   }
}
