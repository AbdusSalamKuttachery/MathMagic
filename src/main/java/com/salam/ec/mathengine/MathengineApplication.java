package com.salam.ec.mathengine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @OpenAPIDefinition(Info = @Info(title = "Math Word Problems"))
public class MathengineApplication implements CommandLineRunner
{

   public static void main(final String[] args)
   {
      SpringApplication.run(MathengineApplication.class, args);
   }

   @Override
   public void run(final String... args) throws Exception
   {
      System.out.println("Salam - taking off!");
   }

}
