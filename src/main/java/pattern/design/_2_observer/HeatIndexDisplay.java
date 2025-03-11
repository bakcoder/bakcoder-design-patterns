package pattern.design._2_observer;

public class HeatIndexDisplay implements Observer, DisplayElement{

    WeatherData weatherData;
    float temperature;
    float humidity;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%" );
    }

    @Override
    public void update(/*float temp, float humidity, float pressure*/) {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
