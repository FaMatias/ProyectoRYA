package com.example.RYArgentina.service;

import com.example.RYArgentina.model.Venta;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.preference.Preference;

public interface MPService {

    public Preference create(Venta venta) throws MPException, MPApiException;
}
