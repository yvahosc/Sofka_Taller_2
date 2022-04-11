package Classes;

import Interfaces.ISpacecraft;

/**
 * Representa la clase nave espacial tripulada que extiende de la clase
 * abstracta nave espacial e implementa la interface nave espacial, sus
 * atributos y sus métodos.
 * @author Yeisson Vahos Cortes
 */
public class MannedSpacecraft extends Spacecraft implements ISpacecraft {
    /**
     * Representa la capacidad de abordaje que tiene la nave espacial.
     */
    public int capacity;
    /**
     * Representa la nave espacial lanzadora que utiliza la nave espacial
     * para hacer el despegue.
     */
    public LauncherSpacecraft launcherSpacecraft;

    /**
     * Representa el constructor que crea una instancia de la clase nave
     * espacial tripulada.
     * @param name Representa el nombre de la nave espacial.
     * @param originCountry Representa el país de origen de la nave espacial.
     * @param weight Representa el peso de la nave espacial.
     * @param yearOfCreation Representa el año de creación de la nave espacial.
     * @param fuelType Representa el tipo de combustible utilizado por la
     *                 nave espacial.
     * @param capacity Representa la capacidad de abordaje que tiene la nave
     *                 espacial.
     * @param launcherSpacecraft Representa la nave espacial lanzadora que
     *                           utiliza la nave espacial para hacer el
     *                           despegue.
     */
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

    /**
     * Representa el metodo para obtener la capacidad de abordaje que tiene
     * la nave espacial.
     * @return El valor correspondiente a la capacidad de abordaje que tiene
     * la nave espacial.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Representa el metodo para modificar la capacidad de abordaje que tiene
     * la nave espacial.
     * @param capacity El valor que se quiere asignar al atributo
     *                 correspondiente a la capacidad de abordaje que tiene
     *                 la nave espacial.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Representa el metodo para obtener la nave espacial lanzadora que
     * utiliza la nave espacial para hacer el despegue.
     * @return El valor correspondiente a la nave espacial lanzadora que
     * utiliza la nave espacial para hacer el despegue.
     */
    public LauncherSpacecraft getLauncherSpacecraft() {
        return launcherSpacecraft;
    }

    /**
     * Representa el metodo para modificar la nave espacial lanzadora que
     * utiliza la nave espacial para hacer el despegue.
     * @param launcherSpacecraft El valor que se quiere asignar al atributo
     *                           correspondiente a la nave espacial lanzadora
     *                           que utiliza la nave espacial para hacer el
     *                           despegue.
     */
    public void setLauncherSpacecraft(LauncherSpacecraft launcherSpacecraft) {
        this.launcherSpacecraft = launcherSpacecraft;
    }

    /**
     * Representa la implementación del método abstracto para conocer la
     * función de la nave espacial.
     */
    @Override
    public void function() {
        System.out.println("La función principal de un vehículo tripulado es " +
                "enviar seres humanos al espacio para tareas de reparación, " +
                "mantenimiento o investigación, en misiones donde se precisa " +
                "de la destreza y de la toma de decisiones de personas, en  " +
                "detrimento de las máquinas."+ "\n");
    }

    /**
     * Representa la implementación del método abstracto para abordar la nave
     * espacial.
     * @throws InterruptedException Control de posible excepción por el uso
     * del método thread.sleep
     */
    @Override
    public void boardSpacecraft() throws InterruptedException {
        System.out.println("Tripulación abordando...");
        for (int i = 0;i < this.capacity; i++){
            Thread.sleep(1000);
            System.out.println("Abordando tripulante " + (i + 1) + " ...");
        }
        System.out.println("Abordaje exitoso.");
    }

    /**
     * Representa la implementación del método abstracto para cargar
     * combustible a la nave espacial.
     */
    @Override
    public void refuelingSpacecraft() {
        super.setFilledUpTank(true);
        System.out.println("La nave tripulada ha sido cargada con combustible" +
                ".");
    }

    /**
     * Representa la implementación del método abstracto para encender la
     * nave espacial.
     */
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
