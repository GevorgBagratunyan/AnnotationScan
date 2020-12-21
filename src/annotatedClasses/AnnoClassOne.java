package annotatedClasses;

import selfAnnotations.MyAnnotation;

@MyAnnotation(classCreator = "George")
public class AnnoClassOne {
    public int a,b;
    private String className;

    public AnnoClassOne(String className){
        this.className=className;
    }

    @Override
    public String toString(){
        return className;
    }

}
