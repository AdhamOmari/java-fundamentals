package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Theater implements User{
    private String name;
    private Set<Review> reviewsArray;
    private Set<String > Movies;

    public Theater(String name) {
        this.name = name;
        reviewsArray = new HashSet<>();
        Movies = new HashSet<>();


    }


//    @Override
//    public String toString() {
//        return "Theater{" +
//                "name='" + name + '\'' +
//                ", reviewsArray=" + reviewsArray +
//                ", Movies=" + Movies +
//                '}';
//    }

    @Override
    public String toString() {
        String theaterReview= "Theater{" +
                "name='" + name + '\'' +
                ", Movies=" + Movies +
                '}';
        for (Review review:this.reviewsArray
        ) {
            theaterReview+="User Reviwe is" +review.toString()+"\n";
        }
        return  theaterReview;
    }
    public void addtheMovie(String movies){
        Movies.add(movies);
    }

    public void  removedMovie(String movies){
        Movies.remove(movies);
    }
    @Override
    public void addReview(Review review) {
        reviewsArray.add(review);

    }

}
