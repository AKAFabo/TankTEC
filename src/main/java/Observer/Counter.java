
package Observer;

public class Counter extends AbstractObservable {
    private int value;
    
    public Counter(){
        this.value = 0;
    }
    
    // TODO counter in descending order
    
    public void increaseCounter(){
        value++;
        notifyAllObservers(Integer.toString(value));
    }
    
    public int getValue(){
        return value;
    }
}
