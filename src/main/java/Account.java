public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19) {
            if (!(name.startsWith(" ")) && !(name.endsWith(" "))) {
                if (nameContainsOnlyOneSpace(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean nameContainsOnlyOneSpace(String name) {
        char[] nameArray = name.toCharArray();
        int spaceCounter = 0;
        for (char c : nameArray) {
            if (c == ' ') {
                spaceCounter++;
            }
        }
        return spaceCounter == 1;
    }

}
