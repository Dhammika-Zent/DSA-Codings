public class Employee {
    int id;
    String name;
    String address;
    int age;
    Employee (int id, String name, String address, int age){
        this.id =id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public int getId() {return id;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public int getAge() {return age;}

    public void display (){
        System.out.println("ID" +id+ "Name:" +name + "Address" +age);
    }

    
}
