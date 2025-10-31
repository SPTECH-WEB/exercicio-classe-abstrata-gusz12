package school.sptech;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;


    @Override public Double calcularArea(){
        return getBase() * getAltura();
    }
    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + getBase() +
                ", altura=" + getAltura() +
                ", cor='" + getCor() + '\'' +
                ", espessura=" + getEspessura() +
                '}';
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
