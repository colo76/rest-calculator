package calc.calc;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Component
public class CalculatorResource {

    @GET
    @Produces("application/json")
    public int add(@PathParam("a") Integer a,@PathParam("b") Integer b,@PathParam("c") Integer c) {

        return a+b+c;

    }



}
