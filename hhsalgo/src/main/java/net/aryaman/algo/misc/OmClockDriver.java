package net.aryaman.algo.misc;

public class OmClockDriver {

    public static void main(String[] args) {
        OmClock oc = new OmClock();
        oc.setTime(1, 30);
        
        oc.forward(30);
       
        oc.showTime();
    }

}
