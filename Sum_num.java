// Найти сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      int sum = 0;
      
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      for(int i = a; i <= b; i++) {
        System.out.println("sum before = " + sum);
        System.out.println("i = " + i);
        sum = sum + i;
        System.out.println("sum after = " + sum);
        System.out.println("= = = = = = = = = = = = = =");
      }
      
      System.out.println("sum = " + sum);
  }
}
