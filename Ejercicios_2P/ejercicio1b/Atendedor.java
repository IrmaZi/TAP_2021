package Ejercicios2p.ejercicio1b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class Atendedor extends Thread {
    Socket c;
    BufferedReader in;
    PrintWriter out;
    List<Socket> sockets;

    public Atendedor(Socket client, List<Socket> ss) throws IOException {
        this.c = client;
        this.sockets = ss;
        in = new BufferedReader(new InputStreamReader(c.getInputStream()));
        out = new PrintWriter(c.getOutputStream());
    }
    public void sendBroadCast(String mensaje) {
        System.out.println("Enviando Broadcast:" + mensaje);
        if(sockets.size()>0) {
            sockets.forEach(socket -> {
                try {
                    PrintWriter outbc = new PrintWriter(socket.getOutputStream());
                    outbc.println(mensaje + " por broadcast.");
                    outbc.flush();
                } catch (IOException e) {
                //generacion
                  e.printStackTrace();
                }
            });
        }
    }
    @Override
    public void run() {
        String line = "";
        while(!line.equals("adios"))
        {
            try{
                line = in.readLine();
                switch(line) {
                    case "Que me cuentas?":
                        System.out.println("comoo....");
                        out.println("Pues nada,solo triste");
                        out.flush();
                        sendBroadCast("Chales compa");
                        break;
                    case "Adios hombre":
                        System.out.println("pues adios yo me quedare a acabar el trabajo");
                        out.println("pues suerte amigo");
                        out.flush();
                        sendBroadCast("y me deja....");
                        in.close();
                        out.close();
                        break;
                    case "como te sientes?":
                        System.out.println("Pues como siempre amigo...:'(");
                        sendBroadCast("soy feliz eso es todo");
                        out.println("que bien ;D");
                        out.flush();
                        break;
                    default:
                        System.out.println(line);
                }
            
            }catch(IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }

}