package Day2;

public class Person {
    private String name;
    private int Id ;
    private  int PhoneNum;
    private String Age ;
    private String State;
    public Person (){

    }

    public Person(String name, int id, int phoneNum, String age, String state) {
        this.name = name;
        Id = id;
        PhoneNum = phoneNum;
        Age = age;
        State = state;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public int getId() {
        return Id;
    }

    public void getId(int id) {
        Id = id;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}


