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
        movies.put("Batman", new Movies("Batman", "Bale", "Action"));
        
    }

    public void addMovie(String title, String director, String genre) {
        // Add movie information to HashMap
        movies.put(title, new Movies(title, director, genre));
    }

}
   

