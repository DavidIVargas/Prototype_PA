/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author davidvargas
 */
public class Mago extends Personaje {

    private String encanto;

    public Mago(String encanto, String nombre, String habilidad, String equipo) {
        super(nombre, habilidad, equipo);
        this.imagen = "/images/img_mago_1.jpeg";
        this.encanto = encanto;
    }

    @Override
    public CloneablePersonaje clonar() {
        Mago magoClon = new Mago(encanto, nombre, habilidad, equipo);
        magoClon.setImagen(imagen);
        magoClon.setEncanto(encanto);
        magoClon.setNombre(nombre);
        magoClon.setHabilidad(habilidad);
        magoClon.setEquipo(equipo);
        return magoClon;
    }

    public String getEncanto() {
        return encanto;
    }

    public void setEncanto(String encanto) {
        this.encanto = encanto;
    }

}
