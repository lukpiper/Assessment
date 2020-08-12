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
public class GUI{
    private Cinemas c = new Cinemas();
    /**
     * Constructor for objects of the GUI class
     */
    public GUI() {
        // Add Buttons
        UI.initialise();
        UI.addButton("Quit", UI::quit);
        UI.addButton("Add a Movie", this::newMovie);
        // Search Bar
        UI.addTextField("Search", this::searchMovie);
        UI.addTextField("Rate a movie", this::rateMovie);
    }

    public void newMovie() {
        // Ask user for information on user
        UI.println("Please leave your movies info below\n");
        String title = UI.askString("Title: ");
        String director = UI.askString("Director: ");
        String genre = UI.askString("Genre: ");
        int rating = 0;
        // Send user inputs to addMovie method
        c.addMovie(title, director, genre, rating);
        
        // Print statement of successful add to user
        UI.println("Movie added\n");
        
        //UI.println("Title: " + title);
        //UI.println("Director: " + director);
        //UI.println("Genre: " + genre);
    }
    
    public void searchMovie(String search) {
       // Ask user for specific movie they want to find and send input to searchMovies method
       //String search = UI.askString("What movie do you want to search for: ");
       c.searchMovies(search);
    }
    
    public void rateMovie(String search) {
        c.rateMovies(search);
    }
    
    public static void main(String[] args){
        GUI obj = new GUI();
    }

}

