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

        putPlayerMap("aaa");
        putPlayerMap("bbb");

        System.out.println("**********************");
        System.out.println("번호를 입력해주세요");

        int menu = 0;
        System.out.println("1. 게임 시작하기");
        System.out.println("2. Player 추가/삭제/수정");
        //System.out.println("3. 프로그램 종료");
        System.out.println("**********************");
        do {
            System.out.println("번호 입력(1,2) > ");
            String input = scanner.nextLine().trim();
            try {
                int iptNum = Integer.parseInt(input);
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
        } while(true);

        return menu;
    }

    //gameStart() start
    static void gameStart(){
        System.out.println("gameStart! ! !");

        Deck deck = new Deck();
        //System.out.println(deck.toString());

        deck.shuffle();
        System.out.println(deck.toString());

        for(int i = 0; i < playerMap.size() * 5; i++) {
            for(String key : playerMap.keySet()){
                Player player = (Player)playerMap.get(key);
                for(int m = 0; m < player.playerCardSet.size(); m++) {
                    player.setCard(m, deck.pick(i));
                }
                System.out.println(player.playerCardSet.toString());
            }
        }

        System.exit(0); //게임 종료
    }
    //gameStart() end

    //viewPlayer() start
    static void viewPlayer(){
        System.out.println("-- viewPlayer 시작--");

        if ( playerMap.size() == 0 || playerMap == null) {
            System.out.println("저장된 플레이어가 없습니다.");
        }
        else {
            System.out.println("**********저장된 플레이어**********");
            /* 스트림이나 iterlator 사용해서 출력 ! ! */
            for (String key : playerMap.keySet()) {
                String nickname = playerMap.get(key).nickname;
                System.out.println(nickname);
            }
        }
        System.out.println();
        System.out.println("1. Player 추가/삭제하기");
        System.out.println("2. 메뉴로 돌아가기");
        System.out.println("**********************");

        int menu = 0;
        do {
            System.out.println("번호 입력 > ");
            String input = scanner.nextLine().trim();
            try {
                int iptNum = Integer.parseInt(input);
                if( iptNum < 1 || iptNum > 2) { //메뉴에 없는 번호 입력했을 경우
                    throw new NumberFormatException();
                }
                menu = iptNum;
                break;
            } catch (NumberFormatException e) { //숫자가 아닌 경우
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
            } catch (Exception e) {
                System.out.println("지정안 한 오류ㅜ 발생!!!!!!!!!!!!!!!!!!!!!!!");
            }

        } while(true);

        switch(menu) {
            case 1 :
                addPlayer();
                break;
            case 2 :
                break;
        }

        //삭제
    }
    //PlayerView() end

    static void addPlayer() {
        if(playerMap.size() > 4) {
            System.out.println("플레이어는 최대 4명까지 저장 가능합니다.");
        }
        System.out.println("플레이어의 닉네임을 입력해주세요.");
        do {
            System.out.println("닉네임 입력 > ");
            String input = scanner.nextLine().trim();
            try {
                if( input.length() > 20) { //메뉴에 없는 번호 입력했을 경우
                    throw new StringIndexOutOfBoundsException();
                } else if( input.isEmpty() || input == null) {
                    throw new NullPointerException(); //입력된 값이 없을 경우
                }
                putPlayerMap(input); //playerMap에 추가메서드 호출
                break;
            } catch (StringIndexOutOfBoundsException e) { //20자 이상일 경우
                System.out.println("닉네임은 20자를 넘을 수 없습니다.");
                System.out.println("다시 입력해주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println("이미 존재하는 닉네임입니다.");
                System.out.println("다시 입력해주세요.");
            }
            catch (NullPointerException e) {
                System.out.println("값을 입력해주세요.");
            }
            catch (Exception e) {
                System.out.println("지정안 한 오류ㅜ 발생!!!!!!!!!!!!!!!!!!!!!!!");
            }
        } while(true);

        System.out.println("추가되었습니다.");
    }
    static void putPlayerMap(String nickname) {
        if(playerMap.containsKey(nickname)) {
            throw new IllegalArgumentException(); //중복된 닉네임이 있을경우 예외던지기
        }
        playerMap.put(nickname, new Player(nickname));
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
