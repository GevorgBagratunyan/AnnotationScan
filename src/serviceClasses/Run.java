package serviceClasses;

import java.io.File;
import java.util.Map;

public class Run {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {

        File packageDir=new File("D:/Java Projects/AnnotationScan/out/production/AnnotationScan/annotatedClasses");
        PackageScanner ps=new PackageScanner();
        AnnotatedClassesToMap actm=new AnnotatedClassesToMap();
        Map<String,Class<?>> map=actm.createAnnoClassesMap(ps.getAnnotatedClasses(packageDir));

    }
}
