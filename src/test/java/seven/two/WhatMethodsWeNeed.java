package seven.two;

import one.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WhatMethodsWeNeed {

    @Mock
    Calculator calculator;

    @Test
    public void testAddWithPositiveIntegerReturnResult(){
        when(calculator.add(3,5)).thenReturn(10);
    }

    @Test
    public void testAddWithNegativeIntegerReturnResult(){
        when(calculator.add(-3,-5)).thenReturn(-10);
    }

    @Test
    public void testAddWithAnyInteger(){
        when(calculator.add(anyInt(), anyInt())).thenReturn(10);
    }
}
