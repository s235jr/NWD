import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scaner = new Scanner(System.in);
        int numberOfCase = Integer.parseInt(scaner.nextLine());
        String[] arraynumbers = new String[numberOfCase];

        for (int i = 0; i < numberOfCase; i++) {
            arraynumbers[i] = scaner.nextLine();
        }

        for (int i = 0; i < arraynumbers.length; i++){
            String[] number = arraynumbers[i].split(" ");
        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);

        System.out.println(nwd(a, b));
    }
    }
    static int nwd(int a, int b) {
        int nwd = 3;
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                nwd = i;
                return nwd;
            }
        }
        return nwd;
    }
}
