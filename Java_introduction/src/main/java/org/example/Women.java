package org.example;

public class Women extends Person{
    public static final String gender  = "women";
    private String addtionalInfo;
    public Women(int age, String name, String profession) {
        super(age, name, profession);
    }

    @Override
    public String getName(){
        return name;
    }
    public static String getGender(){
        return gender;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(" Gender:" + getGender());
    }
    @Override
    public void displayInformation(String additionalInfo){
        System.out.print("Name: " + getName() + ", Age: " + getAge() + ", Profession:" + getProfession());
        System.out.println(" Additional info:" + additionalInfo);
    }
}
