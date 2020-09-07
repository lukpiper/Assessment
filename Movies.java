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

/** <description of class Movies>
 */
public class Movies {
    // Fields
    private String title;
    private String director;
    private String genre;
    private int rating;
    private String explicitRating;
    
    /** 
      Constructors */
    public Movies(String title, String director, String genre, int rating, String explicitRating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.explicitRating = explicitRating;
    }

    public String getTitle(String search) {
        //if (search != title) {
            //UI.println("Title of movie cannot be found");
        //} else {
        return this.title;
        //}
    }
    
    public String getDirector() {
        return this.director;
    }

    public String getGenre() {
        return this.genre;
    }
    
    public int getRating() {
        return this.rating;
    }
    
    public String getExplicitRating() {
        return this.explicitRating;
    }
    
    public void changeRating(int newRating) {
        this.rating = newRating;
    }
}

