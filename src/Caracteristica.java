public class Caracteristica {

    private String nombre;
    private int id;
    private String foto;

    public Caracteristica(){super();}
    public Caracteristica(String nombre, int id, String foto) {
        this.nombre = nombre;
        this.id = id;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
