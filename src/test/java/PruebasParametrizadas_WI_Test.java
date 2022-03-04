
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import paqueteExamen.Entornos_WI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alumno Tarde
 */
@RunWith(value = Parameterized.class)

public class PruebasParametrizadas_WI_Test {

    @Parameterized.Parameters
    public static Iterable<Object[]> dameDatos() {
        int[] matriz1 = {3,2,1};
        int[] expect1 = {1,2,3};
        int[] matriz2 = {-2,-3,-1};
        int[] expect2 = {-3,-2,-1};
        int[] matriz3 = {1,2,-1};
        int[] expect3 = {-1,1,2};
        return Arrays.asList(new Object[][]{
            {matriz1,expect1},{matriz2,expect2},{matriz3,expect3}
        });
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private int[] miMatriz = new int[3];
    private int[] expected = new int[3];

    public PruebasParametrizadas_WI_Test(int[] miMatriz, int[] expected) {
        this.miMatriz = miMatriz;
        this.expected = expected;
    }

    @Test
    public void TestOrdenaArray(){
        Entornos_WI.ordenaArray(miMatriz);
        Assert.assertArrayEquals(expected, miMatriz);
    }
    
}
