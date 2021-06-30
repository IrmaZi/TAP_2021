package Ejercicios2p.ejercicio1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor 
{
    ServerSocket server;
    BufferedReader in;
    PrintWriter out;

    public Servidor() throws IOException
    {
        server = new ServerSocket(5000);
        Socket cc = server.accept();
        in = new BufferedReader(new InputStreamReader(cc.getInputStream()));
        out = new PrintWriter(cc.getOutputStream());
    }

    public void read() throws IOException
    {
        String line = "";
        while(!line.equals("adios"))
        {
            line = in.readLine();
            switch(line) {
                case "Que me cuentas ":
                    System.out.println("Coomo....");
                    out.println("Pues nada campa ,solo triste");
                    out.flush();
                    break;
                case "Adios hombre":
                    System.out.println("pues adios,me quedare a acabar la tarea");
                    out.println("suerte con el trabajo");
                    out.flush();
                    break;
                case "como te sientes?":
                    System.out.println("Pues como siempre amigo...:'(");
                    out.println("soy feliz asi como soy");
                    out.flush();
                    break;
                default:
                    System.out.println(line);
            }
        }
        in.close();
        out.close();
    }
    public static void main(String args []) 
    {
        try {
            Servidor s = new Servidor();
            s.read();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
