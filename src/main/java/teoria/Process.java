package teoria;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Process {
    public static void main(String[] args) throws Exception {

        System.out.println(getipconfig());
        System.out.println(hacerPing(getIp4()));
        System.out.println(hacerPing(getSubred()));
        System.out.println(hacerPing(getPuertaEnlace()));

    }

    public static String hacerPing(String ip) throws IOException {
        ProcessBuilder pingip = new ProcessBuilder("cmd.exe", "/c", "ping", ip);
        java.lang.Process piip = pingip.start();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(piip.getInputStream()));
        String cad = "";
        String total = "";
        while (true) {
            cad = teclado.readLine();
            if (cad == null) {
                break;
            }

            total = total + cad + "\n";
        }
        return total;
    }

    public static String getIp4() throws IOException {
        ProcessBuilder proceso = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
        java.lang.Process p = proceso.start();

        BufferedReader teclado = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String cad = "";
        String ip = "";
        String puerta = "";
        String mascara = "";
        while (true) {
            cad = teclado.readLine();
            if (cad.contains("IPv4")) {
                ip = cad.substring(47);
            }
            if (cad.contains("VirtualBox")) {
                break;
            }


        }
        return ip;
    }

    public static String getSubred() throws IOException {
        ProcessBuilder proceso = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
        java.lang.Process p = proceso.start();

        BufferedReader teclado = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String cad = "";
        String ip = "";
        while (true) {
            cad = teclado.readLine();
            if (cad.contains("cara de subred")) {
                ip = cad.substring(47);
            }
            if (cad.contains("VirtualBox")) {
                break;
            }


        }
        return ip;
    }

    public static String getPuertaEnlace() throws IOException {
        ProcessBuilder proceso = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
        java.lang.Process p = proceso.start();

        BufferedReader teclado = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String cad = "";
        String ip = "";
        while (true) {
            cad = teclado.readLine();
            if (cad.contains("Puerta de enlace")) {
                ip = cad.substring(47);
            }
            if (cad.contains("VirtualBox")) {
                break;
            }


        }
        return ip;
    }
    public static String getipconfig() throws IOException {
        ProcessBuilder proceso = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
        java.lang.Process p = proceso.start();

        BufferedReader teclado = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String cad = "";
        String ip = "";
        String total = "";
        while (true) {
            cad = teclado.readLine();
            if (cad.contains("Puerta de enlace")) {
                ip = cad.substring(47);
            }
            if (cad.contains("VirtualBox")) {
                break;
            }

            total=total+cad+"\n";
        }
        return total;
    }
}
