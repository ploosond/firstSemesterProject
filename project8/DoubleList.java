package project8;


import java.util.ArrayList;
import java.util.List;

public class DoubleList {

    static double sum_double(List<Double> doubleList) {
        double sum = 0;
        for (Double item : doubleList)
            sum += item;
        return sum;
    }

    static double prod_double(List<Double> doubleList) {
        double prod = 1;
        for (Double item : doubleList)
            prod *= item;
        return prod;
    }

    static double inverse_double(List<Double> doubleList) {
        double inverse = 1;
        for (Double item : doubleList)
            inverse *= item * 1/item;
        return inverse;
    }

    public static void main(String[] args) {
        List<Double> myDoubleList = new ArrayList<Double>();
        myDoubleList.add(2.5);
        myDoubleList.add(3.5);
        myDoubleList.add(4.5);

        for (Double eachItemInList : myDoubleList) {
            System.out.println(eachItemInList);
        }

        System.out.println(sum_double (myDoubleList));
        System.out.println(prod_double(myDoubleList));
        System.out.println(inverse_double(myDoubleList));
    }

}
