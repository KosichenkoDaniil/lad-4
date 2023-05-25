import org.junit.Assert;
import org.junit.Before;

public class Test {
    @org.junit.Test
    public void test1(){
        int[] arr = {5, 4, 3, 2, 1};
        int[] result = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals("first test is successful", result, CocktailShakerSort.cocktailSort(arr));
    }

    @org.junit.Test
    public void test2(){
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals("second test is successful", result, CocktailShakerSort.cocktailSort(arr));
    }

    @org.junit.Test
    public void test3(){
        int[] arr = {2, 3, 1, 5, 4};
        int[] result = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals("third test is successful", result, CocktailShakerSort.cocktailSort(arr));
    }

    @org.junit.Test
    public void test4(){
        int[] arr = {3, 4, 5, 1, 2};
        int[] result = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals("fourth test is successful", result, CocktailShakerSort.cocktailSort(arr));
    }

}