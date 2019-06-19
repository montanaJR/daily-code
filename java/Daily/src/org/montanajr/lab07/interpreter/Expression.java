package org.montanajr.lab07.interpreter;

import java.util.*;

interface Expression 
{
    public int interpret(Map<String,Expression> variables);
}



