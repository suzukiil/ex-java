/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07.BatePapo_Cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip
 */
public class ClienteProdutor extends Thread{

    Socket ss;
    MensagemBuffer B;
    PrintWriter pw;
    
    public ClienteProdutor(MensagemBuffer b, Socket ss) {
        super();
        B = b;
        this.ss=ss;
        try {
            pw=new PrintWriter(this.ss.getOutputStream());
        } catch (IOException ex) {
            ex.getStackTrace();
        }
        super.start();
    }
    
    public void enviarMensagem(String mensagem){
        synchronized(B){
            B.put(mensagem);
        }
    }

    public void run() {
        while (true) {
            synchronized (B) {
                pw.println(B.get());
                pw.flush();
            }
        }
    }
}
