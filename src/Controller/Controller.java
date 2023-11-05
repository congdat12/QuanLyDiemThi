package Controller;

import Model.ThiSinh;
import Model.ThiSinhKhoiA;
import Model.ThiSinhKhoiB;
import Model.ThiSinhKhoiC;
import Utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Controller {
    ArrayList<ThiSinh> arrThiSinh = new ArrayList<>();

    public void addThiSinh(ThiSinh thiSinh) {
        arrThiSinh.add(thiSinh);
    }

    public void showThiSinh() {
        for (ThiSinh ts : arrThiSinh) {
            if (ts instanceof ThiSinhKhoiA) {
                ts.show();

            } else if (ts instanceof ThiSinhKhoiB) {
                ts.show();

            } else {
                ts.show();
            }
        }
    }

    public void findBySBD(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sbd = Validator.getString(bf,"input SBD");

        for(ThiSinh ts : arrThiSinh){
            if (ts instanceof ThiSinhKhoiA){
                if(ts.getSbd().equalsIgnoreCase(sbd)){
                    ts.show();
                }
            } else if (ts instanceof ThiSinhKhoiB) {

                if(ts.getSbd().equalsIgnoreCase(sbd)){
                    ts.show();
                }

            }else if (ts instanceof ThiSinhKhoiC){
                if(ts.getSbd().equalsIgnoreCase(sbd)){
                    ts.show();
                }
            }else {
                System.out.println("not found");
            }
        }

    }
}
