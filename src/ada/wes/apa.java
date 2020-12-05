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
public class apa {

    /**
     * @param args the command line arguments
     */
  public static void hitung (int a, int b, int c, int d, int e) {
      System.out.println("Nilai terbesar : "+ e);
  }
   public static int lala(int l){   
     return l;
 }
  
  public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
     apa yo= new apa ();
     int v = lala (1);
     
      System.out.print("Masukkan bilangan I : ");
      int bil1 = input.nextInt();
      
      System.out.print("Masukkan bilangan II : ");
      int bil2 = input.nextInt();
      
      System.out.print("Masukkan bilangan III : ");
      int bil3 = input.nextInt();
      
      System.out.print("Masukkan bilangan IV : ");
      int bil4 = input.nextInt();
      
      System.out.print("Masukkan bilangan V : ");
      int bil5 = input.nextInt();
      
      hitung (bil1, bil2, bil3, bil4, bil5);
      
      }
}
     
  


    
    

