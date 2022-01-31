import java.util.Objects;

public class Test {

    private final int ID;
    private final String NAME;


    public Test(int ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, NAME);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()){
            return false;
        }
        Test temp = (Test) obj;
        return ID == temp.ID && NAME == temp.NAME && NAME.equals(temp.NAME);
    }

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }
}
