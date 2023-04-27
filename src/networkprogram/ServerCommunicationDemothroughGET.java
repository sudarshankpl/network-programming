/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogram;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author kaphl
 */
public class ServerCommunicationDemothroughGET {
    public static void main(String[] args) throws MalformedURLException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your nme");
        String name = sc.nextLine();
        System.out.println("Enter your email");
        String email = sc.nextLine();
        
        URL url = new URL ("http://localhost/serverdemo/insert.php?fullname="+name+"email="+email);
        URLConnection conn = url.openConnection();
        InputStream strem = conn.getInputStream();
        InputStreamReader r= new InputStreamReader(strem);
        int c;
        While ((c = r.read()!= -1)){
            System.out.print((char))();
    }
    }
}

