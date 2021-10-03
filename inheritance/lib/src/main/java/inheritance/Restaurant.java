package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Restaurant implements ReviwImplemant {

    private String NameShop ="";
    private  int rateNumber = 0;
    private double priceCost=0.0;
    private LinkedList<ReviewRestorant>reviews;



    public Restaurant(String nameShop, double priceCost) {
        NameShop = nameShop;
        this.priceCost = priceCost;
        this.rateNumber=0;
        this.reviews=new LinkedList();



    }




    @Override


    public String toString() {
        return "Restaurant{" +
                "NameShop='" + NameShop + '\'' +
                ", rateNumber=" + rateNumber +
                ", priceCost=" + priceCost +
                ", reviews=" + reviews +
                ", starRiting=" + starRiting +
                '}';
    }
}
