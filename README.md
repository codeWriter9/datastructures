# Data structures
Maven project collection of different data structures.
The following have been implemented till date

1. Stack
2. Queue
3. Binary Search Tree

## Getting Started

Do a git clone 


### Prerequisites

You should only need a git client like git bash, an IDE, maven 3.x and certainly the Java platform with sdk


## Running the tests

run mvn clean install

### Break down into end to end tests

Current Tests are as follows

1. [Stack Test](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/StackTest.java) : A JUnit 
that tests if stack functions correctly

|JUnit|Feature Used|
|---|---|
|[StackTest.testStack](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/StackTest.java#L28) | push / pop functions correctly |
|[StackTest.testStack2](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/StackTest.java#L44) | push / pop intermixed |
|[StackTest.testStack3](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/StackTest.java#L70) | push / pop of 1M elements |


2. [Prime Numer Generator Test](https://github.com/codeWriter9/multithreading/blob/master/src/test/java/com/concepts/concurrency/multithreading/PrimeGeneratorTest.java):
A Junit that uses the Cyclic Barrier to use multiple threads to generate prime numbers

|JUnit|Feature Used|N|Number Of Primes|
|---|---|---|---|
|[PrimeGeneratorTest.testPrimeGeneratorsTiny](https://github.com/codeWriter9/multithreading/blob/master/src/test/java/com/concepts/concurrency/multithreading/PrimeGeneratorTest.java#L30) | Cyclic Barrier | 10 | 4 |
|[PrimeGeneratorTest.testPrimeGeneratorsTiny2](https://github.com/codeWriter9/multithreading/blob/master/src/test/java/com/concepts/concurrency/multithreading/PrimeGeneratorTest.java#L48) | Cyclic Barrier | 100 | 25 |
|[PrimeGeneratorTest.testPrimeGeneratorsSmall](https://github.com/codeWriter9/multithreading/blob/master/src/test/java/com/concepts/concurrency/multithreading/PrimeGeneratorTest.java#L66) | Cyclic Barrier | 1,000 | 168 |
|[PrimeGeneratorTest.testPrimeGeneratorsRegular](https://github.com/codeWriter9/multithreading/blob/master/src/test/java/com/concepts/concurrency/multithreading/PrimeGeneratorTest.java#L84) | Cyclic Barrier | 10,000 | 1,229 |
|[PrimeGeneratorTest.testPrimeGenerators](https://github.com/codeWriter9/multithreading/blob/master/src/test/java/com/concepts/concurrency/multithreading/PrimeGeneratorTest.java#L101) | Cyclic Barrier | 100,000 | 9,592 |
|[PrimeGeneratorTest.testPrimeGeneratorsLarge](https://github.com/codeWriter9/multithreading/blob/master/src/test/java/com/concepts/concurrency/multithreading/PrimeGeneratorTest.java#L118) | Cyclic Barrier | 1000,000 | 78,498 |



## Built With

* [Eclipse](https://www.eclipse.org/downloads/) - Integrated development Environment
* [Maven](https://maven.apache.org/) - Dependency Management


## Contributing

By Invitation only

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Sanjay Ghosh** - *Initial work* - [Datastructures](https://github.com/codeWriter9/datastructures)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details




