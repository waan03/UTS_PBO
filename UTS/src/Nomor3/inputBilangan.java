package Nomor3;
import java.util.Scanner;

public class inputBilangan {
    static Scanner sc = new Scanner(System.in);
    static int angka, sum=0;
    static int loopingan(){
        angka=sc.nextInt();
        return sum+=angka;
    }
    public static void main(String[] args) {
        System.out.println("Masukan 10 input angka :");
        for (int i=1;i<=10;i++){
            System.out.print(i+". ");
            loopingan();
        }
        System.out.println("======================");
        System.out.println("Hasil dari bilangan tersebut adalah : "+sum);
    }
}