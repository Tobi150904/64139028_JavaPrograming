package Bai1;

import java.util.ArrayList;

public class PhoneBook extends Phone {

    ArrayList<Contact> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (Contact c : PhoneList) {
            if (c.getName().equals(name)) {
                if (!c.getPhone().contains(phone)) {
                    c.setPhone(c.getPhone() + " : " + phone);
                }
                return;
            }
        }
        PhoneList.add(new Contact(name, phone));
    }

    @Override
    public void removePhone(String name) {
        PhoneList.removeIf(c -> c.getName().equals(name));
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (Contact c : PhoneList) {
            if (c.getName().equals(name)) {
                c.setPhone(newphone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (Contact c : PhoneList) {
            if (c.getName().equals(name)) {
                System.out.println(c.getPhone());
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại của " + name);
    }

    @Override
    public void sort() {
        PhoneList.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
        System.out.println("Danh sách sau khi sắp xếp:");
        for (Contact c : PhoneList) {
            System.out.println(c);
        }
    }
}
