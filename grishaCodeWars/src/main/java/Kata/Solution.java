package Kata;

import java.util.List;

//Create by Grigoriy Skobelev
public class Solution {

    public static String[] superStreetFighterize(String[][] fighters, int[] position, String[] moves) {

        String[] person = new String[moves.length];
        int x = position[0],y = position[1];
        for(int i=0; i<=moves.length;i++){
            switch (moves[i]){

            case "up":
                y++;

            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[][] fighters = new String[][]{
                new String[] {       "",    "Ryu",  "E.Honda",  "Blanka",   "Guile", ""      },
                new String[] { "Balrog",    "Ken",  "Chun Li", "Zangief", "Dhalsim", "Sagat" },
                new String[] {   "Vega", "T.Hawk", "Fei Long",  "Deejay",   "Cammy", "M.Bison"      },
        };
        System.out.println(fighters[0][1]);
    }
}
