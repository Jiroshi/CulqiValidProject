package com.listbin.culqi.service;

import com.listbin.culqi.model.InputValidMOdel;
import com.listbin.culqi.model.ResponseValidModel;

public interface ListBinValidService {

	String callingValidService();

	ResponseValidModel getBrandValidResponse(InputValidMOdel inputModel);

	Boolean validarRespuesta();
}
