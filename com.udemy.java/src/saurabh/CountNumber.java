package saurabh;

import java.util.*;

public class CountNumber {

    /**
     * Return the first unique letter in a string
     * e.g. String word = "abbaaccdeefgcgg" will return 'd' else 0 character
     * @param word
     * @return
     */
    public char getUniqueLetter(String word) {

        char[] allChars = word.toCharArray();
        for (char thisChar : allChars) {
            if (word.indexOf(thisChar) == word.lastIndexOf(thisChar)) {
                return thisChar;
            }
        }
        return '0';
    }

    /**
     * Given a list of non-zero integers, return the first unique integer. If no unique numbers found, return 0
     * @param intList
     * @return
     */
    // It's wrong
    public int getUniqueNumberUsingList(int[] intList) {

        List<Integer> seenInts = new ArrayList<>();
        for (int thisInt : intList) {
            if (seenInts.contains(thisInt)) {
                seenInts.remove(seenInts.indexOf(thisInt));
            } else {
                seenInts.add(thisInt);
            }
        }
        if (!(seenInts.isEmpty())) {
            return seenInts.get(0);
        } else {
            return 0;
        }
    }

    public List<Integer> reverseList(List<Integer> originalList) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = originalList.size() -1; i >= 0; i--) {
            reversedList.add(i);
        }
        return reversedList;
    }

    public void printMap(Map<String, Integer> thisMap) {
        for (String key : thisMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + thisMap.get(key));
        }
        System.out.println(thisMap.toString());
    }

    public static void main(String[]args) {
        String testStr = "abbaaccdeefgcgg";
        CountNumber cn = new CountNumber();

        char uniqueChar = cn.getUniqueLetter(testStr);
        System.out.println(uniqueChar);

        int[] nums = {1, 1, 2, 2, 2, 3, 4};
        int uniqueNumber = cn.getUniqueNumberUsingList(nums);
        System.out.println(uniqueNumber);

        List<Integer> origList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> reversedList = cn.reverseList(origList);
        System.out.println(reversedList.toString());

        Map<String, Integer> thisMap = new HashMap<>();
        cn.printMap(thisMap);
    }
}
