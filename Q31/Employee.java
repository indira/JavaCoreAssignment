/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q31;

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
    
    public String getName(){
        return name;
    }
    
    public int getSal(){
        return sal;
    }
    
    public void display(){
        System.out.println("Employee Id:"+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee sal: "+sal);
    }
}
