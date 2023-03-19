import java.util.Objects;
import java.util.Scanner;
public class PerimeterArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入几何图形的类型：（长方形、正方形、圆形）");
        String shape = sc.next();
        if(Objects.equals(shape, "正方形")){
            System.out.print("请输入边长：");
            float length= sc.nextFloat();
            System.out.print("周长为："+4*length+"面积为："+length*length);
        } else if(Objects.equals(shape, "长方形")){
            System.out.print("请输入长度：");
            float length=sc.nextFloat();
            System.out.print("请输入宽度：");
            float width=sc.nextFloat();
            System.out.print("周长为："+2*(length+width)+"面积为："+width*length);
        }else if(Objects.equals(shape, "圆形")){
            System.out.print("请输入半径：");
            float radius=sc.nextFloat();
            System.out.print("周长为："+String.format("%.1f", 2*3.14*radius)+"面积为："+3.14*radius*radius);
        }
        else {
            System.out.println("输入错误！");
        }
    }
}
