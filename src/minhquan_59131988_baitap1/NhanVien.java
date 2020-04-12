/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhquan_59131988_baitap1;
import java.util.Scanner;
/**
 *
 * @author quan
 */
public class NhanVien {
    private String ten;
    private String tuoi;
    private String diachi;
    private double luong;
    private int tongsogiolam;
    NhanVien(){
        ten="Trần Văn A";
        tuoi="20";
        diachi="Hồ Chí Minh";
        luong=2000000;
        tongsogiolam=200;
    }
    public NhanVien(String ten,String tuoi,String diachi, double luong,int tongsogiolam){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.tongsogiolam = tongsogiolam;
    }
    String getTen(){
        return ten;
    }
    void setTen(String ten){
        this.ten=ten;
    }
    String getTuoi(){
        return tuoi;
    }
    void setTuoi(String tuoi){
        this.tuoi=tuoi;
    }
    String getDiachi(){
        return diachi;
    }
    void setDiachi(String diachi){
        this.diachi=diachi;
    }
    double getLuong(){
        return luong;
    }
    void setLuong(double luong){
        this.luong=luong;
    }
    int getTongSoGioLam(){
        return tongsogiolam;
    }
    void setTongSoGioLam(int tongsogiolam){
        this.tongsogiolam=tongsogiolam;
    }
    void inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Tên nhân viên: ");
        ten=sc.nextLine();
        System.out.println("Tuổi nhân viên: ");
        tuoi=sc.nextLine();
        System.out.println("Địa chỉ nhân viên: ");
        diachi=sc.nextLine();
        System.out.println("Lương nhân viên: ");
        luong=sc.nextDouble();
        System.out.println("Tổng số giờ làm: ");
        tongsogiolam=sc.nextInt();
    }
    void printInfo(){
        System.out.println("Thông tin chi tiết nhân viên:");
        System.out.println("Tên nhân viên: "+ten);
        System.out.println("Tuổi nhân viên: "+tuoi);
        System.out.println("Địa chỉ nhân viên: "+diachi);
        System.out.println("Lương nhân viên: "+luong);
        System.out.println("Tổng số giờ làm: "+tongsogiolam);
        System.out.println("Thưởng: "+tinhThuong());
        System.out.println("Tổng lương: "+(luong+tinhThuong()));
    }
    double tinhThuong(){
        double thuong;
        if(tongsogiolam>=200)
            thuong=luong*0.2;
        else if(tongsogiolam>=100 && tongsogiolam<200)
            thuong=luong*0.1;
        else
            thuong=0;
        return thuong;
    }
}