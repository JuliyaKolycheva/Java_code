/*Управление магазином 

В программе управления магазином цены на товары хранятся в массиве. 
Необходимо создать функционал на поднятие цены на указанное число, которое задается пользователем.

9  - 107.99 24.2 29 1035
100 - 198.99 115.2 120 1126
*/

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        double[] prices = {98.99, 15.2, 20, 1026};
        double rate;
        Scanner scanner = new Scanner(System.in);
        rate = scanner.nextDouble(); // вводим значение повышающей цены

        System.out.println("Повышенные цены на товары: ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] + rate;
            System.out.println(prices[i]);
        }
    }
}

/* Управление магазином-2

В программе управления магазином цены на товары хранятся в массиве.  
Необходимо создать функционал на поднятие цены на указанный процент, который задается пользователем.
*/
import java.util.Scanner;
public class RaisePrices {
    public static void main(String[] args) {
        double[] prices = {10.50, 25.50, 50.50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the raise percent: ");
        double percent = sc.nextDouble();
        for (int i = 0; i < prices.length; i++) {
            double newPrice = prices[i] + (prices[i] * (percent / 100));
            System.out.printf("%.2f ", newPrice);        
        }
    }
}
