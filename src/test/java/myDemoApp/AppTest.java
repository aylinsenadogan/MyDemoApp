/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myDemoApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.ArrayList;

class AppTest {
    @Test
   public void testRangeFunctionIsTrue() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, 6, 9, 12));
      assertTrue(App.range(array, 1, 5));
    }

    @Test
    public void testRangeFunctionIsFalse() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, 6, 9, 12));
      assertFalse(App.range(array, 10,20));
    }

    @Test
    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(App.range(array, 1, 100));
    }

    @Test
    public void testNull() {
      assertFalse(App.range(null, 1, 100));
    }

}
