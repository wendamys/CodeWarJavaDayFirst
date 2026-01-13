import java.util.Scanner;

class MaxChet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = -1;
        if ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0)) {
            System.out.println("Чётных чисел нет");
        } else {
            if (((a % 2 == 0) && (b % 2 == 0)) && (c % 2 == 0))  {
                if (a >= b) { max = a; }
                if (b >= c) { max = b; }
                if (c >= a) { max = c; }
            } else {
                if (a % 2 == 0) {
                    max = a;
                    if (b % 2 == 0) {
                        if (b >= a) { max = b; }
                    }
                    if (c % 2 == 0) {
                        if (c >= a && c >= b) { max = c; }
                    }

                } else { // a nechet
                    if (b % 2 == 0) {
                        max = b;
                        if (c % 2 == 0) {
                            if (c >= b) { max = c; }
                        }
                    } else { max = c; }
                }
            }
            System.out.println(max);
        }
    }
}