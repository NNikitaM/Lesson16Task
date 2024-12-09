public class Main {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз", "раз");
        System.out.println(count);
        int count1 = check.numberOfRepeats("раз два три, раз два три", "раз"); // вернёт 2
        System.out.println(count1);
        int count2 = check.numberOfRepeats("Hello, world!", "goodbye"); // вернёт 0
        System.out.println(count2);
    }
}
