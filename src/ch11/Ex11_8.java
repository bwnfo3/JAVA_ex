//package ch11;
//import java.util.*;
//class Student implements Comparable{
//    String name;
//    int ban;
//    int no;
//    int kor, eng, math;
//
//    int total;
//    int schoolRank;
//
//    Student(String name, int ban, int no, int kor, int eng, int math) {
//        this.name = name;
//        this.ban = ban;
//        this.no = no;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//
//        total = kor+eng+math;
//    }
//    int getTotal() {
//        return kor + eng + math;
//    }
//    float getAverage() {
//        return (int) ((getTotal() / 3f) *10 + 0.5) /10f;
//    }
//    public String toString() {
//        return name+" ,"+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage() + "," + schoolRank;
//    }
//    public int compareTo(Object o) {
//        if(o instanceof Student) {
//            Student s = (Student) o;
//            return s.total - this.total;
//        }
//        else { return -1; }
//    }
//}
//public class Ex11_8 {
//    public static void calculateSchholRank(List list) {
//        Collections.sort(list);
//
//        int prevRank = -1;
//        int prevTotal = -1;
//        int length = list.size();
//
//        int sameRank = 0;
//        Iterator sit = list.iterator();
//        while (sit.hasNext()) {
//            Student s = (Student) sit.next();
//            if(s.getTotal() == prevTotal) {
//                s.schoolRank = prevRank;
//                sameRank++;
//            }
//            else {
//                s.schoolRank = prevRank + sameRank + 1;
//                sameRank = 0;
//            }
//            prevRank = s.schoolRank;
//            prevTotal = s.getTotal();
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(new Student("홍길동",1,1,100,100,100));
//        list.add(new Student("남궁성",1,2,90,70,80));
//        list.add(new Student("김자바",1,3,80,80,90));
//        list.add(new Student("이똥개",1,4,50,90,70));
//        list.add(new Student("엄준식",1,5,60,100,80));
//
//        calculateSchholRank(list);
//        Iterator it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//    }
//}
