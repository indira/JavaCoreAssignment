/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author lenovo
 */
public class Employee {
    private int id;
    private String name;
    private int sal;
 
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getSal(){
        return this.sal;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSal(int sal){
        this.sal = sal;
    }
    
    public void employeeDetails(){
       System.out.println("Employee id: "+id);
       System.out.println("Employee name: "+name);
       System.out.println("Employee Salary: "+sal); 
    }
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Sam");
        employee.setSal(1000);
        
        employee.employeeDetails();
        
        
    }
}
