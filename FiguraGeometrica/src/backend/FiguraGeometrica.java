package backend;

import java.util.Date;

public class FiguraGeometrica {
    
    // atributos
    private String color;
    private boolean relleno;
    private Date fechaCreacion;
    
    // constructor
    public FiguraGeometrica(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
        this.fechaCreacion = new Date();
    }
    
    // getters y setters
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isRelleno() {
        return relleno;
    }
    
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    // método toString
    @Override
    public String toString() {
        return "FiguraGeometrica [color=" + color + ", relleno=" + relleno + ", fechaCreacion=" + fechaCreacion + "]";
    }
}

