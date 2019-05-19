public class TipoDePropiedad {

    private String tipo;
    private int id;

    public TipoDePropiedad(){super();}
    public TipoDePropiedad(String tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
