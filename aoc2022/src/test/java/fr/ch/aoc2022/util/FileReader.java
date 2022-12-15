package fr.ch.aoc2022.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    private final String prefix;

    public FileReader(String folder) {

        prefix = folder + "/";
    }

    public FileReader() {
        prefix = "";
    }

    public List<String> readFile(String fileName) {
        try {
            URI uri = getClass().getClassLoader().getResource(prefix + fileName).toURI();
            return Files.readAllLines(Paths.get(uri), Charset.defaultCharset());
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
