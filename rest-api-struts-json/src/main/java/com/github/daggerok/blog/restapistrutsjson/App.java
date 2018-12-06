package com.github.daggerok.blog.restapistrutsjson;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class App extends StrutsPrepareAndExecuteFilter { }
