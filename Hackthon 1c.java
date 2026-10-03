import java.util.Scanner;

class WasteStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double waste;

        System.out.print("Enter waste collected in kg: ");
        waste = sc.nextDouble();

        if (waste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
}   