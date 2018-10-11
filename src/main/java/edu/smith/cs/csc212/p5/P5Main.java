package edu.smith.cs.csc212.p5;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

public class P5Main extends GFX {

  public void draw(Graphics2D g) {
    g.setColor(Color.red);
    g.fillRect(0,0,getWidth(), getHeight());
  }

  public static void main(String[] args) {
    System.out.println("P5 Main Started!");
    GFX app = new P5Main();
    app.start();
  }
}
