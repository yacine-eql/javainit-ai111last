package fr.eql.ai111.java.init.tp.serie.v1;

import java.util.ArrayList;
import java.util.List;

public class Season {

    private int seasonNumber;
    private List<Episode> episodes = new ArrayList<>();

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }
}
