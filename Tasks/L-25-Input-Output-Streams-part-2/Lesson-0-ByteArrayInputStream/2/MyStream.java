
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MyStream extends ByteArrayInputStream {
    public MyStream(byte[] buf) {
        super(buf);
    }

    @Override
    public void close() throws IOException {
        System.out.println("The close() method was called!");
        super.close();
    }
}
