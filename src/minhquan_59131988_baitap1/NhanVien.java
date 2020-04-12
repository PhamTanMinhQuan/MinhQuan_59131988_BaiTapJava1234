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
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double luong;
    private int tongsogiolam;
public NhanVien(){
        ten="";
        tuoi=0;
        diachi="";
        luong=0;
        tongsogiolam=0;
    }
  public void setTen(String ten) { 
      this.ten = ten;
  }
  public String getTen() { 
      return this.ten;
  }
  public void setTuoi(int tuoi) { 
      this.tuoi = tuoi;
  }
  public int getTuoi() { 
      return this.tuoi;
  }
  public void setDiaChi(String diaChi) { 
      this.diachi = diaChi;
  }
  public String getDiaChi() { 
      return this.diachi;
  }
  public void setLuong(double luong) { 
      this.luong = luong;
  }
  public double getTienLuong() { 
      return this.luong;
  }
  public void setTongSoGioLam(int tongsogiolam) { 
      this.tongsogiolam = tongsogiolam;
  }
  public int getTongSoGioLam() { 
      return this.tongsogiolam;
  }
    public String getThongTin() {
    return "Ten: " + this.ten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi
      + ", tien luong : " + this.luong + ", tong  gio lam: " + this.tongsogiolam
      + ", tien thuong: " + this.tinhThuong();
  }
    public double tinhThuong(){
        if(this.tongsogiolam>=200){
           return this.luong*0.2;
        }
       if(this.tongsogiolam>=100){
            return this.luong*0.1;
        }
       return 0;
    }
}