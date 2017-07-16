/*
 * ******************************************************
 * Copyright VMware, Inc. 2014.   All Rights Reserved.
 * ******************************************************
 */
package net.aryaman.algo.misc;

import java.util.ArrayList;
import java.util.List;

public class TournamentDriver {

    public static void main(String[] args) {
        Tournament t = new Tournament();
        List<Player> players = new ArrayList<>();
        t.generateJerseys();

        Player p1 = new Player("Aryaman");
        players.add(p1);
        Player p2 = new Player("Rishi");
        players.add(p2);
        Player p3 = new Player("Bunny");
        players.add(p3);
        Player p4 = new Player("Anudeep");
        players.add(p4);
        Player p5 = new Player("Varun");
        players.add(p5);
        Player p6 = new Player("Atharv");
        players.add(p6);


        t.addPlayer(p1);
        t.addPlayer(p2);
        t.addPlayer(p3);
        t.addPlayer(p4);
        t.addPlayer(p5);
        t.addPlayer(p6);

        for (Player p : players) {
            System.out.println("The p details is: " + p.getDetails());
        }
        t.removePlayer(p4);
        t.removePlayer(p2);
        t.removePlayer(p2);

        for (Player p : players) {
            System.out.println("The p details is: " + p.getDetails());
        }
    }

}
