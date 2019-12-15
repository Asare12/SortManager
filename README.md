# SortManager
Java application which contains various sorting algorithms.

## Algorithms
* Bubblesort
* Quicksort
* Mergesort
* Bubblesort
* Binary Search Tree

## Prerequisites
```
You'll need to create a JAR file from the following binary search tree project: https://github.com/Asare12/BinaryTreeSearch
and add this as a module dependancy for this project 
```
## Running the tests
Performance tests

```java
    @BeforeClass
    public static void classSetup(){
        Random random = new Random();
        arrayToSort = new int[100];
        for (int i = 0; i < arrayToSort.length; i++){
            arrayToSort[i] = random.nextInt(1000)+1;
        }
    }
```

Testing each sorter to see which sorter sorts in the quickest time.

```java

    @Test
    public void testBubbleSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new BubbleSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);

    }
    @Test
    public void testMergeSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new MergeSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);

    }

    @Test
    public void testInsertionSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new InsertionSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);

    }
    @Test
    public void testBinaryTreeSorter(){
        System.out.println("**************" + Arrays.toString(unsortedArray) + "****************");
        Sorter sorter = new BinaryTreeSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortingArray(unsortedArray);
        long end = System.nanoTime();
        printResult( sorter.toString(), end - start, sortedArray);
```

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management




