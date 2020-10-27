package creational.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private String director;
    private List<String> actors;
    private BigDecimal budget;
    private LocalDate openingNightDate;
    private Country country;
    private boolean hasOscar;

    // our builder
    public static final class MovieBuilder {

        private String title = "";
        private String director;
        private List<String> actors = new ArrayList<>();
        private BigDecimal budget;
        private LocalDate openingNightDate;
        private Country country;
        private boolean hasOscar = false;

        public MovieBuilder withTitle(String title){
            this.title = title;
            return this;
        }

        public MovieBuilder withDirector(String director){
            this.director = director;
            return this;
        }

        public MovieBuilder withActor(String actor){
            this.actors.add(actor);
            return this;
        }

        public MovieBuilder withBudget(BigDecimal budget){
            this.budget = budget;
            return this;
        }

        public MovieBuilder withOpeningNight(LocalDate openingNightDate){
            this.openingNightDate = openingNightDate;
            return this;
        }

        public MovieBuilder withCountry(Country country){
            this.country = country;
            return this;
        }

        public MovieBuilder withOskar(){
            this.hasOscar = true;
            return this;
        }

        public Movie build(){
            if(title.isEmpty()){
                throw new IllegalStateException("Movie must have title!");
            }
            Movie movie = new Movie();
            movie.title = this.title;
            movie.director = this.director;
            movie.actors = this.actors;
            movie.budget = this.budget;
            movie.openingNightDate = this.openingNightDate;
            movie.country = this.country;
            movie.hasOscar = this.hasOscar;
            return movie;
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                ", budget=" + budget +
                ", openingNightDate=" + openingNightDate +
                ", country=" + country +
                ", hasOscar=" + hasOscar +
                '}';
    }
}
