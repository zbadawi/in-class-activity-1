package edu.usc.csci310.ica.subjects.Water;

import edu.usc.csci310.ica.subjects.Animal;

import java.util.HashSet;
import java.util.Set;

public class Sea {

	public static void main(String[] args) {
		Set<Animal> animals = new HashSet<Animal>();
		
		Animal a = new Clownfish();
		animals.add(a);
		Animal b = new Crab();
		animals.add(b);
		Animal c = new Dolphin();
		animals.add(c);
		Animal d = new Shark();
		animals.add(d);
		Animal e = new Whale();
		animals.add(e);
		
		for (Animal f:animals) {
			f.eat();
			f.makeNoise();
			f.move();
		}
		
		System.out.println("The Sea, once it casts its spell, holds one in its net of wonder forever.");

	}

}
