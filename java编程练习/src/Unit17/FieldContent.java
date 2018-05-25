package Unit17;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FieldContent {
    public static String path = "F:\\Project\\JavaIDEA\\test\\src\\Unit17\\";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //fieldName and content
        String fileName,fileContent;
        System.out.print("Please write the name of Field: ");
        fileName = in.nextLine();
        System.out.print("Please write the content of Field: ");
        fileContent = in.nextLine();

        //给文件填充内容
        createFile(fileName,fileContent);
    }
    //创建文件
    public static boolean createFile(String fileName, String fileContent) {
        Boolean bool = false;
        String fileFullName = path + fileName + ".txt";
        File file = new File(fileFullName);

        try {
            if (!file.exists()) {
                file.createNewFile();
                bool = true;
                System.out.println("success create file, fileName: " + fileName);
                writeFileContent(fileFullName, fileContent);
            } else {
                System.out.println("The file is exist of: " + fileName);
                writeFileContent(fileFullName, fileContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }

    public static boolean writeFileContent(String fileFullName, String fileContent){
        Boolean bool = false;
        try {
            File file = new File(fileFullName);
            FileOutputStream fs = new FileOutputStream(file);
            DataOutputStream ds = new DataOutputStream(fs);

            ds.writeUTF(fileContent);
            ds.close();
            fs.close();
            System.out.println("successful write the content: " + fileContent);
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bool;
    }
}
