public class Praktikum {

    public static void main(String[] args) {
        String nameToEmboss = "Иван Васильев ич";
        Account account = new Account(nameToEmboss);
        if (account.checkNameToEmboss()){
            System.out.println("Данные фамилию и имя МОЖНО использовать для печати на банковской карте");
        } else {
            System.out.println("Данные фамилию и имя НЕЛЬЗЯ использовать для печати на банковской карте");
        }
    }

}
