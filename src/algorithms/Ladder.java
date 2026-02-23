import java.util.Scanner;

// test input -> 5
// output -> 1
// output -> 1 2
// output -> 1 2 2
// output -> 1 2 2 3
// output -> 1 2 2 3 3

class Ladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = 0;
        int s = 1;
        int flag = 0;
        while (a >= s) {
            for (int i = 1; a >= i; i++) {
                for (int j = 1; i >= j; j++) {
                    if (s > k) {
                        System.out.print((s == (k+1) ? i : i + " "));
                        //System.out.print(i + " ");
                        k++;
                    }
                }
            }
            k = 0;
            System.out.print("\n");
            s++;
        }
    }
}