package org.teachingextensions.logo.shapes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.TurtlePanel;

/**
 * <img src="http://www.iconeasy.com/icon/thumbnails/System/BlankOn/Text%20Icon.jpg" align="left" >
 * Text allows you to write text on the window
 */
public class Text implements Paintable
{
  private final String string;
  private int          x;
  private int          y;
  private Color        color;
  public Text(String string)
  {
    this.string = string;
  }
  /**
   * Sets text position
   * <div><b>Example:</b> {@code  text.setTopLeft(x,y)}</div>
   * 
   * @param x
   *          the X position
   * @param 
   *          the Y position
   */
  public Text setTopLeft(int x, int y)
  {
    this.x = x;
    this.y = y;
    return this;
  }
  /**
   * Adds text to the window
   * <div><b>Example:</b> {@code  text.addTo(panel)}</div>
   * 
   * @param panel
   *          the ProgramWindow or panel
   */
  public void addTo(TurtlePanel panel)
  {
    panel.addPaintable(this);
  }
  @Override
  public void paint(Graphics2D g, JPanel caller)
  {
    Font font = g.getFont();
    Font font2 = new Font(font.getName(), font.getStyle() | Font.BOLD, font.getSize());
    if (this.color != null)
    {
      g.setColor(this.color);
    }
    g.setFont(font2);
    g.drawString(string, x, y);
  }
  public Text setPenColor(Color color)
  {
    this.color = color;
    return this;
  }
  public String getContent()
  {
    return this.string;
  }
  public Color getPenColor()
  {
    return this.color;
  }
  public int getX()
  {
    return this.x;
  }
  public int getY()
  {
    return this.y;
  }
}
