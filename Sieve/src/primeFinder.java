/**
 * Created by Rafael on 2/19/2016.
 */


class Sieve{
    private boolean[] numbers;

    public Sieve(int max) {

        if (max<0){
            throw new IllegalArgumentException("Max size of array needs to be positive.");
        }
        else {
            numbers = new boolean[max];
            numbers[0] = false;
            numbers[1] = false;
            for (int i = 2; i < max; i++) {
                numbers[i] = true;

            }
        }
    }
    public void findPrimes(){
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]){
                for(int j=2*i;j<numbers.length;j=j+i){
                    //if (j%i == 0){
                        numbers[j] = false;
                        //System.out.print(numbers[i]+" ");
                        //System.out.println();
                    //}
                }
            }
            //System.out.print(numbers[i]+" ");

        }
    }
    public String toString(){
        String a ="";
        for(int i=0;i<numbers.length;i++){
            if (numbers[i] == true){
                a = a+i + " ";
            }


        }
        return a;

    }
}







public class primeFinder {
    public static void main(String [] args)
    {
        Sieve sieve = new Sieve(100);
        sieve.findPrimes();
        System.out.println(sieve);
    }
}
