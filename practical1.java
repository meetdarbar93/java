
public class practical1 {

    public static void main(String[] args) {
        String[] num = { "123", "456", "abc", "789" };
        int sum = 0;
        for (int i = 0; i <= num.length; i++) {
            try {
                sum += Integer.parseInt(num[i]);
            } catch (NumberFormatException e) {
                System.out.println("Number format error");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Array Error");
            } finally {
                System.out.println("i = " + i);
            }
        }
        System.out.println("Sum = " + sum);
    }
}
