package seven.one;

import one.Calculator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class WhatWeNeedToMock {

    @Mock
    Calculator calculator;
    //or
    Calculator firstway = mock(Calculator.class);
    //or
    Calculator secondway = mock(Calculator.class);

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
}
