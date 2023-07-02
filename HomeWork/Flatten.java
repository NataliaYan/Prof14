package lesson5.HomeWork;

import java.util.Arrays;

public class Flatten {
    public static void main(String[] args) {
//        Напишите функцию для "уплощения" передаваемого в нее двухмерного массива.
//        public static int [] flatten(int [] [] a)
//        То есть, если, например, в функцию передается массив {{1,2,3}, {4}}
//        то нужно выдавать массив {1,2,3,4}

        int[][] a = new int[][]{
                {1, 3, 5},      // 0
                {4},               // 1
//                {-10, 20, -40, 5}  // 2
        };
        flatten(a);
    }

    public static int[] flatten(int[][] a) {

        int x = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                x++;
            }
        }
        int[] c = new int[x];
        int index=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[index] = a[i][j];
                index++;
            }
        }
        System.out.println(Arrays.toString(c));
        return c;
    }
}
