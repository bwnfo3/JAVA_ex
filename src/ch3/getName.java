package ch3;

public class getName {
    public static void main(String[] args) {
        String s = "123";
        int i = 123;

        // 위에서 생성한 변수 출력.
        System.out.println(s);
        System.out.println(i);

        // 위에서 생성한 변수 타입 출력.
        System.out.println(s.getClass().getSimpleName());
        System.out.println(((Object)i).getClass().getSimpleName());
        //string은 참조형이라 바로 쓸 수 있는데 int는 기본형이라 object로 변환해서 해야됨
    }
}
