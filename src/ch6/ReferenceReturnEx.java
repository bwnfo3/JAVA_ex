package ch6;
class HairColor { String color;}
public class ReferenceReturnEx {
    public static void main(String[] args) {
        HairColor hc = new HairColor();
        hc.color = "red";

        HairColor hc2 = colorCopy(hc);
        System.out.println("hc.color = " + hc.color);
        System.out.println("hc2.color = " + hc2.color);
        //System.out.println(System.identityHashCode(hc2)); //hc2의 주소값(tmp의 주소값과 같음)

        hc.color = "blue";
        System.out.println("hc.color = " + hc.color);
        System.out.println("hc2.color = " + hc2.color);
    }
    static HairColor colorCopy(HairColor hc) {
        HairColor tmp = new HairColor();
        tmp.color = hc.color;
        //System.out.println(System.identityHashCode(tmp)); //tmp의 주소값
        return tmp;
    }
}
