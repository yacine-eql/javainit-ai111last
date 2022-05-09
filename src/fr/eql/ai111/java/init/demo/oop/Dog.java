package fr.eql.ai111.java.init.demo.oop;

public class Dog {

    // Attributs (variables d'instance)
    private String name;
    private int age;
    private float size;
    private float weight;
    private Toy toy;

    // Constructeurs
    // En l'absence de déclaration d'un constructeur, il y aura par défaut un constructeur
    // vide disponible.
    // Par contre, si un constructeur surchargé est déclaré, il faut déclarer (si besoin) un
    // constructeur vide.
    public Dog() {

    }

    // Constructeur surchargé
    public Dog(String name, int age, float size, float weight, Toy toy) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.toy = toy;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age, float size) {
        this.age = age;
        this.size = size;
    }

    public Dog(float weight, int age) {
        this.age = age;
        this.weight = weight;
    }

    // Méthodes
    protected void bark() {
        System.out.println("Ouaf Ouaf !");
    }

    public void fetchBall(int times) {
        System.out.println(name + " rapporte " + times + " fois la baballe.");
    }

    public float sizeWeightRatio() {
        return size / weight;
    }

    // Accesseurs et mutateurs (getters et setters)

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public Toy getToy() {
        return toy;
    }
    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", weight=" + weight +
                ", toy=" + toy +
                '}';
    }
}
