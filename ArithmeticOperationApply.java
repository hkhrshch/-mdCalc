public class ArithmeticOperationApply extends ArithmeticOperation {

    RomanConverter rc = new RomanConverter();

    public void apply (String x, String y, String z) {

        int result = 0;

        if (z.equals("+")) {
            result = add(Integer.parseInt(rc.convert(x)), Integer.parseInt(rc.convert(y)));
            System.out.println(x + " + " +  y + " = " + result);
        }

        if (z.equals("-")) {
            result = substract(Integer.parseInt(rc.convert(x)), Integer.parseInt(rc.convert(y)));
            System.out.println(x + " - " + y + " = " + result);
        }

        if (z.equals("*")) {
            result = multiply(Integer.parseInt(rc.convert(x)), Integer.parseInt(rc.convert(y)));
            System.out.println(x + " * " + y + " = " + result);
        }

        if (z.equals("/")) {
            if(y.equals("0")) {
				System.out.println("Дiлення на нуль неможливе");                
            }else {
                result = divide(Integer.parseInt(rc.convert(x)), Integer.parseInt(rc.convert(y)));
                System.out.println(x + " * " + y + " = " + result);
            }
        }
        
    }

}