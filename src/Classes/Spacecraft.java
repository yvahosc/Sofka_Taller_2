package Classes;

public abstract class Spacecraft {
    private String name;
    private String originCountry;
    private float weight;
    private int yearOfCreation;
    private String fuelType;
    private boolean filledUpTank = false;
    private boolean spacecraftTurnedOn = false;

    public Spacecraft(
            String name,
            String originCountry,
            float weight,
            int yearOfCreation,
            String fuelType)
    {
        this.name = name;
        this.originCountry = originCountry;
        this.weight = weight;
        this.yearOfCreation = yearOfCreation;
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isFilledUpTank() {
        return filledUpTank;
    }

    public void setFilledUpTank(boolean filledUpTank) {
        this.filledUpTank = filledUpTank;
    }

    public boolean isSpacecraftTurnedOn() {
        return spacecraftTurnedOn;
    }

    public void setSpacecraftTurnedOn(boolean spacecraftTurnedOn) {
        this.spacecraftTurnedOn = spacecraftTurnedOn;
    }

    public abstract void function();

    public abstract void boardSpacecraft();
}
