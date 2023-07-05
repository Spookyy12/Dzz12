package ru.netology.statistic;

public class Films {
        private int id;
        private String nameFilm;
        private String filmGenre;
    public Films(int id, String nameFilm, String filmGenre) {
        this.id = id;
        this.nameFilm = nameFilm;
        this.filmGenre = filmGenre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }


}


