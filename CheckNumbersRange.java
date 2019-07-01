public class CheckNumbersRange extends CheckNumbersFormats {

    RomanConverter rc = new RomanConverter();
    private int x_tocompare;
    private int y_tocompare;


    public String checkRange(String x, String y) {

        if (((x.equalsIgnoreCase("I")) || (x.equalsIgnoreCase("II")) ||
                (x.equalsIgnoreCase("III")) || (x.equalsIgnoreCase("IV")) ||
                (x.equalsIgnoreCase("V")) || (x.equalsIgnoreCase("VI")) ||
                (x.equalsIgnoreCase("VII")) || (x.equalsIgnoreCase("VIII")) ||
                (x.equalsIgnoreCase("IX")) || (x.equalsIgnoreCase("X"))) &
                (y.equalsIgnoreCase("II")) || (y.equalsIgnoreCase("III")) ||
                (y.equalsIgnoreCase("IV")) || (y.equalsIgnoreCase("V")) ||
                (y.equalsIgnoreCase("VI")) || (y.equalsIgnoreCase("VII")) ||
                (y.equalsIgnoreCase("VIII")) || (y.equalsIgnoreCase("IX")) ||
                (y.equalsIgnoreCase("X"))) {

            x_tocompare = Integer.parseInt(rc.convert(x));
            y_tocompare = Integer.parseInt(rc.convert(y));
        } else {

            x_tocompare = Integer.parseInt(x);
            y_tocompare = Integer.parseInt(y);
        }


        if ((x_tocompare < 0) || (x_tocompare > 10) || (y_tocompare < 0) || (y_tocompare > 10)) {
            checker = "out of range";
        }


        return checker;
    }
}


