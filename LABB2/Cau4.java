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
        int n;
        System.out.println("Nhap so nguyen n:");
        n = myObj.nextInt();
        int dapAn = 1;
        int i = 1;
        while(i<=n)
        {
            dapAn = dapAn * i;
            i++;
        }
        System.out.println("Giai thua cua "+n+" la: "+dapAn);
    }
    
}
