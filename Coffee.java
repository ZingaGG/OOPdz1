public class Coffee extends HotDrink {
    protected double _temperature;

    public Coffee(String name, double volume, double temperature){
        super(name, volume);
        set_temperature(temperature);
    }

    public double get_temperature() {
        return _temperature;
    }

    public void set_temperature(double temperature) {
        this._temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Volume = %s, Temperature = %s", super.get_name(), super.get_volume(), _temperature);
    }

    
    
}
