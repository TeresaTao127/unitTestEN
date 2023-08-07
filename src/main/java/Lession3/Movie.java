package Lession3;

public class Movie {
    String title;
    String director;

    int DurationMinutes;

    int YearOfProduction;

    public Movie(String title, String director, int DurationMinutes, int YearOfProduction) {
        this.title = title;
        this.director = director;
        this.DurationMinutes = DurationMinutes;
        this.YearOfProduction = YearOfProduction;
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public int getDurationMinutes(){
        return DurationMinutes;
    }

    public int getYearOfProduction(){
        return YearOfProduction;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", Director='" + director + '\'' +
                ", DurationMinutes=" + DurationMinutes +
                ", YearOfProduction=" + YearOfProduction +
                '}';
    }
}
