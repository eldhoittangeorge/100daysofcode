import java.util.Scanner;

class Calculator {

    public String getOperation(Scanner scanner){
        String operation;
        do {
            System.out.println("please enter an operation + - * /");
            operation = scanner.next();
            System.out.println(operation);

        }while (operation == "+" || operation == "-" || operation == "*" || operation == "/");
        return operation;
    }

//    public boolean validFraction(String string){
//        int a=string.charAt(0),b=string.charAt(1);
//        char c=string.charAt(2),d=string.charAt(3);
//        if()
//    }

    public String getFraction(Scanner scanner){
        String fraction;
        System.out.println("enter a fraction");
        fraction = scanner.next();
        return fraction;
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String operation = calculator.getOperation(scanner);
        System.out.println(operation);
        String fraction = calculator.getFraction(scanner);
        int a = Integer.parseInt(String.valueOf(fraction.charAt(0))),b = Integer.parseInt(String.valueOf(fraction.charAt(2)));
        String fraction2 = calculator.getFraction(scanner);
        int a1 = Integer.parseInt(String.valueOf(fraction2.charAt(0))),b1 = Integer.parseInt(String.valueOf(fraction2.charAt(2)));

        Fraction fraction1 = new Fraction(a,b);
        Fraction fraction3 = new Fraction(a1,b1);
        Fraction fraction4;

        if(operation.equals("*")) {
            System.out.println("mul");
            fraction4 = fraction1.multiply(fraction3);
            System.out.println(fraction4.getNumerator() + "/" + fraction4.getDenomenator());
        }

        if(operation.equals("-")) {
            System.out.println("sub");
            fraction4 = fraction1.subtract(fraction3);
            System.out.println(fraction4.getNumerator() + "/" + fraction4.getDenomenator());
        }

        if(operation.equals("+")) {
            System.out.println("add");
            fraction4 = fraction1.add(fraction3);
            System.out.println(fraction4.getNumerator() + "/" + fraction4.getDenomenator());
        }

        if(operation.equals("/")) {
            System.out.println("div");
            fraction4 = fraction1.division(fraction3);
            System.out.println(fraction4.getNumerator() + "/" + fraction4.getDenomenator());
        }

    }

}
