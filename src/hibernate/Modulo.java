package hibernate;

import java.io.Serializable;

/**
 * @project IlernaPACDesaAD
 * @author: jonan on 26/11/2019
 */
public class Modulo implements Serializable {

    private static final long serialVersionUID = -65908453490972485L;
    private long id;
    private String nombre;
    private String codigo;

    public Modulo() {
    }

    public Modulo(long id, String nombre, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
