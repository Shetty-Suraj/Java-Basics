import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while(true){
        System.out.println("Enter  number (1-5) And 11 to exit: ");
        int Number = scr.nextInt();

        switch ((Number)) {
            case 1:
                  System.out.println("Maths");
                break;
            case 2:
                  System.out.println("Java");
                  break;
            case 3:
                  System.out.println("Opps");
                  break;
            case 4:
                   System.out.println("DSA");
                   break;
            case 5:
                  System.out.println("Nodjes");
                  break;
            case 11:
                   System.exit(0);
            default:
                  System.out.println("Invalid Number plese enter 1-5");
                break;
        }

    }
}
}