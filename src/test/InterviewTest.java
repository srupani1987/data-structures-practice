package test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InterviewTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Employee> employees = Arrays.asList(new Employee("Sresh", "dept1"),
                new Employee("aaaa", "dept1"),
                new Employee("bbbbb", "dept1"),
                new Employee("cccccc", "dept2"),
                new Employee("dddd", "dept2"),
                new Employee("eeeee", "dept1"),
                new Employee("fffff", "dept2"),
                new Employee("ggggg", "dept3"),
                new Employee("hhhhhh", "dept1"),
                new Employee("iiiii", "dept3"));

        Runnable runnable = () -> {
            employees.forEach(employee -> {
                System.out.println(employee.getName());
                System.out.println(Thread.currentThread().getName());
            });
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(runnable);

        Callable<String> callable = () -> {
            return "Test reting from callable...";
        };

        Future<String> submit = executorService.submit(callable);
        String s = submit.get();
        System.out.println(s);

        swapTwoString();
    }




    public static void swapTwoString() {
        String str1 = "Suresh";;
        String str2 = "R";

        str1 = str1 + str2;

        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println( str1 +" : "+ str2);
    }


}
