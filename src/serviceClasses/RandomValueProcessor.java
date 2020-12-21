package serviceClasses;

import annotatedClasses.RandomValueGenerator;
import selfAnnotations.RandomIntegerValue;

import java.lang.annotation.Annotation;
import java.util.Random;

public class RandomValueProcessor {

    public void doProcess(Object rvg) throws IllegalAccessException {
        Annotation[] annotations=rvg.getClass().getDeclaredFields()[0].getAnnotations();
        for (Annotation annotation : annotations) {
            if(annotation instanceof RandomIntegerValue){
                rvg.getClass().getDeclaredFields()[0].setAccessible(true);
                rvg.getClass().getDeclaredFields()[0].setInt(rvg, new Random().nextInt(100));
            }
            System.out.println(annotation);
        }
    }
}
