package com.quest.oops.oops2;

import java.util.Scanner;

public class WeatherMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherReportGenerator reportGenerator = new WeatherReportGenerator();
        CityWeather[] cities = new CityWeather[100];
        int cityCount = 0;

        while (true) {
            System.out.println("\nWeather Monitoring System:");
            System.out.println("1. Add City Weather Data");
            System.out.println("2. Display All Cities");
            System.out.println("3. Find City with Highest Temperature");
            System.out.println("4. Find City with Lowest Temperature");
            System.out.println("5. Display Cities with High Humidity");
            System.out.println("6. Generate Weather Report");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String cityName = scanner.next();
                    System.out.print("Enter temperature: ");
                    double temperature = scanner.nextDouble();
                    System.out.print("Enter humidity: ");
                    double humidity = scanner.nextDouble();
                    System.out.print("Enter condition (Sunny/Rainy): ");
                    String condition = scanner.next();
                    reportGenerator.addCityWeather(cities, cityCount, cityName, temperature, humidity, condition);
                    cityCount++;
                    System.out.println("City weather data added.");
                    break;

                case 2:
                    reportGenerator.displayAllCities(cities, cityCount);
                    break;

                case 3:
                    CityWeather highest = reportGenerator.getCityHighTemperature(cities, cityCount);
                    System.out.println("\nCity with the Highest Temperature: " + highest.getCityName() +
                            " (" + highest.getTemperature() + "°C)");
                    break;

                case 4:
                    CityWeather lowest = reportGenerator.getCityLowTemperature(cities, cityCount);
                    System.out.println("\nCity with the Lowest Temperature: " + lowest.getCityName() +
                            " (" + lowest.getTemperature() + "°C)");
                    break;

                case 5:
                    System.out.print("Enter humidity threshold: ");
                    double threshold = scanner.nextDouble();
                    reportGenerator.displayCityHighHumidity(cities, cityCount, threshold);
                    break;

                case 6:
                    reportGenerator.generateWeatherReport(cities, cityCount);
                    break;

                case 7:
                    System.out.println("Exiting Weather Monitoring System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
//type casting
//        upcasting
//downcasting
//                serialization
//static method and default method
//exception handling
//try catch
//finally
//throw is used to throw an exception within a method, whereas throws  declare that a method can throw exceptions.