package ch7;
final class Singleton {
    private static Singleton s = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        if(s == null)
            s = new Singleton();
        return s;
    }

}
public class SingletonTest {
    public static void main(String[] args) {
        //Singleton s1 = new Singleton(); //생성자에 private가 있어서 생성자 접근 불가능
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
    }
}
