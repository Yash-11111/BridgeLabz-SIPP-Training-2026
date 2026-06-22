class ChargingStation {

    
    static int totalStations = 0;
    static double electricityRate = 8.5; // Rate per unit

    
    String stationId;
    double unitsConsumed;

    
    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId; // using this keyword
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

  
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

   
    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: ₹" + electricityRate + " per unit");
        System.out.println("Bill Amount: ₹" + calculateBill());
        System.out.println();
    }
}

public class evChargingStation {
    public static void main(String[] args) {

        
        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 90);
        ChargingStation s4 = new ChargingStation("CS104", 200);
        ChargingStation s5 = new ChargingStation("CS105", 175);

        System.out.println("Total Stations: " + ChargingStation.totalStations);
        System.out.println();

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        ChargingStation.electricityRate = 10.0;

        System.out.println("===== After Rate Change =====");
        System.out.println();

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}