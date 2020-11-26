package com.epam.arrays;

import com.epam.arrays.entity.CustomArray;
import com.epam.arrays.service.SearchService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchServiceTest {
    private CustomArray array;
    private SearchService service;

    @BeforeTest
    private void init(){
        int[] arr = {3, 7, 18, 90, 243, 324, 772, 911};
        array = new CustomArray(arr);
        service = new SearchService();
    }

    @Test
    public void minElementTest(){
        int actual = service.minElement(array);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void maxElementTest(){
        int actual = service.maxElement(array);
        int expected = 911;
        assertEquals(actual, expected);
    }

    @Test
    public void binarySearchTest(){
        int actual = service.binarySearch(array, 324);
        int expected = 5;
    }

}
