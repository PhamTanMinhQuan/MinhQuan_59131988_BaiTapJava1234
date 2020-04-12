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
    public class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSales)/(double)3;
    }
}
