
package Observer;

import javax.swing.JLabel;

public class DisplayCounter implements IObserver{  
    private JLabel label;
    private String title;
    
    public DisplayCounter(JLabel label, String title){
        this.label = label;
        this.title = title;
        label.setText(title + ": ");
    }
    
    @Override       
    public void notifyObserver(String text) {           
        label.setText(title + ": " + text);
    }
}

