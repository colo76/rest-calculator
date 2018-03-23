### 1. Clone the project: ###

$ git clone https://github.com/colo76/rest-calculator.git

### 2. Run the project ### 

#### If you have java already installed: ####

$ ./run.sh 

or

$ java -jar calc.jar 

### 3. Now you can start invoking the endpoint ###

$ curl http://localhost:9090/add/1/2/3

$ curl http://localhost:9090/div/4/2

$ curl http://localhost:9090/diff/4/2

$ curl http://localhost:9090/mult/4/2/7


## Build the project ##

### 1.  Clone the project: ###

$ git clone https://github.com/colo76/rest-calculator.git

### 2.  Compile ###

$ mvn clean install

## 3 Copy the jar to your current location ## 

$ ./install_jar.sh

### 4 If you have installed: ###

$ ./run.sh 

or

$ java -jar calc.jar 

## 5 Running with Docker ##
1. Compile 
$ mvn clean install
2. Copy the jar to current location
$ ./install_jar.sh
3. Create the Docker image
$ ./create-image.sh
4. Run docker
$ ./run-docker