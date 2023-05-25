package Anime;

import java.time.LocalDate;

import java.util.ArrayList;

public abstract class Anime {

    private ArrayList<String> genres;

    private float rating;

    private int NumberOfEpisodes;

    private LocalDate reliseDate;

    public ArrayList<String> getGenres() {return genres;}

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getNumberOfEpisodes() {
        return NumberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        NumberOfEpisodes = numberOfEpisodes;
    }

    public LocalDate getReliseDate() {
        return reliseDate;
    }

    public void setReliseDate(LocalDate reliseDate) {
        this.reliseDate = reliseDate;
    }

    public Anime(ArrayList<String> genres, float rating, int NumberOfEpisodes, LocalDate reliseDate){
        this.genres = genres;
        this.rating = rating;
        this.reliseDate = reliseDate;
        this.NumberOfEpisodes = NumberOfEpisodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "genres=" + genres +
                ", rating=" + rating +
                ", NumberOfEpisodes=" + NumberOfEpisodes +
                ", reliseDate=" + reliseDate +
                '}';
    }
}
