package Chapter2;

import Chapter2.Displayboard.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        // StatiisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        
        // 模拟天气数据更新
        weatherData.setMeasurements(30.0f, 65.0f, 30.4f);
        weatherData.setMeasurements(28.0f, 70.0f, 29.2f);
        weatherData.setMeasurements(26.0f, 90.0f, 29.2f);

    }

}
