import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LAB03Test {

    @Test
    public void testCycleLengthWithEvenNumber1() {
        int n=8;
        assertEquals(4, LAB03.CycleLength(n));
    }

    @Test
    public void testCycleLengthWithOddNumber1() {
        int n=7;
        assertEquals(17, LAB03.CycleLength(n));
}
   @Test
  public void testCycleLengthWithEvenNumber2() {
      int n=22;
        assertEquals(16, LAB03.CycleLength(n));
    }

    @Test
    public void testCycleLengthWithOddNumber2() {
        int n=9;
        assertEquals(20, LAB03.CycleLength(n));
    }

}