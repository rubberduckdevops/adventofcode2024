package org.example;

import java.util.ArrayList;



public class PointDistance {


    public static Integer main(ArrayList<String> left, ArrayList<String> right){
        Integer totalDistance = 0;
        for(int i =0; i < left.size(); i++) {
            System.out.println("Distance between" + left.get(i) + " and " + right.get(1));
            Integer left_int = Integer.parseInt(left.get(i));
            Integer right_int = Integer.parseInt(right.get(i));
            Integer distanceBetween = Math.abs(left_int - right_int);
            System.out.println(distanceBetween);
            totalDistance = totalDistance + distanceBetween;
            System.out.println("Current Distance " + totalDistance);
        }
            

        return totalDistance;
    }
    

}
