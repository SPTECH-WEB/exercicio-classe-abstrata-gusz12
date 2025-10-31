package school.sptech;

public class Quadrado extends Figura{
    private Double lado;


    @Override public Double calcularArea(){
        Double flado = getLado();
        return flado * flado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + getLado() +
                ", cor='" + getCor() + '\'' +
                ", espessura=" + getEspessura() +
                '}';
    }

    public Double getLado() {
        return this.lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
