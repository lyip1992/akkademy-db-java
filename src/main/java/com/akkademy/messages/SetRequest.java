package com.akkademy.messages;

public class SetRequest {
  private final String key;
  private final Object value;

  public SetRequest(String key, Object value) {
    this.key = key;
    this.value = value;
  }
}
