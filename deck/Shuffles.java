package deck;
import java.util.ArrayList;
import java.util.random.RandomGenerator;
public class Shuffles {

    static RandomGenerator gen = RandomGenerator.getDefault();

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            nums.add(i);
        }
        for(int i = 0; i < nums.size(); i++){
            System.out.printf("Element at index %d: %d\n", i, nums.get(i));
        }

        shuffleList(nums);

        System.out.println();
        for (int i = 0; i < nums.size(); i++) {
            System.out.printf("Element at index %d: %d\n", i, nums.get(i));
        }
    }

    public static void shuffleList(ArrayList<Integer> list){
        // start at the last element
        // generate a random index value 0 - last element exclusive
        // swap the last element with the value at the random index
        // decrement control variable that tracks our position
        // repeat until the control variable goes through index 1
        for(int i = list.size() - 1; i > 0; i--){
            int randPos = (int)(Math.random() * i);
            swapElements(list, randPos, i);
        }

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
