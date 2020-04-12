/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_BaiTap2;
import java.util.ArrayList;
import minhquan_59131988_baitap1.NhanVien;
/**
 *
 * @author quan
 */
public class QuanLyNhanVien implements IQuanLy {
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
    @Override
  public void them(NhanVien nv) {
    dsNhanVien.add(nv);
  };
    @Override
  public void inDS() {
    dsNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
  };
}
