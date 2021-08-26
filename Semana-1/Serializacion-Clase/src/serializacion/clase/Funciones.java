package serializacion.clase;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Funciones {

    private File archivo = new File("Datos.dat");
    private static ObjectInputStream entrada;
    private static ObjectOutputStream salida;
    ArrayList<Persona> listaPersonas = new ArrayList();

    public void Guardar() throws FileNotFoundException, IOException {

        ObjectOutputStream salida;
        FileOutputStream fo = new FileOutputStream(archivo);
        salida = new ObjectOutputStream(fo);
        salida.writeObject(listaPersonas);

        salida.close();

    }

    public void Leer() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream fi = new FileInputStream(archivo);
        ObjectInputStream entrada = new ObjectInputStream(fi);

        listaPersonas = (ArrayList) entrada.readObject();

        for (Persona p : listaPersonas) {

            JOptionPane.showMessageDialog(null, "=========== "
                    + "Nombre: " + p.getNombre() + "\n"
                    + "Apellido Paterno: " + p.getPaterno()+ "\n"
                    + "Apellido Materno: " + p.getMaterno() + "\n"
                    + "Edad: " + p.getEdad() + "\n");

        }

    }

    public void agregarPersona(String nombre, String paterno, String materno, int edad) throws IOException {

        Persona obj = new Persona(nombre, paterno, materno, edad);

        listaPersonas.add(obj);
        Guardar();

        JOptionPane.showMessageDialog(null, "La persona a sido guardada");

    }

}
