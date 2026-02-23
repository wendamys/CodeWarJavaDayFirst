import java.util.Scanner;

// test input -> 10
// output -> 2 4 6 8 10
// output -> 30

class MassiveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = Math.round(n/2);
        int[] arr = new int[len];
        int k = 0;
        int sum = 0;
        for (int i = 2; n >= i; i += 2) {
            arr[k] = i;
            sum += i;
            k++;
        }
        for (int i = 0; arr.length > i; i++) {
            System.out.print(+ arr[i] + " ");
        }
        System.out.println("\n" + sum);

    }
}