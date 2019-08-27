import org.junit.*;

import static org.junit.Assert.*;

public class JUnitTest {


    @Test
    public void test_findMax() {
        Finder find = new Finder();
        int[] i = new int[]{1,24,5,4,6,8,89,9,6,5,443,6,8};
        int[] j = new int[]{9,9,9,9,9,9};
        int[] k = new int[]{-1,1,2,3,4,5};
        int ar = find.findMax(i);
        int ar2 = find.findMax(j);
        int ar3 = find.findMax(k);
        //test
        assertEquals(ar,443);
        assertEquals(ar2,9);
        assertEquals(ar3,5);


    }

    @Test
    public void test_findMin() {
        Finder find = new Finder();
        int[] i = new int[]{1,24,5,4,6,8,89,9,6,5,443,6,8};
        int[] j = new int[]{9,9,9,9,9,9};
        int[] k = new int[]{-1,1,2,3,4,5};
        int ar = find.findMin(i);
        int ar2 = find.findMin(j);
        int ar3 = find.findMin(k);
        //test
        assertEquals(ar,1);
        assertEquals(ar2,9);
        assertEquals(ar3,-1);
    }



    @Test(expected = NullPointerException.class)
    public void test_findinvnullMax() {
        Finder find = new Finder();
        int[] i;
        i = null;
        int ar = find.findMax(i);

    }

    @Test(expected = NullPointerException.class)
    public void test_findinvemptyMax() {
        Finder find = new Finder();
        int[] j = new int[]{};
        int ar2 = find.findMax(j);
    }
    @Test(expected = NullPointerException.class)
    public void test_findinvnullMin() {
        Finder find = new Finder();
        int[] i;
        i = null;
        int ar = find.findMin(i);

    }

    @Test(expected = NullPointerException.class)
    public void test_findinvemptyMin() {
        Finder find = new Finder();
        int[] j = new int[]{};
        int ar2 = find.findMin(j);
    }


}