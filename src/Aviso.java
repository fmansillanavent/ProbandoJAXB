import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

//@XmlRootElement(name="Avisos")
public class Aviso {


    private String codigoAviso;
    private List<Caracteristica> caracteristicas;

    public Aviso(){super();}
    public Aviso(String codigoAviso, List<Caracteristica> caracteristicas) {
        this.codigoAviso = codigoAviso;
        this.caracteristicas = caracteristicas;
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
}
