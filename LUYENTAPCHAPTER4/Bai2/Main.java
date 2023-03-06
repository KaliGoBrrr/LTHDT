/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class Main {
     public static void main(String[] args) {
        Car c = new Car("Xang", "Red", "BMW");
        System.out.println("nhien lieu cua xe la: "+ c.getTypeNL());
        Vehicle vh = new Vehicle();
        vh.run();
    }
}
