//package ch14;
//
//@FunctionalInterface
//interface MyFunction3 {
//    void run();
//}
//class LamdaEx1 {
//    static void execute(MyFunction3 f) {
//        f.run();
//    }
//    static MyFunction3 getMyFunction() {
//        MyFunction3 f = () -> System.out.println("f3.run()");
//        return f;
//    }
//
//    public static void main(String[] args) {
//        //람다식으로 MyFunction3의 run()구현
//        MyFunction3 f1 = ()-> System.out.println("f1.run()");
//        MyFunction3 f2 = new MyFunction3() {
//            public void run(){
//                System.out.println("f2.run()");
//            }
//        };
//        MyFunction3 f3 = getMyFunction();
//
//        f1.run();
//        f2.run();
//        f3.run();
//        getMyFunction().run();
//
//        execute(f1);
//        execute(() -> System.out.println("run()"));
//    }
//}
