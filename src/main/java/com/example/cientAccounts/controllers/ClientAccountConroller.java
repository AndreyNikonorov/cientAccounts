package com.example.cientAccounts.controllers;

import model.ClientAccountsAbs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

@RestController
public class ClientAccountConroller {

    @GetMapping("/ClientsAccounts")
    public String getClientAccount() throws JAXBException {

        ClientAccountsAbs clientAccs = new ClientAccountsAbs();

        StringWriter sw = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(ClientAccountsAbs.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(clientAccs, sw);
        //преобразовываем в строку все записанное в StringWriter
      //  String result = sw.toString();

        return sw.toString();
        }

}

