package fr.eql.ai111.java.init.tp.serie.v2;

import java.util.ArrayList;
import java.util.List;

public class MovieSerie extends Serie {

    private List<Episode> episodes = new ArrayList<>();

    public MovieSerie(String title, int releaseYear, String synopsis) {
        super(title, releaseYear, synopsis);
    }

    @Override
    public void displayByWriter(String writer) {
        System.out.println("Films écrits par : " + writer);
        for (Episode movie : episodes) {
            if (movie.getWriter().equals(writer)) {
                System.out.println("\t" + movie.getTitle());
            }
        }
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
