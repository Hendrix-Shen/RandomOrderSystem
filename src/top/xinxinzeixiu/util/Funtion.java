package top.xinxinzeixiu.util;

import top.xinxinzeixiu.io.ObjectIO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Funtion implements Serializable {

    private int i = 0;

    private String Name;

    public static  final ArrayList<String> List = new ArrayList<>();
    public final Random random = new Random();

    public Funtion() {
    }

    /**
     * @method call 随机点名方法
     * @return 返回随机完成得元素
     */
    public String call(){
        try {
            int value = random.nextInt(List.size());
            String name = List.get(value);
            List.remove(value);
            return name;
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            return "没有名字啦";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funtion funtion = (Funtion) o;
        return i == funtion.i &&
                Objects.equals(Name, funtion.Name) &&
                Objects.equals(List, funtion.List) &&
                Objects.equals(random, funtion.random);
    }

}
