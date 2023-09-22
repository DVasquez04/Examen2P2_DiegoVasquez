package examen2p2_diegovasquez;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Doc implements Serializable{
    private ArrayList<Usuario> users = new ArrayList();
    private File archivo = null;
    public Doc(String path) {
        archivo = new File(path);
    }

    private static final Long serialVersionUID = 696L;
    public ArrayList<Usuario> getListaelementos() {
        return users;
    }

    public void setListaelementos(ArrayList<Usuario> listaelementos) {
        this.users = listaelementos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    

    public void CargarArchivo() {
        try {
            users = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);//Se crea un flujo de entrada (FileInputStream) llamado entrada para leer bytes del archivo especificado en la variable archivo.
                ObjectInputStream objeto = new ObjectInputStream(entrada);//Se crea un flujo de objetos (ObjectInputStream) llamado objeto que se asocia con el flujo de entrada entrada. Este flujo se utiliza para leer objetos serializados del archivo.
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        users.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object UML : users) {
                bw.writeObject(UML);
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }
}
