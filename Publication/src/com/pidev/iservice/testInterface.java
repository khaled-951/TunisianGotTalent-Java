package com.pidev.iservice;
import com.pidev.entities.test;
import java.util.List;

public interface testInterface {
    public void addTest(test t);
    public List<test> getTests();
    public void removeTest(test t);
    public void updateTest(test t, test new_t);
    
}
