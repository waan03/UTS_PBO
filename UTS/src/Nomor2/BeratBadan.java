package Nomor2;
import java.util.Scanner;

public class BeratBadan {
    static public double BMI(double a, double b){
        return (float)a/(Math.pow(b,2));
    }
    static void nentuin(double a, double b){
        if (BMI(a,b)>=22.9){
            System.out.println("Anda overweight");
        }
        else if (BMI(a,b)<=18.5) {
            System.out.println("Anda underweight");
        }else {
            System.out.println("Anda ideal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double berat, tinggi;
        System.out.println("Selamat datang di perhitungan BMI");
        System.out.print("Input berat  (kg) : "); berat = sc.nextDouble();
        System.out.print("Input tinggi (cm) : "); tinggi = sc.nextDouble();
        tinggi=(float)tinggi/100; //mengubah centimeter menjadi meter
        System.out.println("BMI anda adalah : " + BMI(berat,tinggi));
        nentuin(berat, tinggi);
    }
}