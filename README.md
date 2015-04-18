# Helpee-Android-
A test app written in Java using Android Studio

In the project I am only importing Parse and creating a few test methods. 

I had another Android project where I built a Class around an singelton. 
I used this singelton to make data available throughout the rest of the app. 
I also wrote a series of test cases to test every feature I wanted to create. 

All of that worked perfect, but while trying to figure out git versioning, I 
deleted the files by accident. Somehow issuing "git rm -r ." while I was 
inside of the terminal and in the src/main/java/com/lgmra/helpee directory, 
deleted the files. I have used that command to check what is in my commit
cache in the past alot and it worked fine every other time; that is it just
errored out and printed the files that could not be deleted since they are
staged in the cache. If I wanted to delete the cached files I know I can 
issue "git rm -r --cached ." to remove everything in there. When I delete
files from the terminal I always only use rm filename or rm -rf for the entire
directory. 
