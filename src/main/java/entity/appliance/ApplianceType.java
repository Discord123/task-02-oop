package entity.appliance;

public enum ApplianceType {

    LAPTOP("Laptop"),
    OVEN("Oven"),
    REFRIGERATOR("Refrigerator"),
    VACUUMCLEANER("VacuumCleaner"),
    TABLETPC("TabletPC"),
    SPEAKERS("Speakers"),
    TEXTBOOK("TextBook"),
    NEWSPAPER("Newspaper");

    private String description;

    // this method returns a String description
    // which is used to make sure
    // that the user's input is valid
    ApplianceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
