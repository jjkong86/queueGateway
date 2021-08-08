package com.example.queuegateway.utils;

import com.example.queuegateway.exception.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static String toJson(Object target) {
        try {
            return OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(target);
        } catch (IOException e) {
            throw new JsonParseException(target.toString(), e);
        }
    }
}
