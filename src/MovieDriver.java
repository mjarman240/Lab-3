import java.util.Scanner;

public class MovieDriver {
    public static void main (String [] args) {
        // Variables
        String continueLoop = "";

        // Create Movie Object
        Movie movie;

        // Create Scanner object
        Scanner userInput = new Scanner(System.in);

        do {
            // Create object
            movie = new Movie();

            // Prompt for Movie name
            System.out.println("Enter the name of a movie");
            movie.setTitle(userInput.nextLine());

            // Prompt for rating
            System.out.println("Enter the rating of the movie");
            movie.setRating(userInput.nextLine());

            // Ask for tickets sold
            System.out.println("Enter the number of tickets sold for this movie");
            movie.setSoldTickets(userInput.nextInt());

            // Print movie information
            System.out.println(movie);

            // Clear nextline
            userInput.nextLine();

            // Ask if they want to repeat loop
            System.out.println("Do you want to enter another? (y or n)");
            continueLoop = userInput.nextLine();

        } while (!continueLoop.equalsIgnoreCase("n"));

        // Print farewell
        System.out.println("Goodbye");
    }
}
