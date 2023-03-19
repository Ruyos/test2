import java.util.Random;
public class RandomAndSort {
    public static void main(String[] args) {
        int max=49;
        int min=100;
        Random random = new Random();
        int []a=new int[20];
        for(int i=0;i<a.length;i++){
            a[i]=random.nextInt(50)+50;
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("最大值："+max);
        System.out.println("最小值: "+min);
    }
}
