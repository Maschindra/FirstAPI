package com.third.api.Food.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }


    @java.io.Serial
    private static final long serialVersionUID=1L;
    private String resourceName;

    private String fieldName;

    private Object fieldValue;


    public  ResourceNotFoundException(String resource_Name,String field_Name,Object field_Value){
        super(String.format("not found with %s : '%s'",field_Name,field_Value,resource_Name));
        this.fieldName=field_Name;
        this.fieldValue=field_Value;
        this.resourceName=resource_Name;
    }

    public String getResourceName(){
        return resourceName;
    }
    public String getFieldName(){
        return fieldName;
    }
    public Object getFieldValue(){
        return fieldValue;
    }


}


