package serviceClasses;

import java.io.File;
import java.util.ArrayList;

public class PackageScanner {

    //This method finds all classes and creates list of annotated classes
    public ArrayList<Class<?>> getAnnotatedClasses(File dir) throws ClassNotFoundException {
        ArrayList<Class<?>> allClasses=new ArrayList<>();
        if(dir.exists() && dir.isDirectory()){
            String[] classArray=dir.list();
            for (String clazz:classArray) {
                if(clazz.endsWith(".class"))
                    allClasses.add(Class.forName(clazz.substring(0,clazz.length()-6)));
            }
        }

        ArrayList<Class<?>> annotatedClasses=new ArrayList<>();
        for(Class clazz:allClasses){
            if(clazz.getClass().getAnnotations().length!=0){
                annotatedClasses.add(clazz);
            }
        }
        return annotatedClasses;
    }
}
