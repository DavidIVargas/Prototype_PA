package modelo;

public abstract class Personaje implements CloneablePersonaje{
    protected String imagen;
    protected String nombre;
    protected String habilidad;
    protected String equipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Personaje(String nombre, String habilidad, String equipo) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.equipo = equipo;
        this.imagen = imagen;
    }
    
    
    @Override
    public CloneablePersonaje clonar() {
        try {
            return (Personaje) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getRutaImagen() {
        return imagen;
    }
}
