public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        try {
            return name.matches("^(?=.{3,19}$)[а-яА-ЯёЁ]+\\s[а-яА-ЯёЁ]+$");
        } catch (NullPointerException e) {
            return false;
        }
    }

}
