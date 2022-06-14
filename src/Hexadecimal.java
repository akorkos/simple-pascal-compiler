public class Hexadecimal {
    private String number;
    public Hexadecimal(String number){
        this.number = number;
        this.number = this.number.toUpperCase();
        this.number = this.number.replace("OH", "");
        String[] temp = this.number.split("[.]");
        this.number = temp[0];
    }

    public Double getRealNumber() {
        return (double) Integer.parseInt(number, 16);
    }

    public Integer getIntegerNumber(){
        return Integer.parseInt(number, 16);
    }
}
