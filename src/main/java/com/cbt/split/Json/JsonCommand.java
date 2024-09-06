/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.Json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 *
 * @author neeraj
 */
public class JsonCommand {

    private final JsonObject jsonObject;

    public JsonCommand(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String stringValueOfParameterNamed(String paramName) {
        return this.jsonObject.getAsJsonPrimitive(paramName).getAsString();
    }

    public Long longValueOfParameterNamed(String paramName) {
        return this.jsonObject.getAsJsonPrimitive(paramName).getAsLong();
    }

    public Integer IntegerValueOfParameterNamed(String paramName) {
        return this.jsonObject.getAsJsonPrimitive(paramName).getAsInt();
    }
    
    public JsonArray arrayOfParameterNamed(String paramName) {
        return this.jsonObject.getAsJsonArray(paramName);
    }

}
