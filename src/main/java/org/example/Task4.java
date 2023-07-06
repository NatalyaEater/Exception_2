package org.example;
import java.util.Scanner;
/*Разработайте программу,
которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите текст ");
        try {
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().isEmpty()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя.");
        }
    }
}


