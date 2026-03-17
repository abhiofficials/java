import java.util.*;
public class hello{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float pen = input.nextFloat();
        float pencil= input.nextFloat();
        float eraser= input.nextFloat();
        float cost= pen+pencil+eraser;
        float gst=0.18f * cost;
        float totalcost= cost+gst;
        System.out.println("pen cost is : "+pen); 
        System.out.println("pencil cost is : "+pencil); 
        System.out.println("eraser cost is : "+eraser); 
        System.out.println("cost is : "+ cost);   
        System.out.println("gst is : " +gst);
        System.out.println("total cost is : "+totalcost);  
    }
}