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

    public Restaurant() {

    }

    public void addReview(Review review) {
        reviews.add(review);

    }

    public void starsCunt() {
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

    public String getReviews() {

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
                "name='" + name + '\'' + " \n" +
                ", stars=" + stars + " \n" +
                ", price='" + price + '\'' + " \n" +
                ", reviews=" + reviews + " \n" +
                '}';
    }

    public static void main(String[] args) {


        Review review = new Review("ss", "start", 1);
        Review review2 = new Review("d", "start", 2);
        Review review3 = new Review("d", "start", 3);
        Review review5 = new Review("d", "start", 4);

        Theater theater = new Theater("ali");

        theater.addReview(review);
        theater.addReview(review2);
        theater.addReview(review3);
        theater.addtheMovie("a");
        theater.addtheMovie("b");
        theater.removedMovie("a");
        System.out.println(theater);

        Restaurant test = new Restaurant("mac", "1");
        test.addReview(review);
        test.addReview(review2);


        Shop shop = new Shop("shop", "the Shop good", 5);
        shop.addReview(review);
        shop.addReview(review2);
        shop.addReview(review3);
        shop.addReview(review5);

        System.out.println(test);
        System.out.println(theater);
        System.out.println(shop);




    }
}
