package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return this.letras.length;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.letras.length; i++) {
            str += this.letras[i];
            if (i < this.letras.length - 1) {
                str += ", ";
            }
        }
        return str;
    }

    // Getters y Setters
    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

}
