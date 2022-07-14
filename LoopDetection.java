import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LoopDetection {
    public static void main(String[] args) {

        LinkedList loop = new LinkedList();
        loop.add(0, 1);
        loop.add(1, 2);
        loop.add(2, 3);
        loop.add(3, 4);
        loop.add(4, 5);

        List<LinkedList> node = new ArrayList<>();

        while (node != null){
            if(loop.contains(node))
                return;
            loop.add(node);
        }
    }
}
