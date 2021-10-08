package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Shop extends Restaurant  {
    private String nameShop="";
    private String description="";
    private int numDoller=0;
    private Set<Review> reviews;



    public Shop(String nameShop, String description, int numDoller) {
        super();
        this.nameShop = nameShop;
        this.description = description;
        this.numDoller = numDoller;
        reviews = new HashSet<>();
    }
    public Shop() {

    }


    @Override
    public String toString() {
        return "Shop{" +
                "nameShop='" + nameShop + '\'' +
                ", description='" + description + '\'' +
                ", numDoller=" + numDoller +
                ", getReviews=" +  reviews+


                '}';
    }
    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }


}
