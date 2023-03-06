/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keThua;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Circle ht = new Circle(5,"red",true);
        float dt,cv;
        cv = (float) (2*ht.getRadius()*ht.getPi());
        dt = (float) (ht.getPi()*(ht.getRadius()*ht.getRadius()));
        System.out.println("Chu vi la: "+cv);
        System.out.println("Dien tich la: "+dt);
    }
}
/*
1.Trong biểu đồ trên có tất cả bao nhiêu quan hệ thừa kế (is-a)? Tại sao lớp Circle có thể
thừa kế lớp Shape mà không phải lớp Rectangle?
    - có 3 quan hệ kế thừa
    - 


2.Định nghĩa thêm số PI trong lớp Circle ở chương trình vừa tạo; sau đó sử dụng giá trị PI
để tính chu vi và diện tích hình tròn. Biến PI này có nên để final không?
    - không nên để final ở biến Pi
*/