package com.ajet.module10.day113.designpatterns.behavioural.session.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new ForecastDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(32, 70, 29.2f);
        weatherData.setMeasurements(28, 90, 29.2f);
    }
}
