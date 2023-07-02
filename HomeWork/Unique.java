package lesson5.HomeWork;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int a[] = new int[]{1, 7, 5, 3, -20, 75, 4, 98, 10};
        int b[] = new int[]{2, 7, 8, 4, -1, 8, 9, 45, 7};

//        Напишите функцию, которая найдет в двух массивах уникальные элементы и вернет их в виде массива
//        (порядок не важен)
//        public static int [] findUnique(int [] a, int [] b)
//        Пример: {2,3,1}, {4,5,3,2} -> {1,4,5}
//        Подумайте над оптимизацией - возможно, предварительная сортировка сможет как-то помочь?

        findUnique(a, b);
    }

    public static int[] findUnique(int[] a, int[] b) {
        System.out.println("Первичные данные");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

//        объединим два массива
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
        System.out.println("Объедененный массив");
        System.out.println(Arrays.toString(c));

        // сокращаем на повторения
        Arrays.sort(c);
        System.out.println("После сортировки");
        System.out.println(Arrays.toString(c));
        int y = 0;
        for (i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1]) {
                y++;
            }
        }
        System.out.println(y);
        int[] cNew = new int[c.length - y];
        j = 0;
        cNew[j] = c[0];
        for (i = 1; i < c.length; i++) {
            if (c[i] != c[i - 1]) {
                j++;
                cNew[j] = c[i];
            }
        }
        System.out.println("Уникальные данные");
        System.out.println(Arrays.toString(cNew));
        return cNew;
    }
}
