public class Constant {
    private String name, type, scope;

    public Constant(String name, String type, String scope){
        this.name = name;
        this.scope = scope;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getScope() {
        return scope;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Type: " + this.type + " Scope: " + this.scope;
    }
}
