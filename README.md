# android-library-test

[![CircleCI](https://circleci.com/gh/cerberillo/android-library-test.svg?style=shield)](https://circleci.com/gh/cerberillo/android-library-test)[![Coverage Status](https://coveralls.io/repos/github/cerberillo/android-library-test/badge.svg?branch=development)](https://coveralls.io/github/cerberillo/android-library-test?branch=master)

This is a tester project with working configuration for what I consider the minimum setup of a professional android project:

* 2 branch set up (master & development), this could be more complex if you want to play with Beta and Alpha branches and so on, but this is a very basic setup, but as said, minimum
    * master: Production version of the product
    * development: Next version of the product

* Continuous Integration Server validating all commits in the repository by executing tests
* Coverage status reports so any PR that's merged to any of the main branches should have AT LEAST the same coverage that the branch was having before merging.
* Automate deployment when needed

#### PROJECT SPECIFICATIONS

In this case, the configuration is:

 1. Continuous Integration with CircleCI
 2. Coverage status report using Coveralls.io that will validate every PR with coverage status report
 3. Automate deploy of library module to Bintray (for linking with jCenter)
 4. Automate deploy of library.demo project to Fabric

I left automate publishing deactivated because one never knows, so you need to manually publish builds, but It'll be pushing a button instead of uploading a build.

#### BINTRAY CONFIGURATION

In order to hide from public repositories sensible class like Bintray api key or Fabric api key or build secret, this project automatically reads from

#### MISCELANEA

Next step: auto increment build version, so it's not you're task

Please, if you have any suggestion, improvement or bug to report use this repository to communicate and don't hesitate to send a pull request