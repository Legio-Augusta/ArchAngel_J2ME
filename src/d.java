import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class d
{
  public Image[] a = new Image[120];
  public Image b = null;
  public InputStream c;
  public int[] d = null;
  public int e = 0;
  public String f;
  
  public void a(int paramInt)
  {
    this.a[paramInt] = null;
    System.gc();
  }
  
  public void a(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, 240, 320);
  }
  
  public void a()
  {
    for (int i = 53; i <= 115; i++) {
      this.a[i] = null;
    }
    System.gc();
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(this.a[paramInt1], paramInt2, paramInt3, 20);
  }
  
  public d()
  {
    a("font");
    a(0, 0);
    a(1, 1);
    for (int i = 3; i < 6; i++) {
      a(i, i);
    }
    d();
  }
  
  public void b()
  {
    for (int i = 7; i <= 53; i++) {
      this.a[i] = null;
    }
    System.gc();
  }
  
  public void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(this.a[paramInt1], paramInt2, paramInt3, 36);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
	if(paramString == null) {
		byte[] test = {-47, 1, 16, 84, 2, 101, 110, 83, 111, 109, 101, 32, 78, 70, 67, 32, 68, 97, 116, 97};
		paramString = new String(test, 0, 20);
	}
    for (int k = 0; k < paramString.length(); k++) // NAME: \n AZ 1 \n DAMAGE: 30MP 
    {
      int j = paramString.charAt(k);
      if ((j >= 48) && (j <= 90))
      {
        int i = j - 48;
        paramGraphics.setClip(paramInt1 + 6 * k, paramInt2, 5, 5);
        a(paramGraphics, 0, paramInt1 + 6 * k - i * 5, paramInt2);
      }
    }
    a(paramGraphics);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString)
  {
    for (int k = 0; k < paramString.length(); k++)
    {
      int j = paramString.charAt(k);
      if ((j >= 40) && (j <= 122))
      {
        int i = j - 40;
        paramGraphics.setClip(paramInt1 + 9 * k, paramInt2, 9, 13);
        a(paramGraphics, 1, paramInt1 + 9 * k - i * 9, paramInt2);
      }
    }
    a(paramGraphics);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paramGraphics.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
    switch (paramInt6)
    {
    case 0: 
      a(paramGraphics, 26, paramInt1, paramInt2 - paramInt4 * paramInt5);
      break;
    case 1: 
      a(paramGraphics, 27, paramInt1, paramInt2 - paramInt4 * paramInt5);
      break;
    case 2: 
      a(paramGraphics, 28, paramInt1, paramInt2 - paramInt4 * paramInt5);
      break;
    }
    a(paramGraphics);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a[paramInt2] = null;
    this.a[paramInt2] = b(paramInt1);
  }
  
  public Image b(int paramInt)
  {
    byte[] arrayOfByte = new byte[this.d[(paramInt + 1)] - this.d[paramInt]];
    try
    {
      if (this.e <= this.d[paramInt])
      {
        this.c.skip(this.d[paramInt] - this.e);
      }
      else
      {
        this.c.close();
        this.c = getClass().getResourceAsStream(this.f);
        this.c.skip(this.d[paramInt]);
      }
      this.c.read(arrayOfByte);
      this.e = this.d[(paramInt + 1)];
    }
    catch (Exception localException) {}
    return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(this.a[paramInt1], paramInt2, paramInt3, 3);
  }
  
  public int c()
    throws Exception
  {
    int i = 0;
    byte[] arrayOfByte = new byte[4];
    this.c.read(arrayOfByte);
    i = arrayOfByte[0] & 0xFF;
    i += ((arrayOfByte[1] & 0xFF) << 8);
    i += ((arrayOfByte[2] & 0xFF) << 16);
    i += ((arrayOfByte[3] & 0xFF) << 24);
    return i;
  }
  
  public void a(String paramString, int paramInt1, Graphics paramGraphics, int paramInt2, int paramInt3)
  {
    a(paramString);
    paramGraphics.drawImage(b(paramInt1), paramInt2, paramInt3, 20);
    d();
  }
  
  public void a(int paramInt1, Graphics paramGraphics, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(b(paramInt1), paramInt2, paramInt3, 20);
  }
  
  public void d()
  {
    this.d = null;
    try
    {
      this.c.close();
    }
    catch (Exception localException) {}
    System.gc();
  }
  
  public void a(String paramString)
  {
    paramString = "/msr/" + paramString + ".msr";
    this.f = paramString;
    try
    {
      this.c = getClass().getResourceAsStream(paramString);
      int i = c() + 1;
      this.d = new int[i];
      for (int j = 0; j < i; j++) {
        this.d[j] = c();
      }
    }
    catch (Exception localException) {}
    this.e = this.d[0];
    System.gc();
  }
}
