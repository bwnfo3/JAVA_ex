package ch11;
import java.util.*;

class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // autoboxing에 의해 기본형 -> 참조형
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //list1의 1인덱스~3인덱스 복사
        //subList로 만들어지는 리스트는 읽기 전용
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        //배열 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) :" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");

        //인덱스3에 추가하고 "AA"로 변경
        list2.add(3,"A");
        list2.set(3, "AA");
        print(list1, list2);

        //list1에서 list2와 겹치는 부분만 남기고 나머지 삭제
        System.out.println("list1.retainAll(list2) :" + list1.retainAll(list2));
        print(list1, list2);

        //list2에서 list1에 포함된 부분 삭제
        for(int i = list2.size() -1;i>=0;i--) {
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1, list2);
    }
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }

}
