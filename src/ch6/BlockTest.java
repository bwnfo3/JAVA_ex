package ch6;

class BlockTest {
    //클래스 초기화 블럭
    static {
        System.out.println("클래스 초기화 블럭 실행 static{ }");
    }
    //클래스 초기화 블럭 끝
    //인스턴스 초기화 블럭 시작
    {
        System.out.println("인스턴스 초기화 블럭 실행 { }");
    }
    //인스턴스 초기화 블럭 끝
    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest()");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest()");
        BlockTest bt2 = new BlockTest();
    }
}
