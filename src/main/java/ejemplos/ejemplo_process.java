package ejemplos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ejemplo_process {
    public static void main(String[] args) {

        launchProcessAndWaiting();
        launchProcessAndStopping();
        launchProcessAndRead();
    }

    private static void launchProcessAndWaiting() {
        String path = "C:\\WINDOWS\\system32\\notepad.exe";
        String[] processToOpen = new String[1];
        processToOpen[0] = path;
        ProcessBuilder pb = new ProcessBuilder(processToOpen);

        try {
            // Creamos un proceso y lo empezamos
            Process process = pb.start();
            // Nos quedamos esperando a que termine.
            int status = process.waitFor();
            System.out.println("El resultado de la ejecución ha sido " + status);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void launchProcessAndStopping() {
        String path = "C:\\WINDOWS\\system32\\notepad.exe";
        String[] processToOpen = new String[1];
        processToOpen[0] = path;
        ProcessBuilder pb = new ProcessBuilder(processToOpen);

        try {
            // Creamos un proceso y lo empezamos
            Process process = pb.start();
            Thread.sleep(2000);
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void launchProcessAndRead() {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "cd \"C:\\\" && dir");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
