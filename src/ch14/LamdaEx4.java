package ch14;
interface LamdaF {
    void myMethod();
}
class Outer {
    int val = 10;

    class Inner {
        int val = 20;
        void method() {
            int val = 30;

            LamdaF f = new LamdaF() {
                public void myMethod() {

                }
            };
        }
    }
}
class LamdaEx4 {

}
