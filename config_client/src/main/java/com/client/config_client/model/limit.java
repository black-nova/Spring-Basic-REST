package com.client.config_client.model;

import org.springframework.stereotype.Component;

@Component
public class limit {

    private int minimum;
    private int maximum;

    public limit(int minimum, int maximum)
    {   
        super();
        this.minimum=minimum;
        this.maximum=maximum;
    }

    public limit()
    {
        super();
    }

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
