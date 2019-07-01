public class RomanConverter {

    public String convert(String x) {

        String result = x;

        if (x.equalsIgnoreCase("I")) {

            result = "1";
        }

        if (x.equalsIgnoreCase("II")) {

            result = "2";
        }

        if (x.equalsIgnoreCase("III")) {

            result = "3";
        }

        if (x.equalsIgnoreCase("IV")) {

            result = "4";
        }

        if (x.equalsIgnoreCase("V")) {

            result = "5";
        }

        if (x.equalsIgnoreCase("VI")) {

            result = "6";
        }

        if (x.equalsIgnoreCase("VII")) {

            result = "7";
        }

        if (x.equalsIgnoreCase("VIII")) {

            result = "8";
        }

        if (x.equalsIgnoreCase("IX")) {

            result = "9";
        }

        if (x.equalsIgnoreCase("X")) {

            result = "10";
        }

        return result;
    }
}




        
        /*if (a.length() == 1) {


            if (a.charAt(0) == 'I') {
                result = "1";
            }

            if (a.charAt(0) == 'V') {
                result = "5";
            }

            if (a.charAt(0) == 'X') {
                result = "10";
            }
        }


        if (a.length() == 2) {

            if ((a.charAt(0) == 'I') & (a.charAt(1) == 'I')) {
                result = "2";
            }

            if ((a.charAt(0) == 'I') & (a.charAt(1) == 'V')) {
                result = "4";
            }

            if ((a.charAt(0) == 'V') & (a.charAt(1) == 'I')) {
                result = "6";
            }

            if ((a.charAt(0) == 'I') & (a.charAt(1) == 'X')) {
                result = "9";
            }
        }


        if (a.length() == 3) {

            if ((a.length() == 3) & (a.charAt(0) == 'I') & (a.charAt(1) == 'I') & (a.charAt(2) == 'I')) {
                result = "3";
            }

            if ((a.charAt(0) == 'V') & (a.charAt(1) == 'I') & (a.charAt(2) == 'I')) {
                result = "7";
            }
        }

        if (a.length() == 4) {

            if ((a.charAt(0) == 'V') & (a.charAt(1) == 'I') & (a.charAt(2) == 'I') & (a.charAt(3) == 'I')) {
                result = "8";
            }*/
