public class CheckBasicInput {
    protected String checker = "check successfull";

    public String checkBasic (String x) {
        checker = "check successfull";
        if (!((x.equalsIgnoreCase("I")) || (x.equalsIgnoreCase("II")) ||
                (x.equalsIgnoreCase("III")) || (x.equalsIgnoreCase("IV")) ||
                (x.equalsIgnoreCase("V")) || (x.equalsIgnoreCase("VI")) ||
                (x.equalsIgnoreCase("VII")) || (x.equalsIgnoreCase("VIII")) ||
                (x.equalsIgnoreCase("IX")) || (x.equalsIgnoreCase("X")) ||
                (x.equals("0")) || (x.equals("1") || (x.equals("2")) || (x.equals("3")) || (x.equals("4")) ||
                (x.equals("5")) || (x.equals("6")) || (x.equals("7")) || (x.equals("8")) || (x.equals("9")) ||
                (x.equals("10"))))) {

            checker = "input data invalid";
        }

        return checker;
    }
}
