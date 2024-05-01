In this assignment, I had a lot of problem in the beginning with Podman. For some reason my podman would not load, and it did not get fixed until it. Another problem that I often faced was that my mac was at intel i7 which meant I had to alter the commands like:


        -v $(pwd)/ggml-small.bin:/models/ggml-small.bin:ro \
       



instead of:

podman
        -v /local/path/to/self-hosted-llms/models/ggml-small.bin:/models/

Another problem that I often faced was that my packages were not up to date, so a lot of the times, I would have to update the packages online (pip install). The final problem that I encountered throughout this process is that my audio file did not work (probably because it was too big). After I was able to solve all my problems, I was able to complete the assignment!


/Users/suengo/Desktop/Screenshot\ 2024-05-01\ at\ 4.04.11 PM.png 
