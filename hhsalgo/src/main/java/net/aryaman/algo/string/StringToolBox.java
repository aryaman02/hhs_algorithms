package net.aryaman.algo.string;

public class StringToolBox {
    public boolean endsWithStar(String in) { //returns string w/ one star
        if (in.length() > 0 && in.charAt(in.length() - 1) == '*') {
            return true;
        }
        return false;
    }

    public boolean endsWithTwoStars(String in) { //returns string w/ two stars
        if (!in.isEmpty() && in.charAt(in.length() - 1) == '*' && in.charAt(in.length() - 2) == '*') {
            return true;
        }
        return false;
    }

    public String setLast5String(String ccNumber) { // returns last 5 characters of the string
        char[] ccNumberArray = ccNumber.toCharArray();

        if (ccNumberArray.length < 5) {
            return null;
        } else {
            int i = ccNumberArray.length - 1;
            int count = 0;
            StringBuilder sb = new StringBuilder();

            while (count < 5 && i >= 0) {
                if (ccNumberArray[i] != ' ') {
                    count++;
                    sb.append(ccNumberArray[i]);
                }
                i--;
            }
            sb.reverse();
            return sb.toString();
        }

    }

    public String setLast4String(String ccNumber) { // returns last 4 characters of the string
        return ccNumber.substring(ccNumber.length() - 4, ccNumber.length());
    }

    public String scroll(String s) { // moves first character to end of string, and returns new string
        String in = s.trim();
        return s.substring(1, in.length()) + s.charAt(0);
    }

    public String convertName(String name) { // returns first name, space, and last name
        String str = name.trim();
        return str.substring(str.indexOf(",") + 2, str.length()) + " " + str.substring(0, str.indexOf(","));
    }

    public String removeDashes(String num) { // removes all dashes of a social security number
        StringBuilder sb = new StringBuilder();
        char[] social = num.toCharArray();

        for (int i = 0; i < social.length; i++) {
            if (social[i] != '-') {
                sb.append(social[i]);
            }
        }
        return sb.toString();
    }

    public String caesar(String s, int n) { // implements the caesar cipher method
        if (n > 26) {
            n %= 26;
        } else if (n < 0) {
            n = (n % 26) + 26;
        }
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    char ch = (char) (c + n);
                    if (c > 'z') {
                        str += (char) (c - (26 - n));
                    } else {
                        str += ch;
                    }
                } else if (Character.isUpperCase(c)) {
                    char ch = (char) (c + n);
                    if (c > 'Z') {
                        str += (char) (c - (26 - n));
                    } else {
                        str += ch;
                    }
                }
            } else {
                str += c;
            }
        }
        return str;
    }

    public boolean containsSameChar(String str) { // see if all characters in a string are the same
        if (str.length() % 2 == 0) {
            String s1 = str.substring(0, str.length() / 2);
            String s2 = str.substring(str.length() / 2, str.length());
            StringBuilder sb = new StringBuilder(s1);
            String s3 = sb.reverse().toString();

            return (s1.equals(s2) && s3.equals(s2));
        } else {
            String s1 = str.substring(0, str.length() / 2);
            String s2 = str.substring(str.length() / 2 + 1, str.length());
            StringBuilder sb = new StringBuilder(s1);
            String s3 = sb.reverse().toString();

            if (s1.equals(s2) && s3.equals(s2) && str.charAt(0) == str.charAt(str.length() / 2)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public String removeComments(String s) { // implements question number 10 in the java book
        int comm1Index = s.indexOf("/*");
        int comm2Index = s.lastIndexOf("*/");

        if (comm1Index == -1 || comm2Index == -1) {
            return s;

        }
        String result = "";

        if (comm1Index == 0) {
            result = s.substring(comm2Index + 2);

        } else if (comm1Index > 0) {
            result = s.substring(0, comm1Index) + s.substring((comm2Index + 2));

        } else {
            result = s;
        }
        return result;
    }

    public String negativeBits(String str) { // switches '1' to '0' and '0' to '1'
        str = str.replaceAll("0", "2");
        str = str.replaceAll("1", "0");
        str = str.replaceAll("2", "1");

        return str;
    }

    public String dateStr(String str) { // converts from mm//dd/yyyy to dd-mm-yyyy format
        String[] strArray = str.split("/");
        StringBuilder sb = new StringBuilder();

        if (strArray[0].length() == 1) {
            strArray[0] = "0" + strArray[0];
        }
        if (strArray[1].length() == 1) {
            strArray[1] = "0" + strArray[1];
        }
        String temp = strArray[0];
        strArray[0] = strArray[1];
        strArray[1] = temp;

        for (int i = 0; i < strArray.length; i++) {
            sb.append(strArray[i]);
            sb.append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public String nameEcho(String str) { // returns string that has last name in all capital letters
        str = str.trim();
        String[] strArray = str.split(" ");
        strArray[1] = strArray[1].toUpperCase();
        return strArray[0] + " " + strArray[1];
    }

    public boolean isPalindrome(String str) { // determines if string is a palindrome
        String s = str.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (true) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            if (i >= j) {
                return true;
            }
            i++;
            j--;
        }
    }

    public boolean isValidPassword(String str) { // implements whether a password is good or not using given constraints
        if (str.length() < 7) {
            return false;
        } else {
            int spaceCount = 0;
            int numberCount = 0;
            int lowerCount = 0;
            int upperCount = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isSpaceChar(str.charAt(i))) {
                    spaceCount++;
                } else if (Character.isDigit(str.charAt(i))) {
                    numberCount++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    lowerCount++;
                } else if (Character.isUpperCase(str.charAt(i))) {
                    upperCount++;
                }
            }
            if (spaceCount == 0 && numberCount > 0 && upperCount > 0 && lowerCount > 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
