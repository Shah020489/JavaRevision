package com.object.oriented;

public class Student {

    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void show(){
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
        Student shakeel=new Student(123,"Shakeel");
        shakeel.show();
        Student jameel=new Student(120,"Jameel");
        jameel.show();
        Student Wazeer=new Student(118,"Wazeer");
        Wazeer.show();
    }
}
