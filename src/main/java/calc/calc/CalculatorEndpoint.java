package calc.calc;

import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;



@Component
@Path("/")
public class CalculatorEndpoint {

   private CacheControl cacheControl;



    public CalculatorEndpoint(){
        cacheControl = new CacheControl();
        cacheControl.setMaxAge(86400);
        cacheControl.setPrivate(false);
    }

    @GET
    @Path("/add/{a : ([0-9]*)}/{b : ([0-9]*)}/{c : ([0-9]*)}{p:/?}")
    @Produces("application/json")

    public Response add(@PathParam("a") Integer a, @PathParam("b") Integer b, @PathParam("c") Integer c) {


        int cval = this.initZeroIfEmpty(c);
        int result = a+b + cval;

        long current = new Date().getTime();

        Date expires = new Date(current + (100000 * 1_000));


        return Response.ok(Result.addOp(a,b,cval,result), MediaType.APPLICATION_JSON_TYPE).cacheControl(cacheControl).build();

    }

    @GET
    @Path("/diff/{a : ([0-9]*)}/{b : ([0-9]*)}/{c : ([0-9]*)}{p:/?}")
    @Produces("application/json")
    public Response diff(@PathParam("a") Integer a, @PathParam("b") Integer b, @PathParam("c") Integer c) {

        int cval = this.initZeroIfEmpty(c);
        int result = a- b - cval;

        return Response.ok(Result.diffOp(a,b,cval,result), MediaType.APPLICATION_JSON_TYPE).cacheControl(cacheControl).build();

    }

    @GET
    @Path("/mul/{a : ([0-9]*)}/{b : ([0-9]*)}/{c : ([0-9]*)}{p:/?}")
    @Produces("application/json")
    public Response mul(@PathParam("a") Integer a, @PathParam("b") Integer b, @PathParam("c") Integer c) {

        int cval = this.initOneIfEmpty(c);
        int result = a * b * cval;

        return Response.ok(Result.multOp(a,b,cval,result), MediaType.APPLICATION_JSON_TYPE).cacheControl(cacheControl).build();

    }

    @GET
    @Path("/div/{a : ([0-9]*)}/{b : ([0-9]*)}/{c : ([0-9]*)}{p:/?}")
    @Produces("application/json")
    public Response div(@PathParam("a") Integer a, @PathParam("b") Integer b, @PathParam("c") Integer c) {
     try {
         int cval = this.initOneIfEmpty(c);
         int result = a / b / cval;

         return Response.ok(Result.divOp(a, b, cval, result), MediaType.APPLICATION_JSON_TYPE).cacheControl(cacheControl).build();
     }
      //TODO handle this with ArithmeticException handlers
     catch (ArithmeticException e){
         return Response.status(Response.Status.BAD_REQUEST).cacheControl(cacheControl).build();
     }
    }


    @GET
    @Produces("application/json")
    @Path("/sub/{a : ([0-9]*)}/{b : ([0-9]*)}/{c : ([0-9]*)}{p:/?}")
    public Response sub(@PathParam("a") Integer a,@PathParam("b") Integer b,@PathParam("c") Integer c) {
        int cval = this.initZeroIfEmpty(c);
        int result = a-(b- cval);
        return Response.ok(Result.diffOp(a,b,cval,result), MediaType.APPLICATION_JSON_TYPE).cacheControl(cacheControl ).build();


    }


    private Integer initZeroIfEmpty(Integer val){
        int result = 0;
        if (val!=null){
            result=val;
        }

        return result;
    }

    private Integer initOneIfEmpty(Integer val){
        int result = 0;
        if (val!=null){
            result=val;
        }

        return result;
    }

}
