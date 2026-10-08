import java.util.Scanner;

public class MovieTickets {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTickets(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        } else {
            return 0;
        }
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("Booking Bill");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Total Amount: " + calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name:");
        String name = sc.nextLine();

        System.out.println("Enter ticket price:");
        double price = sc.nextDouble();

        System.out.println("Enter number of tickets:");
        int tickets = sc.nextInt();

        MovieTickets mt = new MovieTickets(name, price, tickets);

        mt.displayBill();
    }
}