//package ch7.Abstract;
//
//public class AbstractEx_1 {
//
//}
//abstract class Player { //추상클래스
//    boolean pause;
//    int currentPos;
//
//    Player() {
//        pause = false;
//        currentPos = 0;
//    }
//
//    abstract void play(int pos); //추상메서드
//    abstract void stop(); //추상메서드
//
//    void play() {
//        play(currentPos);
//    }
//    void pause() {
//        if(!pause) {
//            this.pause = true;
//            stop();
//        }
//        else {
//            this.pause = false;
//            play(currentPos);
//        }
//    }
//}
//class CDPlayer extends Player {
//    void play(int currentPos) {
//        play(currentPos);
//    }
//    void pause(int currentPos) {
//        pause();
//    }
//}
