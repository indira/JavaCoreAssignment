package Q5;

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
       return this.name;
   }
   public void setname(String name){
       this.name = name;
   }
   
   public int getSal(){
      return this.sal;
   }
   
   public void setSal(int sal){
       this.sal = sal;
   }
   
   public static void main(String[] args){
       Employee employee = new Employee(101,"sam",1000);
       //call show method and pass this created object to show method
       show(employee);
   }
   
   public static void show(Employee employee){
       //display that data here
       System.out.println("Employee id is: "+employee.id);
       System.out.println("Employee name is: "+employee.name);
       System.out.println("Employee salary is: "+employee.sal);
   }
   
 
}
