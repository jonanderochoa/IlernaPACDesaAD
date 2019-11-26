package hibernate;

/**
 * @project IlernaPACDesaAD
 * @author: jonan on 26/11/2019
 */
public class Profesor {

    private long id;
    private String nombre;
    private String sexo;

    public Profesor() {
    }

    public Profesor(long id, String nombre, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
