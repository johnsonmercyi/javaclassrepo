package com.soft.inheritance;

import java.util.UUID;

public class Animal {
  private UUID id;
  protected String name;
  protected String sound;

  private enum Defaults {
    NAME, SOUND;
  }

  public Animal() {
    this(Defaults.NAME.toString(), Defaults.SOUND.toString());
  }

  public Animal(String name, String sound) {
    id = UUID.randomUUID();
    this.name = name;
    this.sound = sound;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

  @Override
  public String toString() {
    return "Animal [id=" + id + ", name=" + name + ", sound=" + sound + "]";
  }
}
