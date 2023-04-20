package classroom.electronics;

public abstract class Electronics {

    private int cost;

    public Electronics(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }

    public String toString() {
        return String.format("I am a %s that costs $%d.", this.getClass().getName(), this.cost);
    }
    
}
