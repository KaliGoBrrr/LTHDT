/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class Car extends Vehicle{
    private String typeNL;
    
   public Car(){
   
   }
   public Car(String typeNL, String color, String model){
       super(color, model);
       this.typeNL=typeNL;
   }

    public String getTypeNL() {
        return typeNL;
    }

    public void setTypeNL(String typeNL) {
        this.typeNL = typeNL;
    }
}
