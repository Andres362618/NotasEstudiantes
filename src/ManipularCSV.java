import java.io.*;//importa librerias

import javax.swing.JOptionPane;//importa librerias

public class ManipularCSV {//genera la clase ManipularCSV "clase"

    private BufferedReader lector;//usa funcion de la librerias "encapsulación"
    private String linea;//genera string "encapsulación"
    private String partes[] = null;//genera string y asigna un valor "encapsulación"


    public void leerArchivo(String nombreArchivo) {//genera funcion
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));//establece valor para la variable lector
            while ((linea = lector.readLine()) != null) {//establece el ciclo while
                partes = linea.split(",");//indica cuando debe separar el cuadro leyendo las comas del documento csv
                imprimirLinea();//llama funcion
                System.out.println();//establece un println
            }
            lector.close();//cierra el lector
            linea = null;//cierra la linea
            partes = null;//cierra partes
        } catch (Exception e) {//genera excepciones
            JOptionPane.showMessageDialog(null, e);//establece la excepcion
        }
    }

    public void imprimirLinea() {//establece funcion
        for (int i = 0; i < partes.length; i++) {//establece ciclo for
            System.out.print(partes[i]+" | ");//indica usar | para separar las columnas
        }
    }
}
