package school.sptech;

public class Circulo extends Figura{
    private Double raio;


    @Override public Double calcularArea(){
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "cor='" + getCor() + '\'' +
                ", espessura=" + getEspessura() +
                '}';
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
