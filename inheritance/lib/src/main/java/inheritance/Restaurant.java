package inheritance;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {

    private String name;
    private int stars;
    private String price;
    private Set<Review> reviews;

    public Restaurant(String restorantName, String price) {
        this.name = restorantName;
        this.price = price;
        this.stars = 0;
        reviews = new HashSet<>();
    }

    public void addReview(Review review) {
        reviews.add(review);

        starsCunt();
    }

    private void starsCunt() {
        double locatinStar = 0;

        for (Review review : this.reviews) {
            locatinStar += review.getStars();
        }

        this.stars = (int) (locatinStar / this.reviews.size());
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getStars() {
//        return stars;
//    }
//
//    public void setStars(int stars) {
//        this.stars = stars;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }

//

    private String getReviews() {

        for (Review review : this.reviews) {
            review.toString();
        }
        return toString();
    }

//    private void calculateStars() {
//        int allStars = 0;
//
//        for (Review review : this.reviews) {
//            allStars += review.getStars();
//        }
//
//        this.stars = allStars / this.reviews.size();
//    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +" \n"+
                ", stars=" + stars +" \n"+
                ", price='" + price + '\'' +" \n"+
                ", reviews=" + reviews +" \n"+
                '}';
    }

    public static void main(String[] args) {
        Restaurant test = new Restaurant("mac","1");
            Review review=new Review("ss","start",2);
        Review review2=new Review("d","start",3);
        Review review3=new Review("d","start",3);
              test.addReview(review);
               test.addReview(review3);
             test.addReview(review2);

        System.out.println(test);

//        Restaurant test2 = new Restaurant("mac","1");
//        Review reviewtest2=new Review("ali","aliomar",1);
//        Review test2review2=new Review("omar","omaraili",4);
//        test2.addReview(reviewtest2);
//        test2.addReview(test2review2);
//
//
//        System.out.println(test2);

    }
}
