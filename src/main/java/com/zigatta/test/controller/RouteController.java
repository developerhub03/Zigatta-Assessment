package com.zigatta.test.controller;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zigatta.test.service.RouteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/connected")
@Api(value = "Route Service", description = "Route Service between cities")
public class RouteController {
	@Autowired
	RouteService service;

	@ApiOperation(value = "Confirms the route between cities passed as parameters", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieves the route") })
	@GetMapping()
	public String getRoute(@RequestParam("origin") @NotBlank String origin,
			@RequestParam("destination") @NotBlank String destination) {
		return service.getRoute(origin, destination);
	}
}
