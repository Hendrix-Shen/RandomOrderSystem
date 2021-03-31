package top.xinxinzeixiu.io;

import top.xinxinzeixiu.util.Funtion;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ObjectIO {
    public ObjectIO() {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(this.getClass().getResourceAsStream("/top/xinxinzeixiu/assets/1.txt"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = "";
        str = new String(str.getBytes(StandardCharsets.UTF_8));
        try {
            while ((str = bufferedReader.readLine()) != null){
                str.trim();
                Funtion.List.add(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
