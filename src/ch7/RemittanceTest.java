package ch7;
import java.util.*;
class Recipient { //입/출금하는 사람의 정보
    String name; //이름
    int money; //입/출금할 금액
    Recipient(String name, int money) {
        this.name = name;
        this.money = money;
    }
}
class User {
    final String userName; //유저이름
    int accountBalance; //유저 계좌 잔액
    Vector withdrawList = new Vector(); //출금리스트 배열
    Vector depositList = new Vector(); //입금리스트 배열

    User(String userName, int accountBalance) {
        this.userName = userName;
        this.accountBalance = accountBalance;
    }
    //출금
    void withdraw(Recipient r) {
        withdrawList.add(r); //출금 리스트에 추가
        accountBalance -= r.money; //잔액에서 출금금액 빼기
        System.out.println("<출금> " + r.name + " , -" + r.money+"원 (남은잔액 : " + accountBalance + "원)");
    }
    //입급
    void deposit(Recipient r) {
        depositList.add(r);
        accountBalance += r.money; //잔액에서 입금금액 더하기
        System.out.println("<입금> " + r.name + " , +" + r.money+"원 (남은잔액 : " + accountBalance + "원)");
    }
    //출금 리스트 출력
    void showWithdraw() {
        System.out.println("-------------------");
        System.out.println("* 출금 내역 리스트 *");
        for(int i = 0; i<withdrawList.size(); i++) {
            Recipient tmp = (Recipient)withdrawList.get(i);
            System.out.println(i +1+ ". " + tmp.name + " , " + tmp.money + "원");
        }
        System.out.println("-------------------");
    }
    //입금 리스트 출력
    void showDeposit() {
        System.out.println("-------------------");
        System.out.println("* 입금 내역 리스트 *");
        for(int i = 0; i<depositList.size(); i++) {
            Recipient tmp = (Recipient)depositList.get(i);
            System.out.println(i +1+ ". " + tmp.name + " , " + tmp.money + "원");
        }
        System.out.println("-------------------");
    }
    //입금 취소
    void cancelDeposit(Recipient r) {
        depositList.remove(r);
        System.out.println(r.name +"입급 내역이 취소되었습니다.");
        accountBalance -= r.money;
        System.out.println("잔액 : " + accountBalance + "원");
    }
}
class RemittanceTest {
    public static void main(String[] args) {
        User u = new User("나", 10000);
        System.out.println("이름 : "+u.userName + " , 잔액 : "+u.accountBalance+"원");
        System.out.println();

        Recipient r1 = new Recipient("엄준식",5000);
        Recipient r2 = new Recipient("김똥개",10000);
        Recipient r3 = new Recipient("아무개",700);

        u.withdraw(r1);//r1에게 출금됨
        u.deposit(r2);//r2에게 입금받음
        u.deposit(r3);//r3에게 입금받음

        u.showDeposit(); //입급내역 출력
        u.cancelDeposit(r2); //r2에게 입금한 내역 취소
        u.showDeposit(); //입금내역 출력
    }
}
