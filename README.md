# Java StarFinder #
Java StarFinder (JSF) is a unit test generation tool for programs that make extensive use of dynamically allocated data structures such as lists and trees. Users need to provide a precondition, an inductive predicate in separation logic, to describe the input data structure. JSF then performs symbolic execution on the program to generate test cases, and use the precondition to guide its search. "Star" in the name refers to the separating conjunction in separation logic, and there is "*Finder*" since JSF is developed as an extension of the [Java PathFinder](https://github.com/javapathfinder) framework. JSF was partially supported by the [Google Summer of Code 2017](https://summerofcode.withgoogle.com/archive/2017/projects/4789313736802304/) program.

## Publications
Algorithmic details:
- Long H. Pham, Quang Loc Le, Quoc-Sang Phan, Jun Sun, Shengchao Qin. **Poster: Testing Heap-Based Programs with Java StarFinder**. ICSE 2018. \[[PDF](http://qsphan.github.io/papers/icse18.pdf)\]
- Long H. Pham, Quang Loc Le, Quoc-Sang Phan, Jun Sun, Shengchao Qin. **Enhancing Symbolic Execution of Heap-based Programs with Separation Logic for Test Input Generation**. Preprint. \[[PDF](https://arxiv.org/pdf/1712.06025.pdf)\]  

Applications:
- Guolong Zheng, Quang Loc Le, ThanhVu Nguyen, Quoc-Sang Phan. **Automatic Data Structure Repair using Separation Logic**. JPF 2018. \[[PDF](http://star-finder.github.io/papers/jpf18.pdf)\]

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

### Usage ###
Try some examples in star/examples. Choose the files that end with Test.java and run it.
It will generate test files that end with 1.java.

### Questions and Issues ###
For common questions, bug reports, and feature requests, please use the [JPF Google Group](http://groups.google.com/group/java-pathfinder).
