package Nomor4;
import java.util.Scanner;
// Inheritance Hierarcy
public class berhitung {
    public static void main(String[] args) {
        apaaja a = new apaaja();
        Scanner sc =new Scanner(System.in);
        String mauApa;
        int r,b=0;
        System.out.print("Masukan jari-jari  : "); r=sc.nextInt();
        do {
            System.out.print("Pilih luas / keliling : "); mauApa=sc.next().toLowerCase();
            if(mauApa.equals("keliling")){
                a.kelilskuy(r); b=1;            //b untuk looping sederhana
            } else if (mauApa.equals("luas")) {
                a.luas(r); b=1;                 //b untuk looping sederhana
            }else{
                System.out.println("input salah, silakan input ulang.");
                System.out.println("=================================");
            }
        }while (b==0);

    }
}
