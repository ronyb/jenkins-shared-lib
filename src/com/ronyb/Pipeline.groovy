package com.ronyb

public class Pipeline {
  
  private String creatorName;
  
  public Pipeline(String creatorName) {
    this.creatorName = creatorName;
  }

  public void helloWorld() {
    echo "Hello world! Creator name: ${creatorName}"
  }
  
  public int add(int a, int b) {
    return a + b;
  }
}
