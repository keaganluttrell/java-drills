# Inheritance with Java

## Introduction

In this exercise you will **begin by implementing a few concrete classes** and **then refactor the common code** between them into a parent (super/base) class. All of the work in this exercise will be related to automotive parts.

Let's look at a few examples of [automotive parts](https://en.wikipedia.org/wiki/List_of_auto_parts#Engine_components_and_parts):

  1. A car engine has a `manufacturer`, `partNumber`, `description`, `displacement`, `compressionRatio`. Car engines may be either a `DieselEngine` or a `PetrolEngine`. The engine itself is just one of many Engine Components.
  1. A `Radiator` has a `manufacturer`, `partNumber`, `description`, and `coolantPressure`. `Radiator`s are part of the Cooling System for a car.
  1. Another component of the Cooling System for a car is the fan blade. A fan blade has a `manufacturer`, `partNumber`, `description`, `numberOfBlades`, and `diameterInCentimeters`.
  1. The camshaft is another Engine Component. It has a `manufacturer`, `partNumber`, `description`, `duration`, `lift`, and `timing`.

## Your Tasks

Complete each of the following tasks in order. At all points in this exercise you should be using TDD:

1. For each of the components outlined in the _Introduction_ section above, create a Java class. Begin by first doing this in a flat structure. Every class you write should have these methods:

  1. `fullDescription` - returns a `String` containing all of the attributes of the instance of that class listed. For example an instance of `Radiator` would return something like: `"manufacturer: Nissen Automotive, partNumber: 17117507972, description: The full-aluminum radiators from Nissens are produced on the basis of the latest and most advanced technologies, including fully automatic manufacturing and assembly lines, coolantPressure: 250 Pa"`
  1. `coolingSystemComponent` - returns a boolean indicating whether or not an instance of the class is a cooling system
  component.
  1. `engineComponent` - returns a boolean indicating whether or not an instance of the class is an engine component.

2. Refactor your code to use inheritance. Add tests for any Base classes that are introduced in this refactoring.

## Setup

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

To see if you have completed the assessment correctly, run:

```
gradle asses
```