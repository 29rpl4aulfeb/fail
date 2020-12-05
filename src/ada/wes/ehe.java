/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada.wes;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ehe {

    /**
     * @param args the command line arguments
     */
    public static int bil(int a){
        return a;
    }
    public static int lib (int b){
        return b;
    }
    public static int bli(int c) {
        return c;
    }
    public static int lbi(int d){
        return d;
    }
    public static int ibl(int e){
        return e;
    }
    public static void main(String[] args) {
    ehe yo = new ehe ();
    Scanner input = new Scanner (System.in);
    int terbesar;
    
    System.out.print("Masukkan bilangan I : ");
    int a = bil (input.nextInt());
    
        System.out.print("Masukkan bilangan II : ");
        int b = lib (input.nextInt());
        
        System.out.print("Masukkan bilangan III : ");
        int c = bli (input.nextInt());
        
        System.out.print("Masukkan bilangan IV : ");
        int d = lbi (input.nextInt());
        
        System.out.print("Masukkan bilangan V : ");
        int e = ibl (input.nextInt());
        
        if (a> b&& a> c&&a > d&&a > e) {
            terbesar = a;
        }else if (b> a&&b > c&&b > d&&b > e){
            terbesar = b;
        }else if (c> a&&c > b&&c > d&&c > e){
            terbesar = c;
        }else if (d> a&&d > b&&d > c&&d > e){
                terbesar = d;
        }else{
            terbesar = e;
        }
        System.out.println("Angka terbesar adalah "+terbesar);
    }
    
}
