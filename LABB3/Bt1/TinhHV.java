/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhvuonghinhtron;

/**
 *
 * @author admin
 */
public class TinhHV {
     public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.setCanh(10);
        hv.setChuVi(hv.getCanh()*4);
        System.out.println("Chu vi la: "+hv.getChuVi());
        hv.setDienTich(hv.getCanh()*hv.getCanh());
        System.out.println("Dien tich la: "+hv.getDienTich());
    }
}
