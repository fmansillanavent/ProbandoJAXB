import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

@XmlRootElement (name="Productos")
public class Productos {

    private List<Aviso> avisosList;
    private List<Desarrollo> desarrollos;
    private String saludo;


    public Productos() {
        super();
    }

    public Productos(List<Desarrollo> desarrollos, List<Aviso> avisos, String saludo) {
        this.desarrollos = desarrollos;
        this.avisosList = avisos;
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    @XmlElementWrapper(name="Desarrollos")
    @XmlElement(name="Desarrollo")
    public List<Desarrollo> getDesarrollos() {
        return desarrollos;
    }

    public void setDesarrollos(List<Desarrollo> desarrollos) {
        this.desarrollos = desarrollos;
    }

    @XmlElementWrapper(name="Avisos")
    @XmlElement(name="Aviso")
    public List<Aviso> getAvisos() {
        return avisosList;
    }

    public void setAvisos(List<Aviso> avisos) {
        this.avisosList = avisos;
    }

    @Override
    public String toString() {

        return ("<Productos>\n\t<Desarrolllos>Lista de tamaño: " + this.getDesarrollos().size()
                + "</Desarrollos>\n\t<Avisos>Lista de tamaño: " + this.getAvisos().size() + "</Avisos>\n\t<saludo>"
                + this.getSaludo() + "</saludo>\n</Productos>");
    }
}
