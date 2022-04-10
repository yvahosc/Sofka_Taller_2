package Main;

import Classes.LauncherSpacecraft;
import Classes.MannedSpacecraft;
import Classes.Spacecraft;
import Classes.UnmannedSpacecraft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String input;
        int choice;

        do{
            System.out.println("¿Que misión desea iniciar?, digite el número " +
                    "correspondiente:" + "\n" + "1. Misión no tripulada." +
                    "\n" + "2. Misión tripulada.");

            Scanner leer = new Scanner(System.in);
            input = leer.next();
            choice = consoleInputVerification(input);

            if (choice == 1){
                System.out.println("¿Que tipo de nave desea usar?, digite el " +
                        "número correspondiente:" + "\n" + "1. ATV." + "\n" +
                        "2. Pionero XI.");
                input = leer.next();
                choice = consoleInputVerification(input);
                if (choice == 1){
                    LauncherSpacecraft launcher = launcher();
                    UnmannedSpacecraft spacecraft = new UnmannedSpacecraft(
                            "ATV.", "Europa.", 20, 2008, "MMH + NO", 0.2f,
                            launcher);
                    validationOfCapacityLaunchUnmannedSpacecraft(launcher,
                            spacecraft);
                }
                else if (choice == 2){
                    LauncherSpacecraft launcher = launcher();
                    UnmannedSpacecraft spacecraft =
                            new UnmannedSpacecraft("Pionero XI.", "E.E.U.U.",
                                    0.26f, 1973, "MMH + NO4", 0.26f, launcher);
                    validationOfCapacityLaunchUnmannedSpacecraft(launcher,
                            spacecraft);
                }
                else{
                    choice = 1;
                    System.out.println("Por favor digite un número válido."
                            + "\n");
                    continue;
                }
            }
            else if (choice == 2){
                System.out.println("¿Que tipo de nave desea usar?, digite el " +
                        "número correspondiente:" + "\n" + "1. Skylab." + "\n"
                        + "2. EEI.");
                input = leer.next();
                choice = consoleInputVerification(input);
                if (choice == 1){
                    LauncherSpacecraft launcher = launcher();
                    MannedSpacecraft spacecraft = new MannedSpacecraft("Skylab" +
                            ".", "E.E.U.U.", 77, 1973, "Queroseno + H (liq)", 3,
                            launcher);
                    validationOfCapacityLaunchMannedSpacecraft(launcher,
                            spacecraft);
                }
                else if (choice == 2){
                    LauncherSpacecraft launcher = launcher();
                    MannedSpacecraft spacecraft = new MannedSpacecraft("EEI" +
                            ".", "Coop. Internacional", 420, 1998, "UDMH + " +
                            "N2O4", 7,launcher);
                    validationOfCapacityLaunchMannedSpacecraft(launcher,
                            spacecraft);
                }
                else{
                    choice = 1;
                    System.out.println("Por favor digite un número válido." +
                            "\n");
                    continue;
                }
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido." + "\n");
                continue;
            }
            System.out.println("¿Quiere planear otra misión?, digite el " +
                    "número correspondiente:" + "\n" + "1. Sí." + "\n" +
                    "2. No.");
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
            }
            else if (choice == 2){
                System.out.println("Misiones terminadas.");
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido." + "\n");
            }
        }
        while (choice == 1);

    }

    public static void printing(LauncherSpacecraft launcher,
                                Spacecraft spacecraft)
    {
        System.out.println("Nave: " + spacecraft.getName() +
                "\n" + "Origen: " + spacecraft.getOriginCountry()
                + "\n" + "Peso en toneladas: " +
                spacecraft.getWeight());
        spacecraft.function();
        System.out.println("Lanzador: " + launcher.getName() +
                "\n" + "Origen: " + launcher.getOriginCountry()
                + "\n" + "Capacidad de transporte en toneladas: "
                + launcher.getCapacityTransport() + "\n" +
                "combustible utilizado: " +
                launcher.getFuelType());
        launcher.function();
        System.out.println("Ya contamos con la nave y el " +
                "lanzador para iniciar la misión, es tiempo " +
                "de enviar la misión al espacio...");
    }

    public static void validationOfCapacityLaunchUnmannedSpacecraft(
            LauncherSpacecraft launcher,
            UnmannedSpacecraft spacecraft)
            throws InterruptedException
    {
        if (spacecraft.getWeight() < launcher.getCapacityTransport())
        {
            printing(launcher, spacecraft);
            boolean boardSpacecraft = true;
            startUnmannedSpacecraft(boardSpacecraft, spacecraft,
                    launcher);
        }
        else{
            System.out.println("No es posible utilizar el " +
                    "lanzador " + launcher.getName() + " ya que " +
                    "la nave " + spacecraft.getName() + " excede " +
                    "su capacidad de transporte.");
        }
    }
    public static void validationOfCapacityLaunchMannedSpacecraft(
            LauncherSpacecraft launcher,
            MannedSpacecraft spacecraft)
            throws InterruptedException
    {
        if (spacecraft.getWeight() < launcher.getCapacityTransport())
        {
            printing(launcher, spacecraft);
            boolean boardSpacecraft = false;
            startMannedSpacecraft(boardSpacecraft, spacecraft,
                    launcher);
        }
        else{
            System.out.println("No es posible utilizar el " +
                    "lanzador " + launcher.getName() + " ya que " +
                    "la nave " + spacecraft.getName() + " excede " +
                    "su capacidad de transporte.");
        }
    }

    public static LauncherSpacecraft launcher(){

        String input;
        int choice;
        do{
            System.out.println("¿Qué nave lanzadora desea utilizar?, digite " +
                    "el número correspondiente:" + "\n" + "1. Saturno V." +
                    "\n" + "2. Energia.");
            Scanner leer = new Scanner(System.in);
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
                LauncherSpacecraft launcherSpacecraft =
                        new LauncherSpacecraft("Saturno V.", "E.E.U.U.",
                                2900 , 1967 , "H (liq) + O (liq).",
                                118, 3500);

                return launcherSpacecraft;
            }
            else if (choice == 2){
                LauncherSpacecraft launcherSpacecraft =
                        new LauncherSpacecraft("Energia.", "Rusia.", 2400, 1987,
                                "Petroleo + O (liq).", 100, 3060);
                return launcherSpacecraft;
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido." + "\n");

            }
        }
        while (choice == 1);
        return null;
    }

    public static void startUnmannedSpacecraft (
            boolean boardSpacecraft,
            UnmannedSpacecraft spacecraft,
            LauncherSpacecraft launcher)
            throws InterruptedException
    {
        Scanner leer = new Scanner(System.in);
        String input;
        int choice;
        do{
            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número " +
                    "correspondiente:" + "\n" + "1. Cargar combustible en las" +
                    " naves" + "\n" + "2. Encender las naves" + "\n" + "3. " +
                    "Realizar el lanzamiento.");
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
                spacecraft.refuelingSpacecraft();
                launcher.refuelingSpacecraft();
            }
            else if (choice == 2){
                spacecraft.turnOnSpacecraft();
                launcher.turnOnSpacecraft();
                choice = 1;
            }

            else if (choice == 3){
                boolean successfulLaunch;
                successfulLaunch = launcher.startSpaceShip(boardSpacecraft);
                if (successfulLaunch == false) {
                    choice = 1;
                }
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido.");
            }
        }
        while (choice == 1);
    }

    public static void startMannedSpacecraft (
            boolean boardSpacecraft,
            MannedSpacecraft spacecraft,
            LauncherSpacecraft launcher)
            throws InterruptedException
    {
        Scanner leer = new Scanner(System.in);
        String input;
        int choice;
        do{
            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número " +
                    "correspondiente:" + "\n" + "1. Cargar combustible en las" +
                    " naves" + "\n" + "2. Encender las naves" + "\n" + "3. " +
                    "Realizar el abordaje." + "\n" + "4. Realizar el " +
                    "lanzamiento.");
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
                spacecraft.refuelingSpacecraft();
                launcher.refuelingSpacecraft();
            }
            else if (choice == 2){
                spacecraft.turnOnSpacecraft();
                launcher.turnOnSpacecraft();
                choice = 1;
            }
            else if (choice == 3){
                spacecraft.boardSpacecraft();
                boardSpacecraft = true;
                choice = 1;
            }
            else if (choice == 4){
                boolean successfulLaunch;
                successfulLaunch = launcher.startSpaceShip(boardSpacecraft);

                if (successfulLaunch == false) {
                    choice = 1;
                }
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido.");
            }
        }
        while (choice == 1);
    }

    public static int consoleInputVerification (String input){
        try{
            int choice;
            choice = Integer.parseInt(input);
            return choice;
        }
        catch (Exception e){
            return 0;
        }
    }
}
