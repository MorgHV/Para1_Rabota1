import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pr = in.nextLine();
        String zap = ",";
        if(pr.indexOf(zap) != -1) {
            System.out.println(", есть");
        } else {
            System.out.println(", нет");
        }
    }
}