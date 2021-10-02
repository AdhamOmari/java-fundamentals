package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library test = new Library();

        System.out.println("hello world");
        int [] arr=new int[]{1,1,2,4,5,6};
        int[][] arr2 = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        };

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");


        test.roll(5);


        System.out.println(Arrays.toString(test.arrayOfArrays(arr2)));


        System.out.println(test.containsDuplicates(arr));
        System.out.println(Library.analyzeWeathData(weeklyMonthTemperatures));
        System.out.println(test.tally(votes));
        System.out.println (test.avgArray(arr));


    }}
