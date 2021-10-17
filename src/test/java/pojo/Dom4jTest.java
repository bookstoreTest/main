package pojo;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Dom4jTest {
    @Test
    public void test1()  throws  Exception{
        // 1 创建一个SaxReader输入流，用于读取xml配置文件，生成Document对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(".\\src\\main\\resources\\static\\xml\\books.xml");
        System.out.println(document);
    }

    @Test
    public void test2(){

    }
}
