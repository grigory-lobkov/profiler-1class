package profiler;

/**
 * VM options:
 * -javaagent:"C:\Users\Grigory\IdeaProjects\profiler-1class\out\artifacts\Profiler\Profiler.jar"=;Example1sleeps
 */
public class Example1sleeps {

    public Example1sleeps(int count) {
        for(int i=0; i<count; i++)
            sleep(100+count);
    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Example1sleeps e = new Example1sleeps(5);
    }
}
/*
transformClass(profiler.Example1sleeps)

ClassName                              Total,ms Self,ms Count
Example1sleeps.sleep(int)                   531     531     5
Example1sleeps.main(java.lang.String[])     532       1     1
Example1sleeps(int)                         531       0     1

Process finished with exit code 0
 */