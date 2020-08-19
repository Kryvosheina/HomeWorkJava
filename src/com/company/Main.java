package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //   Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
        System.out.println("№1.1. Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел. решение через массив и цикл for");
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
        int counter = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (max == nums[i])
            {
                counter++;
            };

            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("Максимальное число в массиве : " + max);
        System.out.println("Минимальное число в массиве : " + min);
        System.out.println("Количество максимальных чисел : " + counter);

        //   Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
        //решение без массива и цикла
        System.out.println("№1.2. Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел. решение через if-else");
       System.out.println("Введите 5 целых чисел");

       int a=0,b=0,c=0,d = 0,e=0, min2=0, max2=0; int counter2 = 0;
       isValid = false;

       while (!isValid) {
           System.out.println("Введите 1-e число :");
           if (inI.hasNextInt()) {
               a = inI.nextInt();
               isValid = true;
           } else {
               System.out.println("Введите только целое число!");
               inI.next();
           }
       }
       isValid = false;
       while (!isValid) {
           System.out.println("Введите 2-e число :");
           if (inI.hasNextInt()) {
               b = inI.nextInt();
               isValid = true;
           } else {
               System.out.println("Введите только целое число!");
               inI.next();
           }
       }
        isValid = false;
        while (!isValid) {
            System.out.println("Введите 3-e число :");
            if (inI.hasNextInt()) {
                c = inI.nextInt();
                isValid = true;
            } else {
                System.out.println("Введите только целое число!");
                inI.next();
            }
        }
        isValid = false;
        while (!isValid) {
            System.out.println("Введите 4-e число :");
            if (inI.hasNextInt()) {
                d = inI.nextInt();
                isValid = true;
            } else {
                System.out.println("Введите только целое число!");
                inI.next();
            }
        }
        isValid = false;
        while (!isValid) {
            System.out.println("Введите 5-e число :");
            if (inI.hasNextInt()) {
                e = inI.nextInt();
                isValid = true;
            } else {
                System.out.println("Введите только целое число!");
                inI.next();
            }
        }
        int temp_max1 = 0; int temp_max2 = 0; int temp_min1 = 0; int temp_min2 = 0;
        if (a > b)
        {
            temp_max1 = a;
            temp_min1 = b;
        }
        if (b > a)
            {
                temp_max1 = b;
                temp_min1 = a;
            }
        if (a==b)
                {
                    temp_max1 = a;
                    temp_min1 = b;
                    counter2 = counter2 + 2;
                }
        if (c > d)
        {
            temp_max2 = c;
            temp_min2 = d;
        }
        if (d > c)
        {
            temp_max2 = d;
            temp_min2 = c;
        }
        if (c==d)
        {
            temp_max2 = c;
            temp_min2 = d;
            counter2 = counter2 + 2;
        }
        if (temp_max1 > temp_max2)
        {
            max2 = temp_max1;
        }
        if (temp_max2 > temp_max1)
        {
            max2 = temp_max2;
        }
        if (temp_max1 == temp_max2)
        {
            max2 = temp_max1;
            counter2 = counter2 + 2;
        }
        if (temp_min1 > temp_min2)
        {
            min2 = temp_min2;
        }
        if (temp_min2 > temp_min1)
        {
            min2 = temp_min1;
        } else
            {
                min2 = temp_min1;
            }

        if (e > max2)
        {
            max2 = e;
        } else if (max2 == e)
        {
            counter2 = counter2 + 1;
        }

        if (min2 > e)
        {
            min2 = e;
        }

       System.out.println("Максимальное число в массиве : " + max2);
       System.out.println("Минимальное число в массиве : " + min2);
       System.out.println("Количество максимальных чисел : " + counter2);


        // Даны имена 2х человек (тип String).
        // Если имена равны, то вывести сообщение о том, что люди являются тезками.
        System.out.println("№2. Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.");
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
        System.out.println("№3.1. Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль. решение через массивы");
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

        //Дано число месяца (тип int). Необходимо определить время года
        // (зима, весна, лето, осень) и вывести на консоль.
        System.out.println("№3.2. Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль. решение через switch");
        isValid = false;
        System.out.println("введите число месяца :");
        while (!isValid) {
            if (inI.hasNextInt()) {
                count = inI.nextInt();
                isValid = true;
            } else {
                System.out.println("Введите только целое число!");
                inI.next();
            }
        }
        switch (count) {
            case 1:
            case 2:
            case 12: System.out.println("зима");break;
            case 3:
            case 4:
            case 5: System.out.println("весна");break;
            case 6:
            case 7:
            case 8: System.out.println("лето");break;
            case 9:
            case 10:
            case 11: System.out.println("осень");break;

            default: System.out.println("Введите число от 1 до 12 :");
        }

         //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        System.out.println("№4.1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        int[] numeric = new int[100];
        for (int i = 0; i < numeric.length; i++)
        {
            numeric[i] = i;
        }

        for (int i = 1; i < numeric.length; i++)
        {
            if (i % 2 != 0)
            {
               System.out.print(i + " ");
            }
        }
        System.out.println("  ");
        //При помощи цикла while вывести на экран нечетные числа от 1 до 99.
        System.out.println("№4.2. При помощи цикла while вывести на экран нечетные числа от 1 до 99.");
        int[] numeric2 = new int[100];
        for (int i = 0; i < numeric2.length; i++)
        {
            numeric2[i] = i;
        }

        int j = 0;
        do
        {
            if (j % 2 != 0)
            {
                System.out.print(j + " ");
            }
            j = j + 1;
        } while ( j < numeric2.length);
        System.out.println("  ");

        //Дано число n при помощи цикла for посчитать факториал n!
        System.out.println("№5.1. Дано число n при помощи цикла for посчитать факториал n!");
        System.out.println("  ");
        int res = 1;
        int n = 0;
        isValid = false;
        System.out.println("Введите число, факториал которого необходимо вычислить :");
        if (inI.hasNextInt())
        {
            n = inI.nextInt();
            isValid = true;
        } else {
            System.out.println("Введите только целое число!");
            inI.next();
        }

        for (int i = 1; i <= n; i++)
        {
            res = res * i;
        }
        System.out.println("Факториал числа " + n +" = "+ res);

        //Дано число n при помощи цикла while посчитать факториал n!
        System.out.println("№5.2. Дано число n при помощи цикла while посчитать факториал n!");
        System.out.println("  ");
        res = 1;
        n = 0;
        isValid = false;
        System.out.println("Введите число, факториал которого необходимо вычислить :");
        if (inI.hasNextInt())
        {
            n = inI.nextInt();
            isValid = true;
        } else {
            System.out.println("Введите только целое число!");
            inI.next();
        }
        int i = 1;
        do
        {
            res = res * i;
            i = i + 1;
        } while (i <= n);
        System.out.println("Факториал числа " + n +" = "+ res);

        //Даны переменные x и n вычислить x^n.
        double x, y, result;
        System.out.println("6. Даны переменные x и n вычислить x^n.");
        System.out.println("    ");
        System.out.println("Введите переменную х : ");
        x = inI.nextDouble();
        System.out.println("Введите переменную y : ");
        y = inI.nextDouble();
        result = Math.pow(x,y);
        System.out.println("Значение " + x + " в степени " + y + " = " + result);
    }


}
