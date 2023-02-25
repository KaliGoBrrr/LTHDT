/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhvuonghinhtron;

/**
 *
 * @author admin
 */
public class HinhTron {
    private double PI = 3.14;
    private float duongKinh;
    private float banKinh=duongKinh/2;
    private float chuVi;
    private float dienTich;
    //---------------------------------------//
    public void tinhChuVi(){
        chuVi = (float)(2*PI*banKinh);
    }
    public void tinhDienTich(){
        dienTich = (float)(PI*duongKinh);
    }
    float getchuVi(){
        return chuVi;
    }
    float getdienTich(){
        return dienTich;
    }
}

    


    
