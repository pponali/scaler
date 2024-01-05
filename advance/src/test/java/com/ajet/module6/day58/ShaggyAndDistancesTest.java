package com.ajet.module6.day58;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShaggyAndDistancesTest {

    ShaggyAndDistances shaggyAndDistances = new ShaggyAndDistances();
    int[] arr = {7, 1, 3, 4, 1, 7};
    int[] arr2 = {1, 2, 3, 4, 9};
    int[] arr3 = {1, 2, 3, 4, 9, 10};
    int[] arr4 = {1, 2, 3, 4, 9, 10, 11, 12};

    @BeforeEach
    void setUp() {
        shaggyAndDistances.solve(arr);
        shaggyAndDistances.solve(arr2);
        shaggyAndDistances.solve(arr3);
        shaggyAndDistances.solve(arr4);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void solve() {
        System.out.println("ShaggyAndDistancesTest.solve");
        System.out.println("arr: " + shaggyAndDistances.solve(arr));
        System.out.println("arr2: " + shaggyAndDistances.solve(arr2));
        System.out.println("arr3: " + shaggyAndDistances.solve(arr3));
        System.out.println("arr4: " + shaggyAndDistances.solve(arr4));
        System.out.println();
        System.out.println("ShaggyAndDistancesTest.solve2");
        System.out.println("arr: " + shaggyAndDistances.solve(arr));
        System.out.println("arr2: " + shaggyAndDistances.solve(arr2));
    }
}