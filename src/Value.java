public class Value {
    public static Value VOID = new Value(new Object());
    public static Value NULL = new Value(new Object());
    private DataType dataType;
    private Object value;
    private String type;

    public Value(Object value) {
        if (value instanceof DataType)
            this.dataType = (DataType) value;
        else
            this.value = value;
        this.type = null;
    }

    public Value(Object value, DataType dataType) {
        this.dataType = dataType;
        this.value = value;
        this.type = null;
    }

    public Value(DataType dataType, String type) {
        this.type = type;
        this.dataType = dataType;
    }

    public void updateValue(Object value) {
        this.value = value;
    }

    public Character asChar(){
        return (Character)value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        return ((Number)value).doubleValue();
    }

    public Integer asInteger() {
        return ((Number)value).intValue();
    }

    public DataType getDataType(){
        return dataType;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        if (this.type != null) {
            if (this.type.equals("Set") || this.type.equals("Array"))
                return " | dataType: " + this.dataType + "| type: " + this.type;
            if (this.type.equals("Record") || this.type.equals("SubArea") || this.type.equals("EnumStruct"))
                return " | type: " + this.type;
        }
        if (this.value == null)
            return " | value is not set yet | dataType: " + this.dataType;
        return " | value: " + this.value + " | dataType: " + this.dataType;
    }

}

