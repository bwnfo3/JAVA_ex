package ch14;
import java.io.*;
import java.util.stream.*;
class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
            new File("Ex2.java"), new File("Ex1"),new File("Ex1.txt")};

        Stream<File> files = Stream.of(fileArr); //파일 스트림 생성

        Stream<String> filesName = files.map(File::getName); //map으로 파일 이름 스트림으로 변환
        filesName.forEach(System.out::println);
        System.out.println();
        files = Stream.of(fileArr);

        files.map(File::getName)
                .filter(s -> s.indexOf('.')!=-1) //확장자 없는 것 제외
                .map(s -> s.substring(s.indexOf('.') + 1)) //확장자만 추출
                .map(String::toUpperCase) //모두 대문자로 변환
                .distinct() //중복 제거
                .forEach(System.out::println);
    }
}
