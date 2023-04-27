/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogram;

/**
 *
 * @author kaphl
 */
public class httprequestdemo {
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogram;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
 */
    public static void main(String[] args) throws IOException {
        URL url = new URL ("http://localhost/serverdemo/addrecord.php");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter your email");
        String email = sc.nextLine();
        
        System.out.println("enter your Address");
        String address = sc.nextLine();
        String q = "name"+name+"&email"+email+"&address"+address;
        byte[] postData = q.getBytes(StandardCharsets.UTF_8);
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        
        OutputStream stream = conn.getOutputStream();
        stream.write(postData);
        
        InputStream in_stream = conn.getInputStream();
        InputStreamReader r = new InputStreamReader(in_stream);
        int c;
        while ((c=r.read())!=-1){
            System.out.print((char)c);
        }
    }
  
}