package com.app.lambda.demo;

import com.app.lambda.demo.lambda.ICalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpressionApplication {

    public static void main (String[] args) {
        SpringApplication.run (LambdaExpressionApplication.class, args);
        ICalculator calculator=(n1, n2) ->{
          double result = n1 + n2;
            System.out.println ("valor: "+result);
        };
        calculator.operation (4,6);

        ICalculator calculator1=(n1, n2) ->{
            double result = n1 - n2;
            System.out.println ("valor: "+result);
        };
        calculator1.operation (4, 2);
    }

}
