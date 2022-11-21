package oo.ex1;

import java.lang.reflect.Field;

public class Main {
    public static Integer primitive2(Integer i1){
        i1=2;
        System.out.println("inside" +i1);
        return i1;
    }

    public static void primitive3(Integer i1) throws NoSuchFieldException, IllegalAccessException{
        Field field = i1.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(i1,2);
    }


    public static void main(String[] args){
        try{
            int a = 3;
            Integer p1 =new Integer(200);
            p1 = primitive2(p1);
            System.out.println(p1);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
