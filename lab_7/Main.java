import java.io.IOException;

import Core.Worker;
import Core.HrefParser.*;

public class Main {
    public static void main(final String[] args) throws IOException, InterruptedException {
        Worker worker = new Worker(new HrefParser(), new HrefParserSettings(3, "mtuci.ru"));
        worker.RunWorker();
    }
}