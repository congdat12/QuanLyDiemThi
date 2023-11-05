package Model;

import Utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThiSinhKhoiC extends ThiSinh{
    double diemVan;
    double diemSu;
    double diemDia;

    public ThiSinhKhoiC() {}

    public ThiSinhKhoiC(String sbd, String hoTen, String diaChi, double diemVan, double diemSu, double diemDia) {
        super(sbd, hoTen, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    @Override
    public void input() {
        super.input();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        this.diemVan = Validator.getDouble(bf, "diem van");
        this.diemSu = Validator.getDouble(bf, "diem su");
        this.diemDia = Validator.getDouble(bf,"diem dia");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("diem van: "+this.diemVan+ " diem su: "+this.diemSu+ " diem dia: "+this.diemDia);
    }
}
