package inheritance;

public class Review  {

    private String body;
    private String author;
    private int stars;

    public Review(String body, String author, int stars) {
        super();
        this.body = body;
        this.author = author;

//        if (star>=5||star<=0)
//        this.stars=stars;


         if (stars >= 0)
            this.stars = stars;
        else if (stars <= 5)
            this.stars = stars;
        else if(stars > 5)
            this.stars = 5;


        else
            this.stars = 0;
    }

    public int getStars() {
        return stars;
    }



    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +" \n"+
                ", stars=" + stars +" \n"
                ;
    }
}
