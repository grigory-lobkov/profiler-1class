# profiler
Time profiling java-agent to find most time spending methods

## Usage:
- Run any class once
- Go to Run -> Edit configurations
- VM options: `-javaagent:"PATH_TO_JAR\Profiler.jar"[=[INSPECTED_PACKAGE][;INSPECTED_CLASS1[;INSPECTED_CLASS2[;...]]]]`
- Run again to watch execution statistics


### Examples of VM options:

`-javaagent:"C:\Users\Grigory\IdeaProjects\profiler-1class\out\artifacts\Profiler\Profiler.jar"=;Heap;HeapTest`
  
`-javaagent:"C:\Users\Grigory\IdeaProjects\profiler-1class\out\artifacts\Profiler\Profiler.jar"=ru.progwards.java2.lessons.synchro.gc;Heap;HeapTest`
  
`-javaagent:"C:\Users\Grigory\IdeaProjects\profiler-1class\out\artifacts\Profiler\Profiler.jar"=ru.progwards.java2.lessons.synchro.gc`
  
`-javaagent:"C:\Users\Grigory\IdeaProjects\profiler-1class\out\artifacts\Profiler\Profiler.jar"`

## Compilation (not necessary - you can use Jar):
- Create artifact in you project: Ctrl+Alt+Shift+S -> Artifacts -> Add (Alt+Insert)
- Name: "Profiler"
- Manifest file: choose any folder
- Open manifest file in editor, add there line with Profiler class full path:

`Premain-Class: ru.progwards.java2.lessons.patterns.Profiler`

- Edit Profiler.rootPkg variable to mark, where to search for inspected classes
- Build -> Build Artifactis -> Build

### Compile dependency:
- [javassist](https://mvnrepository.com/artifact/org.javassist/javassist)

## Contribution
We are creating simple Profiler agent, easy to use and deploy, without dependencies. You are welcome to improve it. Target Java version is 1.5 for now.
