
package ooptesting_xxxx;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculationTest extends junit.framework.TestCase{
    
    public CalculationTest() {
    }

    @Test
    public void testFindMax() {
        System.out.println("Test Mencari nilai MAX");
        
        // contoh array dengan isi 4 elemen
        int arr[] = new int[]{4,3,2,1};
        int expResult = 3;
        

        // contoh dengan array kosong
//        int arr[] = new int[]{};


//        assertTrue(expResult == Calculation.findMax(arr));
//        assertEquals(3, Calculation.findMax(arr));
        assertFalse(expResult == Calculation.findMax(arr));
    }


    @Test
    public void testFindLuasPersegi() {
        // contoh benar
        int sisi = 4;
        int expResult = 289;
        
        //contoh salah
//        int sisi = 0;

       
//        assertTrue(expResult == Calculation.findMax(arr));
        assertEquals(expResult, Calculation.findLuasPersegi(sisi));
        
    }
    
}
