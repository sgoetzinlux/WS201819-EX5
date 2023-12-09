public class Movie {

    private String title;
    private String studio;
    private String rating;

    // Constructor 1
    Movie(String title, String studio, String rating) {

        this.title = title;
        this.studio = studio;
        this.rating = rating;

    }
    // Constructor 2
    Movie(String title, String studio) {

        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    // Loop through array movies and create new elements with Movies where rating equals "PG
    public static Movie[] getPG(Movie[] movies){

      int arrlength = 0;
      int i = 0;

      for (Movie element: movies)
          if (element.rating == "PG") {
              arrlength++;
          }
      Movie[] moviePG = new Movie[arrlength];

       for (Movie element: movies)
           if (element.rating == "PG") {
               moviePG[i] = element;
               i++;
           }


      return moviePG;
    }

    public static void main(String[] args) {

        Movie casinoRoyal = new Movie("Casino Royal", "Eon Studios", "PG");

        // Test getPG method
        Movie[] moviesPG;
        Movie[] movies = new Movie[] {
                new Movie("Casino Royal", "Eon Studios"),
                new Movie("Christmas Time", "Warner Bros", "AP"),
                new Movie("Oppenheimer", "Universal Pictures"),
                new Movie("Snow White", "Disney", "AP") };

        moviesPG = getPG(movies);
        for (Movie element: moviesPG) {
            System.out.println("Title: " + element.title + " Studio: " + element.studio + " Rating: "+ element.rating);
        }
    }
}
