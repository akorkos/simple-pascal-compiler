public class DataType {
    private PrimativeDataTypes DataType;

    public DataType(String dt){
        switch (dt){
            case "integer" -> this.DataType = PrimativeDataTypes.Integer;
            case "real"-> this.DataType = PrimativeDataTypes.Real;
            case "char"-> this.DataType = PrimativeDataTypes.Char;
            case "boolean" -> this.DataType = PrimativeDataTypes.Boolean;
        }
    }

    public PrimativeDataTypes getDataType() {
        return DataType;
    }

    @Override
    public String toString(){
        if (this.DataType == null)
            return "NULL";
        return this.DataType.toString();
    }
}
