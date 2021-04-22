package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class CBGVManagment {
    private List<CBGV> cbgv = new ArrayList<CBGV>();

    public CBGVManagment() {
    }

    public CBGVManagment(List<CBGV> cbgv) {
        this.cbgv = cbgv;
    }

    @Override
    public String toString() {
        return cbgv+"";
    }
    public void add(){
        CBGV cbgv1 = new CBGV();
        cbgv1 = cbgv1.inputCBGVInfo();
        this.cbgv.add(cbgv1);
    }
    public void calculate(){
        for(int i = 0;i<this.cbgv.size();i++){
            this.cbgv.get(i).calculateFinalSalary();
        }
    }
    public void showGreaterAvg(){
        this.calculate();
        for(int i = 0; i<this.cbgv.size();i++){
            if(this.cbgv.get(i).getFinalSalary()>=80000){
                System.out.println(this.cbgv.get(i));
            }
        }
    }
}
