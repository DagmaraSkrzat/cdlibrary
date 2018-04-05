package pl.dominisz.cdlibrary;

public enum Genre {

    POP("Pop"),
    ROCK("Rock"),
    RAP("Rap"),
    DISCO("Disco"),
    BLUES("Blues"),
    JAZZ("Jazz"),
    FUNKY("Funky"),
    METAL("Metal");

    private String descriptionGenre;

    Genre(String genre) {
        this.descriptionGenre = genre;
    }

    public String getGenre() {
        return descriptionGenre;
    }

}
