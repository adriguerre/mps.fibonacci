package fibonacci;

public class Fibonacci {
    /**
     * Class providing a method that computes the fibonacci af
     * an integer number
     * @author Adrian Guerrero Alvarez
     */
    public  int compute(int value){
        //If the number is negative raises an exception
        if(value < 0)
            throw new RuntimeException("Negative value : " + value);

        //If the value is lower than 2, the fibonacci number is equal to value
        if(value < 2)
            return value;

        //Instead of calculating the fibonacci number again when we will use it again late´]r, we save it and then add it to the result.
        int result = 1;
        int last = 1;

        for(int i = 2;i < value;i++){
            int aux = result;
            result += last;
            last = aux;
        }
        return result;
    }
}
