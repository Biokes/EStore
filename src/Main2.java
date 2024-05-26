package africa.semicolon.data;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


class LambdasAndStream {
    private static double getPositiveRatio(List<Integer> arr){
        return arr.stream().filter(numbers->numbers>0)
                .flatMapToDouble(DoubleStream::of)
                .toArray().length;
    }
    private static double getNegativeRatio(List<Integer> arr){
        return  arr.stream().filter(numbers-> numbers<0)
                .flatMapToDouble(DoubleStream::of).toArray().length;
    }
    private static double getZeroRatio(List<Integer> arr){
        return arr.stream().filter(value ->value ==0)
                .flatMapToDouble(DoubleStream::of)
                .toArray().length;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
