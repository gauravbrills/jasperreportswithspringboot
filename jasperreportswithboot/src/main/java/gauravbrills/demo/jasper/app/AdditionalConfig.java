/**
 * 
 */
package gauravbrills.demo.jasper.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

/**
 * @author grawat
 */
@Configuration
@EnableWebMvc
public class AdditionalConfig extends WebMvcConfigurerAdapter {
    @Override
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {

        configurer.enable();
    }

    @Bean
    public JasperReportsViewResolver getJasperReportsViewResolver() {

        JasperReportsViewResolver resolver = new JasperReportsViewResolver();
        resolver.setPrefix("classpath:jasperreports/");
        resolver.setSuffix(".jrxml");

        resolver.setReportDataKey("datasource");
        resolver.setViewNames("*rpt_*");
        resolver.setViewClass(JasperReportsMultiFormatView.class);
        resolver.setOrder(0);
        return resolver;
    }

    @Bean
    public ViewResolver htmlViewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/pages/");
        resolver.setSuffix(".html");
        resolver.setOrder(1);
        return resolver;
    }
}
