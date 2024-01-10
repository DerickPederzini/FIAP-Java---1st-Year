package havingFun;

public class Fun {
    private String name;
    private double money;
    private String state;


    public Fun(String name, double money, String local) {
        this.name = name;
        this.money = money;
        this.state = local;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

