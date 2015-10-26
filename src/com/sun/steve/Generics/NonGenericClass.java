package com.sun.steve.Generics;

/**
 * This is a non-generic Box class that operates on objects of any type. */
public class NonGenericClass {
	private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
