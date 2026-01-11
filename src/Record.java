import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Record {

   public static void main(String args[]){

       record Point(int x , int y) {
       }

       Point p = new Point(5,10);
       if(p instanceof Point(int x , int y)){
           System.out.println("x=" + x + ", y=" + y);

       }

       // before
        Object obj = null;
       if (obj instanceof Point p1) {

           int x= p1.x;
           int y = p1.y;
           if(x ==5 && y ==10 ){

           }
       }


   }

}
