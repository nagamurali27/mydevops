package com.onesoft.mydevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mydevops {
@GetMapping("getthat")
public String get() {
	return "sunapana";
}
}
