public class HotDrink {
    private String _name;
    private double _volume;


    public HotDrink(String name, double volume){
        set_volume(volume);
        set_name(name);
    }

    public double get_volume() {
        return _volume;
    }

    public void set_volume(double _volume) {
        this._volume = _volume;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public double accessTemperature(Coffee coffee){
        return coffee.get_temperature();
    }
    
}
