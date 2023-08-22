package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(demo..*)")
    public void authenticatingPointCut() {

    }
    //@Pointcut("within(demo.ShoppingCart.*)")
    @Pointcut("within(demo..*)")//workin:Authenticating the Request,before Logger,Checkout Method from ShoppingCart Called,After Logger
    public void authorizationPointCut() {

    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the Request");
    }
    
}
