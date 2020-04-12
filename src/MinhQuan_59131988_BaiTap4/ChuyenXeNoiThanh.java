/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_BaiTap4;

import java.util.Scanner;

/**
 *
 * @author quan
 */
public class ChuyenXeNoiThanh extends ChuyenXe {
     private String soTuyen;
    private double soKmDiDuoc;
     
    public ChuyenXeNoiThanh() {
        super();
    }
 
    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }
 
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public String getsoTuyen() {
        return soTuyen;
    }
 
    public void setsoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }
     
     @Override
    public void nhapThongTinChuyenXe() {
        Scanner sc=new Scanner(System.in);
        super.nhapThongTinChuyenXe();
        System.out.print("Nhập số tuyến: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhập số km đi được: ");
        soKmDiDuoc = scanner.nextDouble();
    }
     
     @Override
    public String toString() {
        return super.toString() + ", số tuyến: " + this.soTuyen + 
                ", số km đi được: " + this.soKmDiDuoc;
    }
}
