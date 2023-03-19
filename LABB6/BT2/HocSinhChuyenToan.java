/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;
public class HocSinhChuyenToan extends HocSinh{
    
    public HocSinhChuyenToan(String hoTen, int lop, int toan, int ly, int hoa){
        
    }
    
    HocSinhChuyenToan(){
    
    }
    @Override
    public float diemTB(){
        float DTB = (((getToan()*2) + getLy() + getHoa()) / 4);
        return DTB;
    }
}