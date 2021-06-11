import java.util.Scanner;

public class LogicGates {

    public static void main(String[] args) {
        int a;
        int b;
        System.out.print("Enter 1 or 0 to simulate this logic gate. \n");
        Scanner scanner = new Scanner(System.in);
        String inputtedNumberA = scanner.nextLine();
        a = Integer.parseInt(inputtedNumberA);
        while (a != 0 && a != 1) {
            System.out.print("Please enter either 1 or 0.");
            inputtedNumberA = scanner.nextLine();
            a = Integer.parseInt(inputtedNumberA);
        }
        System.out.print("Enter another 1 or 0 to simulate this logic gate. \n");
        String inputtedNumberB = scanner.nextLine();
        b = Integer.parseInt(inputtedNumberB);
        while (b != 0 && b != 1) {
            System.out.print("Please enter either 1 or 0.");
            inputtedNumberB = scanner.nextLine();
            b = Integer.parseInt(inputtedNumberB);
        }
    }

    public static void circuitOne(int a, int b) {
        int finalOutput = -1;
        int output1 = and(not(a), b);
        int output2 = and(a, not(b));
        finalOutput = or(output1, output2);
        System.out.print(finalOutput);
    }

    public static void circuitTwo(int a, int b) {
        int s = -1;
        int c = -1;
        int output = -1;
        s = xor(a, b);
        c = and(a, b);
        System.out.print(s + " " + c);
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
