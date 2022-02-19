package com.randy.note.base.observer.base;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(81.65568f,29.3165f,33.61545f);
        weatherData.setMeasurements(82.6316f,28.1668f,33.64961f);
        weatherData.setMeasurements(79.66153f,27.1398f,32.69761f);
    }
}
