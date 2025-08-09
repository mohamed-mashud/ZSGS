public class User {
    private int uid;
    private String name;
    private String PIN;
    private long balance;

    private static int userCount = 0;
    private static final long MIN_BALANCE = 2_000;

    public User(String name) {
        this.uid = ++userCount;
        this.name = name;
        this.balance = MIN_BALANCE;
        this.PIN = String.format("%04d", generatePIN());
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    private int generatePIN() {
        return (int) (Math.random() * 10_000);
    }

    public int getUID() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getPIN() {
        return this.PIN;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", PIN='" + PIN + '\'' +
                ", balance=" + balance +
                "}\n";
    }
}
