package com.listbin.culqi.service.impl;

import java.util.ArrayList;
import java.util.Date;

import com.listbin.culqi.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.listbin.culqi.service.ListBinValidService;
import com.listbin.culqi.util.Constants;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class ListBinValidServiceImpl implements ListBinValidService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	public ResponseValidModel getBrandValidResponse(InputValidMOdel inputModel){

		ResponseValidModel responseValidModel = new ResponseValidModel();

		try {

		}catch (Exception e){
			logger.error(e.getMessage());
		}

		return responseValidModel;
	}

	public Boolean validarRespuesta(String cadena){

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("key1");
		arrayList.add("key3");
		arrayList.add("key5");
		arrayList.add("key7");
		arrayList.add("key9");
		
		Boolean flag = false;
		for (String array: arrayList) {
			if (array.equals(cadena)){
				flag = true;
			}
		}

		return flag;
	}

}
