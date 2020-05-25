package com.edu.test;

import java.util.ArrayList;
import java.util.List;

public class TestOverride {
}

class x{

    protected List test() throws RuntimeException, Exception {
        return  new ArrayList();
    }

}
class y extends x{
    @Override
    public ArrayList test() throws Exception {
        return new ArrayList();
    }
}
