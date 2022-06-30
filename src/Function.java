import java.util.ArrayList;
import java.util.Objects;

public class Function {
    private final String ID;
    private SubProgrammTypes type;
    private ReturnType returnType = ReturnType.Void;
    private Integer numberOfParameters;
    public Function(String ID, Integer numberOfParameters, SubProgrammTypes type, ReturnType returnType){
        this.ID = ID;
        this.type = type;
        this.returnType = returnType;
        this.numberOfParameters = numberOfParameters;
    }
    public Function(String ID,  Integer numberOfParameters, SubProgrammTypes type){
        this.ID = ID;
        this.type = type;
        this.numberOfParameters = numberOfParameters;
    }
    @Override
    public String toString(){
        if (returnType == null)
            return "ID: " + this.ID + " | type: " + this.type + " | return: void";
        return "ID: " + this.ID + " | type: " + this.type + " | return: " + this.returnType;
    }
    @Override
    public int hashCode(){
        return ID.hashCode() + numberOfParameters.hashCode() + type.hashCode() + returnType.hashCode();
    }
}
