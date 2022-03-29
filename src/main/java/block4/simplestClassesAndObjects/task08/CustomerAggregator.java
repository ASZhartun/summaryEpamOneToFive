package block4.simplestClassesAndObjects.task08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class CustomerAggregator {
    private ArrayList<Customer> data;

    {
        this.data = new ArrayList<>();
    }

    public CustomerAggregator(Customer[] array) {
        this.data.addAll(Arrays.stream(array).toList());
    }

    public CustomerAggregator(Customer customer) {
        this.data.add(customer);
    }

    public CustomerAggregator() {

    }

    public ArrayList<Customer> getData() {
        return data;
    }

    public void alphabeticalSort() {
        this.data.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                String first = getFullName(o1);
                String second = getFullName(o2);
                return first.compareTo(second);
            }
        });
    }

    public void creditCardSort() {
        this.data.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getCreditCard().compareTo(o2.getCreditCard());
            }
        });
    }

    public ArrayList<Customer> getSpecifyCreditCards(String bottom, String top) {
        ArrayList<Customer> sample = new ArrayList<>();
        for (Customer human :
                this.data) {
            String creditCard = human.getCreditCard();
            if (creditCard.compareTo(bottom) >= 0 && creditCard.compareTo(top) <= 0) {
                System.out.println(human);
                sample.add(human);
            }
        }
        return sample;
    }

    public void addCustomer(Customer customer) {
        this.data.add(customer);
    }

    public void addCustomer(Customer[] customers) {
        this.data.addAll(Arrays.stream(customers).toList());
    }

    public void addCustomer(Collection<? extends Customer> customers) {
        this.data.addAll(customers);
    }

    public void printData() {
        for (Customer item :
                this.data) {
            System.out.println(item);
        }
    }

    private String getFullName(Customer customer) {
        StringBuilder fullName = new StringBuilder();
        fullName.append(customer.getLastName());
        fullName.append(" ");
        fullName.append(customer.getName());
        fullName.append(" ");
        fullName.append(customer.getSecondName());
        return fullName.toString();
    }
}
