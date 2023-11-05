package Model;

import Utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThiSinhKhoiB extends ThiSinh{
    double diemToan;
    double diemHoa;
    double diemSinh;

    public ThiSinhKhoiB() {}

    public ThiSinhKhoiB(String sbd, String hoTen, String diaChi, double diemToan, double diemHoa, double diemSinh) {
        super(sbd, hoTen, diaChi);
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemSinh = diemSinh;
    }

    @Override
    public void input() {
        super.input();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        this.diemHoa = Validator.getDouble(bf, "diem hoa");
        this.diemToan = Validator.getDouble(bf, "diem toan");
        this.diemSinh = Validator.getDouble(bf, "diem sinh");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("diem toan: " + this.diemToan+ " diem hoa: " +this.diemHoa+ " diem sinh:" + this.diemSinh);

    }
}
