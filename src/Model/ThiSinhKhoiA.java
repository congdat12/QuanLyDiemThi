package Model;

import Utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThiSinhKhoiA extends ThiSinh {

    double diemToan;
    double diemLy;
    double diemHoa;

    public ThiSinhKhoiA() {}

    public ThiSinhKhoiA(String sbd, String hoTen, String diaChi, double diemToan, double diemLy, double diemHoa) {
        super(sbd, hoTen, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    @Override
    public void input() {
        super.input();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        this.diemToan = Validator.getDouble(bf, "diem toan");
        this.diemLy = Validator.getDouble(bf, "diem ly");
        this.diemHoa = Validator.getDouble(bf, "diem hoa");

    }

    @Override
    public void show() {
        super.show();
        System.out.println("diem toan: " + this.diemToan+ " diem ly: " + this.diemLy + " diem hoa: " + this.diemHoa);
    }

    public double diemThi(){
        return super.diemThi = (this.diemHoa + this.diemLy + this.diemToan)/3;
    }
}
