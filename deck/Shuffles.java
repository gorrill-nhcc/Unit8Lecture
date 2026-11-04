package deck;
import java.util.ArrayList;
import java.util.random.RandomGenerator;
public class Shuffles {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        RandomGenerator gen = RandomGenerator.getDefault();
        for(int i = 0; i < 100; i++){
            nums.add(gen.nextInt());
        }
    }

    public static void shuffleList(ArrayList<Integer> list){

    }

    public static void swapElements(ArrayList<Integer> list, int left, int right){

    }
}
