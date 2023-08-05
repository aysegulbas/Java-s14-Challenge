package com.workintech.burger.Model;

public class DeluxeBurger extends Hamburger{
    private String drink;
    private String cips;

    public DeluxeBurger() {//mainde içi boş olsun istiyor, o yüzden bizde manuel değiştirdik
        super("DeluxeBurger",19.10,BreadRollType.DOUBLE_BURGER);//superden kaçış yok
       super.setMeat("Double");//set ile koşul koyabileceğimiz için set kullandık.read mede meat double istiyordu

    }

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Malzeme eklenemez");
    }
}
