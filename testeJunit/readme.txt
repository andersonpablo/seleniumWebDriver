unit 4 has introduced a new feature Parameterized tests.Parameterized tests allow developer to run the same test over and over again using different values. There are five steps, that you need to follow to create Parameterized tests.

Annotate test class with @RunWith(Parameterized.class)

Create a public static method annotated with @Parameters that returns a Collection of Objects (as Array) as test data set.

Create a public constructor that takes in what is equivalent to one "row" of test data.

Create an instance variable for each "column" of test data.

Create your tests case(s) using the instance variables as the source of the test data.

The test case will be invoked once per each row of data. Let's see Parameterized tests in action.