/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner myObj = new Scanner(System.in);
        int x;
        System.out.println("Nhap so can kiem tra: ");
        x = myObj.nextInt();
        
        float kq = (float) Math.sqrt(x);
        if(kq == (int)kq)
        {
            System.out.println(x+" la so chinh phuong");
        }
        else
        {
            System.out.println(x+ " khong la so chinh phuong");
                }
    }
    
            

}
