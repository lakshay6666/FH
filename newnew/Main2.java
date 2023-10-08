import java.io.*;

class Car {
    int id;
    String make;
    String model;
    int manufacture_year;
    String color;
    int price;
    String registration_number;

    public Car(int id, String make, String model, int manufacture_year, String color, int price, String registration_number) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.manufacture_year = manufacture_year;
        this.color = color;
        this.price = price;
        this.registration_number = registration_number;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car[] obj = {
                new Car(1,"Mercedes","Sedan",1995,"Grey",2500,"DL3C2001"),
                new Car(2,"BMW","Sedan",2005,"White",5500,"DL2C9898"),
                new Car(3,"Mercedes","SUV",2010,"White",7000,"DL2C2000"),
                new Car(4,"Bugatti","Coupe",2016,"Red",592500,"DL4C2041"),
                new Car(5,"AUDI","Coupe",2022,"Black",72500,"DL6C8451"),
                new Car(6,"Mercedes","Convertible",2015,"Grey",152500,"DL3C6666"),
                new Car(7,"Porsche","Coupe",2015,"White",102500,"DL3C6333"),
                new Car(8,"AUDI","Sedan",2001,"Black",12500,"DL3C8501"),
                new Car(9,"AUDI","Hatchback",2005,"White",4000,"DLAC2581"),
                new Car(10,"BMW","Sedan",1996,"Pink",2000,"BH0C2052"),
                new Car(11,"BMW","SUV",2016,"Blue",20010,"BH0C0001"),
        };

        String modelToFilter = "Sedan";
        int yearsThreshold = 10; // Cars used for more than 10 years
        String listFilePath = "List_of_Cars_of_" + modelToFilter + "_more_than_" + yearsThreshold + "_years.txt";

        try {
            System.out.println("Creating a list of cars of the given model used for more than " + yearsThreshold + " years: " + modelToFilter);
            FileWriter fileWriter = new FileWriter(listFilePath);
            fileWriter.write("List of Cars of a given model used for more than " + yearsThreshold + " years: " + modelToFilter);
            fileWriter.write("\n-------------------------------\n");

            for (Car car : obj) {
                if (car.model.equalsIgnoreCase(modelToFilter) && (2023 - car.manufacture_year > yearsThreshold)) {
                    fileWriter.write("ID: " + car.id + "\n");
                    fileWriter.write("Make: " + car.make + "\n");
                    fileWriter.write("Model: " + car.model + "\n");
                    fileWriter.write("Manufacture Year: " + car.manufacture_year + "\n");
                    fileWriter.write("Color: " + car.color + "\n");
                    fileWriter.write("Price: " + car.price + "\n");
                    fileWriter.write("Registration Number: " + car.registration_number + "\n");
                    fileWriter.write("-------------------------------\n");
                }
            }

            fileWriter.close();
            System.out.println("List of cars saved to: " + listFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
