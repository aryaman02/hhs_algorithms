package net.aryaman.algo.misc;

/**
 * @author aryamandas
 * 
 */
public class Player {
    /**
     * @return the slot
     */
    public int getJersey() {
        return jersey;
    }

    private String name;

    private int jersey = -1;
    private int slot = -1;

    /**
     * @return the slot
     */
    public int getSlot() {
        return slot;
    }

    public Player(String name) {
        super();
        this.name = name;
    }

    public void assignSlotAndJersey(int slot, int jersey) {
        this.slot = slot;
        this.jersey = jersey;
    }

    public void unassignSlotAndJersey() {
        this.jersey = -1;
        this.slot = -1;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        String detail = "name: " + name + " slot: " + slot + " jersey: " + jersey;
        return detail;
    }
}
