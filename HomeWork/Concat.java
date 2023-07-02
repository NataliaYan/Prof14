package lesson5.HomeWork;

import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {
//        Напишите функцию, принимающую на вход два массива целых и возвращающую один массив,
//                содержащий все их элементы
//        public static int [] concat(int [] a, int [] b)
//        Пример: {1,2,3}, {4,5} -> {1,2,3,4,5}

        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        concat(a, b);

    }

    public static int[] concat(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int c[] = new int[a.length + b.length];
        for (i = 0; i < a.length; i++) {
            c[j] = a[i];
            j++;
        }
        for (i = 0; i < b.length; i++) {
            c[j] = b[i];
            j++;
        }

        // вывод первый париант
        System.out.println(Arrays.toString(c));

        // вывод второй вариант
        System.out.print("array c [ ");
        for (j = 0; j < c.length-1; j++) {
            System.out.print(c[j] + ", ");
        }
        System.out.println(c[j]+ " ]");
        return c;
    }
}
