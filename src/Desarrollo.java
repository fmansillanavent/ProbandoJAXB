import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

//@XmlRootElement(name = "Desarrollo")
public class Desarrollo {

    private String codigoAviso;
    private List<Caracteristica> caracteristicas;
    private TipoDePropiedad tipoDePropiedad;

    public Desarrollo(){super();}
    public Desarrollo(String codigoAviso, List<Caracteristica> caracteristicas, TipoDePropiedad tipoDePropiedad) {
        this.codigoAviso = codigoAviso;
        this.caracteristicas = caracteristicas;
        this.tipoDePropiedad = tipoDePropiedad;
    }

    public String getCodigoAviso() {
        return codigoAviso;
    }

    public void setCodigoAviso(String codigoAviso) {
        this.codigoAviso = codigoAviso;
    }

    @XmlElementWrapper(name="caracteristicas")
    @XmlElement(name="caracteristica")
    public List<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public TipoDePropiedad getTipoDePropiedad() {
        return tipoDePropiedad;
    }

    public void setTipoDePropiedad(TipoDePropiedad tipoDePropiedad) {
        this.tipoDePropiedad = tipoDePropiedad;
    }
}
