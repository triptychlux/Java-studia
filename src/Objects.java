public class Objects {
    public static void main(String[] args) {
        String obiekt1 = new String("cos");
        String obiekt2 = new String("cos");

        // == NEW string
        if(obiekt1 == obiekt2) {
            System.out.print("eq");
        } else {
            System.out.print("ne");
        }
        // equals NEW string
        if(obiekt1.equals(obiekt2)) {
            System.out.print("eq");
        } else {
            System.out.print("ne");
        }

        String obiekt3 = "cos";
        String obiekt4 = "cos";

        // == string
        if(obiekt3 == obiekt4) {
            System.out.print("eq");
        } else {
            System.out.print("ne");
        }
        // equals string
        if(obiekt3.equals(obiekt4)) {
            System.out.print("eq");
        } else {
            System.out.print("ne");
        }
    }
}
