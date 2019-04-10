import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        System.out.println("Enter c");
        c = scanner.nextInt();
        scanner.close();


        if(a == 90 || b == 90 || c == 90){
            System.out.println("Tai staciakampis trikampis");
        } else if(a <= 0 || b <= 0 || c <= 0){
            System.out.println("kampas negali buti = 0 ar maziau");
        } else {
            System.out.println("Trikampis nera staciakampis");
        }
    }
}
