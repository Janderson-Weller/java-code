package Person;

public class Person {
    private String name;
    private int age;
    private String CPF;

    public Person(String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.CPF =  cpf;
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

    public static void main(String[] Args) {
        Person p1 =  new Person("Janderson Weller", 21, "023.456.456-23");
        System.out.println("Olá " + p1.getName() + "," + " seja bem vindo!");
        System.out.println("Seu CPF é: " + p1.getCPF() + " Sua idade é " + p1.getAge());
    }
}
