public class Value {
    public static Value VOID = new Value(new Object());
    public static Value NULL = new Value(new Object());
    private DataType dataType;
    private Object value;

    public Value(Object value) {
        if (value instanceof DataType)
            this.dataType = (DataType) value;
        else
            this.value = value;
    }

    public Value(Object value, DataType dataType) {
        this.dataType = dataType;
        this.value = value;
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
        return (Double)value;
    }

    public Integer asInteger() {
        Double d = (Double)value;
        return d.intValue();
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public DataType getDataType(){
        return dataType;
    }

    public void setDataType(DataType dataType){
        this.dataType = dataType;
    }

    public Boolean isNUmeric(){
        return this.dataType.getDataType() == PrimativeDataTypes.Integer || this.dataType.getDataType() == PrimativeDataTypes.Real;
    }

    public void updateNumericValue(){


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
        return "Value: " + this.value + ", dataType: " + this.dataType;
    }

}

