/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keThuaHaiH;

/**
 *
 * @author admin
 */
public class Cylinder extends Circle {
    
       private double height;
    
    public Cylinder(){
        
    }
    
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}

