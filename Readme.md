# CSYE7200 San Francisco Crime Analysis

## Group Member

- Ning Huang
- Yixuan Wang

## Part I: Data Analysis & Machine Learning Algorithm

### **Introduction**

#### **Source Code**

This includes 2 models' codes:

1. Random Forest Model for Crime Category(new category after reclassifying) Classification.
2. Logistic Regression using TF-IDF Features for Crime Description Classification (Multi-class text classification).
   
Also includes 2 Util codes:
1. General Data Process source code.
2. Generating the dataset for supporting the function of map data searching in the Data Searching Systems.
   
And one Unit test code.

#### **Source Data**

- train.csv: Dataset for training models
- test.csv: Dataset for using models to make predictions and evaluate models' performance
- weather.csv: Dataset with weather information
- sunsetrise.csv: Dataset with sunset time and sunrise time information
- data_reclassify.csv: Complete dataset with new crime category

#### **Output Data**

- searchingData.csv: Data to support the map data searching function in the Data Searching Systems.
- nlp_result.csv: Output data of Logistic Regression Model, to support the Crime Description matching function in the Data Searching Systems.
- classification_result.csv: Output data of Random Forest Model, can be shown partially and downloaded in the Data Searching Systems.


## Part II: Data Searching Systems

### **Introduction**

This part includes five parts:

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

   

   

   