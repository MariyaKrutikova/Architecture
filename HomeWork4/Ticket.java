public class Ticket {
    
    
    public int rootNumber;

    public int place;

    public int price;

    public String date;

    public boolean isValid;

    public Ticket(int rootNumber, int place, int price, String date, boolean isValid) {
        this.rootNumber = rootNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }

    public Ticket() {
        System.out.println("Создан билет");
    }

    
    public int getRootNumber() {
        return rootNumber;
    }
    public void setRootNumber(int rootNumber) {
        this.rootNumber = rootNumber;
    }
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public boolean isValid() {
        return isValid;
    }
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Билет: " + rootNumber + ", место: " + place + ", стоимость: " + price + ", дата: " + date
                + ", свободен: " + isValid;
    }    

}