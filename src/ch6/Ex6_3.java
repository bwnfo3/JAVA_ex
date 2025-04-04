package ch6;

import java.sql.SQLOutput;

class Student {
    String name; //학생이름
    int ban; //반
    int no; //번호
    int kor; //국어점수
    int eng; //영어점수
    int math; //수학점수

    int getTotal() {
        return this.kor + this.eng + this.math;
    }
    float getAverage(){
        float result = this.getTotal() / (float)3;
        result = (float)Math.round(result * 10) / 10;
        return result;
    }
//    Student() {
//
//    }
//    Student(String name, int ban, int no, int kor, int eng, int math) {
//        this.name = name;
//        this.ban = ban;
//        this.no = no;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
    Student(String n, int b, int nu, int k, int e, int m) {
        name = n;
        ban = b;
        no = nu;
        kor = k;
        eng = e;
        math = m;
    }
    String info() {

        String info = this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math;
        info += "," + this.getTotal();
        info += "," + this.getAverage();
        return info;
    }

}
public class Ex6_3 {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.name = "홍길동";
//        s.ban = 1;
//        s.no = 1;
//        s.kor = 100;
//        s.eng = 60;
//        s.math = 76;
//
//        System.out.println("이름 : " + s.name);
//        System.out.println("총점 : " + s.getTotal());
//        System.out.println("평균 : " + s.getAverage());

        Student s2 = new Student("아무개",2,2,66,77,88);
        System.out.println(s2.info());
    }
}
