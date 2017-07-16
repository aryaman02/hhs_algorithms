package net.aryaman.algo.misc;

public class OmClock {
    private int hours;

    private int minutes;

    public void setTime(int hours, int minutes) {
        if (hours < 1 || hours > 12) {
            System.out.println("Not a valid input");

        } else if (minutes < 0 || minutes >= 60) {
            System.out.println("Not a valid input");
        }

        System.out.println("The time is " + hours + ":" + minutes);

        this.hours = hours;
        this.minutes = minutes;
    }

    public void forward(int minutes) {
        this.minutes = this.minutes + minutes;

        if (this.minutes >= 60) {
            int h = this.minutes / 60;
            this.hours = this.hours + h;

            int m = this.minutes % 60;
            this.minutes = m;
        }

        if (this.minutes < 10) {
            System.out.println("0" + this.minutes);
        }

        if (this.hours > 12) {
            this.hours = this.hours % 12;
        }
    }

    public int getHours() {
        return hours;

    }

    public int getMinutes() {
        return minutes;
    }

    public void showTime() {
        int hours = getHours();

        System.out.println("The new time is: " + hours + ":" + minutes);
        int minutes = getMinutes();

    }
}