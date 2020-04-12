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
   public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCSS;
    private double diemHTML;

    public SinhVienIT(String hoTen, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (diemJava*2 + diemCSS + diemHTML)/(double)4;
    }
}
