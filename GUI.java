/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
import java.util.HashMap;

/** <description of class GUI>
 */
public class GUI {
    private Cinemas c = new Cinemas();
    /**
     * Constructor for objects of the GUI class
     */
    public GUI() {
        // Add Buttons
        UI.initialise();
        // Search Bars
        UI.addTextField("Search", this::searchMovie);
        UI.addTextField("Rate a movie", this::rateMovie);
        // Buttons
        UI.addButton("Add a Movie", this::newMovie);
        UI.addButton("Your top picks", this::recommendMovie);
        UI.addButton("Quit", UI::quit);
    }

    public void newMovie() {
        // Ask user for information on user
        UI.println("Please leave your movies info below\n");
        while (true) {
            String title = UI.askString("Title: ");
            if (title.length() == 0) {
                UI.println("Please enter a movie title");
            } 
            else {
                title = title.toLowerCase();
                String director = UI.askString("Director: ");
                String genre = UI.askString("Genre: ");
                director = director.toLowerCase();
                genre = genre.toLowerCase();
                
                String explicitRating = UI.askString("Explicity tags: ");
                explicitRating = explicitRating.toLowerCase();
                
                int rating = 0;
                // Send user inputs to addMovie method
                c.addMovie(title, director, genre, rating, explicitRating);
                
                // Print statement of successful add to user
                UI.println("Movie added\n");
                break;
            }
        }
    }
    
    public void searchMovie(String search) {
       // Ask user for specific movie they want to find and send input to searchMovies method
       //String search = UI.askString("What movie do you want to search for: ");
       c.searchMovies(search.toLowerCase());
    }
    
    public void rateMovie(String search) {
        c.rateMovies(search.toLowerCase());
    }
    
    public void recommendMovie() {
        //String pick = UI.askString("What is your favourite genre: ");
        //pick = pick.toLowerCase();
        c.recommendMovies();
    }
    
    public static void main(String[] args) {
        GUI obj = new GUI();
    }

}

