package com.mycompany.bmi;

import java.util.Scanner;

/**
 *
 * @author Daffa
 */
public class BMIBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadan = scanner.nextDouble();
        
        BMI daffa = new BMI(beratBadan, tinggiBadan);
        daffa.hitung();
        
        System.out.println("Nilai BMI: " + daffa.getBMI());
        
        scanner.close();
    }
}
