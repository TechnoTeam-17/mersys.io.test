![Maven Central](https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java?versionSuffix=4.11.0&label=Selenium)
![Maven Central](https://img.shields.io/maven-central/v/io.cucumber/cucumber-java?versionSuffix=7.9.0&label=Cucumber)
![Maven Central](https://img.shields.io/maven-central/v/org.testng/testng?versionSuffix=7.7.0&label=TestNG)
![Maven Central](https://img.shields.io/maven-central/v/org.slf4j/slf4j-api?versionSuffix=1.8.0-beta2&label=Slf4j)
![Maven Central](https://img.shields.io/maven-central/v/org.apache.commons/commons-lang3?versionSuffix=3.12.0&label=Apache%20Commons)
![Maven Central](https://img.shields.io/maven-central/v/tech.grasshopper/extentreports-cucumber7-adapter?versionSuffix=1.9.2&label=Grashopper)
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)

# mersys.io_Projesi

Techno Study Batch 4, Group 17, Friday Project / date 13-10-2023

In this project we use JAVA, TestNG, Cucumber, Gherkin and other JAVA Tools on this project.

Domain: https://test.mersys.io/

##Team-17 technostudyteam17@gmail.com

- Aygul Abilova - QA Lead  (abilovaygul@gmail.com)
- Neslihan Terlemez - Tester ( terlemez.neslihan@gmail.com )
- Alpaslan Alemdar - Tester  ( alpaslanalemdar5406@hotmail.com)
- Nergis Reçel - Tester (nergisrecel@hotmail.com)
- Hakan Kılıç - Tester   (Aliyamnuveybam@gmail.com)
- Omer Al- Tester (xfinaldest@gmail.com)
- Sokol Rrustemi- Tester (sokolrrustemi@gmail.com) 
   
Getting Started
---------------

The easiest way to get started is to clone the repository:

```bash
# File > New > Project From Version Control 
# Copy to URL
git@github.com: https://github.com/TechnoTeam-17/mersys.io
# open project at Intellij
# select project JDK
jdk1.8

# Open Module Settings at Intellij
# install selenium from maven
org.seleniumhq.selenium:selenium-java:4.11.0

# install io.cucumber from maven
cucumber-java version :7.9.0

# install io.cucumber TestNG from maven
cucumber-TestNG version:7.9.0

# install TestNG from maven
org.testNG:6.14.3

# install slf4j from maven
org.slf4j:slf4j-nop:1.7.30

# install slf4j from maven
org.slf4j:slf4j-nop:1.8.0 beta2

# install org.apache.commons from maven
org.apache.commons-lang3 version:3.12.0

# install tech.grasshopper from maven
extentreports-cucumber7-adapter version:1.9.2

# install commons.io from maven
commons-io:commons-io:2.11.0

# Right click to Main.java
Run 'Main'

```
List of Dependencies
----------------

| Package      | Description                           |
|--------------|---------------------------------------|
| TestNG       | Next Generation Testing Tool.         |
| Selenium     | Browser Automation Framework.         |
| slf4j        | The Simple Logging Facade for Java.   |
| commons.io   | The Apache Commons IO library.        |
| cucumber     | Cucumber is a tool that supports BDD. |
| grasshopper  | HTML & PDF Report tool.               |

## File Structure
```bash
|-- src
|   |-- main
|       |-- java
|       |-- resources
|
|   |-- test
|       |-- java
|           |-- FeatureFiles
|               |-- Cucumber Feature Files
|           |-- Pages
|               |-- Locators, Page Object Model Files
|           |-- Runners
|               |-- CrossBrowserTest
|               |-- ExtentReport
|           |-- StepDefinitions
|               |-- Test Class Files
|           |-- Utilities
|               |-- Events
|               |-- Hooks
|               |-- WBA
|           |-- XML
|       |-- resources
|       |-- results
|           |-- reports*
|           |-- gitignore
|
|-- gitignore
|-- pom.xml

## Rules Of Pull Request
- Update your codes from main branch before you pull request
- Don't use Thread.Sleep
- Don't use Turkish Character
- Don't use extra space
- Use logical comment lines
- Use ./screenshots folder for bug & facility report
- Only work at your story
- Don't add any scenario you want

## License

This project is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

### Wish you the best! 

