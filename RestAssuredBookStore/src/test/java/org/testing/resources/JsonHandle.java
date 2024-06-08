package org.testing.resources;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonHandle {
    public static String readJsonData(String filePath) throws Exception {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}