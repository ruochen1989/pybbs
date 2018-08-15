package co.yiiu.core.bean;

/**
 * Created by tomoya.
 * Copyright (c) 2016, All Rights Reserved.
 * https://yiiu.co
 */
public class Result {

  private int code;
  private String description;
  private Object detail;

  public static Result success() {
    return success(null);
  }

  public static Result success(Object detail) {
    Result result = new Result();
    result.setCode(200);
    result.setDescription("success");
    result.setDetail(detail);
    return result;
  }

  public static Result error() {
    return error(null);
  }

  public static Result error(String description) {
    return error(201, description);
  }

  public static Result error(int code, String description) {
    Result result = new Result();
    result.setCode(code);
    result.setDescription(description);
    result.setDetail(null);
    return result;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Object getDetail() {
    return detail;
  }

  public void setDetail(Object detail) {
    this.detail = detail;
  }
}
