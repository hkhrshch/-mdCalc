public class CheckNumbersFormats extends CheckBasicInput {


    public String checkFormats(String x, String y) {

        if ((((x.equals("0")) || (x.equals("1")) || (x.equals("2")) || (x.equals("3")) || (x.equals("4")) ||
                (x.equals("5")) || (x.equals("6")) || (x.equals("7")) || (x.equals("8")) || (x.equals("9")) ||
                (x.equals("10"))) & ((y.equalsIgnoreCase("I")) || (y.equalsIgnoreCase("II")) ||
                (y.equalsIgnoreCase("III")) || (y.equalsIgnoreCase("IV")) ||
                (y.equalsIgnoreCase("V")) || (y.equalsIgnoreCase("VI")) ||
                (y.equalsIgnoreCase("VII")) || (y.equalsIgnoreCase("VIII")) ||
                (y.equalsIgnoreCase("IX")) || (y.equalsIgnoreCase("X"))))) {

            checker = "formats do not correspond";

        }

        if ((((x.equalsIgnoreCase("I")) || (x.equalsIgnoreCase("II")) ||
                (x.equalsIgnoreCase("III")) || (x.equalsIgnoreCase("IV")) ||
                (x.equalsIgnoreCase("V")) ||
                (x.equalsIgnoreCase("VI")) || (x.equalsIgnoreCase("VII")) ||
                (x.equalsIgnoreCase("VIII")) || (x.equalsIgnoreCase("IX")) ||
                (x.equalsIgnoreCase("X"))) & ((y.equals("0")) || (y.equals("1")) || (y.equals("2")) ||
                (y.equals("3")) || (y.equals("4")) || (y.equals("5")) || (y.equals("6")) || (y.equals("7")) ||
                (y.equals("8")) || (y.equals("9")) || (y.equals("10"))))) {

            checker = "formats do not correspond";
        }

     return checker;
     }
}












