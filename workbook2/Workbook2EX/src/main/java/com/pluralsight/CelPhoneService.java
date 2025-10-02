package com.pluralsight;

public class CelPhoneService {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone();
        c1.setPhoneNumber("323-777-9999");
        c1.setOwner("Cater Diamond");

        CellPhone c2 = new CellPhone();
        c2.setPhoneNumber("626-666-0101");
        c2.setOwner("Lillia Vanrouge");

        c1.display(c1);
        c2.display(c2);

        c1.dial(c2.getPhoneNumber());
        c2.dial(c1.getPhoneNumber());

    }

}
