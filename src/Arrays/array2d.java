package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // create 3 empty rows
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                list.get(i).add(in.nextInt());

            }
        }

        // print
        System.out.println(list);
    }
}