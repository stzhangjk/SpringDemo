import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Grady on 2016.5.26.
 */
public class FileSourceExample {
    public static void main(String[] args){

        try {

            Resource fileRes1 = new FileSystemResource("D:\\CodePrectice\\Intellij\\SpringDemo\\002-Resource\\src\\main\\resources\\test.txt");
            InputStream inputStream = fileRes1.getInputStream();
            System.out.println(fileRes1.getFilename());

            Resource fileRes2 = new ClassPathResource("test.txt");
            InputStream inputStream2 = fileRes2.getInputStream();
            System.out.println(fileRes2.getFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
