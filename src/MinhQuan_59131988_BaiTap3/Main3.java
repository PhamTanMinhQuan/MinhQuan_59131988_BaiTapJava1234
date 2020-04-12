/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_BaiTap3;

/**
 *
 * @author quan
 */
public class Main3 {
     public static void main(String[] args) {
        SinhVienIT sinhVienIT = new SinhVienIT("Phạm Tấn Minh Quân", 5.0, 6.9, 4.2);
        sinhVienIT.Xuat();

        SinhVienBiz sinhVienBiz = new SinhVienBiz("Trần Văn Tèo", 8.0, 9.0);
        sinhVienBiz.Xuat();
    }
}
