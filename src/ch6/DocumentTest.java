package ch6;

public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("javaTest");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
class Document {
    static int count = 0;
    String name;

    Document() {
        name = "제목없음" + ++count + ".txt";
        System.out.println(name);
    }
    Document(String name) {
        this.name = name + ".txt";
        System.out.println(this.name);
    }
}
