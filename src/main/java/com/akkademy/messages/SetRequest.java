package com.akkademy.messages;

import java.io.Serializable;

public class SetRequest implements Serializable {
  private final String key;
  private final Object value;

  public SetRequest(String key, Object value) {
    this.key = key;
    this.value = value;
  }
}
