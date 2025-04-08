package ch7;

public class InstanceOfTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("Instance of FireEngine");
        }
        if(fe instanceof Car) {
            System.out.println("Instance of Car");
        }
        if(fe instanceof Object) {
            System.out.println("Instance of Object");
        }
    }
}
