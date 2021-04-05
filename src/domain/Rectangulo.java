package domain;

public class Rectangulo extends FiguraGeometrica {

    @Override
    public void dibujar() {
        System.out.println("Se imprime un " + this.getClass().getSimpleName());
    }
    
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
}
