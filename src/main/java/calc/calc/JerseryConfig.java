package calc.calc;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseryConfig extends ResourceConfig{

   public JerseryConfig(){
     registerEndpoints();
   }


    private void registerEndpoints() {
        register(CalculatorEndpoint.class);
    }
}
