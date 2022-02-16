import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiviseurTests {
    private Operation op ;
    @Test
    public void check_each_division(){
        op = new Operation() ;
        assertEquals(6,op.divisible(4,2,4));
        assertEquals(2,op.divisible(4,2,3));
        assertEquals(1,op.divisible(2,4,1));
    }
}