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

/** <description of class Cinemas>
 */
public class Cinemas{
    private HashMap<String, Movies> movies;
    
     public static void main(String[] args) {
        Cinemas obj = new Cinemas();
    }
    
    /**
     * Constructor
     */
    public Cinemas() {
        // New HashMap
        movies = new HashMap<String, Movies>();
        // Add in some data for search testing
        movies.put("Batman", new Movies("Batman", "Bale", "Action", 8));
        
    }

    public void addMovie(String title, String director, String genre, int rating) {
        // Add movie information to HashMap
        movies.put(title, new Movies(title, director, genre, rating));
    }
    
    public void searchMovies(String search) {
        // Send information on movie method and return result
        if(movies.isEmpty()) {
            Iterator it = movies.entrySet().iterator();
            UI.println("Try adding some movies to the system");
        }
        if (movies.keySet().contains(search)) {
            //if(movies.keySet().equals(search)){
            UI.println("Here is your movies information\n");
            String title = movies.get(search).getTitle(search);
            UI.println("Title: " + title);
            String director = movies.get(search).getDirector();
            UI.println("Director: " + director);
            String genre = movies.get(search).getGenre();
            UI.println("Genre: " + genre);
            int rating = movies.get(search).getRating();
            UI.println("Rating: " + rating +"/10");
        } else {
            UI.println("Movie cannot be found");
        }

    }

    public void rateMovies(String search) {
        if(!movies.isEmpty()) {
            Iterator it = movies.entrySet().iterator();
        }
        if (movies.keySet().contains(search)) {
            boolean interger = true;
            UI.println("Here is your movies information\n");
            String title = movies.get(search).getTitle(search);
            int rating = movies.get(search).getRating();
            UI.println("Title: " + title);
            UI.println("Rating: " + rating);
            if (interger = true) {
                rating = UI.askInt("What would you rate this movie out of 10: ");
                if (rating < 10) {
                    UI.println("You've given this movie an " + rating + "/10");
                    interger = true;
                } else {
                    UI.println("Please enter a value below ten");
                    interger = true;
                }
            }
        }
    }
}

