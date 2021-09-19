/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author eiwte
 */
public class MyPropertyBean implements Serializable {
    
    public static final String STRING_PROPERTY = "text";
    
    private String text;
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String s) {
        String oldValue = text;
        text = s;
        propertySupport.firePropertyChange(STRING_PROPERTY, oldValue, text);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
