/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soDien;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap so dien:");
        soDien = myObj.nextInt();
        if(soDien<50){
           int tien = soDien*1000;
           System.out.println("So tien la:"+tien);
        }else{
           int tien = 50*1000 + (soDien - 50)*1200;
           System.out.println("So tien la:"+tien);
        }
    }
    
}
