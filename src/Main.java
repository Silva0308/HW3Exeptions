import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            DataGet.getData();

        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (ArrayCountElementException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }
}