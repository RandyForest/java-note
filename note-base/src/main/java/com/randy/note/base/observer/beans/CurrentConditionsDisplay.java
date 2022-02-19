package com.randy.note.base.observer.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements Display, PropertyChangeListener {
    private float temperature;
    private float humidity;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        if ("temperature".equals(propertyName)) {
            this.temperature = (float) evt.getNewValue();
            display();
        } else if ("humidity".equals(propertyName)) {
            this.humidity = (float) evt.getNewValue();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("温度：%.2f，湿度：%.2f\n", this.temperature, this.humidity);
    }
}
