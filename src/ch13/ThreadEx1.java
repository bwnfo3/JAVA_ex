package ch13;

class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
class ThreadEx1_1 extends Thread { //Thread클래스 상속받아서 구현
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(getName()); //조상인 Thread의 getName() 호출
        }
    }
}
class ThreadEx1_2 implements Runnable { //Runnable인터페이스를 구현해서 구현
    public void run() {
        for(int i = 0; i < 5; i++) {
            //Thread.currentThread() : 현재 실행중인 Thread 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}