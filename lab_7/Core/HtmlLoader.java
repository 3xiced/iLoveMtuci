package Core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayOutputStream;

public class HtmlLoader {

    private final String host;

    public HtmlLoader(String host) {
        this.host = host;
    }

    public String GetHtml(String methodUrl) throws IOException {
        final SocketFactory socketFactory = SSLSocketFactory.getDefault();
        try (final Socket socket = socketFactory.createSocket(host, 443)) {
            final String request = "GET /%s HTTP/1.1\r\nConnection: close\r\nHost:%s\r\n\r\n".formatted(methodUrl,
                    host);

            final OutputStream outputStream = socket.getOutputStream();
            outputStream.write(request.getBytes(StandardCharsets.US_ASCII));

            final InputStream inputStream = socket.getInputStream();

            return ReadAsString(inputStream);
        }
    }

    public String GetHtml() throws IOException {
        return GetHtml("");
    }

    private static String ReadAsString(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, bytesRead);
        }
        return outputStream.toString(StandardCharsets.UTF_8.name());
    }
}