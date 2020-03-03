# Coding-task-solution
This is a spring batch application that orders N log files by date and outputs its result to the console

## Requirements
Java 11 or later
Intellij Idea or Eclipse IDE


## How to run it
you can run this app via command line with: 

`mvn clean spring-boot:run`

## Log files
The log lines in the log files used for testing this app must be in the following format

**2020-02-29T23:22:08Z, Lorem ipsum dolor sit amet consectetuer adipiscing elit.**

You can put your files in a folder called /logs/ in the same path as your project

You can also change the path on the BatchConfig class if you'd like:

`@Value("file:../logs/samplelog*.log")
    private Resource[] inputResources;`
    
**Depending on the size of your files it may take some time to finish printing everything into the console.
I tested it with 2,381,400 different records and it took around 20 minutes to finish but feel free to try to break it.**

**I didnt add many validations so please make sure the log files format is correct otherwise app is gonna break XD**

