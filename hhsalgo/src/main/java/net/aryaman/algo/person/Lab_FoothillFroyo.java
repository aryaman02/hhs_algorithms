package net.aryaman.algo.person;
public class Lab_FoothillFroyo
{
    public static void main(String[] args) {
        DateProfile[] applicant = new DateProfile[4];
        applicant[0] = new DateProfile ('M', 'F', 5, 6, "RaPerNum1");
        applicant[1] = new DateProfile ('f', 'M', 10, 2, "RaPerNum2");
        applicant[2] = new DateProfile ('M', 'f', 8, 1, "RaPerNum3");
        applicant[3] = new DateProfile ('m', 'f', 9, 10, "RaPerNum4");

        displayTwoProfiles(applicant[1], applicant[3]);
    }

    static void displayTwoProfiles(DateProfile profile1, DateProfile profile2)
    {
        System.out.println("Fits between");
    }

}

class DateProfile
{
    private char gender;
    private char searchGender;
    private int romance;
    private int finance;
    private String name;


    public static int MIN_ROMANCE = 1;
    public static int MAX_ROMANCE = 10;
    public static int MIN_FINANCE = 1;
    public static int MAX_FINANCE = 10;
    public static int MIN_NAME_LEN = 1;
    public static int MAX_NAME_LEN = 30;

    public static char DEFAULT_GEND;
    public static char DEFAULT_SEARCH_GEND;
    public static int DEFAULT_ROMANCE;
    public static int DEFAULT_FINANCE;
    public static String DEFAULT_NAME;

    DateProfile()
    {
        setDefaults();
    }

    DateProfile (char gender, char searchGender, int romance, int finance,
            String name)
            {
        this.gender = gender;
        this.searchGender = searchGender;
        this.romance = romance;
        this.finance = finance;
        this.name = name;
            }

    boolean setGender(char gender)
    {
        boolean result = true;

        if (gender == 'M' || gender == 'm')
        {
            this.gender = 'M';
        }
        else if (gender == 'F' || gender == 'f')
        {
            this.gender = 'F';
        }
        else
        {
            this.gender = DEFAULT_GEND;
            result = false;
        }

        return result;
    }

    boolean setSearchGender(char searchGender)
    {
        boolean result = true;

        if (searchGender == 'M' || searchGender == 'm')
        {
            this.searchGender = 'M';
        }
        else if (searchGender == 'F' || searchGender == 'f')
        {
            this.searchGender = 'F';
        }
        else
        {
            this.searchGender = DEFAULT_SEARCH_GEND;
            result = false;
        }

        return result;
    }

    boolean setRomance(int romance)
    {
        boolean result = true;

        if (romance >= MIN_ROMANCE && romance <= MAX_ROMANCE)
        {
            this.romance = romance;
        }
        else
        {
            this.romance = DEFAULT_ROMANCE;
            result = false;
        }

        return result;
    }

    boolean setFinance(int finance)
    {
        boolean result = true;

        if (finance >= MIN_FINANCE && finance <= MAX_FINANCE)
        {
            this.finance = finance;
        }
        else
        {
            this.finance = DEFAULT_FINANCE;
            result = false;
        }

        return result;
    }

    boolean setNameLength(String name)
    {
        boolean result = true;

        if (name.length() >= MIN_NAME_LEN && name.length() <= MAX_NAME_LEN)
        {
            this.name = name;
        }
        else
        {
            this.name = DEFAULT_NAME;
            result = false;
        }

        return result;
    }

    char getGender()
    {
        return gender;
    }

    char getSearchGender()
    {
        return searchGender;
    }

    int getRomance()
    {
        return romance;
    }

    double getFinance()
    {
        return finance;
    }

    int getNameLength()
    {
        return name.length();
    }


    public static double fitValue(DateProfile partner)
    {
        double GenderFit, RomanceFit, FinanceFit;
        GenderFit = partner.determineGenderFit(partner);
        RomanceFit = partner.determineRomanceFit(partner);
        FinanceFit = partner.determineFinanceFit(partner);

        double result;

        if (GenderFit == 0)
        {
            result = 0;
            return result;
        }
        result = (RomanceFit + FinanceFit) / 2;
        return result;
    }

    private double determineGenderFit(DateProfile partner)
    {
        double result;
        if (this.gender != partner.gender) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    private double determineRomanceFit(DateProfile partner)
    {
        double result;
        if (this.romance <= partner.romance) {
            result = (double) getRomance() / this.romance;
        } else {
            result = getRomance()/ this.romance;
        }
        return result;
    }

    private double determineFinanceFit(DateProfile partner)
    {
        double result;
        if (this.finance <= partner.finance) {
            result = (double) partner.finance / this.finance;
        } else {
            result = (double) this.finance / partner.finance;
        }
        return result;
    }

    void setDefaults()
    {
        DEFAULT_GEND = 'M';
        DEFAULT_SEARCH_GEND = 'F';
        DEFAULT_ROMANCE = 5;
        DEFAULT_FINANCE = 5;
        DEFAULT_NAME = "";
    }
    static void displayTwoProfiles(DateProfile profile1, DateProfile profile2) {
        String name1 = profile1.name;
        String name2 = profile2.name;

        System.out.println("Fit between " + name1 + " and " + name2 + ":");
        System.out.println("  " + fitValue(profile2));

    }
}