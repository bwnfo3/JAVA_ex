package ch6;

class Marine {
    int x =0, y = 0;
    int hp = 60;
    static int weapon = 6;//공격력
    static int armor = 0;

    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Ex6_9 {
    public static void main(String[] args) {
        Marine m = new Marine();
        Marine m2 = new Marine();
        System.out.println(m.weapon + " , " + m2.weapon);
        m.weaponUp();
        System.out.println(m.weapon + " , " + m2.weapon);

        System.out.println(m.armor + " , " + m2.armor);
        m.armorUp();
        System.out.println(m.armor + " , " + m2.armor);
        m.armorUp();
        System.out.println(m.armor + " , " + m2.armor);
    }
}
