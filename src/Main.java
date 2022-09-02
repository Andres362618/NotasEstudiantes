public class Main {//genera la clase Main "clase"
    
    public static void main (String[] args) {//establece la funcion
        ManipularCSV archivo = new ManipularCSV();//llamado a ManipularCSV "herencia"

        archivo.leerArchivo("src\\Notas.csv");//brinda la hubicacion a leer del archivo csv
    }
}
