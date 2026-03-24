package lab4;

public class Tanar
{
    private String name;
    private int age;
    private String address;

    Tanar(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\''
                ;
    }

}
