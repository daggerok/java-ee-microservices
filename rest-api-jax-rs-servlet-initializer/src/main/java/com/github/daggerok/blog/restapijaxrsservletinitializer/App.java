package com.github.daggerok.blog.restapijaxrsservletinitializer;

import com.github.daggerok.blog.restapijaxrsservletinitializer.rest.HealthResource;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

@ApplicationScoped
@ApplicationPath("")
public class App extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    return new HashSet<>(
        asList(
            HealthResource.class
        )
    );
  }
}
