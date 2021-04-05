package domain;

public abstract class FiguraGeometrica {
    private String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void dibujar ();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
