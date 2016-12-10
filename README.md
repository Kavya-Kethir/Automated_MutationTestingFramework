# AutomatedMutationTestingFramework
This project automates the generation of mutants there by decreasing the burden of developer
*** STEPS TO RUN TOOL ***

The tool is very easy to run. We have created an executable jar file of our program and there are 2 PowerShell scripts. 
- MutationInsertion.jar
- ExecuteMutantTest.ps1
- MutationTestingMaster.ps1

The MutationTestingMaster.ps1 script takes care of all the steps. It will ask for some inputs from the user and based on that, in the end, you will be able to see the final results.

=== Steps ===
1. Download the MutationTestingTool project folder on your local machine.

2. Copy the geo-master project folder from the submission to a new directory. This new directory can be named anything. However please keep in mind that the program will create around 100 mutants in the same directory.

3. Open PowerShell prompt.

4. Run MutationTestingMaster.ps1 script from the MutationTestingTool project.

5. It will ask user to input MutationTestingTool project directory path. 
-Enter like: path\to\parent\MutationTestingTool

6. Then itíll ask for mutant directory path. This is the path of the folder we created in step-2.
- Enter like: path\\to\\folder\\created\\in\\step2\\geo-master
- Please note that the program expects escaped backslashes here. 

7. The script will execute the MutationInsertion.jar file and create all the possible mutants. Please wait while it completion message appears.

8. The script will start running test on each mutant. It will ask to input mutant directory path. It is the same folder that you created in step-2.
- Enter like: path\to\folder\created\in\step2

9. The script will provide information for each of the mutant test result and path to reports for each of these.

10. Once it has completed testing all the mutants, itíll show the results. The information includes total number of mutants, total number of killed mutants, total number of alive mutants and mutation score.
