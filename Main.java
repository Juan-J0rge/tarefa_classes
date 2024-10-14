/**
 * @author Juan Jorge
 *
 */

public class Main {
    public static void main(String[] args) {
        GarrafaDeAgua garrafa = new GarrafaDeAgua();
        garrafa.setTipo("Plastico");

        garrafa.setLitros(2);

        System.out.println(garrafa.getTipo());
        System.out.println(garrafa.getLitros());


    }
}