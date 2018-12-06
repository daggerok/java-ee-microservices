package com.github.daggerok.ui;

import spark.servlet.SparkApplication;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import static java.util.Collections.singletonMap;
import static java.util.stream.Collectors.joining;
import static javax.ws.rs.core.HttpHeaders.CONTENT_TYPE;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static spark.Spark.get;
import static spark.Spark.staticFiles;

// https://sparktutorials.github.io/
public class BlogApplication implements SparkApplication {

  @Override
  public void init() {
    // http://sparkjava.com/documentation#static-files
    staticFiles.location("/public");

    get("/health", (request, response) -> {
      response.header(CONTENT_TYPE, APPLICATION_JSON);
      return singletonMap("status", "ui is UP");
    }, Json.gson::toJson);

    // solution 1: redirect
    /*
    get("/about", (request, response) -> {
      response.redirect(request.contextPath() + "/");
      return null;
    });
    */
    // solution 2: render index.html for any specified fallback spa paths
    Stream.of("/about", "/not-found", "/404")
          .forEach(path -> get("/about", (request, response) -> {
            try (final InputStream is = this.getClass().getResourceAsStream("/public/index.html")) {
              try (final InputStreamReader isr = new InputStreamReader(is)) {
                try (final BufferedReader br = new BufferedReader(isr)) {
                  return br.lines().collect(joining(""));
                }
              }
            }
          }));
  }

  @Override
  public void destroy() {
  }
}
