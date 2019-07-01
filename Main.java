import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		//InheritanceLine1: CheckBasicInput->CheckNumbersFormats->CheckNumbersRange->CheckArithmeticOperation
	    //InheritanceLine2: ArithmeticOperation->ArithmeticOperationApply

        Scanner sc = new Scanner(System.in);
        CheckArithmeticOperation ch = new CheckArithmeticOperation();
        ArithmeticOperationApply ar = new ArithmeticOperationApply();

        String a;
        String b;

        int i = 1;
        while(i==1){

            a = "0";
            b = "0";
			
            System.out.println("Введiть перше число вiд 0 до 10, або вiд I до X: ");
			a = sc.nextLine();
			
			if(a.equalsIgnoreCase("quit")) {break;}
			
            System.out.println("Перше число: " + a);
			System.out.println(" ");
            ch.checkBasic(a);
            if(ch.checkBasic(a) == "input data invalid") {
                System.out.println("Введено недопустиме значення.");
                a = "0";
                continue;			
            }
			



            System.out.println("Введiть друге число вiд 0 до 10, або вiд I до X: ");
			System.out.println(" ");
            b = sc.nextLine();
			
			if(b.equalsIgnoreCase("quit")) {break;}
			
            System.out.println("Друге число: " + b);
			System.out.println(" ");
            ch.checkBasic(b);
            if(ch.checkBasic(b) == "input data invalid") {
                System.out.println("Введено недопустиме значення.");
				System.out.println("'quit' - вийти з програми");
				System.out.println(" ");
                b = "0";
                continue;
            }

            ch.checkFormats(a, b);
            if(ch.checkFormats(a, b) == "formats do not correspond"){
                System.out.println("Числа не мають належати до рiзних систем числення. " +
                        "Вираз у виглядi " + "'X + 10'"  + " - невалiдний.");
				System.out.println("'quit' - вийти з програми");
				System.out.println(" ");
                continue;
            }

            if(ch.checkRange(a, b) == "out of range") {
                System.out.println("Введенi числа не мають виходити за межi вiд 0 до 10, або вiд I до X");
				System.out.println("'quit' - вийти з програми");
				System.out.println(" ");
                continue;
            }


            boolean j = true;
            while(j == true) {
                System.out.println("Оберiть бажану арифметичну дiю, '+' - додавання, '-' - вiднiмання, " +
                        "'*' - множення, '/' - дiлення.");
                String c = sc.nextLine();
				System.out.println(" ");
				
				if(c.equalsIgnoreCase("quit")) {break;}
				
                if(ch.checkOperation(c) == "invalid input") {
                    System.out.println("Некоректно введено арифметичну дiю");
					System.out.println("'quit' - вийти з програми");
					System.out.println(" ");
                    continue;
                }
                ar.apply(a, b, c);
				System.out.println(" ");
				System.out.println("'quit' - вийти з програми");
				
                break;
            }
            }

        }
    }

