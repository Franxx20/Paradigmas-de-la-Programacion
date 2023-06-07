package archivo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> number = Arrays.asList(2,3,4,5);

        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans-i);
        System.out.println(even);
    }
}