/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocSinh hs = new HocSinh();
        hs.setHoTen("jenj");
        hs.setLop(10);
        hs.setToan(10);
        hs.setLy(7);
        hs.setHoa(6);
        HocSinhChuyenToan ct = new HocSinhChuyenToan();
        ct.setHoTen("zenj");
        ct.setLop(10);
        ct.setToan(10);
        ct.setLy(7);
        ct.setHoa(6);
        System.out.println("Diem trung binh cua " + hs.getHoTen() + " la: " + hs.diemTB());
        ct.diemTB();
        System.out.println("Diem trung binh cua hs chuyen toan " + ct.getHoTen() + " la: " + ct.diemTB());     
    }   
}