package Classes;

import Interfaces.ISpacecraft;

public class UnmannedSpacecraft extends Spacecraft implements ISpacecraft {
    private float push;

    public UnmannedSpacecraft(
            String name,
            String originCountry,
            float weight,
            int yearOfCreation,
            String fuelType,
            float push)
    {
        super(name, originCountry, weight, yearOfCreation, fuelType);
        this.push = push;
    }

    public float getPush() {
        return push;
    }

    public void setPush(float push) {
        this.push = push;
    }

    @Override
    public void function() {
        System.out.println("La función principal de un vehículo no tripulado " +
                "es estudiar otros cuerpos celestes." + "\n");
    }

    @Override
    public void boardSpacecraft() {
        System.out.println("Vehículo aereo no tripulado, no se requiere " +
                "abordaje.");
    }

    @Override
    public void refuelingSpacecraft() {
        super.setFilledUpTank(true);
        System.out.println("La nave no tripulada ha sido cargada con " +
                "combustible.");
    }

    @Override
    public void turnOnSpaceCraft() {
        if (super.isFilledUpTank() == false){
            System.out.println("Es necesario poner combustible a la nave no " +
                    "tripulada antes de encenderla.");
        } else{
            super.setSpacecraftTurnedOn(true);
            System.out.println("Nave no tripulada encendida.");
        }
    }
}
