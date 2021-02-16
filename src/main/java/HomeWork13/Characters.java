package HomeWork13;

public class Characters {
    private String movie;
    private String name;
    private int score;

    public Characters(String movie, String name, int score) {
        this.movie = movie;
        this.name = name;
        this.score = score;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Character " + name + " was in the movie " + movie + ", and his non-objective score is " + score;
    }
}
