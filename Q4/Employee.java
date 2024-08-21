package Q4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    
    public void employeeDetails(){
       System.out.println("Employee id: "+id);
       System.out.println("Employee name: "+name);
       System.out.println("Employee Salary: "+sal); 
    }
    public static void main(String[] args){
        Employee employee = new Employee(101,"Sam",1000);
        employee.employeeDetails();
    }
}
