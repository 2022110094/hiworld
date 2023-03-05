package cn.how2j.jsoup;

/**
 * @author 10919
 * @version 1.0
 * Create by 2023/3/5 14:26
 */

public class Test5 {
    public static String random(int length) {
        String crString = "";
        short as[] = new short[length];
        for(int i =0;i<as.length;i++) {
            int key = (int)(Math.random()*3);
            switch (key) {
                case 0:
                    as[i] = (short)(Math.random()*(122-97)+97);
                    break;
                case 1:
                    as[i] = (short)(Math.random()*(90-65)+65);
                    break;
                case 2:
                    as[i] = (short)(Math.random()*(57-48)+48);

            }
        }
        for(short d:as) {
            char c = (char)d;
            crString += c ;
        }
        return crString;
    }

    public static void main(String[] args) {
        System.out.println(random(2));
    }
}
