package Anime;

import java.time.LocalDate;
import java.util.ArrayList;

public class OVA extends Anime{

    public OVA(ArrayList<String> genres, float rating, int NumberOfEpisodes, LocalDate reliseDate) {
        super(genres, rating, NumberOfEpisodes, reliseDate);
    }

    @Override
    public String toString() {
        return "OVA:\n" +
                super.toString();
    }
}
