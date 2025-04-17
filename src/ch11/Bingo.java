package ch11;
import java.util.*;
class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet();
        int[][] board = new int[5][5];

        for(int i = 0; set.size() < 25; i++) {
            set.add((int)(Math.random() * 50) + 1 + ""); //int로 저장하면 sort됨 , LinkedHashSet으로 하는 게 더 낫긴함
        }

        //System.out.println(set);
        Iterator it = set.iterator();
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[i].length; j++) {
                board[i][j] = Integer.valueOf((String) it.next());
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}
