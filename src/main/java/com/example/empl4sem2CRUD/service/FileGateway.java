package com.example.empl4sem2CRUD.service;


import org.springframework.context.annotation.Scope;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;
@Scope("prototype")
@MessagingGateway(defaultRequestChannel = "textInputChanel")
public interface FileGateway {
    void writeToFile(@Header(FileHeaders.FILENAME) String filename, String data);
//void writeToFile( String filename, String data);
}
