//package ch14;
//import org.w3c.dom.ls.LSOutput;
//
//import java.util.*;
//import java.util.stream.*;
//
//class StreamEx1 {
//    public static void main(String[] args) {
//       Stream<Student> studentStream = Stream.of(
//               new Student("김하나", 3, 300),
//               new Student("이둘",2,222),
//               new Student("박셋",3,400),
//               new Student("김넷",1,450),
//               new Student("최다섯",1,400),
//               new Student("강여섯",1,500),
//               new Student("이일곱",3,300)
//       );
//       studentStream.sorted(
//               Comparator.comparing(Student::getBan)
//                       .thenComparing(Comparator.naturalOrder())
//               )
//               .forEach(System.out::println);
//    }
//}
//class Student implements Comparable<Student> {
//    String name;
//    int ban;
//    int totalScore;
//
//    Student(String name, int ban, int totalScore) {
//        this.name = name;
//        this.ban = ban;
//        this.totalScore = totalScore;
//    }
//    public String toString() {
//        return "[" + name + ", " + ban + ", " + totalScore + "]";
//    }
//    String getName() { return this.name;}
//    int getBan() { return this.ban;}
//    int getTotalScore() { return this.totalScore;}
//
//    public int compareTo(Student o) {
//        return o.totalScore - this.totalScore; //내림차순 정렬
//    }
//}