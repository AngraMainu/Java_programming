package cz.cvut.fel.pjv;

import java.util.Arrays;

public class Start {

    public static void main(String[] args) {
        int size = 12;
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = i+1;
        }
        //System.out.println(Arrays.toString(values));
        TreeImpl hw = new TreeImpl();
        hw.setTree(values);
        System.out.println(hw.toString());
    }
}