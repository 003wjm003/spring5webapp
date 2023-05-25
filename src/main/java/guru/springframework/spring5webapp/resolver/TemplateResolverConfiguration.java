package guru.springframework.spring5webapp.resolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {

    @Bean
    public SpringResourceTemplateResolver firstTemplateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("classpath:/templates/books/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setOrder(0);
        templateResolver.setCheckExistence(true);

        return templateResolver;
    }

    @Bean
    public SpringResourceTemplateResolver secondTemplateResolver() {
        SpringResourceTemplateResolver templateResolver2 = new SpringResourceTemplateResolver();
        templateResolver2.setPrefix("classpath:/templates/authors/");
        templateResolver2.setSuffix(".html");
        templateResolver2.setTemplateMode(TemplateMode.HTML);
        templateResolver2.setCharacterEncoding("UTF-8");
        templateResolver2.setOrder(0);
        templateResolver2.setCheckExistence(true);

        return templateResolver2;
    }

}
