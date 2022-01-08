package com.pechersky.springlessons;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    @Override
    public String getSong(int idx) {
        return "Titanium";
    }
}
