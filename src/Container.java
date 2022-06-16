public class Container<T> {

    private String tipoCarga;
    private double peso;

    public Container(String tipoCarga, double peso) {
        this.tipoCarga = tipoCarga;
        this.peso = peso;
    }

    private Pilas<BuqueCarga> contenedor = new Pilas<>();
    BuqueCarga contiene = new BuqueCarga();
    @Override
    public String toString() {
        return "Container{" +
                "tipoCarga='" + tipoCarga + '\'' +
                ", peso=" + peso +
                '}';
    }



}
