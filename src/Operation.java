
public class Operation {

    public int divisible(int a, int b, int c){
        if(a % b == 0 && a % c == 0)
            return b + c ;
        if(a % b == 0)
            return b ;
        if(a % c == 0)
            return c ;
        return -1 ;
    }
}
