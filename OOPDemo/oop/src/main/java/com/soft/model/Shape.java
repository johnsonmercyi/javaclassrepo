package com.soft.model;

public class Shape {
  private int length;
  private int width;

  public Shape(int length, int width) {
    this.length = length;
    this.width = width;
  }

  /**
   * @return the length
   */
  public int getLength() {
    return length;
  }

  /**
   * @param length the length to set
   */
  public void setLength(int length) {
    this.length = length;
  }

  /**
   * @return the width
   */
  public int getWidth() {
    return width;
  }

  /**
   * @param width the width to set
   */
  public void setWidth(int width) {
    this.width = width;
  }

  public int area() {
    return length * width;
  }
}
