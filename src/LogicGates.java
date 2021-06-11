import java.util.Scanner;

public class LogicGates {

    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Enter 1 or 0 to simulate the circuits.");
        Scanner scanner = new Scanner(System.in);
        String inputtedNumberA = scanner.nextLine();
        a = Integer.parseInt(inputtedNumberA);
        while (a != 0 && a != 1) {
            System.out.println("Please enter either 1 or 0.");
            inputtedNumberA = scanner.nextLine();
            a = Integer.parseInt(inputtedNumberA);
        }
        System.out.println("Enter another 1 or 0 to simulate the circuits.");
        String inputtedNumberB = scanner.nextLine();
        b = Integer.parseInt(inputtedNumberB);
        while (b != 0 && b != 1) {
            System.out.println("Please enter either 1 or 0.");
            inputtedNumberB = scanner.nextLine();
            b = Integer.parseInt(inputtedNumberB);
        }
        circuitOne(a, b);
        circuitTwo(a, b);
    }

    public static void circuitOne(int a, int b) {
        int output1 = and(not(a), b);
        int output2 = and(a, not(b));
        int finalOutput = or(output1, output2);
        System.out.println("The result of simulating circuit one is " + finalOutput + ".");
    }

    public static void circuitTwo(int a, int b) {
        int s = xor(a, b);
        int c = and(a, b);
        System.out.println("The result of simulating circuit two is " + s + " and " + c + ".");
    }

    public static int not(int c) {
        if (c == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int and(int a, int b) {
        return a * b;
    }

    public static int or(int a, int b) {
        if (a == b && a == 1) {
            return 1;
        } else {
            return a + b;
        }
    }

    public static int xor(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int nand(int a, int b) {
        if (a == 1 && b == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int nor(int a, int b) {
        if (a == 0 && b == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int xnor(int a, int b) {
        if (a == b) {
            return 1;
        } else {
            return 0;
        }
    }

}
