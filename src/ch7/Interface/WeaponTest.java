package ch7.Interface;

interface Weapon {
    void attack();
}
class Sword implements Weapon {
    public void attack() {
        System.out.println("칼로 베기~!!");
    }
}
class Gun implements Weapon {
    public void attack() {
        System.out.println("총으로 쏘기!!");
    }
}
class Bow implements Weapon {
    public void attack() {
        System.out.println("활로 쏘기-!!");
    }
}
class GameChar {
    private Weapon weapon; //private를 쓴 이유 : 외부에서 weapon변경 x, setter로만 변경
    void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void attack(){
        if(weapon == null){
            System.out.println("맨 손 입니다.");
            return;
        }
        else {
            weapon.attack();
        }
    }
}
public class WeaponTest {
    public static void main(String[] args) {
        GameChar player = new GameChar();
        player.setWeapon(new Sword());
        player.attack(); //칼로 베기~!!

        player.setWeapon(new Bow());
        player.attack(); //활로 쏘기-!!

        player.setWeapon(new Gun());
        player.attack(); //총으로 쏘기!!
    }
}
