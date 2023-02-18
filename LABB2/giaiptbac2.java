/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aNumber , bNumber, cNumber;
        double delta;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap a:");
        aNumber = myObj.nextInt();
        System.out.println("Nhap b:");
        bNumber = myObj.nextInt();
        System.out.println("Nhap c:");
        cNumber = myObj.nextInt();
        System.out.println("Pt co dang:" +aNumber+"x^2+"+bNumber+"x+"+cNumber+"=0");
        if(aNumber==0){
          if(bNumber==0){
            if(cNumber==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = (float) -cNumber/bNumber;
            System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
        }
    }
        if(aNumber!=0){
           delta = bNumber*bNumber-4*aNumber*cNumber;
           if(delta<0){
               System.out.println("Phuong trinh vo nghiem");  
           }
           if(delta==0){
             float x = (float) -bNumber/(2*aNumber);
               System.out.println("Phuong trinh co nghiem kep:"+x);
           }
           if(delta>0){
             float x1 = (float) (-bNumber+Math.sqrt(delta))/(2*aNumber);
             float x2 = (float) (-bNumber-Math.sqrt(delta))/(2*aNumber);
               System.out.println("Phuong trinh co 2 nghiem phan biet: x1="+x1+"va x2="+x2);
           }
        }    
}
}
