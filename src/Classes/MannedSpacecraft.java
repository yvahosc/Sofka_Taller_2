package Classes;

import Interfaces.ISpacecraft;

public class MannedSpacecraft extends Spacecraft implements ISpacecraft {
    public int capacity;
    public LauncherSpacecraft launcherSpacecraft;

    public MannedSpacecraft(String name,
                            String originCountry,
                            float weight,
                            int yearOfCreation,
                            String fuelType,
                            int capacity,
                            LauncherSpacecraft launcherSpacecraft)
    {
        super(name, originCountry, weight, yearOfCreation, fuelType);
        this.capacity = capacity;
        this.launcherSpacecraft = launcherSpacecraft;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LauncherSpacecraft getLauncherSpacecraft() {
        return launcherSpacecraft;
    }

    public void setLauncherSpacecraft(LauncherSpacecraft launcherSpacecraft) {
        this.launcherSpacecraft = launcherSpacecraft;
    }

    @Override
    public void function() {
        System.out.println("La función principal de un vehículo tripulado es " +
                "enviar seres humanos al espacio para tareas de reparación, " +
                "mantenimiento o investigación, en misiones donde se precisa " +
                "de la destreza y de la toma de decisiones de personas, en  " +
                "detrimento de las máquinas."+ "\n");
    }

    @Override
    public void boardSpacecraft() throws InterruptedException {
        System.out.println("Tripulación abordando...");
        for (int i = 0;i < this.capacity; i++){
            Thread.sleep(1000);
            System.out.println("Abordando tripulante " + (i + 1) + " ...");
        }
        System.out.println("Abordaje exitoso.");
    }

    @Override
    public void refuelingSpacecraft() {
        super.setFilledUpTank(true);
        System.out.println("La nave tripulada ha sido cargada con combustible" +
                ".");
    }

    @Override
    public void turnOnSpacecraft() {
        if (super.isFilledUpTank() == false){
            System.out.println("Es necesario poner combustible a la nave " +
                    "tripulada antes de encenderla.");
        } else{
            super.setSpacecraftTurnedOn(true);
            System.out.println("Nave tripulada encendida.");
        }
    }
}
