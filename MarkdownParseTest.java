import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
//potatoes
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksFromFile1() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-thing.html");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile2() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-page.html");
        assertEquals(links, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void getLinksFromFile3() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile4() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile5() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile6() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile7() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile8() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("a link on the first line");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile9() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("a link");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile101() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file101.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("`google.com");
        links.add("google.com");
        links.add("ucsd.edu");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile102() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file102.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("a.com");
        links.add("a.com(())");
        links.add("example.com");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile103() throws IOException{
        Path fileName = Path.of("/Users/ednaho/Documents/GitHub/ednafiles/test-file103.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");

    }
    
    
}