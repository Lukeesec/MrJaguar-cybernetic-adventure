/*package com.jaguar;

public class FlourPacker {

    public static void main(String[] args) {


        System.out.println(canPack(1, 0, 4)); //return false
        System.out.println(canPack(1, 0, 5)); //return true
        System.out.println(canPack(0, 5, 4)); //return true
        System.out.println(canPack(2, 2, 12)); //return true
        System.out.println(canPack(-3, 2, 12)); //return false
        System.out.println(canPack(2, 1, 5)); //true

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0) ||
                (bigCount * 5 + smallCount < goal)) {
            return false;
        }
        return (goal % 5 <= smallCount);
    }
}
/*
bigCount represents the count big flour bags (5kilo each)
smallCount represents the count of small flour bags (1kilo each)

The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefor, the sum of the kilos bigCount and smallCountmust be at least equal to the value of goal.
The method should return true if it is possible to make a package with the goal kilos of flour.

If the sum is greater than goal, ensure that only flour bags are used towards the amount. For exmaple
, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false because each bigCout bag
is 5 kilos and cannont be divided. However, if goal=9, bigCount =1, and smallCount = 5., the method should
return true because 1 full bigCount bag and 4 smallCount bags equal goal, and its okay if there
are additional bags leftover.

if any parameters are negative return false.



 */