package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //   Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.

        System.out.println("Введите 5 целых чисел");
        Scanner inI = new Scanner(System.in);
        int nums[];
        nums = new int[5];
        boolean isValid;
        for (int i = 0; i < 5; i++) {
            isValid = false;

            while (!isValid) {
                System.out.println("Введите " + (i + 1) + "-е число :");
                if (inI.hasNextInt()) {
                    nums[i] = inI.nextInt();
                    isValid = true;
                } else {
                    System.out.println("Введите только целое число!");
                    inI.next();
                }
            }

        }
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("Максимальное число в массиве : " + max);
        System.out.println("Минимальное число в массиве : " + min);


        // Даны имена 2х человек (тип String).
        // Если имена равны, то вывести сообщение о том, что люди являются тезками.
        String name1, name2;
        System.out.println("введите 1-е имя : ");
        name1 = inI.next();
        System.out.println("введите 2-е имя : ");
        name2 = inI.next();
        if (name1.equals(name2)) {
            System.out.println("Люди - тезки");
        } else {
            System.out.println("Имена разные");
        }

        //Дано число месяца (тип int). Необходимо определить время года
        // (зима, весна, лето, осень) и вывести на консоль.
        //решено тупо в лоб :) перебор по 4 массивам
        int count = 0;
        isValid = false;

        System.out.println("введите число месяца :");

        if (inI.hasNextInt()) {
            count = inI.nextInt();
            isValid = true;
        } else {
            System.out.println("Введите только целое число!");
            inI.next();
        }
        int[] winter = new int[]{12, 1, 2};
        int[] spring = new int[]{3, 4, 5};
        int[] summer = new int[]{6, 7, 8};
        int[] autumn = new int[]{9, 10, 11};

        for (int i = 0; i < winter.length; i++) {
            if (count == winter[i]) {
                System.out.println("Сейчас зима");
            }
        }
        for (int i = 0; i < spring.length; i++) {
            if (count == spring[i]) {
                System.out.println("Сейчас весна");
            }
        }
        for (int i = 0; i < summer.length; i++) {
            if (count == summer[i]) {
                System.out.println("Сейчас лето");
            }
        }
        for (int i = 0; i < autumn.length; i++) {
            if (count == autumn[i]) {
                System.out.println("Сейчас осень");
            }
        }

        //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        int[] numeric = new int[100];
        for (int i = 0; i < numeric.length; i++) {
            numeric[i] = i;
        }
        int odd = 0;
        for (int i = 1; i < numeric.length; i++)
        {
            if (i % 2 != 0)
            {
               System.out.print(i + " ");
            }
        }
    }
}
