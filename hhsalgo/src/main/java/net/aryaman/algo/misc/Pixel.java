package net.aryaman.algo.misc;

public class Pixel {
    private int redComponent;
    private int blueComponent;
    private int greenComponent;

    public static void main(String[] args) {
        Pixel p = new Pixel();
        p.setPrimaryColors(125, 142, 165);
        String pixel = p.getPixel();
        System.out.println(pixel);
    }

    public int getRed() {
        return redComponent;
    }

    public int getBlue() {
        return blueComponent;
    }

    public int getGreen() {
        return greenComponent;
    }

    private boolean validateColorComponent(int number, String colorType) {
        if (number < 0 || number > 255) {
            System.out.println("Not a valid amount of: " + colorType);
            return false;
        }
        return true;
    }

    public void setRed(int number) {
        if (!validateColorComponent(number, "RED")) {
            return;
        }

        redComponent = number;
    }

    public void setBlue(int number) {
        if (!validateColorComponent(number, "BLUE")) {
            return;
        }

        blueComponent = number;
    }

    public void setGreen(int number) {
        if (!validateColorComponent(number, "GREEN")) {
            return;
        }

        greenComponent = number;
    }

    public void setPrimaryColors(int number, int number2, int number3) {

        if (!validateColorComponent(number, "RED")) {
            return;
        }

        if (!validateColorComponent(number2, "BLUE")) {
            return;
        }


        if (!validateColorComponent(number3, "GREEN")) {
            return;
        }

        redComponent = number;
        blueComponent = number2;
        greenComponent = number3;

        if (number == 255 && number2 == 0 && number3 == 0) {
            System.out.println("RED");
        } else if (number == 0 && number2 == 255 && number3 == 0) {
            System.out.println("BLUE");
        } else if (number == 0 && number2 == 0 && number3 == 255) {
            System.out.println("GREEN");
        }
    }

    /**
     * Returns a String representation of the hex values of Red, Green and Blue
     * RRGGBB
     * @return
     */
    public String getPixel() {
        BinaryToDecimal bd = new BinaryToDecimal();
        String redVal = bd.decimalToHex(redComponent);
        String blueVal = bd.decimalToHex(blueComponent);
        String greenVal = bd.decimalToHex(greenComponent);

        String pixel = String.format("R:%s-G:%s-B:%s", redVal, greenVal, blueVal);
        return pixel;
    }


}
