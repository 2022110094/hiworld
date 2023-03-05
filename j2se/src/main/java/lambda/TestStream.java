package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import charactor.Hero;
/**
 * @author 10919
 * @version 1.0
 * Create by 2023/3/5 16:07
 */

public class TestStream {
    public static void main(String[] args) {
        Random r = new Random();
        List <Hero> heroes = new ArrayList<>();
        for(int i=0;i<10;i++){
            heroes.add(new Hero("hero"+i,r.nextInt(100),r.nextInt(100)));
        }
        //System.out.println(heroes);
        //Collections.sort(heroes,(h1, h2)->h1.hp>=h2.hp?1:-1);
        //System.out.println(heroes);
        //System.out.println(heroes.get(7).name);


        heroes
                .stream()
                .sorted((h1, h2)->h1.hp<=h2.hp?1:-1)
                .forEach(hero -> System.out.println(hero));

        System.out.println(heroes.get(2).name);
    }
}
