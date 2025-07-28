public class Customer {
    private String name;
    private String email;
    private String mobileNo;
    private Account account;


    public Customer(String name, String email, String mobileNo, Account account) {
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.account = account;
    }


    public Account getUserAccount() {
        return this.account;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name +
                "\nEmail: " + this.email +
                "\nMobile No: " + this.mobileNo +
                "\nAccount: " + this.account.toString();
    }
    
} 