/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int so;
Scanner myObj = new Scanner(System.in);
System.out.println("Nhap so nguyen ba chu so: ");
so = myObj.nextInt();
if (so < 100 || so > 999) {
	System.out.println("khong hop le!");
}
int donvi = so % 10;
so/=10;
int chuc = so % 10;
int tram = so / 10;
        switch (tram) {
            case 1 -> System.out.printf("Mot");
            case 2 -> System.out.printf("Hai");
            case 3 -> System.out.printf("Ba");
            case 4 -> System.out.printf("Bon");
            case 5 -> System.out.printf("Nam");
            case 6 -> System.out.printf("Sau");
            case 7 -> System.out.printf("Bay");
            case 8 -> System.out.printf("Tam");
            case 9 -> System.out.printf("Chin");
            default -> {
            }
        }
System.out.printf(" Tram ");
        switch (chuc) {
            case 2 -> System.out.printf("Hai");
            case 3 -> System.out.printf("Ba");
            case 4 -> System.out.printf("Bon");
            case 5 -> System.out.printf("Nam");
            case 6 -> System.out.printf("Sau");
            case 7 -> System.out.printf("Bay");
            case 8 -> System.out.printf("Tam");
            case 9 -> System.out.printf("Chin");
            default -> {
            }
        }
System.out.printf(" Muoi ");
        switch (donvi) {
            case 1 -> System.out.printf("Mot");
            case 2 -> System.out.printf("Hai");
            case 3 -> System.out.printf("Ba");
            case 4 -> System.out.printf("Bon");
            case 5 -> System.out.printf("Lam");
            case 6 -> System.out.printf("Sau");
            case 7 -> System.out.printf("Bay");
            case 8 -> System.out.printf("Tam");
            case 9 -> System.out.printf("Chin");
            default -> {
            }
        }
    }
    
}
