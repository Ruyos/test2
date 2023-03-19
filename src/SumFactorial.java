public class SumFactorial {
    public static void main(String[] args){
        long sum = 0; //用来存储总和
        long factorial = 1; //用来存储每个数的阶乘
        for(int i=1;i<=10;i++){ //循环从1到10
            factorial *= i; //计算i的阶乘
            sum += factorial; //把i的阶乘加到总和里
        }
        System.out.println(sum); //打印总和
    }
}//