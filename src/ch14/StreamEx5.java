package ch14;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.*;

class StreamEx5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김하나", 3, 1, 300),
                new Student("이둘",2,1,222),
                new Student("박셋",3,1,400),
                new Student("김넷",1, 2,450),
                new Student("최다섯",1,1, 400),
                new Student("강여섯",1,1, 500),
                new Student("이일곱",3,2,300)
        );

        Stream<Student> stuStrm = students.stream();
        stuStrm.sorted(Comparator.comparing(Student::getHak)
                        .thenComparing(Comparator.comparing(Student::getBan))
                        .thenComparing(Comparator.naturalOrder()))
            .forEach(System.out::println);

        stuStrm = students.stream();
/*
        Stream<String> stuNameStrm = stuStrm.map(Student::getName);
        stuNameStrm.forEach(System.out::println);

 */

//        Map<Integer, List<Student>> stuHakMap = students.stream()
//                .collect(Collectors.groupingBy(Student::getHak));
        Map<Integer, Map<Integer, List<Student>>> stuBanMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getHak,
                        Collectors.groupingBy(Student::getBan)
                ));

//        studentStream.sorted(
//                        Comparator.comparing(Student::getBan)
//                                .thenComparing(Comparator.naturalOrder())
//                )
//                .forEach(System.out::println);
    }
}
class Student implements Comparable<Student> {
    String name;
    int hak;
    int ban;
    int totalScore;

    Student(String name, int hak,int ban, int totalScore) {
        this.name = name;
        this.hak = hak;
        this.ban = ban;
        this.totalScore = totalScore;
    }
    public String toString() {
        return "[" + name + ", " + hak + ", " +ban + ", " + totalScore + "]";
    }
    String getName() { return this.name;}
    int getBan() { return this.ban;}
    int getHak() { return this.hak;}
    int getTotalScore() { return this.totalScore;}

    public int compareTo(Student o) {
        return o.totalScore - this.totalScore; //내림차순 정렬
    }
}