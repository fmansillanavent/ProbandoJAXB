import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) throws JAXBException {

        File file = new File("src/productos.xml");
        System.out.println(file);
        JAXBContext jaxbContext = JAXBContext.newInstance(Productos.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Productos productos = (Productos) unmarshaller.unmarshal(file);

        System.out.println(productos.toString());
        System.out.println("Fin unmarshal");
    }
}
