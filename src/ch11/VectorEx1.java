//package ch11;
//import java.util.*;
//class VectorEx1 {
//    public static void main(String[] args) {
//        Vector v = new Vector(5);
//        v.add("1");
//        v.add("2");
//        v.add("3");
//        print(v);
//
//        v.trimToSize(); //빈 공간 제거 (용량과 크기가 같아짐)
//        System.out.println("====After trimToSize() ====");
//        print(v);
//
//        v.ensureCapacity(6); //용량 6으로 늘림
//        System.out.println("====After ensureCapacity() ====");
//        print(v);
//
//        v.setSize(7); //용량 6으로 늘림
//        System.out.println("====After setSize() ====");
//        print(v);
//
//        v.clear();
//        System.out.println("====After clear() ====");
//        print(v);
//
//        v.trimToSize(); //빈 공간 제거 (용량과 크기가 같아짐)
//        System.out.println("====After trimToSize() ====");
//        print(v);
//    }
//    static void print(Vector v) {
//        System.out.println(v);
//        System.out.println("size : "+v.size());
//        System.out.println("capacity : " +v.capacity());
//    }
//}
