public class CheckArithmeticOperation extends CheckNumbersRange {

    public String checkOperation (String x) {
        checker = "check successfull";
        if(!((x.equals("+")) || (x.equals("-")) || (x.equals("*")) || (x.equals("/")))) {
            checker = "invalid input";
        }
        return checker;
    }
}
