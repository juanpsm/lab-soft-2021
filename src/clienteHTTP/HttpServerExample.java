package clienteHTTP;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class HttpServerExample {
	public static void main(String arg[]) throws IOException {
		HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
		// se pueden crear varios context cada uno administrado por un handler distinto
		// contiene el código de atención del requerimiento
		server.createContext("/applications/myapp", new MyHandler());
		// crea un default executor, que toma de a 1 los requerimientos
		server.setExecutor(null);
		server.start();
	}
}
