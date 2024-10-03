import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int year = scanner.nextInt();
        // leap year, can be divided by 4, cannot be divided by 100, and
        if (year % 400 == 0){
            System.out.println("Leap");
        } else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }

        scanner.close();
    }
}