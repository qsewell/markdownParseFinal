import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;

public class MarkdownParseTest1 {
    @Test
    public void getLinks() throws IOException {
        Path fileName = Path.of("test-file-final.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }
    @Test
    public void getLinks2() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks3() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://www.microsoft.com/en-us/store/apps/windows");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks4() throws IOException {
        Path fileName = Path.of("test-file2v2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks5() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks6() throws IOException {
        Path fileName = Path.of("test-file3v2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks7() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks8() throws IOException {
        Path fileName = Path.of("test-file4v2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks9() throws IOException {
        Path fileName = Path.of("test-file5v2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks10() throws IOException {
        Path fileName = Path.of("test-file6v2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks11() throws IOException {
        Path fileName = Path.of("test-file7v2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks12() throws IOException {
        Path fileName = Path.of("test-file8v2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("alinkonthefirstline");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks13() throws IOException {
        Path fileName = Path.of("test-file-for-lab-1.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("`google.com");
        expected.add("google.com");
        expected.add("ucsd.edu");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks14() throws IOException {
        Path fileName = Path.of("test-file-for-lab-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("a.com");
        expected.add("a.com(()))");
        expected.add("example.com");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }

    @Test
    public void getLinks15() throws IOException {
        Path fileName = Path.of("test-file-for-lab-3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://twitter.com");
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        expected.add("https://cse.ucsd.edu/");
        assertEquals(expected, MarkdownParse1.getLinks(content));
    }
}
