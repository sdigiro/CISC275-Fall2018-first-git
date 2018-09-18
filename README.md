# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	An array list of type Dog called dogs
	A new dog named Fido with 4 legs
	A new dog named Fido with 3 legs
	A new dog named Alfie with 4 legs
	A new animal

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
	The comparator is called in Collections.sort(dogs, new Animal());
	There is no class definition for the comparator because a comparator is an interface, not a class.
