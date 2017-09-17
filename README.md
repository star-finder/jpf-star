# Java StarFinder #
Java StarFinder (JSF) is a unit test generation tool for programs that make extensive use of dynamically allocated data structures such as lists and trees. Users need to provide a precondition, an inductive predicate in separation logic, to describe the input data structure. JSF then performs symbolic execution on the program to generate test cases, and use the precondition to guide its search. *Star* in the name refers to the separating conjunction in separation logic, and there is *Finder* since JSF is developed as an extension of the Java PathFinder framework.

## Installation
We provide two ways of installing JSF:
* Virtual machine with Docker
* Installation on local machine

### Docker
Assuming you have [Docker](https://www.docker.com/) installed, simply run:

```bash
$ docker build -t star .
# Will take some time to build the image...
$ docker run -it star
```

### Local Machine ###
To run Java StarFinder you need Java PathFinder and Symbolic PathFinder. Go to Java PathFinder website then install the packages
jpf-core and jpf-symbc. After that, pull this repo and configure similar to jpf-symbc.

You can try some examples in star/examples. Choose the files that end with Test.java and run it.
It will generate test files that end with 1.java.

Note that you also need the solver S2SAT to run the examples. You should contact the authors of S2SAT to get the instructions
how to compile and run the solver.

The author of S2SAT can be contacted via email: lequangloc@gmail.com

### Who do I talk to? ###

You can contact repo admin if you have any questions.

Email: longph1989@gmail.com
