import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NameToEmboss {

    private final String name;
    private final boolean expected;

    public NameToEmboss(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][]{
                //позитивные проверки
                {"Иван Иванов", true},
                {"И И", true},
                {"Ив И", true},
                {"Алексей Афанасьевич", true},
                {"Алексей Афанасьеви", true},
                //негативные проверки
                {"Ив", false},
                {"Алексей Афанасьевичч", false},
                {" Иван Иванов", false},
                {"Иван Иванов ", false},
                {"Иван Иван ов", false},
                {"ИванИванов", false},
                {"", false},
                {null, false}
        };
    }

    @Test
    public void checkNameToEmbossRangeDataTest() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

}
