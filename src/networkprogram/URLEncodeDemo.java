/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogram;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

/**
 *
 * @author yuvraj
 */
public class URLEncodeDemo {
   public static void main(String[]args) throws MalformedURLException {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an query");
       String q = sc.nextLine();
       String url = "https://google.com?q="+q;
       System.out.println("orginal url \n"+url+q);
    String encodeUrl = URLEncoder.encode(url+q); //blind encoding
       String eq = URLEncoder.encode(q);
      
               System.out.println(url+eq);
               
               String url2 = "https://www.abc.com?name=ram&city=ktm&q=what is networking ?";
               URL u = new URL (url2);
               String o;
               
               o = u.getProtocol()+"://";
               o+= u.getAuthority()+"?";
               o+= "name="+URLEncoder.encode ("ram")+"&";
                o+= "city="+URLEncoder.encode ("ktm")+"&";
                 o+= "q="+URLEncoder.encode ("What is network programming ?");
                  System.out.println(o);
                  
                  System.out.println(URLDecoder.decode(o));
                  System.out.println(URLDecoder.decode("https://www.google.com/q=?"));
                  
   } 
}