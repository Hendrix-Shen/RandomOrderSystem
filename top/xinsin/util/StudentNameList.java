package top.xinsin.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class StudentNameList implements Serializable {
    private static final long serialVersionUID = 5955141326133509608L;
    public static final ArrayList<StudentName> List = new ArrayList<>();
    private final Random random = new Random();

    public StudentNameList() {

    }

    public String get(){
        for(Object obj:List){
            System.out.println(obj);
        }
        return null;
    }

    public String call(){
        try {
            int value = random.nextInt(List.size());
            Object studentName = List.get(value);
            String str = ((StudentName) studentName).getName();
            List.remove(value);
            return str;
        }catch (IllegalArgumentException e){
            return "没有名字啦";
        }
    }
}
