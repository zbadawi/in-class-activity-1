package edu.usc.csci310.ica.subjects.Land;

import edu.usc.csci310.ica.subjects.Animal;

import java.util.HashSet;
import java.util.Set;

public class Zoo {

	public static void main(String[] args) {
		Set<Animal> animals = new HashSet<Animal>();
		
		Animal a = new Bear();
		animals.add(a);
		Animal b = new Dinosaur();
		animals.add(b);
		Animal c = new Elephant();
		animals.add(c);
		Animal d = new Lion();
		animals.add(d);
		Animal e = new Panda();
		animals.add(e);
		
		for (Animal f:animals) {
			f.eat();
			f.makeNoise();
			f.move();
		}

	}

}
