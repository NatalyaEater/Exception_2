package org.example;
import java.util.Scanner;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.*/
public class Task1 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите дробное число");
                Scanner sc = new Scanner(System.in);
                float num = sc.nextFloat();
                System.out.println(num);
            } catch (Exception e){
                System.out.println("Попробуйте еще раз.");
            }
        }
    }
}


