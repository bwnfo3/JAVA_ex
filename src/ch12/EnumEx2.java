package ch12;
enum Direction {
    EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");

    private static Direction[] DIR_ARR = Direction.values();
    //Direction.values() -> 열거형의 모든 상수를 배열에 담아서 반환
    private final int value;
    private final String symbol;

    Direction(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }
    public int getValue() { return value; }
    public String getSymbol() { return symbol; }
    public static Direction of(int value) {
        if( value < 0 || value > 4) {
            throw new IllegalArgumentException("Invlide value : " + value);
        }
        else {
            return DIR_ARR[value -1];
        }
    }
    public Direction rotate(int num) {
        num = num % 4;
        if(num <0) num += 4;
        return DIR_ARR[(value + num -1) % 4];
    }
    public String toString() { return name()+getSymbol(); }
}
class EnumEx2 {
    public static void main(String[] args) {
        for(Direction d : Direction.values()) {
            System.out.printf("%s=%s%n",d.name(),d.getValue());
        }
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());

        System.out.println(Direction.EAST.rotate(1));
        System.out.println(Direction.EAST.rotate(2));
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));
    }
}
