package dsabootcamp.multithrading;
/* Main thread is the most imp thread in java
It is executed when ever a java program is start
Every program must contain this thread for its execution to take place
Java main thread is need because of the following reasons
1. From this other "child" threads are spawned
2. It must be the last thread to finish execution i.e when the main thread stops program terminates  */

                             /*                                 JVM
                                                               /  \
                                                 start()  /          \  start()
                                         Main Thead   /                 \   Other Demon Thread
                                             /\
                                 start()   /     \   start()
                                        /         \
                             Child Thread A        Child Thread B
                                /
                             /
                        /
                   Child Thread C   */


public class MainThread {

}
