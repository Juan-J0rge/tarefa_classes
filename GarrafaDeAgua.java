/**
 * @author Juan Jorge
 *
 */
public class GarrafaDeAgua {
    private String tipo;
     private int litros;

    //Metodos

    //Vou passar pra classe main o tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Vou usar pra imprimir no System.out.println.
    //Como a variavel esta privada tenho que usar o get

    /**
     *  retorna o tipo o tipo da garrafa
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    public void setLitros(int litros){
        this.litros = litros;
    }

    /**
     *  retorna o tipo a quantidade de litros
     *  da garrafa
     * @return
     */
    public int getLitros() {
        return litros;
    }



}
