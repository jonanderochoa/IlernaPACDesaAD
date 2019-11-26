package hibernate;

import java.util.List;

/**
 * @project IlernaPACDesaAD
 * @author: jonan on 26/11/2019
 */
public class Alumno {

    private long id;
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String sexo;
    private List<Modulo> modulos;

    public Alumno() {
    }

    public Alumno(long id, String nombre, String nacionalidad, int edad, String sexo, List<Modulo> modulos) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
        this.modulos = modulos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }
}
