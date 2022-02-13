import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class NameToEmbossPositiveTest {

    private final String name;

    public NameToEmbossPositiveTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][] {
                {"Иван Иванов"},
                {"И И"},
                {"Ив И"},
                {"Алексей Афанасьевич"},
                {"Алексей Афанасьеви"},
        };
    }

    @Test
    public void checkNameToEmbossRangeDataTest() {
      Account account = new Account(name);
      boolean actual = account.checkNameToEmboss();
      assertTrue("Данные фамилию и имя НЕЛЬЗЯ использовать для печати на банковской карте", actual);
    }

}
