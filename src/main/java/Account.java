import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        Pattern pattern = Pattern.compile("^(?=.{3,19}$)[а-яА-ЯёЁ]+\\s[а-яА-ЯёЁ]+$");
        if (name != null) {
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        }
        return false;
    }
}