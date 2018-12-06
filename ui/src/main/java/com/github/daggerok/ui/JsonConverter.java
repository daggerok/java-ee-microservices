package com.github.daggerok.ui;

import com.google.gson.Gson;
import spark.ResponseTransformer;

public class JsonConverter implements ResponseTransformer {

  private static final Gson gson = new Gson();
  private static final JsonConverter INSTANCE = new JsonConverter();

  @Override
  public String render(final Object model) {
    return gson.toJson(model);
  }

  public static ResponseTransformer get() {
    return INSTANCE;
  }
}
