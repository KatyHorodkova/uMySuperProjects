package com.it.Utils;

import java.util.Random;
import java.util.stream.Collectors;

public class Utils {
    public static class String{
        public static java.lang.String getRandom(int count){
        return new Random().ints('A','z')
        .limit(count)
        .mapToObj(s-> ""+(char)s)
        .collect(Collectors.joining());
        }
    }
}
