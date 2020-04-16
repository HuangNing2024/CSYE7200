# CSYE7200 San Francisco Crime Analysis

## Group Member

- Ning Huang
- Yixuan Wang

## Part I: Data Analysis & Machine Learning Algorithm



## Part II: Data Searching Systems

### **Introduction**

This includes five parts

1. Data Display: Via machine learning algorithms and Spark, we use histogram and pie chart to show research results.

2. Data Searching: Users can input some restriction to get history information and these will be displayed through map with marker presenting the crime occurrence date, street, weather and type

3. Crime Type Search: This function is developed for police man. When residence call 911, they will provide some crime description. So this can help police man to know the criminal type immediately, which can help them to prepare well.

4. Csv Displaying: This part is mainly for display our prediction results, and user can download CSV file to get more information.

5. Crime Type Mapping: The original datasets in the Kaggle have 39 crime types which make prediction rates very low. So we map the old crime type  to new type depending the official guidance attached by the footer of websites.

   

   ### How to set up

   you need the correct version of Java and sbt. The template requires:

   - Java Software Developer's Kit (SE) 1.8 or higher

   - sbt 1.3.4 or higher. Note: if you downloaded this project as a zip file from [https://developer.lightbend.com](https://developer.lightbend.com/), the file includes an sbt distribution for your convenience.

   To build and run the project:

   1. Use a command window to change into the example project directory, for example: `cd DataSearchSystems`
   2. Build the project. Enter: `sbt run`. The project builds and starts the embedded HTTP server. Since this downloads libraries and dependencies, the amount of time required depends partly on your connection's speed.
   3. After the message `Server started, ...` displays, enter the following URL in a browser: [http://localhost:9000](http://localhost:9000/)

   

   

   