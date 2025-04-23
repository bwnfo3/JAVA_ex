package ch11;
import java.io.*;
import java.util.*;
class Ex11_14 {
    static ArrayList record = new ArrayList();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        while(true) {
            switch(displayMenu()) {
                case 1:
                    inputRecord();
                    break;
                case 2:
                    displayRecord();
                    break;
                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }
    static int displayMenu(){

        System.out.println("******** 성적 관리 프로그램 ********");
        System.out.println();
        System.out.println("1. 학생성적 입력하기");
        System.out.println("2. 학생성적 보기");
        System.out.println("3. 프로그램 종료");
        System.out.println();
        System.out.println("원하는 메뉴를 선택하세요. (1~3) : ");

        int menu = 0;

        String menuNum = s.nextLine();
        menu = Integer.valueOf(menuNum);

//        checkMenu(menu);
//
//        static public void checkMenu(int menu) {
//            if(menu < 1 || menu > 3) {
//                System.out.println("잘못된 값을 입력했습니다.");
//                System.out.println("원하는 메뉴를 선택하세요. (1~3) : ");
//                String inputNum = s.nextLine();
//                int menuNum = Integer.valueOf(inputNum);
//                checkMenu(menuNum);
//            }
//        }

        return menu;
    }
    static void inputRecord() {
        System.out.println("1. 학생성적 입력하기");
        System.out.println("이름,반,번호,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요.");
        System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");

        while (true) {
            System.out.println(">>");
            String input = s.nextLine();
            if (input.equals("q")) {
                break;
            }
            String[] arr = input.split(",");
            Student s = new Student(arr[0],Integer.valueOf(arr[1]),Integer.valueOf(arr[2]),Integer.valueOf(arr[3]),Integer.valueOf(arr[4]),Integer.valueOf(arr[5]));
            record.add(s);
        }
    }
    static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;
        int length = record.size();

        if(length>0) {
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 정교등수 반등수");
            System.out.println("---------------------------------------");
            for (int i = 0; i < length; i++) {
                Student student = (Student) record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                mathTotal += student.math;
                englishTotal += student.eng;
                total += student.total;
            }
            System.out.println("---------------------------------------");
            System.out.println("총점 : " + koreanTotal +" "+ englishTotal +" "+ mathTotal +" "+ total);
            System.out.println();
        }
        else {
            System.out.println("************데이터가 없습니다***********");
        }
    }
}
class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank; // 반등수
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public int compareTo(Object o) {
        if(o instanceof Student) {
            Student tmp = (Student)o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank
                +","+classRank
                ;
    }
} // class Student
