package com.fairbenefit.cucumber.stepdefs;

import com.fairbenefit.FairbenefitPlattformApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FairbenefitPlattformApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
