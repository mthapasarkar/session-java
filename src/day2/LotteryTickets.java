package day2;

public class LotteryTickets {
    private String number;
    private long date;
    private long time;
    private String name;
    private float amount;
    private String barCode;
    private String serialNumber;
    private String type;
    private String companyName;

    public String getNumber() {
        return number;
    }

    public void setNumber(String s) {
        this.number = number;
    }

    public long getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime() {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}