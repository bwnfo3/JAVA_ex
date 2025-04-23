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
//    int classRank;
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
//        return name+" ,"+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage() + "," + classRank;
//    }
//    public int compareTo(Object o) {
//        if(o instanceof Student) {
//            Student s = (Student) o;
//            return s.total - this.total;
//        }
//        else { return -1; }
//    }
//}
//class ClassTotalComparator implements Comparator {
//    public int compare(Object o1, Object o2) {
//        Student s1 = (Student) o1;
//        Student s2 = (Student) o2;
//        if(s1.ban == s2.ban) {
//            return (int)(s2.total - s1.total);
//        }
//        else {
//            return s1.ban - s2.ban;
//        }
//    }
//}
//class Ex11_9 {
//    public static void calculateClassRank(List list) {
//        Collections.sort(list, new ClassTotalComparator());
//
//        int prevBan = -1;
//        int prevRank = -1;
//        int prevTotal = -1;
//        int length = list.size();
//
//        int sameRank = 1;
//        Iterator sit = list.iterator();
//        while (sit.hasNext()) {
//            Student s = (Student) sit.next();
//            if(s.ban != prevBan) {
//                prevBan = s.ban;
//                prevRank = -1;
//                prevTotal = -1;
//            }
//            if(s.getTotal() == prevTotal) {
//                s.classRank = prevRank;
//                sameRank++;
//            }
//            else {
//                s.classRank = prevRank + sameRank ;
//                sameRank = 1;
//            }
//            prevRank = s.classRank;
//            prevTotal = s.getTotal();
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(new Student("홍길동",1,1,100,100,100));
//        list.add(new Student("남궁성",1,2,90,70,80));
//        list.add(new Student("김자바",1,3,80,80,90));
//        list.add(new Student("이똥개",3,4,50,90,70));
//        list.add(new Student("엄준식",2,5,60,100,80));
//        list.add(new Student("김박사",2,1,70,90,60));
//
//        calculateClassRank(list);
//        Iterator it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//    }
//}
