package com.java.assessments.generic.classes;

/*3)	(Generic Class Pair) Write a generic class Pair which 
has two type parameters—F and S— each representing the type of the 
first and second element of the pair, respectively. 
Add get and set methods for the first and second elements of the pair. 
[Hint: The class header should be public class Pair<F, S>.]*/
public class Pair <F,S>{
	F firstElement;
	S secondElement;
	
	public Pair(F firstElement, S secondElement) {
		super();
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}

	public F getFirstElement() {
		return firstElement;
	}

	public void setFirstElement(F firstElement) {
		this.firstElement = firstElement;
	}

	public S getSecondElement() {
		return secondElement;
	}

	public void setSecondElement(S secondElement) {
		this.secondElement = secondElement;
	}
}
