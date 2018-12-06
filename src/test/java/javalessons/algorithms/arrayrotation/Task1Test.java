package javalessons.algorithms.arrayrotation;

import org.junit.*;

import static org.junit.Assert.*;

public class Task1Test {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before each test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After each test");
    }
    @BeforeClass
    public static void init() throws Exception {
        System.out.println("Before all tests - only one time");
    }

    @AfterClass
    public static void finish() throws Exception {
        System.out.println("After all tests - only one time");
    }

    @Test
    public void shouldRotateByOnePosition() {
        System.out.println("I am in test");
        int[] inputArray = {1,2,3,4,5};
        int[] expectedArray = {5,1,2,3,4};

        int[] actualArray = Task1.rotation(inputArray,1);
        assertArrayEquals("Array should be rotated by one position", expectedArray, actualArray);
    }

    @Test
    public void shouldRotateByMoreThanTablePosition(){
        System.out.println("I am in second test");
        int[] inputArray = {1,2,3,4,5};
        int[] expectedArray = {3,4,5,1,2};
        int[] actualArray = Task1.rotation(inputArray,8);
        assertArrayEquals("Array should be rotated by more than table length position", expectedArray, actualArray);
    }

    @Test
    public void shouldRotateByMultiplePosition(){
        System.out.println("I am in third test");
        int[] inputArray = {1,2,3,4,5};
        int[] expectedArray = {1,2,3,4,5};
        int[] actualArray = Task1.rotation(inputArray,25);
        assertArrayEquals("Array should be rotated by multiple times length of the array", expectedArray, actualArray);
    }

    @Test
    public void  shouldRotateByZeroPosition(){
        System.out.println("I am in fourth test");
        int[] inputArray = {1,2,3,4,5};
        int[] expectedArray = {1,2,3,4,5};
        int[] actualArray = Task1.rotation(inputArray,0);
        assertArrayEquals("Array should be rotated by zero position", expectedArray, actualArray);
    }
}