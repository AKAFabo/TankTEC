
package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObservable implements IObservable {          
    private final List<IObserver> observers = new ArrayList<>();
          
    @Override       
    public void addObserver(IObserver observer) {           
        this.observers.add(observer);
    }                 
    
    @Override       
    public void removeObserver(IObserver observer) {           
        this.observers.remove(observer);
    }          
    
    @Override       
    public void notifyAllObservers(String text) {           
        for (IObserver observer : observers) {               
            observer.notifyObserver(text);
        }
               
    }
}

