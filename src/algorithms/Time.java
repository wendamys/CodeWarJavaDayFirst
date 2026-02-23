import java.util.Scanner;

// test input -> 44000
// output -> 12:13:20

class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int day = 24 * 60 * 60;
        int hour = 60 * 60;

        int timehour = (sec % day) / 3600;
        int timeminute = (sec % hour) / 60;
        int timesec = (sec % hour) % 60;
        System.out.printf("%02d:%02d:%02d", timehour, timeminute, timesec);
    }
}