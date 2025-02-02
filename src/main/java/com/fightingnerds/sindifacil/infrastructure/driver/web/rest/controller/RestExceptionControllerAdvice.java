package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.ProblemHandling;

@ControllerAdvice
public class RestExceptionControllerAdvice implements ProblemHandling {
}
