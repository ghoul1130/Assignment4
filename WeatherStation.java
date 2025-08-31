
import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(int temperature);
}

// Phone
class PhoneDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Phone shows: " + temperature + "°C");
    }
}

// TV
class TVDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("TV shows: " + temperature + "°C");
    }
}

// WeatherStation
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    // Add observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Set temperature and notify observers
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature changed to " + temperature);
        notifyObservers();
    }

    // Notify all observers
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
