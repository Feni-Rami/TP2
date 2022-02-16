import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    private Fraction fraction ;
    @Test
    public void check_all_operation_fraction(){
        fraction = new Fraction(1/2, 4/3) ;
        assertEquals(1/2,fraction.somme());
        assertEquals(1/2,fraction.difference());
        assertEquals(1/2,fraction.multiplication());
        assertEquals(1/2,fraction.division());
        assertEquals(1/2,fraction.reduction());
    }
}