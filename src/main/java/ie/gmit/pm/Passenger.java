package ie.gmit.pm;

public class Passenger {

    private String title;
    private String name;
    private String passengerId;
    private int phone;
    private int age;

    public Passenger(String title, String name, String id, int phone, int age) {
        setTitle(title);
        setName(name);
        setPassengerId(id);
        setPhone(phone);
        setAge(age);
    }

    public void setTitle(String title) {
        if(title.equalsIgnoreCase("mr") || title.equalsIgnoreCase("mrs") ||
                title.equalsIgnoreCase("ms")) {
            this.title = title;
        }else{
            throw new IllegalArgumentException("Passenger title is invalid");
        }
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }else{
            throw new IllegalArgumentException("Passenger name is invalid");
        }
    }

    public void setPassengerId(String passengerId) {
        if(passengerId.length() >= 10) {
            this.passengerId = passengerId;
        }else{
            throw new IllegalArgumentException("Passenger id not valid");
        }
    }

    public void setPhone(int phone) {
        int numberCount = String.valueOf(phone).length();
        if(numberCount >= 10) {
            this.phone = phone;
        }else{
            throw new IllegalArgumentException("Phone number incorrect");
        }
    }

    public void setAge(int age) {
        if(age > 16) {
            this.age = age;
        }else{
            throw new IllegalArgumentException("Passenger under valid age");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }


}
