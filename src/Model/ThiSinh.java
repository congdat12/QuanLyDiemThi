package Model;

import Utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThiSinh {
    String sbd;
    String hoTen;
    String diaChi;

    double diemThi;

    public ThiSinh(){}

    public ThiSinh(String sbd, String hoTen, String diaChi) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void input(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        this.sbd = Validator.getString(bf, "SBD");
        this.hoTen = Validator.getString(bf, "ho ten");
        this.diaChi = Validator.getString(bf, "dia chi");
    }

    public void show(){
        System.out.println("SBD: " + this.sbd + " ho ten: " + this.hoTen + " dia chi: " + this.diaChi);
    }


}
