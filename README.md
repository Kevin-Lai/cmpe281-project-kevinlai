# CMPE281-Project

* University Name: [San Jose State University](http://www.sjsu.edu/)
* Course: [Cloud Technologies](http://info.sjsu.edu/web-dbgen/catalog/courses/CMPE281.html)
* Professor [Sanjay Garje](https://www.linkedin.com/in/sanjaygarje/)
* ISA: [Anushri Srinath Aithal](https://www.linkedin.com/in/anushri-aithal/)
* Student: [Kevin Lai](www.linkedin.com/in/kevinlai247)

## Project Introduction
The application is a highly available, highly scalable, cost effective 3 tier web application that serves as an online storage solution.

## What's Here

This repository includes:

* README.md - this file
* .ebextensions/ - this directory contains the Java configuration file that
  allows AWS Elastic Beanstalk to deploy my Java application
* buildspec.yml - this file is used by AWS CodeBuild to build the web
  application
* pom.xml - this file is the Maven Project Object Model for the web application
* src/main - this directory contains my Java service source files
* src/test - this directory contains my Java service unit test files
* template.yml - this file contains the description of AWS resources used by AWS
  CloudFormation to deploy my infrastructure


## Setting Up Environment and Testing

To work on the code on my local computer, I cloned my project's repository to my local computer and did the following:

1. Installed maven.  See https://maven.apache.org/install.html for details.

2. Installed tomcat.  See https://tomcat.apache.org/tomcat-8.0-doc/setup.html for
   details.

3. Installed AWS Eclipse Toolkit. See https://aws.amazon.com/eclipse/ for details.

4. Added the Tomcat server to Eclipse.
  * Click on the "Servers" tab in the console area of Eclipse.
  * Click on "No servers are available. Click this link to create a new server..."
  * On the pop-up prompt, select "Apache" > "Tomcat v#.# Server" where #.# is the version of the Tomcat server.

5. Built the application. For this part, I used Eclipse with the AWS Eclipse Toolkit.

**Steps 6 - 7 are for running the application on your local computer.**

6. Running and testing the application on the local Tomcat server.
  * If the Tomcat server is already running, stop the Tomcat server.
  * Right-click the project folder in the Eclipse Project Explorer and select "Run as.." > "Run on Server"
  * On the pop-up prompt, select the Tomcat server and click "Finish"

7. Open "localhost:8080" in a web browser to view the application. 8080 is the default HTTP port, but can be changed to something else if wanted.

**Steps 8 - 9 are for running and testing the application on AWS.**

8. Create a AWS CodeStar repository on Amazon Web Services.
  * Learn more about AWS CodeStar by reading the user guide. See the User Guide: http://docs.aws.amazon.com/codestar/latest/userguide/welcome.html
  * Learn more about AWS CodeBuild and how it builds and tests your application here: https://docs.aws.amazon.com/codebuild/latest/userguide/concepts.html

9. Using the AWS Eclipse Toolkit, connect the Eclipse environment to your AWS account using your AWS access and secret access keys.
  * Once linked, you can use Eclipse to make changes to the repository code locally on your local computer.
  *	The changes can then either be pushed to the local Tomcat server for testing or to the AWS CodeStar repository for deployment.

9. Uploading local code
  * Right-click the project folder in the Eclipse Project Explorer and select "Team" > "Commit"
  * Write a commit message and press "Commit"
  * Then, once the code is committed, AWS CodeStar will automatically handle the building and deployment of the application.
  * Changes pushed to the project's repository are automatically picked up and deployed
  to the Amazon EC2 instance by AWS Elastic Beanstalk.

## Project Requirements
The list page also lists the above fields along with a link to download the file. The download use case leverages CloudFront.
* The architecture diagram depicting the architecture of the project and all appropriate solution components.
* The application leverages the following AWS services since AWS was chosen as the cloud provider:
  * EC2
  * ELB
  * Lambda
  * AutoScaling Group
  * Single AZ RDS (Describe what steps can be taken to covert the single AZ DB into multi-AZ deployment as part of the project deliverable)
  * CloudFront
  * S3
  * S3 Transfer Acceleration
  * R53
  * CloudWatch
  * SNS

## Feature List
* The web application allows authorized users to perform following operations:
  * Upload new files. (max size 10 MB per file) (Create)
  * Browse through already uploaded list of files with each record having a URL to download the fie. (Read/ List Page)
  * Update already uploaded files. (Update Page)
  * Delete already uploaded file (Delete Page)
* For each file upload, application tracks following fields:
  * User's first name
  * User's last name
  * File Upload Time
  * File Updated Time
  * File Description

## Architecture diagram
![Architecture Diagram](https://github.com/Kevin-Lai/cmpe281-project-kevinlai/blob/master/images/cmpe281_project1_architecture_kevinlai.png)

## Demo Screenshots
Home Page
![Home Page](https://github.com/Kevin-Lai/cmpe281-project-kevinlai/blob/master/images/cmpe281-project-homepage.PNG)

Sign Up Page
![Sign Up Page](https://github.com/Kevin-Lai/cmpe281-project-kevinlai/blob/master/images/cmpe281-project-signup.PNG)

Sign In Page
![Sign In Page](https://github.com/Kevin-Lai/cmpe281-project-kevinlai/blob/master/images/cmpe281-project-signin.PNG)

User Signing In
![User Sign In](https://github.com/Kevin-Lai/cmpe281-project-kevinlai/blob/master/images/cmpe281-project-signin-user-input.PNG)