//package ch11;
//import java.util.*;
//class Student implements Comparable{
//    String name;
//    int ban;
//    int no;
//    int kor, eng, math;
//
//    Student(String name, int ban, int no, int kor, int eng, int math) {
//        this.name = name;
//        this.ban = ban;
//        this.no = no;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
//    int getTotal() {
//        return kor + eng + math;
//    }
//    float getAverage() {
//        return (int) ((getTotal() / 3f) *10 + 0.5) /10f;
//    }
//    public String toString() {
//        return name+" ,"+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
//    }
//    public int compareTo(Object o) {
//        if(o instanceof Student) {
//            Student s = (Student) o;
//            return this.name.compareTo(s.name);
//        }
//        else { return -1; }
//    }
//}
//public class Ex11_5 {
//    static int getGroupCount(TreeSet tset, int from, int to) {
//        Student s1 = new Student("",0,0,from,from,from);
//        Student s2 = new Student("",0,0,to,to,to);
//
//        return tset.subSet(s1, s2).size();
//    }
//    public static void main(String[] args) {
//        TreeSet tset = new TreeSet(new Comparator(){
//            public int compare(Object o1, Object o2) {
//                if(o1 instanceof Comparable && o2 instanceof Comparable) {
//                    Student s1 = (Student) o1;
//                    Student s2 = (Student) o2;
//
//                    return (int)(s1.getAverage() - s2.getAverage());
//                }
//                else {
//                    return -1;
//                }
//            }
//        });
//        //ArrayList list = new ArrayList();
//        tset.add(new Student("홍길동",1,1,100,100,100));
//        tset.add(new Student("남궁성",1,2,90,70,80));
//        tset.add(new Student("김자바",1,3,80,80,90));
//        tset.add(new Student("이똥개",1,4,50,90,70));
//        tset.add(new Student("엄준식",1,5,60,100,80));
//
//        Iterator it = tset.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        System.out.println("[60~69] :" + getGroupCount(tset,60,70));
//        System.out.println("[70~79] :"+getGroupCount(tset,70,80));
//        System.out.println("[80~89] :"+getGroupCount(tset,80,90));
//        System.out.println("[90~100] :"+getGroupCount(tset,90,101));
//    }
//}
