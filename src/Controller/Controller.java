package Controller;

import Model.ThiSinh;
import Model.ThiSinhKhoiA;
import Model.ThiSinhKhoiB;
import Model.ThiSinhKhoiC;
import Utils.Validator;
import View.MenuController;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

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
        boolean isFound = false;

        for(ThiSinh ts : arrThiSinh){
            if (ts instanceof ThiSinhKhoiA){
                if(ts.getSbd().equalsIgnoreCase(sbd)){
                    ts.show();
                    isFound = true;
                }
            } else if (ts instanceof ThiSinhKhoiB) {

                if(ts.getSbd().equalsIgnoreCase(sbd)){
                    ts.show();
                    isFound = true;

                }

            }else{
                if(ts.getSbd().equalsIgnoreCase(sbd)){
                    ts.show();
                    isFound = true;
                }
            }

        }
        if (!isFound){
            System.out.println("not found");
        }

    }
    public void menuController(){
        MenuController menu = new MenuController();
        menu.menu();
        boolean isChecked = true;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (isChecked){

            int choose = Validator.getInt(bf,"xin moi chon ");
            switch (choose){
                case 1:
                    ThiSinhKhoiA khoiA = new ThiSinhKhoiA();
                    khoiA.input();
                    addThiSinh(khoiA);
                    break;
                case 2:
                    ThiSinhKhoiB khoiB = new ThiSinhKhoiB();
                    khoiB.input();
                    addThiSinh(khoiB);

                    break;
                case 3:
                    ThiSinhKhoiC khoiC = new ThiSinhKhoiC();
                    khoiC.input();
                    addThiSinh(khoiC);
                    break;
                case 4:
                    showThiSinh();
                    break;
                case 5:
                    findBySBD();
                    break;
                case 6:
                    isChecked = false;

            }
        }
    }
}
