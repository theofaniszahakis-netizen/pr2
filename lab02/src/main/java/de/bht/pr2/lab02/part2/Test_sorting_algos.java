package de.bht.pr2.lab02.part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test_sorting_algos {

    int[] Zahlen = {5,3,1,2,4};
    int[] Zahlen2= {1,2,3,4,5};
    @Test
    void InsertionSort() {
        assertArrayEquals(Zahlen2,InsertionSort.sort(Zahlen));

    }
    @Test
    void QuickSort() {
        assertArrayEquals(Zahlen2,QuickSort.sort(Zahlen));

    }
    @Test
    void BubbleSort() {
       assertArrayEquals(Zahlen2,BubbleSort.sort(Zahlen));
    }
}
