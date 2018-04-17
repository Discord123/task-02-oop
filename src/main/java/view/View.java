package view;


import entity.appliance.Appliance;

import java.util.List;

public class View {

    public static void print(Object object) {
        System.out.println(object);
    }

    public static void printList(List<Appliance> list) {
        if (list.size() == 0) {
            System.out.println("Device not found!");
        } else {
            for (Appliance a : list) {
                System.out.println(a);
            }
        }
    }
}
