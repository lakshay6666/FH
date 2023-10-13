package prechec;

class Engine {
    String Enginematerial;
    double Uniqueid;
    int cost;

    public Engine(String Enginematerial, double Uniqueid, int cost) {
        this.Enginematerial = Enginematerial;
        this.Uniqueid = Uniqueid;
        this.cost = cost;
    }

    public String getEnginematerial() {
        return Enginematerial;
    }

    public double getUniqueid() {
        return Uniqueid;
    }

    public int getcost() {
        return cost;
    }
}

class CombustionEngine extends Engine {
    public CombustionEngine(String Enginematerial, double Uniqueid, int cost) {
        super(Enginematerial, Uniqueid, cost);
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine(String Enginematerial, double Uniqueid, int cost) {
        super(Enginematerial, Uniqueid, cost);
    }
}

class HybridEngine extends Engine {
    public HybridEngine(String Enginematerial, double Uniqueid, int cost) {
        super(Enginematerial, Uniqueid, cost);
    }
}

class Manufacture {
    private String Manufacturename;
    private int yearOfManufacture;

    public Manufacture(String Manufacturename, int yearOfManufacture) {
        this.Manufacturename = Manufacturename;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturename() {
        return Manufacturename;
    }

    public int getyearOfManufacture() {
        return yearOfManufacture;
    }
}

abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Internal Combustion Engine Vehicle (ICEV)");
        System.out.println("Manufacture Name: " + getManufacture().getManufacturename());
        System.out.println("Year Of Manufacture: " + getManufacture().getyearOfManufacture());
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Unique ID : " + getEngine().getUniqueid());
        System.out.println("Engine Cost: " + getEngine().getcost());
    }
}

class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Battery Electric Vehicle (BEV)");
        System.out.println("Manufacture Name: " + getManufacture().getManufacturename());
        System.out.println("Year Of Manufacture: " + getManufacture().getyearOfManufacture());
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Unique ID : " + getEngine().getUniqueid());
        System.out.println("Engine Cost: " + getEngine().getcost());
    }
}

class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Hybrid Vehicle (HybridV)");
        System.out.println("Manufacture Name: " + getManufacture().getManufacturename());
        System.out.println("Year Of Manufacture: " + getManufacture().getyearOfManufacture());
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Unique ID : " + getEngine().getUniqueid());
        System.out.println("Engine Cost: " + getEngine().getcost());
    }
}

public class Engine2 {
    public static void main(String[] args) {
        Manufacture porsche = new Manufacture("Porsche", 2015);
        Manufacture audi = new Manufacture("Audi", 2023);
        Manufacture suzuki = new Manufacture("Suzuki", 2022);
        Manufacture kia = new Manufacture("KIA", 2016);

        Engine iceEngine = new Engine("Steel", 134.0, 23400);
        Engine electricEngine = new Engine("Copper", 321, 12005);
        Engine manualEngine = new Engine("Zinc", 2321.0, 123059);

        ICEV icev = new ICEV(porsche, iceEngine);
        BEV bev = new BEV(porsche, electricEngine);
        HybridV hybridv = new HybridV(porsche, manualEngine);

        ICEV icev1 = new ICEV(audi, iceEngine);
        BEV bev1 = new BEV(audi, electricEngine);
        HybridV hybridv1 = new HybridV(audi, manualEngine);

        ICEV icev2 = new ICEV(suzuki, iceEngine);
        BEV bev2 = new BEV(suzuki, electricEngine);
        HybridV hybridv2 = new HybridV(suzuki, manualEngine);

        ICEV icev3 = new ICEV(kia, iceEngine);
        BEV bev3 = new BEV(kia, electricEngine);
        HybridV hybridv3 = new HybridV(kia, manualEngine);

        Vehicle[] vehicles = {icev, bev, hybridv, icev1, bev1, hybridv1, icev2, bev2, hybridv2, icev3, bev3, hybridv3};

        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}