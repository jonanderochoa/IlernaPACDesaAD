package hibernate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String VARON = "Varón";
    private static final String MUJER = "Mujer";

    private static final String MODULE_FILE_PATH = "ficheros\\modulo.xml";
    private static final String ALUMN_FILE_PATH = "ficheros\\alumno.xml";
    private static final String PROFESSOR_FILE_PATH = "ficheros\\profesor.xml";

    private static Object Alumno;
    private static Object Profesor;
    private static Object Modulo;

    public static void main(String[] args) {

        System.out.println("INICIO...");

        // Creamos los modulos
        System.out.println("Creando módulos");
        Modulo mp6 = new Modulo(1, "Acceso a datos", "MP6");
        Modulo mp9 = new Modulo(2, "Programación de servicios y procesos", "MP9");

        System.out.println("Guardando los modulos en fichero...");
        // Guardamos en fichero los objetos modulos
        saveModulo(mp6);
        saveModulo(mp9);

        System.out.println("Guardando los modulos en la lista");
        // Creamos una lista de modulos y añadimos los modulos que se añadiran al alumno Jon
        List<Modulo> jonModulos = new ArrayList<>();
        jonModulos.add(mp6);
        jonModulos.add(mp9);

        System.out.println("Creando alumno");
        // Creamos un alumno con sus valores iniciales
        Alumno alumnoJon = new Alumno(
                1,
                "Jon Ander",
                "Española",
                35,
                VARON,
                jonModulos);

        System.out.println("Guardando alumno en fichero...");
        // Guardamos en fichero el objeto alumno
        saveAlumno(alumnoJon);

        System.out.println("Creando profesor");
        // Creamos un profesor
        Profesor profesorAlvaro = new Profesor(
                1,
                "Alvaro",
                VARON
        );

        System.out.println("Guardando profesor en fichero...");
        // Guardamos en fichero el objeto profesor
        saveProfesor(profesorAlvaro);

        System.out.println();
        System.out.println("##################################");
        System.out.println("  MOSTRANDO DATOS DE FICHEROS");
        System.out.println("##################################");
        // Lee los datos del ficheros y los muestra por consola
        readModulo();
        readModulo();
        readAlumno();
        readProfesor();
    }

    /**
     * Metodo encargado de recibir el fichero y el tipo de objeto por parametro y crear un flujo de datos en
     * binario para almacenar los datos del objeto en el fichero
     * @param file Fichero en el que queremos almacenar la informacion
     * @param object Objeto que queremos almacenar
     */
    public static void fileOutputStream(File file, Object object){
        try{
            // Creamos un fichero de salida de flujo de datos en binario
            // append: true al ser true añade, no sobreescribe )
            FileOutputStream fileOut = new FileOutputStream(file, true);

            // Creamos un objeto de salida pasandole el fichero
            ObjectOutputStream objectStream = new ObjectOutputStream(fileOut);

            // Cargamos el el objeto de salida
            objectStream.writeObject(object);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Error: No se ha podido encontrar el fichero--> "+ e.toString());

        } catch (IOException e) {

            System.out.println(e.getMessage());
            System.out.println("Error: No se ha podido--> "+ e.toString());
        }
    }

    /**
     * Metodo que lee el objeto pasado por paramentro del fichero que se encuentra en la ruta pasada por parametro
     * @param file fichero que queremos leer
     * @param object Tipo de objeto en que queremos que se convierta
     * @param <T>
     */
    public static <T> void fileInputStream(File file, T object){
        try{
            // Creamos un flujo de datos binario de entrada
            FileInputStream fileIn = new FileInputStream(file);
            // Objeto que entrada
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Leemos el objeto y lo igualamos a la clase pasada por parametro
            T obj = (T)objectIn.readObject();
            objectIn.close();
            System.out.println(obj.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Guarda el modulo en fichero
     * @param modulo Modulo que queremos escribir en el fichero
     */
    public static void saveModulo(Modulo modulo){
        fileOutputStream(new File(MODULE_FILE_PATH), modulo);
    }

    /**
     * Guarda el alumno en fichero
     * @param alumno Alumno  que queremos escribir en el fichero
     */
    public static void saveAlumno(Alumno alumno){
        fileOutputStream(new File(ALUMN_FILE_PATH), alumno);
    }

    /**
     * Guarda el profesor en fichero
     * @param profesor Profesor  que queremos escribir en el fichero
     */
    public static void saveProfesor(Profesor profesor){
        fileOutputStream(new File(PROFESSOR_FILE_PATH), profesor);
    }

    /**
     * Lee el modulo del fichero
     */
    public static void readModulo(){
        fileInputStream(new File(MODULE_FILE_PATH), Modulo);
    }

    /**
     * Lee el alumno del fichero
     */
    public static void readAlumno(){
        fileInputStream(new File(ALUMN_FILE_PATH), Alumno);
    }

    /**
     * Lee el profesor del fichero
     */
    public static void readProfesor(){
        fileInputStream(new File(PROFESSOR_FILE_PATH), Profesor);
    }

}
