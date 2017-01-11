# Java Problem Set: Mocking

## Background

Galvanize is writing an Object Relational Mapper. Unfortunately, our `SuperComplexDriver` is very slow, so we want to mock it when we write our `OrmTest`.

## Problem 1: Writing a Fake manually

Using what you're learned about Test Doubles (Fakes, Mocks, Stubs, etc) to write a FakeDriver, and inject it into `Orm` using constructor injection, then complete the `OrmTest` adding appropriate tests and assertions.

## Problem 2: Mocking with Mockito

Using what you're learned about Mockito to create a mock Driver, and inject it into `Orm` using constructor injection, then complete the `OrmTest` adding appropriate tests and assertions.

## Verification 
 
Run `gradle assess` to verify you were successful. 

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

