/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Guntur Wicaksono
 */
import java.util.Scanner;
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 0, n2 = 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung: ");
        int number = reader.nextInt();
        System.out.print("Fibonacci dari "+number+" adalah: "+n1+" "+n2);
        for(int i=0;i<number;++i){
            int ntotal = n1 + n2;
            System.out.print(" "+ntotal);
            n1 = n2;
            n2 = ntotal;
        }
    }
}