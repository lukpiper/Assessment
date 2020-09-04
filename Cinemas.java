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
        //movies.put("Batman", new Movies("Batman", "Bale", "Action", 8));
        
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
            // Returns movie information based off users correct movie title search
            UI.clearPanes();
            UI.println("Here is your movie's information\n");
            
            // Find and Print title information
            String title = movies.get(search).getTitle(search);
            title = title.substring(0, 1).toUpperCase() + title.substring(1);
            UI.println("Title: " + title);
            UI.drawString("Title: " + title, 50, 50);
            
            // Find and Print director information
            String director = movies.get(search).getDirector();
            director = director.substring(0, 1).toUpperCase() + director.substring(1);
            UI.println("Director: " + director);
            UI.drawString("Director: " + director, 50, 70);
            
            // Find and Print genre information
            String genre = movies.get(search).getGenre();
            genre = genre.substring(0, 1).toUpperCase() + genre.substring(1);
            UI.println("Genre: " + genre);
            UI.drawString("Genre: " + genre, 50, 90);
            
            
            int rating = movies.get(search).getRating();
            if (rating == 0) {
                UI.println("Movie has not been rated yet");
                UI.drawString("Movie has not been rated yet", 50, 110);
            } else {
                UI.println("Rating: " + rating +"/10");
                UI.drawString("Rating: " + rating, 50, 110);
            }
        } else {
            UI.println("Movie cannot be found");
        }
    }

    public void rateMovies(String search) {
        if(!movies.isEmpty()) {
            Iterator it = movies.entrySet().iterator();
            UI.println("Try adding some movies to the system");
        }
        if (movies.keySet().contains(search)) {
            // Displays current movie information
            UI.println("Here is your movies information\n");
            String title = movies.get(search).getTitle(search);
            String director = movies.get(search).getDirector();
            String genre = movies.get(search).getGenre();
            int rating = movies.get(search).getRating();
            title = title.substring(0, 1).toUpperCase() + title.substring(1);
            UI.println("Title: " + title);
            if (rating == 0) {
                UI.println("Movie has not been rated yet");
            } else {
                UI.println("Rating: " + rating +"/10");
            }
            // Continous loop for boundary input question, loop breaks when user inputs correct possible answer
            while (true) {
                rating = UI.askInt("What would you rate this movie out of 10: ");
                //boundary values defined
                if (rating > 10 || rating <= 0) {
                    UI.println("Please enter a value between 0 and 10");
                } else {
                    //movies.put(title, new Movies(title, director, genre, rating));
                    movies.get(search).changeRating(rating);
                    UI.println("You've given this movie a " + rating + "/10");
                    break;
                }
            }
        } else {
            UI.println("Movie cannot be found");
        }
    }
    
    public void recommendMovies(String pick) {
        //int rating = movies.get(pick).getRating();
        //UI.println(rating);
        //if (movies.rating >= 4) {
            //UI.println("a");
        //}
    }
}

