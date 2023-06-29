package clases;

public class Productos {

    private String nomP;
    private double precio;
    private int existencia;

    //genera constructores vacio y con parametros
    //metodos get y set para cada atributo
    //metodo toString

    public Productos() {
    }

    public Productos(String nomP, double precio, int existencia) {
        this.nomP = nomP;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Productos{" + "nomP=" + nomP + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
}
