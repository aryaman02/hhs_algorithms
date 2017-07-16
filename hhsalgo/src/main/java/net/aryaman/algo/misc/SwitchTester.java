package net.aryaman.algo.misc;

public class SwitchTester {

    public static void main(String[] args) {
        SwitchTester st = new SwitchTester();
        st.dosomethingSwitchEnum(DayOfWeek.Thursday);
        double x = 12.2;

        int y = (int) (x + 0.5);
        System.out.println(y);
    }

    private static enum DayOfWeek {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }


    private void dosomething(String s) {
        if (s.equalsIgnoreCase("Monday")) {
            System.out.println("Today is Monday");
        } else if (s.equalsIgnoreCase("Tuesday")) {
            System.out.println("Today is Tuesday");
        } else if (s.equalsIgnoreCase("Wednesday")) {
            System.out.println("Today is Wednesday");
        } else if (s.equalsIgnoreCase("Thursday")) {
            System.out.println("Today is Thu");
        } else if (s.equalsIgnoreCase("Friday")) {
            System.out.println("Today is Fri");
        } else if (s.equalsIgnoreCase("Saturday")) {
            System.out.println("Today is Sat");
        } else if (s.equalsIgnoreCase("Sunday")) {
            System.out.println("Today is Sun");
        } else {
            System.out.println("unknown day of the weeek");
        }
    }

    private void dosomethingSwitch(String s) {
        switch (s) {
        case "Monday":
            System.out.println("Today is Monday");
            break;

        case "Tuesday":
            System.out.println("Today is Tuesday");
            break;

        case "Wednesday":
            System.out.println("Today is Wednesday");
            break;

        case "Thursday":
            System.out.println("Today is Thursday");
            break;

        case "Friday":
            System.out.println("Today is Fri");
            break;

        case "Saturday":
            System.out.println("Today is Sat");
            break;

        case "Sunday":
            System.out.println("Today is Sun");
            break;

        default:
            System.out.println("unknown");
            break;
        }
    }

    private void dosomethingSwitchEnum(DayOfWeek s) {
        switch (s) {
        case Monday:
            System.out.println("Today is Monday");
            break;

        case Tuesday:
            System.out.println("Today is Tuesday");
            break;

        case Wednesday:
            System.out.println("Today is Wednesday");
            break;

        case Thursday:
            System.out.println("Today is Thursday");
            break;

        case Friday:
            System.out.println("Today is Fri");
            break;

        case Saturday:
            System.out.println("Today is Sat");
            break;

        case Sunday:
            System.out.println("Today is Sun");
            break;

        default:
            System.out.println("unknown");
            break;
        }
    }
}
