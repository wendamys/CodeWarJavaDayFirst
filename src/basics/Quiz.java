import java.security.MessageDigest;

// output -> A12
// output -> A12
// output -> A12
// output -> 10892

public class Quiz {

    public static void main(String[] args) throws Exception {
        System.out.println( "A" + ('\t' + '\u0003') );
        System.out.println( "A" + 12 );
        System.out.println( 'A' + "12" );
        System.out.println( 'А' + '1' + "2" );
    }
}