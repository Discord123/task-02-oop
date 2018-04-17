package model;

import entity.SearchCriterion;
import entity.appliance.Appliance;
import entity.appliance.ApplianceType;

import java.util.List;
import java.util.Map;

public class Searcher {
    private ApplianceType applianceType;
    private List<Appliance> appliances;
    private SearchCriterion searchCriterion;
    private Parser parser;

    public Searcher(List<String> textFromFile) {
        parser = new Parser(textFromFile);
    }

    // method finds all the records that match a certain search criterion
    public void findAppliance(String type, String parameter, String value) {

        applianceType = ApplianceType.valueOf(type.toUpperCase());

        searchCriterion = new SearchCriterion(parameter, value);

        appliances = parser.makeApplianceList(applianceType, searchCriterion);

    }

    // an overloaded method to provide an opportunity
    // to find all the records for a specific type
    public void findAppliance(String type) {

        applianceType = ApplianceType.valueOf(type.toUpperCase());
        searchCriterion = new SearchCriterion("", "");

        appliances = parser.makeApplianceList(applianceType, searchCriterion);
    }

    public List<Appliance> showResults() {

        return appliances;
    }

    public SearchCriterion getSearchCriterion() {
        return searchCriterion;
    }

    public void setSearchCriterion(String parameter, String value) {
        searchCriterion = new SearchCriterion(parameter, value);
    }

    public ApplianceType getApplianceType() {
        return applianceType;
    }

    public Map<String, String> getMap() {
        return parser.getParametersList();
    }
}
