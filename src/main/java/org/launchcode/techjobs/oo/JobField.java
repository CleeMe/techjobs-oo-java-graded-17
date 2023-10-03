package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    private int id;
    private static int nextId = 1;
    protected String value;

    public JobField() {
        id = nextId;
        nextId++;
    }
}
