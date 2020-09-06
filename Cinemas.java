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
        movies.put("batman", new Movies("batman", "christopher nolan", "action", 8));
        
    }

    public void addMovie(String title, String director, String genre, int rating) {
        // Add movie information to HashMap
        movies.put(title, new Movies(title, director, genre, rating));
    }
    
    public void searchMovies(String search) {
        // Send information on movie method and return result
        // If no movies in system, print error message
        if(movies.isEmpty()) {
            Iterator it = movies.entrySet().iterator();
            UI.println("Try adding some movies to the system");
        }
        // Search for movie in Hashmap
        if (movies.keySet().contains(search)) {
            // Returns movie information based off users correct movie title search
            UI.clearPanes();
            UI.setLineWidth(2);
            UI.setFontSize(12);
            UI.drawString("Movies Information: ", 125, 20);
            UI.drawRect(25, 25, 300, 150);
            UI.println("Here is your movie's information\n");
            
            // Find and Print title information
            String title = movies.get(search).getTitle(search);
            title = title.substring(0, 1).toUpperCase() + title.substring(1);
            UI.println("Title: " + title);
            UI.setFontSize(20);
            UI.drawString("Title: " + title, 50, 60);
            
            // Find and Print director information
            String director = movies.get(search).getDirector();
            director = director.substring(0, 1).toUpperCase() + director.substring(1);
            UI.println("Director: " + director);
            UI.setFontSize(14);
            UI.drawString("Director: " + director, 50, 90);
            
            // Find and Print genre information
            String genre = movies.get(search).getGenre();
            genre = genre.substring(0, 1).toUpperCase() + genre.substring(1);
            UI.println("Genre: " + genre);
            UI.setFontSize(14);
            UI.drawString("Genre: " + genre, 50, 110);
            
            // Find rating of movie
            int rating = movies.get(search).getRating();
            // If movie rating is not been rated print that message if not then print its rating
            if (rating == 0) {
                UI.println("Movie has not been rated yet");
                UI.setFontSize(14);
                UI.drawString("Movie has not been rated yet", 50, 130);
            } else {
                UI.println("Rating: " + rating +"/10");
                UI.drawString("Rating: " + rating +"/10", 50, 130);
            }
        } else {
            UI.println("Movie cannot be found");
        }
    }

    public void rateMovies(String search) {
        // If no movies in system, print error message
        if(movies.isEmpty()) {
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
    
    public void recommendMovies() {
        UI.println("Here are our tops picks for you\n");
        for (String i : movies.keySet()) {
            if (movies.get(i).getRating() >= 7) {
                UI.println(i.substring(0, 1).toUpperCase() + i.substring(1) + "\n");
                
            }
        }
        
        
        
        
        //if (movies.forEach(rating >= 5)) {
            //UI.println("Nice");
        //}
        
        //if (movies.containsValue(pick)) {
            //UI.println("Here is your movies information\n");
            //String title = movies.get(pick).getTitle(pick);
            //String director = movies.get(pick).getDirector();
            //String genre = movies.get(pick).getGenre();
            //int rating = movies.get(pick).getRating();
            
            //UI.println("Title: " + title);
            //UI.println("Director: " + director);
            //UI.println("Genre: " + genre);
            //UI.println("Rating: " + rating);
        //} else {
            //UI.println("Fail");
        //}
        //if (movies.keyValue().contains(pick)) {
          //  UI.println("Nice");
            
        //}
        
        //int rating = movies.get(pick).getRating();
        //UI.println(rating);
        //if (movies.rating >= 4) {
            //UI.println("a");
        //}
    }
}

