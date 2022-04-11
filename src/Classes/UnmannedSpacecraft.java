package Classes;

import Interfaces.ISpacecraft;

/**
 * Representa la clase nave espacial no tripulada que extiende de la clase
 * abstracta nave espacial e implementa la interface nave espacial, sus
 * atributos y sus métodos.
 * @author Yeisson Vahos Cortes
 */
public class UnmannedSpacecraft extends Spacecraft implements ISpacecraft {

    /**
     * Representa el empuje que tiene la nave espacial.
     */
    private float push;

    /**
     * Representa la nave espacial lanzadora que utiliza la nave espacial
     * para hacer el despegue.
     */
    public LauncherSpacecraft launcherSpacecraft;

    /**
     * Representa el constructor que crea una instancia de la clase nave
     * espacial no tripulada.
     * @param name Representa el nombre de la nave espacial.
     * @param originCountry Representa el país de origen de la nave espacial.
     * @param weight Representa el peso de la nave espacial.
     * @param yearOfCreation Representa el año de creación de la nave espacial.
     * @param fuelType Representa el tipo de combustible utilizado por la
     *                 nave espacial.
     * @param push Representa el empuje que tiene la nave espacial.
     * @param launcherSpacecraft Representa la nave espacial lanzadora que
     *                           utiliza la nave espacial para hacer el
     *                           despegue.
     */
    public UnmannedSpacecraft(
            String name,
            String originCountry,
            float weight,
            int yearOfCreation,
            String fuelType,
            float push,
            LauncherSpacecraft launcherSpacecraft)
    {
        super(name, originCountry, weight, yearOfCreation, fuelType);
        this.push = push;
        this.launcherSpacecraft = launcherSpacecraft;
    }

    /**
     * Representa el metodo para obtener el empuje que tiene la nave espacial.
     * @return El valor correspondiente al empuje que tiene la nave espacial.
     */
    public float getPush() {
        return push;
    }

    /**
     * Representa el metodo para modificar el empuje que tiene la nave espacial.
     * @param push El valor que se quiere asignar al atributo correspondiente
     *            al empuje que tiene la nave espacial.
     */
    public void setPush(float push) {
        this.push = push;
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
     *                          correspondiente a la nave espacial lanzadora
     *                          que utiliza la nave espacial para hacer el
     *                          despegue.
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
        System.out.println("La función principal de un vehículo no tripulado " +
                "es estudiar otros cuerpos celestes." + "\n");
    }

    /**
     * Representa la implementación del método abstracto para abordar la nave
     * espacial.
     */
    @Override
    public void boardSpacecraft() {
        System.out.println("Vehículo aereo no tripulado, no se requiere " +
                "abordaje.");
    }

    /**
     * Representa la implementación del método abstracto para cargar
     * combustible a la nave espacial.
     */
    @Override
    public void refuelingSpacecraft() {
        super.setFilledUpTank(true);
        System.out.println("La nave no tripulada ha sido cargada con " +
                "combustible.");
    }

    /**
     * Representa la implementación del método abstracto para encender la
     * nave espacial.
     */
    @Override
    public void turnOnSpacecraft() {
        if (super.isFilledUpTank() == false){
            System.out.println("Es necesario poner combustible a la nave no " +
                    "tripulada antes de encenderla.");
        } else{
            super.setSpacecraftTurnedOn(true);
            System.out.println("Nave no tripulada encendida.");
        }
    }
}
