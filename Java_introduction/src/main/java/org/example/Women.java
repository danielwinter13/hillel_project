package org.example;

public class Women extends Person implements Displayable {
    public static final String gender  = "women";
    public Women(int age, String name, String profession) {
        super(age, name, profession);
    }
    public static String getGender(){
        return gender;
    }
    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Profession:" + getProfession() + " gender: " + getGender());
    }
}
