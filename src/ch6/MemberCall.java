package ch6;
public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //static int cv2 = iv;
    static int cv2 = new MemberCall().iv;

    static void staticMethod() {
        System.out.println(cv);
        //System.out.println(iv); //에러. 클래스메서드에서 인스턴스 변수 사용 불가
        MemberCall c = new MemberCall(); //객체를 생성한 후에 인스턴스 참조 가능
        System.out.println(c.iv);

        //System.out.println(new MemberCall().iv);와 같음
    }

    void instatnceMethod() {
        System.out.println(iv); //인스턴스 메서드에서 인스턴스 변수 사용가능
        System.out.println(cv);
    }

    static void staticMethod2() {
        staticMethod();
        //instanceMethod(); 클래스 메서드에서 인스턴스 메서드 호출 불가능
        MemberCall c = new MemberCall();
        c.instatnceMethod();
    }

    void instanceMethod2() {
        staticMethod2();
        instatnceMethod();
    }
}
