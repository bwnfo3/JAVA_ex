package ch6;
class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값 : " + t1.channel + " , t2의 channel값 : " + t2.channel);
        //t1의 channel값 : 0 , t2의 channel값 : 0

        t1.channel = 7;
        System.out.println("t1의 channel값 : " + t1.channel + " , t2의 channel값 : " + t2.channel);
        //t1의 channel값 : 7 , t2의 channel값 : 0

        t1.power = true;
        System.out.println("t1의 power값 : " + t1.power + " , t2의 power값 : " + t2.power);
        //t1의 power값 : true , t2의 power값 : false

        t2 = t1;
        System.out.println("t1의 channel값 : " + t1.channel + " , t2의 channel값 : " + t2.channel);
        //t1의 channel값 : 7 , t2의 channel값 : 7

        System.out.println("t1의 power값 : " + t1.power + " , t2의 power값 : " + t2.power);
        //t1의 power값 : true , t2의 power값 : true

        t2.channel = 9;
        System.out.println("t1의 channel값 : " + t1.channel + " , t2의 channel값 : " + t2.channel);
        //t1의 channel값 : 9 , t2의 channel값 : 9
    }
}