package com.dmdev.week4.practics.less;

public enum Door {

    METALLING ("metal"),
    WOODING("wood"),
    PLASTIC("plastic");
    private final String name;

    Door(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
