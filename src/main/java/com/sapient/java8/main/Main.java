package com.sapient.java8.main;

import com.sapient.java8.domain.Coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by shiva on 5/7/2017.
 */
public class Main {
    public static void main(String args[]){
        List<Coordinate> coordinateList = new ArrayList<Coordinate>();
        coordinateList.add(new Coordinate(0,0));
        coordinateList.add(new Coordinate(-1,	1));
        coordinateList.add(new Coordinate(-2,	4));
        coordinateList.add(new Coordinate(-2	,-3));
        coordinateList.add(new Coordinate(-10,	2));
        coordinateList.add(new Coordinate(5	,-1));
        coordinateList.add(new Coordinate(2,	4));
        coordinateList.add(new Coordinate(1,	0));
        coordinateList.add(new Coordinate(10,	3));

        //ExerciseJ81:
        //Print each coordinate using lambda expression
        System.out.println("\nExerciseJ81");
        coordinateList.stream().forEach(System.out::println);
        //ExerciseJ82:
        //Calculate sum of X coordinates using mapToInt and reduce, print each X coordinate and final sum using 1 statement.
        System.out.println("\nExerciseJ82");
        int sumX = coordinateList.stream().mapToInt(Coordinate::getX).peek(System.out::println).reduce(0,(a,b)->a+b);
        System.out.println("Sum of X:"+sumX);
        //ExerciseJ83:
        //Calculate sum of all Y coordinates using sum()
        System.out.println("\nExerciseJ83");
        int sumY = coordinateList.stream().mapToInt(Coordinate::getY).sum();
        System.out.println("Sum of Y:"+sumY);
        //ExerciseJ84:
        //Filter all coordinates with positive X and Y coordinates, print them
        //Filter all coordinates where
        System.out.println("\nExerciseJ84");
        coordinateList.stream().filter(coordinate -> coordinate.getX()>0 && coordinate.getY()>0).forEach(System.out::println);
        //ExerciseJ85:
        //Use collectors to store all coordinates with positive X to a new arrayList
        System.out.println("\nExerciseJ85");
        List<Coordinate> positiveXCoordinateList = coordinateList.stream().filter(coordinate -> coordinate.getX()>0).collect(Collectors.toList());
        System.out.println(positiveXCoordinateList);
    }
}
