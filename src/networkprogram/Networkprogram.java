/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package networkprogram;

import java.net.InetAddress;
import java.net.UnknownHostException;
import static java.time.Clock.system;
import static java.time.InstantSource.system;

/**
 *
 * @author yuvraj
 */
public class Networkprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException{
        InetAddress ip= InetAddress.getByName("192.168.1.1");
        InetAddress ip2= InetAddress.getByName("google.com");
        //getby address
        byte[] add = {(byte)192,(byte)168,1,1};
        InetAddress ip3 = InetAddress.getByAddress(add);
        InetAddress ip4 = InetAddress.getByAddress("google.com",add);
        System.out.println(ip.getHostName());
        System.out.println(ip2.getHostName());
                System.out.println(InetAddress.getLocalHost());
                System.out.println(InetAddress.getLoopbackAddress());
                
                InetAddress m1 = InetAddress.getByName("239.0.2.4");
                System.out.println(m1.isMulticastAddress());
                  InetAddress m2 = InetAddress.getByName("190.0.0.0");
                System.out.println(m1.isAnyLocalAddress());
                
                InetAddress m3 = InetAddress.getByName("127.0.0.1");
                 InetAddress m4 = InetAddress.getByName("::1");
                 
                System.out.println(m3.isLoopbackAddress());
                System.out.println(m4.isLoopbackAddress());
                
                
         InetAddress s1 = InetAddress.getByName("FF0E:0000:0000:0000:0000:0000:0000:0000");
         System.out.println(s1.isMCGlobal());
   
          InetAddress s2 = InetAddress.getByName("FF08:0000:0000:0000:0000:0000:0000:0000");
         System.out.println(s1.isMCOrgLocal());
         
         InetAddress s3 = InetAddress.getByName("FF05:0000:0000:0000:0000:0000:0000:0000");
         System.out.println(s1.isMCSiteLocal());
         
         InetAddress s34 = InetAddress.getByName("FF02:0000:0000:0000:0000:0000:0000:0000");
         System.out.println(s1.isMCLinkLocal());
         
         
         InetAddress s5 = InetAddress.getByName("FF01:0000:0000:0000:0000:0000:0000:0000");
         System.out.println(s1.isMCNodeLocal());
    }
   
        
        
       
        
        // TODO code application logic here
    }
