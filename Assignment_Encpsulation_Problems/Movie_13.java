package Assignment_Encpsulation_Problems;
public class Movie_13 {
    private String title;
    private String director;
    private int duration; // in minutes
    public Movie_13(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getMovieDetails() {
        return "Title: " + title + "\n"
                + "Director: " + director + "\n"
                + "Duration: " + duration + " minutes";
    }
    public static void main(String[] args) {
        Movie_13 movie = new Movie_13("Inception", "Christopher Nolan", 148);
        System.out.println(movie.getMovieDetails());
    }
}
