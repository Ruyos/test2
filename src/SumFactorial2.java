public class SumFactorial2 {
    public static void main(String []args){
    float sum=0;
    float factorial=1;
    float num;
    int i=1;
    do {
        factorial*=i;
        num=1/factorial;
        sum+=num;
        i++;
    }while (i<=20);
System.out.println(sum);
  }
}//
