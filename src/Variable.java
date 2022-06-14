import java.util.Objects;

public class Variable {
    private String ID, Scope;
    private DataType DataType;

    public Variable(String ID, String Scope){
        this.ID = ID;
        this.Scope = Scope;
    }

    public String getScope() {
        return Scope;
    }

    public PrimativeDataTypes getDataType() {
        return DataType.getDataType();
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
        return "ID: " + this.ID + ", datatype: " + this.DataType + ", scope: " + this.Scope + "\n";
    }
}
