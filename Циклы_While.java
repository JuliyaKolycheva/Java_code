/* Дано натуральное число. Определить:
* 1. количество цифр 3 в нем;
* 2. сколько раз в нем встречается последняя цифра;
* 3. количество четных цифр в нем;
* 4. сумму его цифр, больших пяти;
* 5. произведение его цифр, больших семи;
* 6. сколько раз в нем встречаются цифры 0 и 5 (всего).
 */

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
    
      int number = sc.nextInt();
     
      int countLastNumber = 0;
      int lastNumber = number % 10;
      int sumMoreFive = 0;
      int multiplicationMoreSeven = 1;
      int countNumbers = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        if(lastDigit == lastNumber) {
          countLastNumber++;
        }
        if(lastDigit > 5) {
          sumMoreFive = sumMoreFive + lastDigit;
        }
        if(lastDigit > 7) {
          multiplicationMoreSeven = multiplicationMoreSeven * lastDigit;
        }
         if((lastDigit == 0) || (lastDigit == 5)) {
          countNumbers++;
                  }  
                number = number / 10;   
        }
        
      System.out.println("Сколько раз в числе встречается последняя цифра - " + countLastNumber + " раз(а)");
      System.out.println("Сумма цифер числа больше 5 = " + sumMoreFive);
      System.out.println("Произведение цифр числа, больших семи = " + multiplicationMoreSeven);
      System.out.println("Сколько раз в числе встречается цифра 5 и 0 (всего) = " + countNumbers);
      }
  }
  
