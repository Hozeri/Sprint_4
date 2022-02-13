import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class NameToEmbossNegativeTest {

    private final String name;

    public NameToEmbossNegativeTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][] {
                {"Ив"},
                {"Алексей Афанасьевичч"},
                {" Иван Иванов"},
                {"Иван Иванов "},
                {"Иван Иван ов"},
                {"ИванИванов"},
                {""}
        };
    }

    @Test
    public void checkNameToEmbossRangeDataTest() {
      Account account = new Account(name);
      boolean actual = account.checkNameToEmboss();
      assertFalse("Данные фамилию и имя МОЖНО использовать для печати на банковской карте", actual);
    }

}
