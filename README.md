# Data structures
Maven project collection of different data structures.
The following have been implemented till date

1. [Stack](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/main/java/org/ghosh/sanjay/datastructures/Stack.java)
2. [Queue](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/main/java/org/ghosh/sanjay/datastructures/Queue.java)
3. [Binary Search Tree](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/main/java/org/ghosh/sanjay/datastructures/BinaryTree.java)

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


2. [Queue Test](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/QueueTest.java):
A Junit that checks if the queue functions correctly

|JUnit|Feature Used|
|---|---|
|[QueueTest.testQueue](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/QueueTest.java#L27)|enqueue/dequeue functions correctly|
|[QueueTest.testQueue2](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/QueueTest.java#L44)|enqueue/dequeue intermixed|
|[QueueTest.testQueue3](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/QueueTest.java#L69)|enqueue/dequeue of 1M elements|


3. [BinaryTreeTest](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java):
A Junit that checks if the binary tree functions correctly

|JUnit|Feature Used|
|---|---|
|[BinaryTreeTest.testInsertTree](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L30)|insertion functions correctly|
|[BinaryTreeTest.testLevelOrder](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L46)|level order maintained correctly|
|[BinaryTreeTest.testInOrderAndPreOrderAndPostOrder](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L62)|traversal - inorder/pre-order/post-order|
|[BinaryTreeTest.testInsertTreeAndTreeTraversal](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L79)|insert and inorder/pre-order/post-order|
|[BinaryTreeTest.testSearchTree](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L113)|search - root node / random node|
|[BinaryTreeTest.testSearchNullTree](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L128)|search - null/empty tree|
|[BinaryTreeTest.testLeftTreeDeleteNode](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L141)|delete - left node|
|[BinaryTreeTest.testRightTreeDeleteNode](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L161)|delete - right node|
|[BinaryTreeTest.testDeleteRootNode](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L181)|delete - root node|
|[BinaryTreeTest.testEmptyTree](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L201)|delete - empty tree|
|[BinaryTreeTest.testInOrderPredecessor](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L218)|inorder predecessor|
|[BinaryTreeTest.testMinima](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L233)|check minima|
|[BinaryTreeTest.testMaxima](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L247)|check maxima|
|[BinaryTreeTest.testHeight](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L260)|check height|
|[BinaryTreeTest.testBalanceFactor](https://github.com/codeWriter9/datastructures/blob/master/datastructures/src/test/java/org/ghosh/sanjay/datastructures/BinaryTreeTest.java#L271)|check balance factor|

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




