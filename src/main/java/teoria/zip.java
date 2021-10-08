package teoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zip {
    public static void main(String[] args){

        System.out.println(comget());
    }

    public static String exget(){
        ProcessBuilder proceso = new ProcessBuilder("C:\\Program Files\\7-Zip\\7z.exe","x","C:\\Users\\AlumnoM\\Desktop\\descompresion.7z" , "-oC:\\Users\\AlumnoM\\Desktop", "*.*", "-r");
        java.lang.Process p = null;
        try {
            p = proceso.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader teclado = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String cad = "";
        String ip = "";
        String total = "";
        while (true) {
            try {
                cad = teclado.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*if (cad.contains("Puerta de enlace")) {
                ip = cad.substring(47);
            }*/
            if (cad == null) {
                break;
            }

            total=total+cad+"\n";
        }
        return total;
    }
    public static String comget(){
        ProcessBuilder proceso = new ProcessBuilder("C:\\Program Files\\7-Zip\\7z.exe","a", "C:\\Users\\AlumnoM\\Desktop\\compresion.7z","C:\\Users\\AlumnoM\\Desktop\\texto.txt");
        java.lang.Process p = null;
        try {
            p = proceso.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader teclado = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String cad = "";
        String ip = "";
        String total = "";
        while (true) {
            try {
                cad = teclado.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*if (cad.contains("Puerta de enlace")) {
                ip = cad.substring(47);
            }*/
            if (cad == null) {
                break;
            }

            total=total+cad+"\n";
        }
        return total;
    }
    private static boolean descomprimir(String pathArchivoComprimido, String pathDescompresion) {
        return false;
    }
    private static boolean comprimir(String nombreFicheroComprimido, String ficheroAComprimir) {
        return false;
    }
}

