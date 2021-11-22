// dummy class, to be replaced by a later implementation

package shared;

public class Transaction
  {
    private String name;
    private long accountNumber;
    private float amount;
    private String type;

    public Transaction(String name)
      {
        this.name = name;
      }

    public String getName()
      {
        return name;
      }

    public void setName(String name)
      {
        this.name = name;
      }

    public long getAccountNumber()
      {
        return accountNumber;
      }

    public void setAccountNumber(long accountNumber)
      {
        this.accountNumber = accountNumber;
      }

    public float getAmount()
      {
        return amount;
      }

    public void setAmount(float amount)
      {
        this.amount = amount;
      }

    public String getType()
      {
        return type;
      }

    public void setType(String type)
      {
        this.type = type;
      }
  }
