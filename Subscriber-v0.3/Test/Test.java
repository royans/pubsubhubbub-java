package Test;

import java.io.IOException;
import java.net.InetAddress;

import PubSubHubbub.Web;
import PubSubHubbub.Subscriber;

public class Test {

	private Web webserver;
	private static Subscriber sbcbr;
	private static String hostname = null;
	private static Integer webserverPort = 8080;

    private void startServer(){
    	try {
    		webserver = new Web(webserverPort);
			
			sbcbr = new Subscriber(webserver);
			
			InetAddress addr = InetAddress.getLocalHost(); 
			hostname = addr.getHostName();
			hostname = "http://" + hostname + ":" + Integer.toString(webserverPort) + "/";
		   
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("WebServer can not start");
		}

    }

	public static void main(String[] args) {
		try {
			
			   String hub = "http://myhub.example.com/endpoint";
			   String hub_topic = "http://publisher.example.com/topic.xml";
			   
			   startServer();

			   int statusCode = sbcbr.subscribe(hub, hub_topic, hostname, null, null);
			   
			   if (statusCode == 204){
				   System.out.println("the status code of the subscription is 204: the request was verified and that the subscription is active");
			   } else if (statusCode == 202){
				   System.out.println("the status code of the subscription is 202: the subscription has yet to be verified (i.e., the hub is using asynchronous verification)");
			   } else{
				   System.out.println("the status code of the subscription is:" + statusCode);   
			   }
			   
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
