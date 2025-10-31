package school.sptech;

import java.util.*;
import java.util.List.*;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura){
        getFiguras().add(figura);
    }
    public Double calcularSomaDasAreas(){
        double total = 0;
        for (int i = 0; i < figuras.size(); i++) {
            total += getFiguras().get(i).calcularArea();
        }
        return total;
    }
    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaiores = new ArrayList<>();
        for (int i = 0; i < getFiguras().size(); i++) {
            Figura figuraVez = getFiguras().get(i);
            if(figuraVez.calcularArea() > 20){
                figurasMaiores.add(figuraVez);
            }
        }
        return figurasMaiores;
    }
    public List<Figura> buscarQuadrados(){
        List<Figura> figurasQuadrados = new ArrayList<>();
        for (int i = 0; i < getFiguras().size(); i++) {
            Figura figuraVez = getFiguras().get(i);
            if(figuraVez instanceof Quadrado){
                figurasQuadrados.add(figuraVez);
            }
        }
        return figurasQuadrados;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

}
