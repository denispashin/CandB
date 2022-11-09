package ru.webred.candb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import javax.swing.text.View;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

@SpringBootApplication
@Controller
public class CandBApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandBApplication.class, args);
    }


    private class BackEnd {


        private int length;             //длина массива
        private int[] mas;              //задуманное компьютером число
        private int[] inputArray;       //число, введенное пользователем

        private void printMas(int[] mas) {
            for (int i = 0; i < length; i++) {
                System.out.print(mas[i] + "   ");
            }
         
                    }
        private void getMas() {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Введите целое число от 1 до 10");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введите число");
                    scanner.next();
                }
                length = scanner.nextInt();
            } while (length <= 0 || length > 10);
            //        setMas(createMas());
        }

        public void onClick() {
            onClick(null);
        }

        public void onClick(View view) {

            Random random = new Random(30);
            Set<Integer> numberSet = new HashSet<>();
            for(int i = 0; i < 1000; i++)
                numberSet.add(random.nextInt(10));
            mInfoTextView.setText(numberSet.toString());
        }
        }

        

        }

