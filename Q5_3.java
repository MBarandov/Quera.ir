import java.util.Scanner;

public class Q5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        if (x%2==0 && y%2==0 & y<=x)
            System.out.println(x+y);
        else if (x%2!=0 && y%2!=0 & y<=x)
            System.out.println(x+y - 1);
        else
            System.out.println(-1);
        
        scanner.close();
    }
}
