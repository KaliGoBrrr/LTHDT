/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
/**
 *
 * @author admin
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aNumber , bNumber;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap a:");
        aNumber = myObj.nextInt();
        System.out.println("Nhap b:");
        bNumber = myObj.nextInt();
        if(aNumber==0){
            if(bNumber==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = (float) -bNumber/aNumber;
            System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
        }
    }
    
}
