import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        String str = Integer.toString(x) + Integer.toString(y);
        System.out.println(sum + "\n" + str);

    }
}