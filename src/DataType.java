public class DataType {
    private PrimativeDataTypes DataType;

    public DataType(String dt){
        switch (dt){
            case "integer" -> this.DataType = PrimativeDataTypes.Integer;
            case "real"-> this.DataType = PrimativeDataTypes.Real;
            case "char"-> this.DataType = PrimativeDataTypes.Char;
            case "boolean" -> this.DataType = PrimativeDataTypes.Boolean;
            case "enum" -> this.DataType = PrimativeDataTypes.Enum;
            default -> this.DataType = PrimativeDataTypes.DefinedType;
        }
    }

    public PrimativeDataTypes getDataType() {
        return DataType;
    }

    @Override
    public String toString(){
        if (this.DataType == PrimativeDataTypes.DefinedType)
            return "dataType is defined by the user (i.e. Type)";
        return this.DataType.toString() + " ";
    }
}
