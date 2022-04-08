package main.java.com.epam.training.classes.mainTask;

class Customer {
    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private final int id = idGenerator;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String address;
    private final long cardNumber;
    private final long bankAccount;

    Customer(String name, String surname, String patronymic, String address, long cardNumber, long bankAccount) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getAddress() {
        return address;
    }
    public long getCardNumber() {
        return cardNumber;
    }
    public long getBankAccount() {
        return bankAccount;
    }
    public String toString() {
        return String.format("id: %2d %10s %15s\t %12s\t %10s\t card number %18d\t bank account %d",
                id, name, surname, patronymic, address, cardNumber, bankAccount);
    }
}
