import java.util.Scanner;

// test input -> PYTGON JAVA C++
// output -> C++
// output -> JAVA
// output -> PYTGON

class FirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        if (a.charAt(0) > b.charAt(0) && a.charAt(0) > c.charAt(0)) { // а будет на 3 месте 
            if (b.charAt(0) > c.charAt(0)) { // если б больше то он на 2, а с на первом 
                System.out.println(c + "\n" + b + "\n" + a);
            } else { System.out.println(b + "\n" + c + "\n" + a); } // иначе если б меньше то он на первом, б на втором
        }
        // теперь проверяем б
        if (b.charAt(0) > a.charAt(0) && b.charAt(0) > a.charAt(0)) { // б будет на 3 месте
            if (a.charAt(0) > c.charAt(0)) { // если а больше то он на 2 месте
                System.out.println(c + "\n" + a + "\n" + b);
            } else { System.out.println(a + "\n" + c + "\n" + b); }
        }
        if (c.charAt(0) > b.charAt(0) && c.charAt(0) > a.charAt(0)) {
            if (a.charAt(0) > b.charAt(0)) {
                System.out.println(b + "\n" + a + "\n" + c);
            } else { System.out.println(a + "\n" + b + "\n" + c); }
        }
    }
}