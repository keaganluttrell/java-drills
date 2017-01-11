# Java Problem Set: Dependency Injection with Reflection

## Problem

Galvanize has decided to create it's own Dependency Injection Container. This `SimpleDiContainer` is instantiated with a number of dependencies, then when the `injectDependencies()` method is invoked, the container will set any properties with the `@Inject` annotation.

A test has been written, but the code is incomplete. Your task is to implement the `injectDependencies()` method in such a way that satisfies the test.
 
To complete this exercise, use what you learned about reflection, your IDE's debugging capabilities (try breakpoints and the `watch window`), the [Official Documentation](https://docs.oracle.com/javase/7/docs/api/java/lang/reflect/package-summary.html), and the existing code to figure out what you are unsure about.
 
Run `gradle test` to verify you were successful. 

## git Instructions

Begin by forking the repository from which you'll be working. The 'Fork' button is located in the upper right-hand corner of the repository's Github page. Once complete, you'll arrive at your Forked repository's Github page. There you'll find the link to the git repository by clicking the 'Clone or Download' button.

To set up your repository in git using HTTPS:

	git clone https://github.com/<your name>/java-drills.git

Or by using SSH:

	git clone git@github.com:<your name>/java-drills.git

Once you have cloned the repository, run the following command to verify the repository was successfully cloned:

	git config -l

In the output verify that the following line exists:

	remote.origin.url=git@github.com:<your name>/java-drills.git

Finally, create a branch in which you will do your work:

    git checkout -b solution

After you have completed the assessment, be sure to push your changes:

    git add .
    git commit -m "Completed Assessment"
    git push origin solution

