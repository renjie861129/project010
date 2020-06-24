package cn.com.renjie;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/**
 * @author Buddha.ren
 * @create 2020-06-20 15:02
 */
public class HelloWorld {

    public static void main(String[] args) {


        System.out.println(args);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        System.out.println("HelloWorld.main");

        int i = 100;
        System.out.println("i = " + i);


        for (String arg : args) {
            
        }

        for (int j = 0; j < args.length; j++) {
            String arg = args[j];
            
        }


        System.out.println("hello XXXX!!!");


        System.out.println("hello XXXX!!!");
        System.out.println("hello XXXX!!!");


        System.out.println("hello XXXX!!!");

        final Date date1 = new Date();
        ArrayList list1 = new ArrayList();
        HashMap map1 = new HashMap();

        try {
            FileInputStream inputStream1 = new FileInputStream("D:\\toolsbak\\ideaIU\\doc");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
/*        System.out.println("11111!!!");
        System.out.println("22222!!!");*/

//        synchronized ()
    }
}
