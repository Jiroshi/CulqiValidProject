package com.listbin.culqi.service;

import com.listbin.culqi.model.InputValidMOdel;
import com.listbin.culqi.model.ResponseValidModel;

public interface ListBinValidService {

	ResponseValidModel getBrandValidResponse(InputValidMOdel inputModel);

	Boolean validarRespuesta(String cadena);
}
