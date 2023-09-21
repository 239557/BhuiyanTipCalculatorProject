import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator");
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("How many people are in your group: ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0 - 100): ");
        int percentTip = scan.nextInt();

        double cost = 0;
        System.out.print("Enter a cost in dollars and cents: ");
        double cost2 = scan.nextDouble();
        cost += cost2;

        while (cost2 != -1) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost2 =  scan.nextDouble();
            cost += cost2;
        }
        System.out.println("--------------------------------------------");
        System.out.println();
        double beforeTip = cost;
        System.out.println("Total bill before tip: " + beforeTip);
        System.out.println("Total percentage: " + percentTip + "%");
        double totalTip = beforeTip * (percentTip / 100.0 );
        System.out.println("Total Tip: $" + totalTip);
        System.out.println("Total bill with Tip: " + beforeTip + totalTip);
        double billiTip = beforeTip + totalTip;
        System.out.println("Total bill with Tip: " + billiTip);
        System.out.println("Per person cost before tip: " +(beforeTip / people));
        System.out.println("Tip per person:" +(totalTip / people));
        System.out.println("Total cost per person:" +(cost2 / people));
}
    }