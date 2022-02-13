import pytest
import math
def test_add():
    num1 = 2
    num2 = 3
    sum = num1+num2
    assert sum == 5

def test_substrat():
    num1 = 20
    num2 = 2
    substration = num1-num2
    assert substration == 18

def test_multiply():
    num1 = 20
    num2 = 2
    multiply = num1*num2
    assert multiply == 40

def test_division():
    num1 = 20
    num2 = 2
    division = num1/num2
    assert division == 10