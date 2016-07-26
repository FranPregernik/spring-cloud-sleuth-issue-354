package hr.altima.config;


import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import com.ryantenney.metrics.spring.config.annotation.MetricsConfigurerAdapter;
import hr.altima.helpers.metrics.MvcMetricsHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

@Configuration
@EnableMetrics
public class MetricsConfig extends MetricsConfigurerAdapter {

    @Bean(name = "mvcMetricsHandlerInterceptor")
    public HandlerInterceptor mvcMetricsHandlerInterceptor() {
        return new MvcMetricsHandlerInterceptor();
    }

}