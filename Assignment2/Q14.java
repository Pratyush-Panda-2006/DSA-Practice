class Distance {
    int feet;
    int inches;

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void displayDistance() {
        System.out.print(feet + "' " + inches + "\"");
    }
}

class Measurement extends Distance {
    double centimetres;

    Measurement(int feet, int inches, double centimetres) {
        super(feet, inches); // Initialize base class fields
        this.centimetres = centimetres;
    }

    void displayMeasurement() {
        super.displayDistance(); // Call base class method
        System.out.println(" (equal to " + centimetres + " cm)");
    }
}

public class Q14 {
    public static void main(String[] args) {
        Measurement m = new Measurement(5, 11, 180.34);
        m.displayMeasurement();
    }
}