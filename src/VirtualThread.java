import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread {

    public static void main(String args[]){

        ExecutorService  executorService =  Executors.newVirtualThreadPerTaskExecutor();
        executorService.submit(() -> System.out.println("virtual thread called .."));
        executorService.close();

    }

}
