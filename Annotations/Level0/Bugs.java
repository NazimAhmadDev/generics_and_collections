package week4_assignment6;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description() default "No bug";
}

class Bug {
    @BugReport(description = "Null pointer exception occurs")
    @BugReport(description = "Incorrect message occurs")
    void showBug(){
        System.out.println("Bugs are revealed");
    }
}


public class Bugs {
    public static void main(String[] args) throws Exception{
        Method methods = Bug.class.getDeclaredMethod("showBug");
        BugReport[] bugReports = methods.getDeclaredAnnotationsByType(BugReport.class);

        System.out.println("Bugs found in method : "+ methods.getName());
        for (BugReport bug : bugReports) {
            System.out.println(" - " + bug.description());
        }
    }
}




