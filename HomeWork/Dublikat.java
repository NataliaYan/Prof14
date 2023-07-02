package lesson5.HomeWork;

import java.util.Arrays;

public class Dublikat {
    public static void main(String[] args) {
        int a[] = new int[]{1, 7, 5, 3, -20, 75, 4, 98, 10};
        int b[] = new int[]{2, 7, 8, 4, -1, 8, 9, 45, 7};


//        Напишите функцию, которая найдет в двух массивах одинаковые элементы и вернет их в виде массива
//        (порядок не важен)
//        public static int [] findDuplicates(int [] a, int [] b)
//        Пример: {2,3,1}, {4,5,3,2} -> {2,3}
//        Подумайте над оптимизацией - возможно, предварительная сортировка сможет как-то помочь?

        findDuplicates(a, b);

    }

    public static int[] findDuplicates(int[] a, int[] b) {
        System.out.println("Первичные данные");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("После сортировки");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int i = 0;
        int j = 0;
        int x = 0;


        // массив B сокращаем на повторения

        int y = 0;
        for (i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                y++;
            }
        }
        int[] aNew = new int[a.length - y];
        j = 0;
        aNew[j] = a[0];
        for (i = 1; i < aNew.length; i++) {
            if (a[i] != a[i - 1]) {
                j++;
                aNew[j] = a[i];
            }
        }
        System.out.println("Отсортированный и сокращенный массив А");
        System.out.println(Arrays.toString(aNew));

        // массив B сокращаем на повторения
        y = 0;
        for (i = 1; i < b.length; i++) {
            if (b[i] == b[i - 1]) {
                y++;
            }
        }
        int[] bNew = new int[b.length - y];
        j = 0;
        bNew[j] = b[0];
        for (i = 1; i < b.length; i++) {
            if (b[i] != b[i - 1]) {
                j++;
                bNew[j] = b[i];
            }
        }
        System.out.println("Отсортированный и сокращенный массив B");
        System.out.println(Arrays.toString(bNew));

// ищем количество повторений в обоих массивах для задания размера нового массива
        y = 0;
        for (i = 0; i < aNew.length; i++) {
            for (j = 0; j < bNew.length; j++) {
                if (aNew[i] == bNew[j]) {
                    y++;
                }
            }
        }


//ищем дубликаты
        int[] d = new int[y];
        int index = 0;
        for (i = 0; i < aNew.length; i++) {
            for (j = 0; j < bNew.length; j++) {
                if (aNew[i] == bNew[j]) {
                    d[index] = aNew[i];
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(d));
        return d;
    }

}

//                 Arrays.binarySearch(b, a[i]) с помощью ?






