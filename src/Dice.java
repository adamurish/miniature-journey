public class Dice {
    private final int sides;
    private int value;

    public Dice(int sides){
        this.sides = sides;
        roll();
    }

    public int getValue(boolean reRoll){
        if(reRoll)
            roll();
        return value;
    }

    private void roll() {
        value = (int) (Math.random() * sides) + 1;
    }

    @Override
    public String toString(){
        return String.format("On side %d out of %d",value,sides);
    }
}
