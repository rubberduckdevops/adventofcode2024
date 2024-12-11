package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimilarityScore {

    public static Integer checkScore(ArrayList<String> leftList, ArrayList<String> rightList)
    {
        System.out.println(leftList.size());
        System.out.println(rightList.size());
        List<Integer> similarityScores = new ArrayList<>();
        for (int i = 0; i < leftList.size(); i++) {
            String leftNumber = leftList.get(i);
            boolean number_exists = rightList.contains(leftNumber);
            if (number_exists) {
                similarityScores.add(calculateCountOfNumbers(leftNumber, rightList));
            }
        }
        return totalSimilarity(similarityScores);
    };

    private static Integer totalSimilarity(List<Integer>scores){
        Integer sumOfScores = 0;
        for (Integer number : scores) {
            sumOfScores += number;
        }
        return sumOfScores;
    }

    private static Integer calculateCountOfNumbers(String searchNumber, ArrayList<String> list)
    {
        Integer instanceCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(searchNumber)) {
                instanceCount++;
            }
        }
        return Integer.parseInt(searchNumber) * instanceCount;
    };
}
