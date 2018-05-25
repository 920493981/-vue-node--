package Unit16;

import java.lang.reflect.Array;

public class test1 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        //通过返回类型确定强制类型转换方式(int[])
        int[] newArray = (int[]) changeArrLength(intArray, 10);

        print(newArray);
    }
//转换数组长度
    public static Object changeArrLength(Object obj, int len) {
        //getComponentType()可能是获得数组相关的length相关的，便于后面的
        //newInstance()更改数组长度。
        Class<?> arr = obj.getClass().getComponentType();
        Object newArr = Array.newInstance(arr, len);
        int lenObj = Array.getLength(obj);
        System.arraycopy(obj,0,newArr,0,lenObj);
        return newArr;
    }

    public static void print(Object obj) {
        Class<?> o = obj.getClass();//获取参数类型
        if(!o.isArray()){
            return;
        }
        int length = Array.getLength(obj);
        System.out.println("\nArray length: " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(Array.get(obj,i) + " ");
        }
    }
}
