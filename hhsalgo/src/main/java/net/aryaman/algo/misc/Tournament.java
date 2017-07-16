package net.aryaman.algo.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
/**
 * @author aryamandas
 * 
 */
public class Tournament {
    private final Player[] slots = new Player[4];
    private final List<Integer> jerseyList = new ArrayList<>();
    private final Queue<Player> queue = new LinkedList<>();

    public void generateJerseys() {

        Set<Integer> jerseys = new HashSet<>();

        while (jerseys.size() < slots.length) {
            Random r = new Random();
            int jersey = r.nextInt(100);

            jerseys.add(jersey);
        }

        jerseyList.addAll(jerseys);
    }
    /**
     * Look in slots array for an empty slot (null entry).
     * 
     * If an empty slot is found, put the player in the empty slot, and assign
     * him the slot number.
     * 
     * If no empty slot is found, add the player to the queue.
     * 
     * @param p
     */
    public void addPlayer(Player p) {
        for (int i = 0; i < slots.length; i++) {
            int slot = i;
            int jersey = jerseyList.get(slot);

            if (slots[slot] == null) {
                slots[slot] = p;
                p.assignSlotAndJersey(slot, jersey);
                break;
            }
            if (i == slots.length) {
                return;
            }
        }
        if (p.getJersey() == -1) {
            /*
             * The person did not get a slot, after iterating thru all the
             * slots. Therefore, put the person in queue.
             */
            queue.add(p);
        }
    }

    /**
     * Find the player's assigned slot.
     * 
     * Go to slots array, and remove the Player from the slot.
     * 
     * Unassign player's slot.
     * 
     * If the queue has players waiting, then remove the player from the head of
     * the queue, and assign the new player to the slot.
     * assign player slot to x50 but how?
     * @param p
     */
    public void removePlayer(Player p) {
        int slot = p.getSlot();
        if (slot == -1) {
            System.out.println("The person was not added before: " + p.getName());
            return;
        }
        int jersey = p.getJersey();
        System.out.println("Player's current jersey is: " + jersey);
        p.unassignSlotAndJersey();

        slots[slot] = null;

        if (!queue.isEmpty()) {
            Player anotherPlayer = queue.remove();
            slots[slot] = anotherPlayer;
            anotherPlayer.assignSlotAndJersey(slot, jerseyList.get(slot));
        }
    }
}