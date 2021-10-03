package inheritance;

public class ReviewRestorant extends Restaurant implements ReviwImplemant  {
    private String author ="";
    private  int  starNumber=0;
    private String body="";

    public ReviewRestorant(String author, int starNumber, String body) {
        super(author);
        this.author = author;
        this.starNumber = starNumber;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ReviewRestorant{" +
                "author='" + author + '\'' +
                ", starNumber=" + starNumber +
                ", body='" + body + '\'' +
                '}';
    }


}
