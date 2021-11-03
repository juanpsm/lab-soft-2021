package clienteHTTP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

class MyHandler implements HttpHandler {
	public void handle(HttpExchange t) throws IOException {
		// encapsula el requerimiento y la respuesta HTTP
		InputStream is = t.getRequestBody();
		is.read(); // .. lee el request body
		String response = "Esta es la respuesta";
		t.sendResponseHeaders(200, response.length());
		OutputStream os = t.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
}
