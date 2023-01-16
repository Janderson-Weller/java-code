package Person;

public class Person {
    private String name;
    private int age;
    private String CPF;
    private String country;

    public Person(String name, int age, String cpf, String country) {
        this.name = name;
        this.age = age;
        this.CPF =  cpf;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public static void main(String[] Args) {
        Person p1 =  new Person("Janderson Weller", 21, "023.456.456-23", "Brazil");
        System.out.println("Olá " + p1.getName() + "," + " seja bem vindo!");
        System.out.println("Seu CPF é: " + p1.getCPF() + " Sua idade é " + p1.getAge() + " País de oringem: " + p1.getCountry());
    }
}
