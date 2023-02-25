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
    public double getPI() {
        return PI;
    }
    public void setPI(double PI) {
        this.PI = PI;
    }
    public float getDuongKinh() {
        return duongKinh;
    }
    public void setDuongKinh(float duongKinh) {
        this.duongKinh = duongKinh;
    }
    public float getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
    public float getChuVi() {
        return chuVi;
    }
    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }
    public float getDienTich() {
        return dienTich;
    }
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
}

    


    
