package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class Colecciones {
    ArrayList<String> cars ;
    String[] bikes;
    Set<String> bicicles;
    HashMap<Integer, String> transport;

    public Colecciones(){
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport= new HashMap<Integer, String>();
    }

    public void inicializar(){
        //carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        //motos
        this.bikes[1]="Yamaha V-Star 250";
        this.bikes[2]="Royal Enfield Meteor 350";
        this.bikes[3]="Kawasaki Eliminator";
        this.bikes[4]="Honda CMX500A2 SE Rebel.";
        //bicicletas 
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String> obtenerHash() {
        HashMap<Integer, String> resultMap = new HashMap<>();
        HashSet<String> seen = new HashSet<>();  // Para evitar duplicados
        int count = 1;

        // Agregar elementos de cars
        for(String car : cars) {
            if(car != null && !car.isEmpty() && seen.add(car)) {
                resultMap.put(count++, car);
            }
        }

        // Agregar elementos de bikes
        for(String bike : bikes) {
            if(bike != null && !bike.isEmpty() && seen.add(bike)) {
                resultMap.put(count++, bike);
            }
        }

        // Agregar elementos de bicicles
        for(String bicycle : bicicles) {
            if(bicycle != null && !bicycle.isEmpty() && seen.add(bicycle)) {
                resultMap.put(count++, bicycle);
            }
        }

        return resultMap;
    }
}
