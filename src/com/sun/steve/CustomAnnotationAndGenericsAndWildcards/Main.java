package com.sun.steve.CustomAnnotationAndGenericsAndWildcards;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
        MyTestRunner runner = new MyTestRunner();

        runner.run(AnotherSimpleTestCase.class);
        
        List<Class<?>> testCaseClasses = new ArrayList<Class<?>>();
        testCaseClasses.add(SimpleTestCase.class);
        testCaseClasses.add(AnotherSimpleTestCase.class);
        runner.run(testCaseClasses);
        
	}
}
