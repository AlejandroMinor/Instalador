package instalador2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aleja
 */
public class Procesos {

    public static final String TASKLIST = "tasklist";

    public static boolean isProcessRunning(String serviceName) throws Exception {

        Process p = Runtime.getRuntime().exec(TASKLIST);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            //System.out.println(line);
            if (line.contains(serviceName)) {

                return true;
            }

        }
        return false;
    }

    public String consoleInfo(String datoAbuscar, String ruta) throws IOException {

        Process p = Runtime.getRuntime().exec(ruta);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(datoAbuscar)) {
                System.out.println(datoAbuscar + " " + line);
                if (line.contains(":")) {
                    line = line.substring(line.lastIndexOf(":"));
                    line = line.replaceAll(" +", " ");
                    return line;
                } else {
                    line = line.substring(line.lastIndexOf("="));
                    line = line.replaceAll(" +", " ");
                    line = line.replace("=", ": ");
                    return line;
                }
            }
        }
        line = "";
        return line;
    }

    public String consoleInformation(String datoAbuscar, String ruta) throws IOException {

        Process p = Runtime.getRuntime().exec(ruta);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            if (line.contains(datoAbuscar)) {
                System.out.println(datoAbuscar + " " + line);
                return line;
            }
        }
        line = "";
        return line;
    }

}
