package com.edtech.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.edtech.steps.serenity.EndUserSteps;

public class DefinitionSteps2 {

    @Steps
    EndUserSteps endUser;

    

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
    	System.out.println("Defn2----------------------------------");
       endUser.looks_for(word);
    }

   

}
