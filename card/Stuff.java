package card;

public enum Stuff {
    ONE(1), TWO(2), THREE(3);
    final int val;
    Stuff(int val){
        this.val = val;
    }
    public int getVal(){
        return val;
    }
}
