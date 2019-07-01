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
			
            System.out.println("����i�� ���� �᫮ �i� 0 �� 10, ��� �i� I �� X: ");
			a = sc.nextLine();
			
			if(a.equalsIgnoreCase("quit")) {break;}
			
            System.out.println("���� �᫮: " + a);
			System.out.println(" ");
            ch.checkBasic(a);
            if(ch.checkBasic(a) == "input data invalid") {
                System.out.println("������� �������⨬� ���祭��.");
                a = "0";
                continue;			
            }
			



            System.out.println("����i�� ��㣥 �᫮ �i� 0 �� 10, ��� �i� I �� X: ");
			System.out.println(" ");
            b = sc.nextLine();
			
			if(b.equalsIgnoreCase("quit")) {break;}
			
            System.out.println("��㣥 �᫮: " + b);
			System.out.println(" ");
            ch.checkBasic(b);
            if(ch.checkBasic(b) == "input data invalid") {
                System.out.println("������� �������⨬� ���祭��.");
				System.out.println("'quit' - ���� � �ணࠬ�");
				System.out.println(" ");
                b = "0";
                continue;
            }

            ch.checkFormats(a, b);
            if(ch.checkFormats(a, b) == "formats do not correspond"){
                System.out.println("��᫠ �� ����� ������� �� �i���� ��⥬ �᫥���. " +
                        "��ࠧ � �����i " + "'X + 10'"  + " - �����i����.");
				System.out.println("'quit' - ���� � �ணࠬ�");
				System.out.println(" ");
                continue;
            }

            if(ch.checkRange(a, b) == "out of range") {
                System.out.println("������i �᫠ �� ����� ��室�� �� ���i �i� 0 �� 10, ��� �i� I �� X");
				System.out.println("'quit' - ���� � �ணࠬ�");
				System.out.println(" ");
                continue;
            }


            boolean j = true;
            while(j == true) {
                System.out.println("����i�� ������ ��䬥��� �i�, '+' - ���������, '-' - �i��i�����, " +
                        "'*' - ��������, '/' - �i�����.");
                String c = sc.nextLine();
				System.out.println(" ");
				
				if(c.equalsIgnoreCase("quit")) {break;}
				
                if(ch.checkOperation(c) == "invalid input") {
                    System.out.println("����४⭮ ������� ��䬥��� �i�");
					System.out.println("'quit' - ���� � �ணࠬ�");
					System.out.println(" ");
                    continue;
                }
                ar.apply(a, b, c);
				System.out.println(" ");
				System.out.println("'quit' - ���� � �ணࠬ�");
				
                break;
            }
            }

        }
    }

