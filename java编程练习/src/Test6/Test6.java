package Test6;

import java.util.Arrays;

public class Test6 {
    public static void main (String []args) {
        //练习6.1 数组数据的复制 arr1中的0-3元素复制到arr2中，并输出arr1，arr2
        System.out.println("练习6.1 数组数据的复制 arr1中的0-3元素复制到arr2中，并输出arr1，arr2");
        int[] arr1 = new int[] {5,3,6,7,21,1,13};
        int[] arr2 = new int[4];

        for (int i = 0; i < arr2.length; i++) {
            Arrays.fill(arr2, i, i+ 1, arr1[i]);
        }

        System.out.println("This is arr1: ");
        for (int e : arr1) {
            System.out.print(e + " ");
        }

        System.out.println("\n This is arr2: ");
        for (int e : arr2) {
            System.out.print(e + " ");
        }

        //练习6.2 输出数组中的最小值
        System.out.println("\n练习6.2 输出数组中的最小值");
        int smallerNumber = arr1[0];

        for (int i = 0; i < arr1.length - 1; i++ ) {
            if(arr1[i] > arr1[i + 1] && arr1[i + 1] < smallerNumber) {
                smallerNumber = arr1[i + 1];
            }
        }
        System.out.println("arr1中最小值是: " + smallerNumber);

        //练习6.3 将数组中索引是2的元素替换为“bb”，并将替换前后的数组全部输出
        System.out.println("\n练习6.3 将数组中索引是2的元素替换为“bb”，并将替换前后的数组全部输出");
        String[] arr = new String[]{"q", "w", "r", "t", "y", "u", "i"};
        System.out.println("数组没变化之前： ");
        for (String e : arr){
            System.out.print(e + ' ');
        }

        Arrays.fill(arr, 2, 3, "bb");
        System.out.println("\n数组变化之后： ");
        for (String e : arr){
            System.out.print(e + ' ');
        }

        //练习6.4  将二维数组中的行列对调显示出来  对角线右边的与左边的对调
        System.out.println("练习6.4  将二维数组中的行列对调显示出来  对角线右边的与左边的对调");
        int swapNum ;
        int[][] swopArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("原二维数组: ");
        for ( int i = 0; i < swopArr.length; i++ ) {
            for ( int j = 0; j < swopArr[i].length; j++ ) {
                System.out.print(swopArr[i][j] + " ");
            }
            System.out.print("\n");
        }

        for ( int i = 0; i < swopArr.length; i++ ) {
            for ( int j = i + 1; j < swopArr[i].length; j++ ) {
                swapNum = swopArr[i][j];
                swopArr[i][j] = swopArr[j][i];
                swopArr[j][i] = swapNum;
            }
        }

        System.out.println("现二维数组: ");
        for ( int i = 0; i < swopArr.length; i++ ) {
            for ( int j = 0; j < swopArr[i].length; j++ ) {
                System.out.print(swopArr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
