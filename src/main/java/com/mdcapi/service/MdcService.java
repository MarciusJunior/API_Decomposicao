package com.mdcapi.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mdcapi.model.totalMdcModel;

@Service
public class MdcService {
	
	public List<String> MDC(int numero) {
		
		List<Integer> resultadoNumeros = new ArrayList();
		List<Integer> resultadoFatores = new ArrayList();
		int fator = 2;
		while(numero >= 1) {
		
		while(numero % fator == 0 || numero == 1) {

					if(numero == 1){
						resultadoFatores.add(1);
						resultadoNumeros.add(1);
						numero = -1;
						break;
					}
					System.out.println(numero + " " + fator);
					resultadoFatores.add(fator);
					resultadoNumeros.add(numero);
					numero = numero / fator;

				
		}
		fator++;
	}
		List<String> resultadoTotal = new ArrayList();
		
		for(int numeroIndice :  resultadoNumeros) {
				String resultadoFinal = numeroIndice + "";
				resultadoTotal.add(resultadoFinal);
			
		}
		
		List<String> resultadoTotalDois = new ArrayList();

		int i = 0;
		for(int numeroIndice : resultadoFatores) {

			String resultadoFinalDois = numeroIndice
					+ " " + resultadoTotal.get(i);
			resultadoTotalDois.add(resultadoFinalDois);
			i++;
		}
		
		return resultadoTotalDois;

	}	
	}
