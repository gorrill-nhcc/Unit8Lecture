package deck;
import java.util.ArrayList;
import java.util.random.RandomGenerator;
public class Shuffles {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        RandomGenerator gen = RandomGenerator.getDefault();
        for(int i = 0; i < 10; i++){
            nums.add(gen.nextInt(1, 9));
        }
        for(int i = 0; i < nums.size(); i++){
            System.out.printf("Element at index %d: %d\n", i, nums.get(i));
        }

        swapElements(nums, 0, nums.size() - 1);
        System.out.println();
        for (int i = 0; i < nums.size(); i++) {
            System.out.printf("Element at index %d: %d\n", i, nums.get(i));
        }
    }

    public static void shuffleList(ArrayList<Integer> list){

    }

    public static void swapElements(ArrayList<Integer> list, int left, int right){
        // make a temp assign left into it
        int temp = list.get(left);
        // replace the value left with the value at right
        list.set(left, list.get(right));
        // replace the value at right with the value in temp
        list.set(right, temp);

        /*
        int a = 10;
        int b = 15;

        int temp = a; // temp 10, a 10, b 15
        a = b; // a 15, temp 10, b 15
        b = temp; // a 15, temp 10, b 10
        */
    }
}
