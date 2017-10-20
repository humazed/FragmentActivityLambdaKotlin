# FragmentActivityLambdaKotlin
The kotlin way of doing the same as https://medium.com/groupon-eng/from-fragments-to-activity-the-lambda-way-32c768c72aa9

I replaced the interface with function as they natively supported in kotlin.
and each lambda on JVM internally is serializable, so it’s safe to cast lambdas or function expressions to java.io.Serializable.
https://discuss.kotlinlang.org/t/are-closures-serializable/1620/2
