package com.example.transition;

import com.example.transition.Class.Animal;
import com.example.transition.Class.Dog;
import com.example.transition.Interface.Action;
import com.example.transition.Interface.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransitionApplication.class, args);

        Animal animal = new Dog();  // 向上转型
        System.out.println(animal.getA());
        // no have animal.getNose()

        Dog dog = (Dog) animal; // 向下转型
        System.out.println(dog.getNose());
        System.out.println(dog.getA());
        //转型之后  Dog  和 父类（animal） 的方法都能调用
        System.out.println("---------------------------------");

        Action action = new People(); // 接口  向上转型
        System.out.println(action.dance());
        action.fly();

        People people = (People) action;  //接口 向下转型
        System.out.println(people.dance());
        people.fly();



	}

}
