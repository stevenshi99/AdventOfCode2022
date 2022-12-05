public class test {
    public static void main(String[] args) {
        String hello = "A Z";
        hello = hello.replace(" ", "");
        char[] arr = hello.toCharArray();
        for (char x : arr) {
            System.out.println(x);
        }
    }
}