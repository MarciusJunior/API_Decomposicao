package com.mdcapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mdcapi.model.totalMdcModel;
import com.mdcapi.service.MdcService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/mdcapi")
public class MdcController {
	
	private MdcService mdc;
	
	@GetMapping(value = "/mdc")
	public List<String> mdcConta(@RequestParam int numero) {
		return mdc.MDC(numero);
	}
	
	

}
