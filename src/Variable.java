import java.util.Objects;

public class Variable {
    private final String ID;
    private String Scope;

    public Variable(String ID, String Scope){
        this.ID = ID;
        this.Scope = Scope;
    }

    public String getScope() {
        return Scope;
    }

    public String getID() {
        return ID;
    }

    public void setScope(String scope) {
        Scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        return Objects.equals(ID, o.toString());
    }

    @Override
    public String toString(){
        return "ID: " + this.ID + " | scope: " + this.Scope;
    }
}
