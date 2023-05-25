import Anime.Anime;
import Anime.OVA;
import Anime.ONA;
import Anime.series;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>() {{
            add(new OVA(new ArrayList<String>(){{add("Сенен");}}, 7.6f, 12, LocalDate.of(2022, 12, 12)));
            add(new ONA(new ArrayList<String>(){{add("Сенен");}}, 9.6f, 12, LocalDate.of(2021, 10, 15)));
            add(new series(new ArrayList<String>(){{add("Сенен");}}, 5.8f, 12, LocalDate.of(2022, 5, 6)));
            add(new OVA(new ArrayList<String>(){{add("Седзе");}}, 8.7f, 12, LocalDate.of(2020, 4, 29)));
            add(new ONA(new ArrayList<String>(){{add("Седзе");}}, 10f, 12, LocalDate.of(2021, 11, 30)));
            add(new series(new ArrayList<String>(){{add("Седзе");}}, 4.5f, 12, LocalDate.of(2019, 7, 25)));
            add(new series(new ArrayList<String>(){{add("Сэйнэн");}}, 7.7f, 12, LocalDate.of(2018, 9, 5)));
            add(new OVA(new ArrayList<String>(){{add("Сэйнэн");}}, 6.9f, 12, LocalDate.of(2019, 3, 21)));
            add(new ONA(new ArrayList<String>(){{add("Дзесэй");}}, 4.5f, 12, LocalDate.of(2018, 4, 16)));
            add(new OVA(new ArrayList<String>(){{add("Дзесэй");}}, 7.3f, 12, LocalDate.of(2016, 10, 23)));
        }};

        System.out.println("Оценка выше 7: ");
        for(var anime : animeList){
            if(anime.getRating() > 7){
                System.out.println(anime.toString());
            }
        }

        System.out.println("\n\nВышли недавно: ");
        LocalDate currentTime = LocalDate.of(2022, 5, 1);
        for(var anime : animeList){
            long res = ChronoUnit.YEARS.between(currentTime, anime.getReliseDate());
            if (res > -2){
                System.out.println(anime);
            }
        }

        System.out.println("\n\nСамыйе популярные жанры: ");
        HashMap<String, Integer> mostPopularGenera = new HashMap<>();
        for (var anime : animeList) {
            for(var gener : anime.getGenres()){
                if(!mostPopularGenera.containsKey(gener)){
                    mostPopularGenera.put(gener, 1);
                } else{
                    int tmp = mostPopularGenera.get(gener) + 1;
                    mostPopularGenera.put(gener, tmp);
                }
            }
        }

        System.out.println(mostPopularGenera);
    }
}
