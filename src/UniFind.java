import java.util.Scanner;

public class UniFind{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入汉字：");
        char ch=scanner.next().charAt(0);
        System.out.println("\""+ch+"\""+"在unicode中的位置为："+(int)ch);
    }
}