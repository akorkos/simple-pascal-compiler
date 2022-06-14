import java.math.BigInteger;

public class Binary {
    private String number;
    public Binary(String number){
        this.number = number;
        this.number = this.number.toUpperCase();
        this.number = this.number.replace("0B","");
    }

    public Double getRealNumber() {
        String withoutPeriod = number.replace(".", "");
        double value = new BigInteger(withoutPeriod, 2).doubleValue();
        String binaryDivisor = "1" + number.split("\\.")[1].replace("1", "0");
        double divisor = new BigInteger(binaryDivisor, 2).doubleValue();
        return value / divisor;
    }

    public Integer getIntegerNumber(){
        return Integer.parseInt(number, 2);
    }
}
