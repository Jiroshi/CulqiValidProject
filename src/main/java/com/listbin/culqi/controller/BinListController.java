package com.listbin.culqi.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.listbin.culqi.model.InputValidMOdel;
import com.listbin.culqi.model.ResponseValidModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.listbin.culqi.service.ListBinValidService;

import ch.qos.logback.core.pattern.parser.Parser;

@RestController
public class BinListController {

	@Autowired
	private ListBinValidService listBinValidService;

	@RequestMapping(value = "/api_key/valid", method = RequestMethod.POST)
	public ResponseEntity<ResponseValidModel> getServiceValidJson(@RequestBody String api_key) throws Exception
	{

		ResponseValidModel responseValidModel = new ResponseValidModel();
		
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = (JsonObject) parser.parse(api_key);
		JsonElement cadenaAux = jsonObject.get("api_key");
		String cadenaAux2 = cadenaAux.getAsString();
		String cadena = cadenaAux2.substring(1, cadenaAux2.length()-1);
		
		Boolean flag = listBinValidService.validarRespuesta(cadena);
		
		
		if (flag){
			responseValidModel.setValid("true");
			return new ResponseEntity<ResponseValidModel>(responseValidModel, HttpStatus.OK);
		}else {
			return new ResponseEntity<ResponseValidModel>(responseValidModel, HttpStatus.UNAUTHORIZED);
		}

	}

}
