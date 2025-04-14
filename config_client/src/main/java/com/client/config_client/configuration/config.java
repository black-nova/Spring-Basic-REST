package com.client.config_client.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("config-client")
public class config {
    private int minimum;
    private int maximum;

    public int getmaximum()
    {
        return this.maximum;
    }

    public int getminimum()
    {
        return this.minimum;
    }


    public void setmaximum(int maximum)
    {
        this.maximum=maximum;
    }

    public void setminimum(int minimum)
    {
        this.minimum=minimum;
    }
}
