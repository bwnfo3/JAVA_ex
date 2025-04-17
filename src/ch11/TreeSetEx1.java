package ch11;
import java.util.*;
class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc"); set.add("df"); set.add("cat");
        set.add("Dog"); set.add("birds"); set.add("happy");
        set.add("dZZZ"); set.add("elephant"); set.add("flower");
        set.add("apple"); set.add("dog");

        System.out.println(set);
        System.out.println("range search : from" + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz")); //대소문자 구분돼서 Dog는 출력안됨
    }
}
