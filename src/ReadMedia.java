import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 
 * @author Nick Farrow
 * Read .msr (media binary combined file). .msr is optional extension. It can be 
 * extracted using some binary extract tool like photo_spliter.py by Greg Lavino.
 */
public class ReadMedia
{
  public Image[] img_arr_a = new Image[120];
  public Image img_b = null;
  public InputStream inputStream;
  public int[] int_arr_d = null;
  public int int_bound_e = 0;
  public String msr_media;
  
  public void destroyImage(int paramInt)
  {
    this.img_arr_a[paramInt] = null;
    System.gc();
  }
  
  public void mySetClip(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, 240, 320);
  }
  
  public void destroyImage53_115()
  {
    for (int i = 53; i <= 115; i++) {
      this.img_arr_a[i] = null;
    }
    System.gc();
  }
  
  public void drawImageAnchor20(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(this.img_arr_a[paramInt1], paramInt2, paramInt3, 20);
  }
  
  public ReadMedia()
  {
    readMediaStream("font");
    reloadImageArr(0, 0);
    reloadImageArr(1, 1);
    for (int i = 3; i < 6; i++) {
      reloadImageArr(i, i);
    }
    closeInputStream();
  }
  
  public void destroyImage7_53()
  {
    for (int i = 7; i <= 53; i++) {
      this.img_arr_a[i] = null;
    }
    System.gc();
  }
  
  // Load image from binary file seem complex, in many case the img_arr (120 items) has many null value.
  // These null value lead to NullPointer exception
  public void drawImageAnchor36(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(this.img_arr_a[paramInt1], paramInt2, paramInt3, 36);
  }
  
  public void drawStringGraphic(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
	if(paramString == null) { // dungnv
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
        drawImageAnchor20(paramGraphics, 0, paramInt1 + 6 * k - i * 5, paramInt2);
      }
    }
    mySetClip(paramGraphics);
  }
  
  public void drawGraphicStr40_122(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString)
  {
    for (int k = 0; k < paramString.length(); k++)
    {
      int j = paramString.charAt(k);
      if ((j >= 40) && (j <= 122))
      {
        int i = j - 40;
        paramGraphics.setClip(paramInt1 + 9 * k, paramInt2, 9, 13);
        drawImageAnchor20(paramGraphics, 1, paramInt1 + 9 * k - i * 9, paramInt2);
      }
    }
    mySetClip(paramGraphics);
  }
  
  public void drawImageSwitch(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paramGraphics.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
    switch (paramInt6)
    {
    case 0: 
      drawImageAnchor20(paramGraphics, 26, paramInt1, paramInt2 - paramInt4 * paramInt5);
      break;
    case 1: 
      drawImageAnchor20(paramGraphics, 27, paramInt1, paramInt2 - paramInt4 * paramInt5);
      break;
    case 2: 
      drawImageAnchor20(paramGraphics, 28, paramInt1, paramInt2 - paramInt4 * paramInt5);
      break;
    }
    mySetClip(paramGraphics);
  }
  
  public void reloadImageArr(int paramInt1, int paramInt2)
  {
    this.img_arr_a[paramInt2] = null;
    this.img_arr_a[paramInt2] = loadImage(paramInt1);
  }
  
  public Image loadImage(int paramInt)
  {
    byte[] arrayOfByte = new byte[this.int_arr_d[(paramInt + 1)] - this.int_arr_d[paramInt]];
    try
    {
      if (this.int_bound_e <= this.int_arr_d[paramInt])
      {
        this.inputStream.skip(this.int_arr_d[paramInt] - this.int_bound_e);
      }
      else
      {
        this.inputStream.close();
        this.inputStream = getClass().getResourceAsStream(this.msr_media);
        this.inputStream.skip(this.int_arr_d[paramInt]);
      }
      this.inputStream.read(arrayOfByte);
      this.int_bound_e = this.int_arr_d[(paramInt + 1)];
    }
    catch (Exception localException) {}
    return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public void drawImageInArr(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(this.img_arr_a[paramInt1], paramInt2, paramInt3, 3);
  }
  
  public int readBinaryData()
    throws Exception
  {
    int i = 0;
    byte[] arrayOfByte = new byte[4];
    this.inputStream.read(arrayOfByte);
    i = arrayOfByte[0] & 0xFF;
    i += ((arrayOfByte[1] & 0xFF) << 8);
    i += ((arrayOfByte[2] & 0xFF) << 16);
    i += ((arrayOfByte[3] & 0xFF) << 24);
    return i;
  }
  
  public void drawStringImage(String paramString, int paramInt1, Graphics paramGraphics, int paramInt2, int paramInt3)
  {
    readMediaStream(paramString);
    paramGraphics.drawImage(loadImage(paramInt1), paramInt2, paramInt3, 20);
    closeInputStream();
  }
  
  public void drawLoadImage(int paramInt1, Graphics paramGraphics, int paramInt2, int paramInt3)
  {
    paramGraphics.drawImage(loadImage(paramInt1), paramInt2, paramInt3, 20);
  }
  
  public void closeInputStream()
  {
    this.int_arr_d = null;
    try
    {
      this.inputStream.close();
    }
    catch (Exception localException) {}
    System.gc();
  }
  
  public void readMediaStream(String paramString)
  {
    paramString = "/msr/" + paramString + ".msr";
    this.msr_media = paramString;
    try
    {
      this.inputStream = getClass().getResourceAsStream(paramString);
      int i = readBinaryData() + 1;
      this.int_arr_d = new int[i];
      for (int j = 0; j < i; j++) {
        this.int_arr_d[j] = readBinaryData();
      }
    }
    catch (Exception localException) {}
    this.int_bound_e = this.int_arr_d[0];
    System.gc();
  }
}
