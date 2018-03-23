###  Clone the project: ###

$ git clone https://github.com/colo76/rest-calculator.git

###  Run the project ### 

#### If you have installed: ####

$ ./run.sh 

or

$ java -jar calc.jar 

### Now you can start invoking the endpoint ###

$ curl http://localhost:9090/add/1/2/3

$ curl http://localhost:9090/div/4/2

$ curl http://localhost:9090/diff/4/2

$ curl http://localhost:9090/mult/4/2/7


## Build the project ##

###  Clone the project: ###

$ git clone https://github.com/colo76/rest-calculator.git

###  Install the jar ###

$ mvn clean install

##  Copy the jar to your current location ## 

$ ./install_jar.sh

### If you have installed: ###

$ ./run.sh 

or

$ java -jar calc.jar 

### Running with Docker ###
$ mvn clean install
$ ./install_jar.sh
$ ./create-image.sh
$ ./run-docker