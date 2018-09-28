package com.listbin.culqi.controller;

import com.listbin.culqi.model.InputValidMOdel;
import com.listbin.culqi.model.ResponseValidModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.listbin.culqi.service.ListBinValidService;

@RestController
public class BinListController {

	@Autowired
	private ListBinValidService listBinValidService;

	@RequestMapping(value = "/api_key/valid", method = RequestMethod.POST)
	public ResponseEntity<ResponseValidModel> getServiceValidJson(@RequestBody InputValidMOdel inputValidModel) throws Exception
	{

		ResponseValidModel responseValidModel = new ResponseValidModel();
		responseValidModel = listBinValidService.getBrandValidResponse(inputValidModel);

		Boolean flag = listBinValidService.validarRespuesta();
		if (flag){

		}else {
			return new ResponseEntity<ResponseValidModel>(responseValidModel, HttpStatus.OK);
		}

		return new ResponseEntity<ResponseValidModel>(responseValidModel, HttpStatus.OK);
	}

}
