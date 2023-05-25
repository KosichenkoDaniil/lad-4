package Anime;

import java.time.LocalDate;
import java.util.ArrayList;

public class series extends Anime{

    public series(ArrayList<String> genres, float rating, int NumberOfEpisodes, LocalDate reliseDate) {
        super(genres, rating, NumberOfEpisodes, reliseDate);
    }

    @Override
    public String toString() {
        return "series:\n" +
                super.toString();
    }
}
