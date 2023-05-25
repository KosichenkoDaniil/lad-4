package Anime;

import java.time.LocalDate;
import java.util.ArrayList;

public class ONA extends Anime{

    public ONA(ArrayList<String> genres, float rating, int NumberOfEpisodes, LocalDate reliseDate) {
        super(genres, rating, NumberOfEpisodes, reliseDate);
    }

    @Override
    public String toString() {
        return "ONA:\n" +
                super.toString();
    }
}
