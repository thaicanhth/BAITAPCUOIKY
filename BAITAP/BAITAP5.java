package BAITAP;

import java.util.Scanner;

public class BAITAP5 {
    public static int n;
    //---------ham tinh giai thua--------------
    public static double giaithua(int n){
        double tmp=1;
        if (n>1) {
            for (int i = 2; i <= n; i++) {
                tmp *= i;
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        float tong = 0.0f;
        Scanner reader = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên N = ");
        n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            tong+= i/giaithua(i);
        }
        System.out.println("tong day so la: " + tong);
    }
}

