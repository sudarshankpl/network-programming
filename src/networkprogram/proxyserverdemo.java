/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogram;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;

/**
 *
 * @author yuvraj
 */
public class proxyserverdemo {
   public static void main(String[] args) throws MalformedURLException, IOException{
       String proxyAddress ="proxy1.asm.edu.np";
       //method1 (system Property)
       
       System.setProperty("http.proxyHost", proxyAddress);
        System.setProperty("http.proxyPort", "80");
        System.setProperty("http.nonproxyHost", "www.google.com|www.facebook.com");
        URL url = new URL ("http://www.xyz.com");
        url.openConnection();
       
        //ftp
        
        System.setProperty("ftp.proxyHost", proxyAddress);
        System.setProperty("ftp.proxyPort", "80");
        System.setProperty("ftp.nonproxyHost", "www.google.com|www.facebook.com");
       
        url.openConnection();
        
        //method 2 : Proxy Class
        String p1 = "192.168.1.0";
        String p2 = "192.168.1.1";
        
        SocketAddress a = new InetSocketAddress(p1,80);
         SocketAddress b = new InetSocketAddress(p2,80);
         
         //Create the proxy
         
         Proxy pr1 = new Proxy(Proxy.Type.HTTP,a);
         Proxy pr2 = new Proxy(Proxy.Type.HTTP,b);
         
         URL u1 = new URL ("http://www.asm.edu.np");
         URL u2 = new URL ("http://www.xyz.edu.np");
          u1.openConnection(pr1);
          u2.openConnection(pr2);
   } 
}