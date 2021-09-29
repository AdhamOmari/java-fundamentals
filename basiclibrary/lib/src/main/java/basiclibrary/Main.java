package basiclibrary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library test = new Library();

        test.roll(2);
        int [] arry = {1,2,3,3};
        
        int[][] weeklyMonthTemperatures = {
                {3, 3, 3, 3, 3, 3, 3},
                {2, 2, 2, 2, 2, 2, 2}
                ,{5,5,5,5}};

        System.out.println(test. containsDuplicates(arry));;
        System.out.println(test.averageArry(arry));;
        System.out.println(Arrays.toString(test.weeklyMonthTemperatures(weeklyMonthTemperatures))) ;
    }}
