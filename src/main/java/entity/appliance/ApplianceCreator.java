package entity.appliance;

import java.lang.reflect.Field;
import java.util.Map;

public class ApplianceCreator {
    private static ApplianceCreator instance;

    private ApplianceCreator() {
    }

    public static ApplianceCreator getInstance() {

        if (instance == null) {
            instance = new ApplianceCreator();
        }
        return instance;
    }


    // this method creates a certain type of appliance
    // based on enum types
    // then parameterizes it using Map parameters
    // which consist of keys and values
    // for example, DEPTH=33
    public Appliance createAppliance(ApplianceType type, Map<String, String> parameters) {
        Appliance appliance = null;

        switch (type) {
            case OVEN:
                appliance = new Oven();
                break;
            case LAPTOP:
                appliance = new Laptop();
                break;
            case REFRIGERATOR:
                appliance = new Refrigerator();
                break;
            case VACUUMCLEANER:
                appliance = new VacuumCleaner();
                break;
            case TABLETPC:
                appliance = new TabletPC();
                break;
            case SPEAKERS:
                appliance = new Speakers();
                break;
            case TEXTBOOK:
                appliance = new TextBook();
                break;
            case NEWSPAPER:
                appliance = new Newspaper();
                break;
        }

        parameterize(appliance, parameters);
        return appliance;
    }


    // this method uses a reflection to access class fields
    // and set values from Map parameters
    private void parameterize(Appliance appliance, Map<String, String> parameters) {

        for (String key : parameters.keySet()) {
            Field field;
            try {
                field = appliance.getClass().getDeclaredField(key);
                field.setAccessible(true);
                if (field.getType().getName().equals("double")) {
                    field.set(appliance, Double.valueOf(parameters.get(key)));
                } else {
                    field.set(appliance, parameters.get(key));
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
            }
        }
    }
}