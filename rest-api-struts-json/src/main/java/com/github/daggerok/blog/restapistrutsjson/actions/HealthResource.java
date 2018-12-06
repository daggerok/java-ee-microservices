package com.github.daggerok.blog.restapistrutsjson.actions;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import org.apache.struts2.convention.annotation.*;

import static com.opensymphony.xwork2.Action.*;
import static java.lang.String.format;

@Results({
    @Result(name = SUCCESS, type = "json"),
    @Result(name = INPUT, type = "json"),
    @Result(name = ERROR, type = "json")
})
@Namespace("/")
//@Namespace("/api")
@Result(type = "json")
@ParentPackage("json-default")
public class HealthResource extends ActionSupport {

  public static final String PREFIX = "rest-api-struts-json is";

  @Getter
  String status = format("%s DOWN", PREFIX);

  @Override
  @Action("health")
  public String execute() throws Exception {
    status = format("%s UP", PREFIX);
    return SUCCESS;
  }

  @Action(
      value = "fail",
      exceptionMappings = {
          @ExceptionMapping(exception = "java.lang.Throwable", result = ERROR)
      }
  )
  public String failImmediately() {
    if (true) throw new RuntimeException("should fail immediately");
    return ERROR;
  }
}
