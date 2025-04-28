package ch14;
import java.util.*;

class LamdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            list.add(i);
        }

        //list의 모든 요소 출력
        list.forEach( i -> System.out.print(i));
        System.out.println();

        //list에서 2와 3의 배수 제거
        list.removeIf( i -> i % 2 == 0 || i % 3 == 0);
        System.out.println(list);

        list.replaceAll( i -> i * 10);
        System.out.println(list);

        Map<String, String> strMap = new HashMap<>();
        strMap.put("1","1");
        strMap.put("2","2");
        strMap.put("3","3");
        strMap.put("4","4");

        //strMap의 모든 요소를 {k,v}형식으로 출력
        strMap.forEach((k,v) -> System.out.print("{" + k + "," + v + "}, "));
        System.out.println();
    }
}
