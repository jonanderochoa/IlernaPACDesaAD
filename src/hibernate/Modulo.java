package hibernate;

/**
 * @project IlernaPACDesaAD
 * @author: jonan on 26/11/2019
 */
public class Modulo {

    private long id;
    private String nombre;
    private int codigo;

    public Modulo() {
    }

    public Modulo(long id, String nombre, int codigo) {
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
