package project5;


public class TestMicrowave {

    static void turn(HouseAppliance h, boolean on) {
        if (on)
            h.turnOn();
        else
            h.turnOff();
    }

    public static void main(String[] agrs) {
        MicrowaveOven samsung = new SamsungME83X();

        turn(samsung, true);

        samsung.setProgram(5);

        samsung.incTime(120);

        samsung.incHeat(20);




    }
}
