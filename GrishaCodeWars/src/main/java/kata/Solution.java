package kata;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String[] superStreetFighterize(String[][] fighters, int[] position, String[] moves) {

        if(moves.length == 0 ) return new String[]{};

        List<String> person = new ArrayList<String>();

        int x = position[0], y = position[1];

        for(int i = 0; i<moves.length;i++){
            switch (moves[i]){
            case "up":
                if(fighters[x-1][y] == ""){

                }else {
                    if (x == 1 && y == 0) {
                        x = 1;
                    } else {
                        if (x == 0) {
                            x = 2;
                        } else {
                            x--;
                        }
                    }
                }
                person.add(fighters[x][y]);
                break;
            case "down":
                if(fighters[x+1][y] == ""){

                }else {
                    if (x == 2 && y == 0) {
                        x = 2;
                    } else {
                        if (x == 2) {
                            x = 0;
                        } else {
                            x++;
                        }
                    }
                }
                person.add(fighters[x][y]);
                break;
            case "left":
                if(fighters[x][y-1] == ""){

                }else {
                    if (y == 1 && x == 0) {
                        y = 4;
                    } else {
                        if (y == 0) {
                            y = 5;
                        } else {
                            y--;
                        }
                    }
                }
                person.add(fighters[x][y]);
                break;
            case "right":
                if(fighters[x][y+1] == ""){
                    y = y+2;
                }else {
                    if (y == 4 && x == 0) {
                        y = 1;
                    } else {
                        if (y == 5) {
                            y = 0;
                        } else {
                            y++;
                        }
                    }
                }
                person.add(fighters[x][y]);
                break;

            }
        }
        String [] outData = person.toArray(new String[0]);
        return outData;
    }

    public static void main(String[] args) {
        int x = 1;
        System.out.println(x-1);
        System.out.println(--x);
    }
}
