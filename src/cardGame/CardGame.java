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
                    editPlayer();
                    break;
                case 3 :
                    System.exit(0);
            }
        }
    }
    static int displayMenu() {
        playerMap.put("aaa", new Player("aaa"));
        playerMap.put("bbb", new Player("bbb"));

        System.out.println("**********************");
        System.out.println("1. 게임 시작하기");
        System.out.println("2. Player 추가/삭제/수정");
        System.out.println("3. 프로그램 종료");
        System.out.println("**********************");

        int menu = 0;
        menu = MenuCheck(1,3);

        return menu;
    }

    //메뉴에 없는 숫자 입력 + 숫자가 아닌 값 입력했을 경우 예외처리 메서드
    static int MenuCheck(int initnum, int lastnum) {
       int menuNum = 0;
        while(true) {
            System.out.println("번호 입력("+initnum +"~"+ lastnum+") > ");
            String input = scanner.nextLine().trim();
            try {
                int iptNum = Integer.parseInt(input);
                if( iptNum < initnum || iptNum > lastnum) {
                    throw new NumberFormatException();
                }
                menuNum = iptNum;
                break;
            } catch (NumberFormatException e) { //숫자가 아닌 경우
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
            } catch (Exception e) {
                System.out.println("다른 오류 처리해야됨 !! ");
            }
        }
        return menuNum;
    }

    //gameStart() start
    static void gameStart(){
        if(playerMap.size() < 2 || playerMap.isEmpty()) {
            System.out.println("게임을 시작하려면 최소 2명이상의 플레이어가 필요합니다.");
            return;
        }
        System.out.println("gameStart! ! !");

        Deck deck = new Deck();
        //System.out.println(deck.toString());

        deck.shuffle();
        System.out.println(deck.toString());

        // 플레이어 수 * CardSetCapacity(플레이어당 나눠줘야 할 카드 갯수)만큼 카드 나눠주기
        int index = 0;
        do {
            for (String key : playerMap.keySet()) {
                Player player = (Player) playerMap.get(key);
                ArrayList<Card> tmpCardList = player.getPlayerCardList();
                tmpCardList.clear();
                for ( int i = 0; i < Player.CardSetCapacity; i++) {
                    Card pickCard = deck.pick(index + i);
                    player.addCard(i,pickCard);
                }
                index += 5;
            }
        } while (index < playerMap.size() * Player.CardSetCapacity);

        //끝



        return;
    }
    //gameStart() end

    //editPlayer() start
    static void editPlayer(){
        while(true) {
            System.out.println("editPlayer(*)=-------------------");
            switch(displayEditMenu()) {
                case 1 :
                    viewPlayer();
                    break;
                case 2 :
                    addPlayer();
                    break;
                case 3 :
                    removePlayer();
                    break;
                case 4 :
                    return;
            }
        }
    }
    //editPlayer() end

    static int displayEditMenu() {
        System.out.println();
        System.out.println("**********************");
        System.out.println("1. Player 리스트 보기");
        System.out.println("2. Player 추가하기");
        System.out.println("3. Player 삭제하기");
        System.out.println("4. 메뉴로 돌아가기");
        System.out.println("**********************");
        System.out.println();

        int menu = 0;
        menu = MenuCheck(1,4);

        return menu;
    }

    //저장된 playerList 출력
    static void viewPlayer() {
        System.out.println();
        if ( playerMap.size() == 0 || playerMap == null) {
            System.out.println("저장된 플레이어가 없습니다.");
        }
        else {
            System.out.println("---------저장된 플레이어 목록 ---------");
            /* 스트림이나 iterlator 사용해서 출력 ! ! */
            for (String key : playerMap.keySet()) {
                String nickname = playerMap.get(key).nickname;
                System.out.println(nickname);
            }
        }
        System.out.println();
    }

    //Player 추가
    static void addPlayer() {
        if(playerMap.size() >= 4) {
            System.out.println("플레이어는 최대 4명까지 저장 가능합니다.");
            return;
        }
        System.out.println("플레이어의 닉네임을 입력해주세요.");
        do {
            System.out.println("닉네임 입력 > ");
            String input = scanner.nextLine().trim();
            try {
                if( input.length() > 20) {
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

    //Player 추가
    static void removePlayer() {
        if (playerMap.size() == 0 || playerMap == null) {
            System.out.println("삭제할 플레이어가 없습니다.");
            return;
        }
        viewPlayer();

        while(true) {
            System.out.println("삭제할 플레이어의 닉네임을 입력해주세요.");
            System.out.println(">>");
            String input = scanner.nextLine().trim();
            try {
                if(playerMap.containsKey(input)) {
                    playerMap.remove(input);
                    break;
                }
                else {
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
            }
        }

        System.out.println("삭제되었습니다.");
    }
}