public class Dog {
    private String name;
    private String breed;
    private byte age;

    public void run(){
        IO.println(String.format("I show ,Run....."));
    }
    public void brak(int round){
        for(int i=1;i<=round;i++){
            IO.print(String.format("Hong! "));
        }
        IO.println();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(byte age){
        this.age = age;
    }

    public byte getAge(){
        return this.age;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }
}
