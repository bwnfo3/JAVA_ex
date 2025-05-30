package ch14;
import java.util.function.*;
import java.util.*;
class LamdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i % 10 * 10;
        List<Integer> list = new ArrayList<>();

        makeRandomList(s, list);
        System.out.println(list);

        printEvenNum(p, c, list);

        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }
    public static <T> List<T> doSomething(Function<T,T> f, List<T> list) {
        List<T> newList = new ArrayList<>();
        for(T i : list) {
            newList.add(f.apply(i)); //list의 요소의 1의자리요소만 *10 해서 저장
        }
        return newList;
    }
    public static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for(T i : list) {
            if(p.test(i)) { // i % 2 == 0인 요소만
                c.accept(i); //조건에 해당되는 요소 System.print.print( i + ", ")
            }
        }
        System.out.println("]");
    }
    public static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for(int i = 0; i < 10; i++) {
            list.add(s.get()); //랜덤 숫자 저장
        }
    }
}
