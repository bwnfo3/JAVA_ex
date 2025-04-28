package ch14;
import java.util.*;
import java.util.stream.*;
class StreamEx4 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "dfg", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

        //Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase) //전부 소문자로 전환
                .distinct() //중복제거
                .sorted() //정렬
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or nit It is true",
                "Do or do not There is no try",
        };
        Stream<String> lineStrm = Arrays.stream(lineArr);
        lineStrm.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");

        Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
        Stream<String> strStream = strStrmStrm.map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);
    }
}
