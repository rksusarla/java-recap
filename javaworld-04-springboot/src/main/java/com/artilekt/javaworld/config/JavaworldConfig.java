package com.artilekt.javaworld.config;

import com.artilekt.javaworld.LaundryLoadSelector;
import com.artilekt.javaworld.LaundrySelectorByColor;
import com.artilekt.javaworld.enums.Color;
import com.artilekt.javaworld.enums.LoadSize;
import com.artilekt.javaworld.enums.Style;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.artilekt.javaworld.enums.Color.COLORED;

@Configuration
public class JavaworldConfig {

    @Bean
    public Style defaultStyle() { return Style.ANTIQUE; }

    @Bean
    public LoadSize defaultLoadSize() { return LoadSize.MEDIUM_LOAD; };

    @Bean
    public Color defaultColor() { return COLORED; }
}
