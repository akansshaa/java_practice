public class stringTest {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("i'm learning");
        str.append("strings in java.");
        System.out.println( str.toString());
    }

    @Override
    public String toString() {
        return "stringTest []";
    }
}
