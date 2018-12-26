package project5;


public class SamsungME83X implements  MicrowaveOven{

    private int heat = 60;

    private int program = 3;

    private int time = 30;

    private boolean on;

    @Override
    public void incHeat(int he) {
        this.heat += he;
    }

    @Override
    public void setProgram(int prog) {
        this.program = prog;
    }

    @Override
    public void incTime(int tim) {
        this.time += tim;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }





}
