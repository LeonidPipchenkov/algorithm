package relative_ranks_506;

import java.util.Comparator;
import java.util.TreeMap;

class Solution {

    public String[] findRelativeRanks(int[] score) {
        var answer = new String[score.length];
        var sortedScore = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            sortedScore.put(score[i], i);
        }
        int place = 1;
        for (var entry : sortedScore.entrySet()) {
            answer[entry.getValue()] = getPlaceVal(place);
            place++;
        }
        return answer;
    }

    private String getPlaceVal(int place) {
        return switch (place) {
            case 1 -> "Gold Medal";
            case 2 -> "Silver Medal";
            case 3 -> "Bronze Medal";
            default -> String.valueOf(place);
        };
    }

}
