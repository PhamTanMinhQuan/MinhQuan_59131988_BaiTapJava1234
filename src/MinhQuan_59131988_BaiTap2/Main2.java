/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_BaiTap2;
import minhquan_59131988_baitap1.NhanVien;

/**
 *
 * @author quan
 */
public class Main2 {
public static void main(String[] args){
    IQuanLy qlNhanVien= new QuanLyNhanVien();
NhanVien nv1=new NhanVien();    
        nv1.setTen("Trần Văn Cao");
        nv1.setTuoi(25);
        nv1.setDiaChi("Hồ Chí Minh");
        nv1.setLuong(5000000);
        nv1.setTongSoGioLam(200);
NhanVien nv2=new NhanVien();
        nv2.setTen("Huỳnh Gia Tèo");
        nv2.setTuoi(30);
        nv2.setDiaChi("Hà Nội");
        nv2.setLuong(6900000);
        nv2.setTongSoGioLam(100);
NhanVien nv3=new NhanVien();
        nv3.setTen("Nguyễn Thị Ngọc");
        nv3.setTuoi(20);
        nv3.setDiaChi("Cần Thơ");
        nv3.setLuong(3000000);
        nv3.setTongSoGioLam(50);
NhanVien nv4=new NhanVien();
        nv4.setTen("Phạm Thế Tài");
        nv4.setTuoi(25);
        nv4.setDiaChi("Hải Phòng");
        nv4.setLuong(4000000);
        nv4.setTongSoGioLam(100);
NhanVien nv5=new NhanVien();
        nv5.setTen("Trần thanh Tuyền");
        nv5.setTuoi(29);
        nv5.setDiaChi("Huế");
        nv5.setLuong(5000000);
        nv5.setTongSoGioLam(200);

        qlNhanVien.them(nv1);
        qlNhanVien.them(nv2);
        qlNhanVien.them(nv3);
        qlNhanVien.them(nv4);
        qlNhanVien.them(nv5);
        qlNhanVien.inDS();
    }
}