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
    private int DISTMIN = 1;
    private int DISTMAX = 10;
    private int DISTINIT = 5;
    /**
     * Constructor for objects of the GUI class
     */
    public GUI() {
        // Add Buttons
        UI.initialise();
        UI.addButton("Quit", UI::quit);
        UI.addButton("Add a Movie", this::newMovie);
        //UI.addButton("Search for a Movie", this::searchMovie);
    }

    public void newMovie() {
        // Ask user for information on user
        //UI.println("Please leave your movies info below");
        String title = UI.askString("What is the Title: ");
        String director = UI.askString("Who is the Director: ");
        String genre = UI.askString("What is the Genre: ");
        //int rating = UI.addSlider("Rating", DISTMIN, DISTMAX, DISTINIT);
        
        // Send user inputs to addMovie method
        c.addMovie(title, director, genre);
        
        // Print statement of successful add to user
        UI.println("Movie added");
        
        UI.println(title);
        UI.println(director);
        UI.println(genre);
    }
    
    public static void main(String[] args){
        GUI obj = new GUI();
    }

}
