package Classes;

import Interfaces.ISpacecraft;

/**
 * Representa la clase nave espacial lanzadora que extiende de la clase
 * abstracta nave espacial e implementa la interface nave espacial, sus
 * atributos y sus métodos.
 * @author Yeisson Vahos Cortes
 */
public class LauncherSpacecraft extends Spacecraft implements ISpacecraft {

    /**
     * Representa el peso que tiene la capacidad de transportar la nave
     * espacial.
     */
    private int capacityTransport;

    /**
     * Representa el empuje que tiene la nave espacial.
     */
    private int push;

    /**
     * Representa el constructor que crea una instancia de la clase nave
     * espacial lanzadora.
     * @param name Representa el nombre de la nave espacial.
     * @param originCountry Representa el país de origen de la nave espacial.
     * @param weight Representa el peso de la nave espacial.
     * @param yearOfCreation Representa el año de creación de la nave espacial.
     * @param fuelType Representa el tipo de combustible utilizado por la
     *                 nave espacial.
     * @param capacityTransport Representa el peso que tiene la capacidad de
     *                          transportar la nave espacial.
     * @param push Representa el empuje que tiene la nave espacial.
     */
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

    /**
     * Representa el metodo para obtener el peso que tiene la capacidad de
     * transportar la nave espacial.
     * @return El valor correspondiente al peso que tiene la capacidad de
     * transportar la nave espacial.
     */
    public int getCapacityTransport() {
        return capacityTransport;
    }

    /**
     * Representa el metodo para modificar el peso que tiene la capacidad de
     * transportar la nave espacial.
     * @param capacityTransport El valor que se quiere asignar al atributo
     *                          correspondiente al peso que tiene la
     *                          capacidad de transportar la nave espacial.
     */
    public void setCapacityTransport(int capacityTransport) {
        this.capacityTransport = capacityTransport;
    }

    /**
     * Representa el metodo para obtener el empuje que tiene la nave espacial.
     * @return El valor correspondiente al empuje que tiene la nave espacial.
     */
    public int getPush() {
        return push;
    }

    /**
     * Representa el metodo para modificar el empuje que tiene la nave espacial.
     * @param push El valor que se quiere asignar al atributo correspondiente
     *            al empuje que tiene la nave espacial.
     */
    public void setPush(int push) {
        this.push = push;
    }

    /**
     * Representa la implementación del método abstracto para conocer la
     * función de la nave espacial.
     */
    @Override
    public void function() {
        System.out.println("La función de un vehículo lanzadera es lanzar una" +
                " carga útil al espacio, normalmente un satélite artificial, " +
                "una sonda o una nave tripulada." + "\n");
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
        System.out.println("La nave lanzadora ha sido cargada con combustible" +
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
                    "lanzadora antes de encenderla.");
        } else{
            super.setSpacecraftTurnedOn(true);
            System.out.println("Nave lanzadora encendida.");
        }
    }

    /**
     * Representa método realizar el despegue de la nave lanzadora junto a la
     * nave de la misión.
     * @param boardSpaceShip Parámetro que indica si ya se realizó o no el
     *                       abordaje de pasajeros para proceder con el
     *                       despegue de la nave.
     * @return Un valor booleano que indica si se hizo o no el despegue de la
     * nave lanzadora dependiendo de algunos parámetros correspondientes al
     * estado de la nave (el cargue del combustible, abordaje y encendido de
     * la nave).
     * @throws InterruptedException Control de posible excepción por el uso
     * del método thread.sleep 
     */
    public boolean startSpaceShip(boolean boardSpaceShip)
            throws InterruptedException
    {
        if (super.isFilledUpTank() == true){

            if (boardSpaceShip == true){

                if (super.isSpacecraftTurnedOn() == true){

                    System.out.println("Lanzamiento iniciado...");
                    for (int i = 0;i < 11; i++){
                        Thread.sleep(1000);
                        System.out.println((10 - i) + " segundos...");
                    }
                    System.out.println("Lanzamiento exitoso." + "\n");
                    return true;
                } else{
                    System.out.println("Es necesario encender las naves " +
                            "primero.");
                    return false;
                }
            } else{
                System.out.println("Es necesario abordar la nave primero.");
                return false;
            }
        } else {
            System.out.println("Es necesario poner combustible a las naves " +
                    "primero.");
            return false;
        }
    }
}
