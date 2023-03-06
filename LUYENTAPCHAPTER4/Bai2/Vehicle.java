/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class Vehicle {
    private String color;
    private String model;
   
  public Vehicle(){
  
  }
  public Vehicle(String color, String model){
      super();
      this.color=color;
      this.model=model;
  }
  public void run(){
      System.out.println("go go!");
  }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
