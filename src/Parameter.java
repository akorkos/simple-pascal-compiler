import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parameter {
    private Map<Variable, Value> parameters;
    public Parameter(){
        this.parameters = new HashMap<>();
    }
    public void addParameter(Variable parameter, Value value){
        this.parameters.put(parameter, value);
    }
    public boolean isEmpty(){
        return this.parameters.isEmpty();
    }

    @Override
    public String toString(){
        return " | parameters: " + parameters.keySet();
    }
}
