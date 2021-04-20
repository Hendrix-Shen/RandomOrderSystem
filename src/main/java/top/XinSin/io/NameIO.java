package top.XinSin.io;

import top.XinSin.Enum.IO;
import top.XinSin.util.StudentName;
import top.XinSin.util.StudentNameList;

import java.io.*;
import java.util.ArrayList;

public class NameIO {
    private int index = 0;
    public NameIO() {

    }
    public IO read(){
        System.out.println("NameIO.read");
        File file = null;
        try {
            file = new File("1.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = "";
        try {
            while ((str = bufferedReader.readLine()) != null){
                str.trim();
                StudentNameList.List.add(new StudentName(str));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return IO.Read;
    }

    public IO write(String toWrite){
        ArrayList<String> list = new ArrayList<>();
        File file = new File("1.txt");
        /*if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str = "";
        try {
            while ((str = bufferedReader.readLine()) != null){
                str.trim();
                list.add(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String s : list) {
                writer.write(s + "\r\n");
            }
            writer.write(toWrite + "\r\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IO.Write;
    }
}
