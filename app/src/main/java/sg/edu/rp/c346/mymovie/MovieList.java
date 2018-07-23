package sg.edu.rp.c346.mymovie;

import java.util.Calendar;

/**
 * Created by 16019865 on 23/7/2018.
 */

public class MovieList {

    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_threater;
    private String description;
    private int rating_star;

    public MovieList(String title, String year, String rated, String genre, Calendar watched_on, String in_threater, String description, int rating_star) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_threater = in_threater;
        this.description = description;
        this.rating_star = rating_star;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_threater() {
        return in_threater;
    }

    public void setIn_threater(String in_threater) {
        this.in_threater = in_threater;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating_star() {
        return rating_star;
    }

    public void setRating_star(int rating_star) {
        this.rating_star = rating_star;
    }

    public String getDateString() {
        String str = watched_on.get(Calendar.DAY_OF_MONTH) + "/" + watched_on.get(Calendar.MONTH) + "/" + watched_on.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return "MovieList{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", watched_on=" + watched_on +
                ", in_threater='" + in_threater + '\'' +
                ", description='" + description + '\'' +
                ", rating_star=" + rating_star +
                '}';
    }
}
