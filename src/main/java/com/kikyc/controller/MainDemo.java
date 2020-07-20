package com.kikyc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDemo{
    public static void main(String[] strs){
        int [] i;
        i = new int[]{1, 2, 3};
        p(i);
    }
    static void main(){

    }

    public static void p(int[] ints){
        List<int[]> temp = new ArrayList<int[]>();
        int n;

        for(int j = 0;j<ints.length;j++){
            for(int i = 0;i<ints.length;i++){
                int[] ints2 = new int[ints.length];
//                ints2 = Arrays.copyOf(ints);
                System.arraycopy(ints,0,ints2,0,ints.length);
                n = ints2[i];
                ints2[i] = ints[j];
                ints2[j] = n;

                if(!temp.contains(ints2)){
                    temp.add(ints2);
                    System.out.println(Arrays.toString(ints2));
                }

            }
        }
    }


}