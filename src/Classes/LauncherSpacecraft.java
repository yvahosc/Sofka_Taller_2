package Classes;

import Interfaces.ISpacecraft;

public class LauncherSpacecraft extends Spacecraft implements ISpacecraft {

    public int capacityTransport;
    public int push;

    public LauncherSpacecraft(
            String name,
            String originCountry,
            float weight,
            int yearOfCreation,
            String fuelType,
            int capacityTransport,
            int push)
    {
        super(name, originCountry, weight, yearOfCreation, fuelType);
        this.capacityTransport = capacityTransport;
        this.push = push;
    }

    public int getCapacityTransport() {
        return capacityTransport;
    }

    public void setCapacityTransport(int capacityTransport) {
        this.capacityTransport = capacityTransport;
    }

    public int getPush() {
        return push;
    }

    public void setPush(int push) {
        this.push = push;
    }

    @Override
    public void function() {
        System.out.println("La función de un vehículo lanzadera es lanzar una" +
                " carga útil al espacio, normalmente un satélite artificial, " +
                "una sonda o una nave tripulada." + "\n");
    }

    @Override
    public void boardSpacecraft() {
        System.out.println("Vehículo aereo no tripulado, no se requiere " +
                "abordaje.");
    }

    @Override
    public void refuelingSpacecraft() {
        super.setFilledUpTank(true);
        System.out.println("La nave lanzadora ha sido cargada con combustible" +
                ".");
    }

    @Override
    public void turnOnSpaceCraft() {
        if (super.isFilledUpTank() == false){
            System.out.println("Es necesario poner combustible a la nave " +
                    "lanzadora antes de encenderla.");
        } else{
            super.setSpacecraftTurnedOn(true);
            System.out.println("Nave lanzadora encendida.");
        }
    }
}
