import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NameToEmbossTest {

    private final String name;
    private final boolean expected;

    public NameToEmbossTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][]{
                {"Иван Иванов", true},
                {"И И", true},
                {"Ив И", true},
                {"Алексей Афанасьевич", true},
                {"Алексей Афанасьеви", true},
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
