package annotatedClasses;

import selfAnnotations.MyAnnotation;

@MyAnnotation(classCreator = "George")
public class AnnoClassTwo {

    String name;
    int age;

    public  AnnoClassTwo(){
        name="John Smith";
        age=58;
    }

}
