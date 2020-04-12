/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhquan_59131988_baitap1;

/**
 *
 * @author quan
 */
public class Main1 {
    public static void main(String[] args){
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
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    }
}