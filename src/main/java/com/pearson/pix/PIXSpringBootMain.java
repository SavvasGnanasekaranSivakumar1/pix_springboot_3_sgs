package com.pearson.pix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,WebMvcAutoConfiguration.class })
@EnableAutoConfiguration(exclude = {  })
public class PIXSpringBootMain {
        //extends SpringBootServletInitializer implements WebMvcConfigurer {

    /*@Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/jsp/", ".jsp");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder
                                                         application) {
        return application.sources(SpringBootMain.class);
    }*/
    public static void main(String ar[])
    {
        SpringApplication.run(PIXSpringBootMain.class,ar);
    }
}
