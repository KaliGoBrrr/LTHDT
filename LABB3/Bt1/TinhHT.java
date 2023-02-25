/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhvuonghinhtron;

/**
 *
 * @author admin
 */
public class TinhHT {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setDuongKinh(10);
        ht.setBanKinh(ht.getDuongKinh()/2);
        ht.setChuVi((float) (ht.getBanKinh()*ht.getPI()));
        System.out.println("Chu vi la: "+ht.getChuVi());
        ht.setDienTich((float) (ht.getPI()*ht.getDuongKinh()));
        System.out.println("Dien tich la: "+ht.getDienTich());
    }
}
