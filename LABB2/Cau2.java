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
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        int x;
        System.out.println("Nhap so diem:");
        x = myObj.nextInt();
        if(x<5){
            System.out.println("Kem");
        }
        if(x>5&&x<7){
            System.out.println("Trung binh");
    }
        if(x>7&&x<8){
            System.out.println("Kha");
        }
        if(x>8){
            System.out.println("Gioi");
        }
}
}
