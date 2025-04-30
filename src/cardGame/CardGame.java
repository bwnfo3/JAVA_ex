package cardGame;
import java.util.*;
import java.io.*;

class CardGame {
    static Scanner scanner = new Scanner(System.in);
    static TreeMap<String, Player> playerMap = new TreeMap<>(); //게임 참여 할 플레이어 리스트
    public static void main(String[] args) {
        while(true)  {
            switch(displayMenu()) {
                case 1 :
                    gameStart();
                    break;
                case 2 :
                    viewPlayer();
                    break;
            }
        }
    }
    static int displayMenu() {
        System.out.println("**********************");
        System.out.println("번호를 입력해주세요");

        int menu = 0;
        while(true) {
            try {
                System.out.println("1. 게임 시작하기");
                System.out.println("2. Player 추가/삭제/수정");
                //System.out.println("3. 프로그램 종료");
                System.out.println("**********************");
                System.out.println("번호 입력 > ");
                String input = scanner.nextLine();
                int iptNum = Integer.parseInt(input); //-----------trim 생각해보기--------------
                if( iptNum < 1 || iptNum > 2) { //메뉴에 없는 번호 입력했을 경우
                    throw new NumberFormatException();
                }
                if (iptNum == 1 && playerMap.size() < 2) {
                    throw new NullPointerException(); //사용자정의 예외처리 !~!~!해야됨!!!!!!!!!!!!!!!!
                }
                menu = iptNum;
                break;
            } catch (NumberFormatException e) { //숫자가 아닌 경우
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
            } catch (NullPointerException e) {
                System.out.println("게임을 시작하려면 최소 2명의 플레이어가 필요합니다.");
            } catch (Exception e) {
                System.out.println("다른 오류 처리해야됨 !! ");
            }
        }

        return menu;
    }
    static void gameStart(){
        System.out.println("gameStart! ! !");
        System.exit(0); //게임 종료
    }
    static void viewPlayer(){
        System.out.println("-- viewPlayer 시작--");

        playerMap.put("Player1", new Player("Player1"));
        playerMap.put("Player2", new Player("Player2"));

        if ( playerMap.size() == 0 || playerMap == null) {
            System.out.println("저장된 플레이어가 없습니다.");
        }
        else {
            System.out.println("**********저장된 플레이어**********");
            /* 스트림이나 iterlator 사용해서 출력 ! ! */
//            for( Player p : playerMap ) {
//                System.out.println(p.nickname);
//            }
        }
        System.out.println();
        System.out.println("플레이어 추가할거임 ?");

        System.exit(0);
        /*

            1. 플레이어 추가할건지 / 삭제할건지 (playerMap 1명이면 안띄울까 ?) 
                1.1 추가 ->1 , 삭제 -> 2 (예외 ..!!!!!)
                1.2 playerMap 4명일경우 최대 4명만 된다고 고지 -> 삭제할건지? 아님 돌아갈건지
            2. 플레이어 추가하는 경우 -> 닉네임 글자 20자, 공백, 특수문자 검사하기, 중복검사도
            3. 플레이어 삭제
         */


        //멤버 추가
        
        //삭제
    }
}

/*
            <<필요한 것>>

            Player를 담을 ?
            int GameCount = 0;

            Map으로 ! -> 최대 4명~~ 넘으면 지울건지? Y/N

            <<메뉴 메서드>>

            1. 초기 게임 시작할 건지 ? 멤버 추가할건지 ? case로 나누기
                1.1 멤버가 0,1명일 경우 -> 게임에 최소 2명 필요하다고 알림 (메뉴로 돌아감)
                1.2 메뉴에 있는 것 x ->> 잘못된 입력

            2. 멤버 추가 / 삭제 / 수정?도 해야하나
                2.1. 멤버 추가 - 4명 이상일 경우 삭제 해야함 고지, 닉네임 입력
                    2.1.1. 닉네임 20자 넘어갈 경우
                    2.1.2. 닉네임 공백
                    2.1.3. 중복될 경우!!
                    2.1.4. 이름에 문자가 아닌 다른 값 입력! --> 예외 생각해보기

                --> 할 때마다 메뉴로 돌아가시게습니까? 아님 더 수행할건지 ?


            -------

            <게임 시작>

            ( 몇 판 할건지 ? )

            while(gameCount <= TotalGameCount ) {
                gameStart()
            }

            void gameStart() {

                Deck.shuffle()

                1. Deck에서 Player명수 * 5 순서대로 배열 만들고 5개씩 Map의 Plyaer에게 저장
                2. 각 Player getRoundScore해서 .. 비교 후 1등 Player 받아와서 addVictory()
                3. 모든 Player 카드 리셋

                GameCount++
            }

         */
