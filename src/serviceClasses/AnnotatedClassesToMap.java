package serviceClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnnotatedClassesToMap {
    //This method returns HashMap of annotated classes with key(class name) and value(class object)
    public Map<String,Class<?>> createAnnoClassesMap(ArrayList<Class<?>> annotatedClasses) throws IllegalAccessException, InstantiationException {
        Map<String,Class<?>> classesMap=new HashMap<>();
        for (Class<?> clazz:annotatedClasses) {
            classesMap.put(clazz.getName(), clazz.getClass().newInstance());
        }
        return classesMap;
    }
}
