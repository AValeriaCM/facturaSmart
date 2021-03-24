package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.service.IDetalleService;

import io.swagger.annotations.Api;

@Validated
@Controller
@RestController
@RequestMapping("/detalles")
@Api(value = "REST informacion de cliente")
public class DetalleController {
	
	@Autowired
	private IDetalleService detalleService;

}
