package fr.eql.ai111.java.init.tp.serie.v2;

import java.util.ArrayList;
import java.util.List;

public class TvSerie extends Serie {

    private List<Season> seasons = new ArrayList<>();

    public TvSerie(String title, int releaseYear, String synopsis) {
        super(title, releaseYear, synopsis);
    }

    @Override
    public void displayByWriter(String writer) {
        System.out.println("Episodes écrits par " + writer);
        for (Season season : seasons) {
            System.out.println("\tSaison " + season.getSeasonNumber());
            List<Episode> episodes = season.getEpisodes();
            for (Episode episode : episodes){
                if (episode.getWriter().equals(writer)) {
                    System.out.println("\t\t" + episode.getTitle());
                }
            }
        }
    }

    public List<Season> getSeasons() {
        return seasons;
    }
}
