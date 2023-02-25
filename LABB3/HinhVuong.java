/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinhvuonghinhtron;

/**
 *
 * @author admin
 */
public class HinhVuong {
    private float canh;
    private float chuVi;
    private float dienTich;
    //---------------------------------------//
    public void tinhChuVi(){
        chuVi = canh*4;
    }
    public void tinhDienTich() {
        dienTich = canh*canh;
    }
    float getchuVi(){
        return chuVi;
    }
    float getdienTich(){
        return dienTich;
    }
}

    
    

