package Nomor1;

import java.util.Scanner;

public class telpon {
    public int convertJam (int a, int b){
        return Math.abs((a-b)*3600);
    }
    public int convertMenit (int a, int b){
        return  Math.abs((a-b)*60);
    }
    public int convertDetik (int a, int b){
        return  Math.abs(a-b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        telpon t = new telpon();
        int  total, pulsa, bayartotal;
        int startJ, startM,startD, endJ,endM,endD, J,M,D;
        System.out.print("Masukan jam awal : "); startJ= sc.nextInt();
        System.out.print("Masukan menit awal : "); startM= sc.nextInt();
        System.out.print("Masukan detik awal : "); startD= sc.nextInt();
        System.out.println("Waktu awal telpon : " + startJ + " : " + startM + " : " + startD);
        System.out.println("========================");
        System.out.print("Masukan jam akhir : "); endJ= sc.nextInt();
        System.out.print("Masukan menit akhir : "); endM= sc.nextInt();
        System.out.print("Masukan detik akhir : "); endD= sc.nextInt();
        System.out.println("Waktu akhir telpon : "+ endJ + " : " + endM + " : " + endD);
        System.out.println("========================");
        J=Math.abs(t.convertJam(endJ,startJ ));
        M=Math.abs(t.convertMenit(endM,startM));
        D=Math.abs(t.convertDetik(endD,startD));
        total = J+M+D;
        /*setiap melebihi 5 detik akan saya bulatkan ke atas
        contoh : 31 detik maka akan terhitung 7 pulsa
                 30 detik maka akan terhitung 6 pulsa */
        if (total%5 != 0){
            pulsa=total/5;
            bayartotal=(pulsa*150)+150;
        }
        else {
            pulsa=total/5;
            bayartotal=pulsa*150;
        }
        System.out.println("Total pulsa yang dikurangi : Rp."+bayartotal+",00-");
        System.out.println("Waktu yang digunakan "+Math.abs((endJ-startJ))+" : "+Math.abs((endM-startM))+" : "+Math.abs((endD-startD)));
    }
}
