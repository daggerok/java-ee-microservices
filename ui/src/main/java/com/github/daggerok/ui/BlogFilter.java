package com.github.daggerok.ui;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import static spark.servlet.SparkFilter.APPLICATION_CLASS_PARAM;

@WebFilter(
    urlPatterns = "/*",
    filterName = "BlogFilter",
    displayName = "Spark Application Filter",
    initParams = @WebInitParam(
        name = APPLICATION_CLASS_PARAM,
        value = "com.github.daggerok.ui.BlogApplication"
    )
)
public class BlogFilter extends spark.servlet.SparkFilter { }
