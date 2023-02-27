public class array {
    public static void main(String args[]) {

        //numbers of array
        int []num = {10, 20, 30, 40};
        System.out.println(num[0]); // print only one elements.

        //string array
        String []name = {"ravi", "veer", "kumar"};
        name[1] = "pandey"; // change array
        System.out.println(name[1]);
        System.out.println(name.length);

        // loop in array

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //multi-dimension array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
