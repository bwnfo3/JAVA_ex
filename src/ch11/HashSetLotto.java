package ch11;
import java.util.*;
public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();
        Set linkSet = new LinkedHashSet();

        for(int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 10);
            set.add(num);
            linkSet.add(num);
        }

        System.out.println(set); //순서 x
        System.out.println(linkSet); //저장순서대로 저장
    }
}
