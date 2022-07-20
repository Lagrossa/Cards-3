package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Float[] nums = {1f,2f,3f,4f,5f,6f,7f,8f,9f};
    System.out.println(smallestDiff(nums));
    }

    static float smallestDiff(Float[] vals){
        float smallest = 100f;
        for (int x = 0; x < vals.length; x++){
            float num1 = vals[x];
            float num2 = 0;
            float num3 = 0;
            float num4 = 0;
            for (int y = 0; y < vals.length; y++) {
                num2 = vals[y];
                for (int w = 0; w < vals.length; w++) {
                    num3 = vals[w];
                    for (int z = 0; z < vals.length; z++) {
                        num4 = vals[z];
                        if(num1 != num2 && num1 != num3 && num1 != num4 && num2 != num3 && num2 != num4 && num3 != num4) {
                            System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
                            System.out.println((num1 / num2) - (num3 / num4) + " +++++++++++++++");
                            if ((num1 / num2) - (num3 / num4) < smallest && (num1 / num2) - (num3 / num4) > 0) {
                                smallest = (num1 / num2) - (num3 / num4);
                            }
                        }
                    }
                }
            }
        }
        return smallest;
    }
}
