package classes;

public class InheritanceCar extends InheritanceVehicle {

    public static void main(String[] args) {
//        InheritanceCar inheritanceCar = new InheritanceCar();
//        inheritanceCar.setEngine("V8");
//
//        InheritanceVehicle inheritanceVehicle = inheritanceCar;
//
//        InheritanceCar vv = (InheritanceCar) inheritanceVehicle;
//
//        System.out.println(vv.getEngine());
//

        InheritanceCar inheritanceCar = new InheritanceCar();
        InheritanceVehicle inheritanceVehicle = inheritanceCar;

        if (inheritanceVehicle instanceof InheritanceCar) {
            System.out.println("InheritanceCar");
        }else {
            System.out.println("Not InheritanceCar");
        }

    }
}
