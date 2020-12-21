package annotatedClasses;

import selfAnnotations.RandomIntegerValue;

public class RandomValueGenerator {
    @RandomIntegerValue
    public int value;

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
