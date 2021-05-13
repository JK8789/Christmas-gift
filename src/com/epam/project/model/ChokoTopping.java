
package com.epam.project.model;

public class ChokoTopping implements Topping {

    private final String name;

    public ChokoTopping(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    
    
}
