public class SumPrime {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=50;i++)
            if(isPrime(i)){
                sum+=i;
            }
        System.out.println(sum);
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
