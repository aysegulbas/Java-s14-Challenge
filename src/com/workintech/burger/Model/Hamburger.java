package com.workintech.burger.Model;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;

        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = "Normal";
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }
    @Override
    public void addAddition(String additionName, double price) {
if(addition1==null){
    this.addition1=new Addition(additionName,price);
}else if(addition3==null){
            this.addition2=new Addition(additionName,price);
        }
else if(addition3==null){
    this.addition3=new Addition(additionName,price);
}else if(addition4==null){
    this.addition4=new Addition(additionName,price);
}
    }




    public String itemize() {
        StringBuilder builder = new StringBuilder();
        builder.append("********************\n");
        builder.append("Name: "+name+"\n");
        builder.append("Meat: "+meat+"\n");
        builder.append("BreadRollType: "+breadRollType+"\n");
        if (addition1 != null) {//additionlar zorunlu değil o yüzden else if yapılmadı, ayrıca ilk null olmayanda append yapar sonrakilere bakmazdı. Else if'de bir condition doğrudur
            builder.append("Addition1: "+addition1.getAdditionName()+"\n");
            price=price+addition1.getAdditionPrice();
        }
        if (addition2 != null) {
            builder.append("Addition2: "+addition2.getAdditionName()+"\n");
            price=price+addition2.getAdditionPrice();
        }
        if (addition3 != null) {
            builder.append("Addition3: "+addition3.getAdditionName()+"\n");
            price=price+addition3.getAdditionPrice();
        }
        if (addition4 != null) {
            builder.append("Addition4: "+addition4+"\n");
            price=price+addition4.getAdditionPrice();
        }
        return builder.toString();
    }
    public double itemizeHamburger(){
        String explanation=itemize();
        System.out.println(explanation);
        System.out.println("Price: "+getPrice());
        return getPrice();
    }


}
