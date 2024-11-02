package com.mycompany.bmi;

import java.util.Scanner;

/**
 *
 * @author Daffa
 */
public class BMI {
    double beratBadan; // Changed to double for more precision
    double tinggiBadan;
    double BMI;

    public BMI(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }   
     
    public void hitung() {
        double x = beratBadan / Math.pow(tinggiBadan / 100, 2);
        BMI = x;
        if (x < 18.5) {
            System.out.println("kurus");
        } else if (x >= 18.5 && x <= 24.9) {
            System.out.println("ideal");
        } else if (x >= 25 && x <= 29.9) {
            System.out.println("berat badan berlebih");
        } else {
            System.out.println("obesitas");
        }
    }
    
    public double getBMI() {
        return BMI;
    }
}
