# 17章练习

通过输入文件名与文件内容，根据文件名查找相应文件之后将内容写进去。

在这里我采用了2个函数

```java
//创建文件
    public static boolean createFile(String fileName, String fileContent)
//内容写入文件
  public static boolean writeFileContent(String fileFullName, String fileContent)
```

## 条理分析

1. 输入文件名字，内容
2. 根据文件名字查找对应文件createFile（）若么有则创建，如有则写入进行下一步
3. 执行第二步: writeFileContent（）将内容写入文件

* 其中第三步在这里要注意有两个流对象，一个是文件流，一个数据流

### 运行模式

 文件流out之后再进行数据流的out，之后关闭数据流，文件流