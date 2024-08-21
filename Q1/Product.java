/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author lenovo
 */
public class Product {
    private final int id;
    private final String name;
    private final double price;
    //constructor
    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //Getter method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    
   //Display method
    public void productDisplay(){
        System.out.println("Product Id: "+id);
        System.out.println("Product name:"+name);
        System.out.println("Product Price: "+price);
    }
    
    public static void main(String[] args){
        Product product = new Product(1,"TV",500);
        product.productDisplay();
    }
    
}
