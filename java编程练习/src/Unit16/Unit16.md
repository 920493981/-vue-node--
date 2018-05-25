# 16章 java学习体会

题目，转换数组长度（反射）

## 反射理解

* 按照我自己的理解的话就是说反射能够在开发者想查看其它合作人员的包（package）与类（class）情况

在这里我用的有

```Java
//通过返回类型确定强制类型转换方式(int[])
    int[] newArray = (int[]) changeArrLength(intArray, 10);
```

```java
//获得数组
Class<?> arr = obj.getClass().getComponentType();
        Object newArr = Array.newInstance(arr, len);
```

其实学反射我怕把自己返老还童了