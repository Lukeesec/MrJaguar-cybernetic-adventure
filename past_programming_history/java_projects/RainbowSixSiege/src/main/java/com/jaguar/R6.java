package com.jaguar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class R6 {
    /**
     * Rainbow Six Siege - Do you know all the operator? Firstly make a array of all the current chars.
     * Then make a new arraylist and have it so a user can input a name and it will be stored in a arraylist
     * keep letting a player enter in a name untell they type quit then take the inputted array and sort it to
     * the original array then compare and output the original array with the new array side by side.
     */
    public ArrayList<String> originalR6 = new ArrayList<String>();
    public ArrayList<String> userInputedR6 = new ArrayList<String>();

    public void addAll() {
        Collections.addAll(originalR6, "nomad", "maverick", "lion", "finka", "dokkaebi", "zofia", "ying", "jackel",
                "hibana", "capitao", "blackbeard", "buck", "sledge", "thatcher", "ash", "thermite", "montagne", "twitch", "blitz",
                "iq", "fuze", "glaz", "kaid", "clash", "maestro", "alibi", "vigil", "ela", "lesion", "mira", "echo", "caveira", "valkyrie",
                "frost", "mute", "smoke", "castle", "pulse", "doc", "rook", "jager", "bandit", "tachanka", "kapkan");
    }

    /**
     * a input is entered then passed to correctSpelling method then the correctSpelling method
     * goes through the whole array checking if the name entered equals any String in originalR6, if the
     * name entered does not equal anything in the arraylist then it will return false and the user will
     * see *Incorrect spelling*
     */

    /**
     * a name is inputted then needs to be checked against originalR6.. But i need to get a name in originalR6
     * not a position.
     */
    public boolean correctSpelling(String name) {
        for (int i = 0; i < originalR6.size(); i++) {
            if (!onFile1(name)) {
                return true;
            }
        }
        return false;
    }

    public void compareAll() {
        userInputedR6.sort(Comparator.comparingInt(originalR6::indexOf));
    }

    /**
     * Will elaborate later
     */

    public void printAll() {
        System.out.println("You got: " + userInputedR6.size() + " operators out of the possible: " + originalR6.size());
        int minSize = Math.min(originalR6.size(), userInputedR6.size());
        for (int i = 0; i < minSize; i++) {
            System.out.printf("%d. %-10s %d. %-10s%n", (i + 1), originalR6.get(i), (i + 1), userInputedR6.get(i));
        }
        if (originalR6.size() < userInputedR6.size()) {
            for (int i = minSize; i < userInputedR6.size(); i++) {
                System.out.printf("%d. %-10s %d. %-10s%n", (i + 1), "was not answered", (i + 1), userInputedR6.get(i));
            }
        } else if (originalR6.size() > userInputedR6.size()) {
            for (int i = minSize; i < originalR6.size(); i++) {
                System.out.printf("%d. %-10s %d. %-10s%n", (i + 1), originalR6.get(i), (i + 1), "was not answered");
            }
        }
    }

    public void addUserInput(String name) {
        if (onFile(name)) {
            userInputedR6.add(name);
        } else {
            System.out.println("You already have " + name + " on file.");
        }
    }

    public boolean onFile(String name) {
        int position = searchFor(name);
        if (position >= 0) {
            return false;
        }
        return true;
    }

    public boolean onFile1(String name) {
        int position = searchFor1(name);
        if (position >= 0) {
            return false;
        }
        return true;
    }

    //Makes sure the user does not input duplicates
    private int searchFor(String name) {
        return userInputedR6.indexOf(name);
    }

    //checks if what the user inputs is actually in the arrayList.
    private int searchFor1(String name) {
        return originalR6.indexOf(name);
    }
}