package basiclibrary;

public class Main {
    public static void main(String[] args) {
        Library test = new Library();
        test.roll(2);
        int [] arry = {1,2,3,3};
        System.out.println(test. containsDuplicates(arry));;
        test.Average(arry);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
                {5, 5, 5, 5, 5, 5, 5}
        };
        System.out.println(test.weeklyMonthTemperatures(weeklyMonthTemperatures)) ;
    }}
