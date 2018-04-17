package controller;


import model.Reader;
import model.Searcher;
import view.View;

public class Controller {

    public static void main(String[] args) {

        try {
            Reader reader = Reader.getInstance();
            reader.readFile();

            Searcher searcher = new Searcher(reader.getTextFromFile());

            View.print("Searching all records of a certain type:");

            searcher.findAppliance("Oven","powerConsumption","1000"); // user's input
            View.printList(searcher.showResults());

            View.print("\nSearching with a search criterion:");

            searcher.findAppliance("Laptop", "os", "Linux"); // user's input
            View.printList(searcher.showResults());

            searcher.findAppliance("Laptop", "batteryCapacity", "1"); // user's input
            View.printList(searcher.showResults());

            searcher.findAppliance("VacuumCleaner","powerConsumption","100");
            View.printList(searcher.showResults());

            searcher.findAppliance("VacuumCleaner","wandType","all-in-one");
            View.printList(searcher.showResults());

            searcher.findAppliance("TabletPC");
            View.printList(searcher.showResults());

            searcher.findAppliance("TabletPC","color","red");
            View.printList(searcher.showResults());

            searcher.findAppliance("Speakers","frequencyRange","2-4");
            View.printList(searcher.showResults());

            searcher.findAppliance("Speakers","powerConsumption","20");
            View.printList(searcher.showResults());

            searcher.findAppliance("TextBook","numberOfPages","15git");
            View.printList(searcher.showResults());

            searcher.findAppliance("TextBook","numberOfPages","13");
            View.printList(searcher.showResults());

            searcher.findAppliance("Newspaper","title","minsk");
            View.printList(searcher.showResults());

            searcher.findAppliance("Newspaper","title","NewYorker");
            View.printList(searcher.showResults());

        } catch (Throwable e) {
            View.print(e.getMessage());
            e.printStackTrace();
        }
    }
}
