import java.io.*;

class Division1 {
    public static void div() {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );

            int a = -1;
            int b = -1;

            while (true) {
                try {
                    System.out.print("Enter first number: ");
                    a = Integer.parseInt(br.readLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Wrong input: Enter only a number");
                }
            }

            while (true) {
                try {
                    System.out.print("Enter second number: ");
                    b = Integer.parseInt(br.readLine());

                    try {
                        int c = a / b;
                        System.out.println("Result: " + c);
                    } catch (ArithmeticException ae) {
                        System.out.println("Wrong input: Do not pass Zero");
                        continue;
                    }
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Wrong input: Enter only a number");
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
	public static void main(String[] args)
	{
		div();
	}
}
