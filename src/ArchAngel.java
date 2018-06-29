//import com.samsung.util.AudioClip;
import java.io.PrintStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public class ArchAngel
  extends MIDlet
{
  public int a = 1;
  public int b = 0;
  public int c;
  public int d = 0;
  public boolean e = false;
  public boolean f = true;
  public boolean g = false;
  public boolean h = false;
  public boolean i;
  public boolean j = false;
  public boolean k = false;
  public boolean l = false;
  public boolean m = false;
  public boolean n = false;
  public Random rnd = new Random();
  public int p = 0;
  public boolean q;
  public boolean r;
  public boolean s;
  public boolean t;
  public boolean u = false;
  public boolean v = true;
  public boolean w = true;
  public int x = 0;
  public int y = -1;
  public int z = 0;
  public int aa = -1;
  public int ab;
  public int ac;
  public int ad;
  public int ae = 40;
  public int af = 1;
  public int ag = 0;
  public int ah = 0;
  public GameScreen game_scrn = null;
  public GameSettings gameSetting = new GameSettings();
  public ReadMedia readMedia = new ReadMedia();
  public ReadText readText = new ReadText();
  public MainGameScreen mainGameScreen = new MainGameScreen(this, this.readMedia);
  public String[] an = { "ON", "OFF" };
  public String[] ao = { "AUTOMATIC", "MANUAL" };
  public String[] ap = { "Easy", "Hard" };
  //public AudioClip aq = null;
  public Thread thread = null;
  private boolean as = true;
  
  public void a()
  {
    AARecordStore localh = new AARecordStore();
    if (localh.readRecordStore("Angel1", false))
    {
      this.af = localh.returnByteCalc();
      this.ag = localh.returnByteCalc();
      localh.addScore();
    }
  }
  
  public void b()
  {
    AARecordStore localh = new AARecordStore();
    if (localh.readRecordStore("Angel", true))
    {
      this.gameSetting.calcFromRecord(localh);
      localh.byteCalculate(this.ah);
      localh.addScore();
    }
  }
  
  public ArchAngel()
  {
    a();
  }
  
  public void pauseApp()
  {
    this.game_scrn.a();
  }
  
  public void c()
  {
    /*if (this.aq != null)
    {
      this.aq.stop();
      this.aq = null;
    }*/
  }
  
  public void a(Graphics paramGraphics, String paramString, boolean paramBoolean)
  {
    int i1 = paramString.length() * 9;
    if (paramBoolean) {
      this.readMedia.drawGraphicStr40_122(paramGraphics, 5, 305, paramString);
    } else {
      this.readMedia.drawGraphicStr40_122(paramGraphics, 235 - i1, 305, paramString);
    }
  }
  
  public boolean d()
  {
    AARecordStore localh = new AARecordStore();
    if (localh.readRecordStore("Angel", false))
    {
      this.gameSetting.readRSSetting(localh);
      this.gameSetting.readArmPlasmaMissile(this.readText);
      this.ah = localh.returnByteCalc();
      localh.addScore();
      return true;
    }
    return false;
  }
  
  public void a(String paramString, int paramInt)
  {
    if (this.af == 0) {
      return;
    }
    /*if (this.aq != null)
    {
      this.aq.stop();
      this.aq = null;
    }*/
    try
    {
      /*String str = new String("/mmf/" + paramString + ".mid");
      this.aq = null;
      this.aq = new AudioClip(3, str);
      this.aq.play(paramInt, 3);
      System.out.println("play--->" + paramString);*/
    }
    catch (Exception localException)
    {
      System.out.println("Error play sound");
    }
  }
  
  public void a(int paramInt)
  {
    this.readText.readTextFromStream("ms" + paramInt); // e.a()
    this.readText.processTxt(1);
    System.out.println(" AA.a(int) al.a(1) ");
    this.mainGameScreen.r = this.readText.int_arr_m[0]; // f.r = 
    this.mainGameScreen.s = this.readText.int_arr_m[1];
    this.mainGameScreen.y = this.readText.int_arr_m[2];
    this.readText.processTxt(2);
    System.out.println(" AA.a(int) al.a(2) ");
    
    this.mainGameScreen.m = this.readText.buildString();
    if (this.ah == 0) {
      this.mainGameScreen.j = (this.readText.int_arr_m[0] / 2);
    } else {
      this.mainGameScreen.j = this.readText.int_arr_m[0];
    }
    this.mainGameScreen.k = this.readText.int_arr_m[1];
    this.mainGameScreen.l = this.readText.int_arr_m[2];
    this.mainGameScreen.h = this.readText.int_arr_m[3];
    this.readText.processTxt(3);
    System.out.println(" AA.a(int) al.a(3) ");
    
    this.mainGameScreen.q = this.readText.buildString();
    if (this.ah == 0) {
      this.mainGameScreen.n = (this.readText.int_arr_m[0] / 2);
    } else {
      this.mainGameScreen.n = this.readText.int_arr_m[0];
    }
    this.mainGameScreen.o = this.readText.int_arr_m[1];
    this.mainGameScreen.p = this.readText.int_arr_m[2];
    this.mainGameScreen.i = this.readText.int_arr_m[3];
    this.readText.processTxt(10);
    System.out.println(" AA.a(int) al.a(10) ");
    
    this.mainGameScreen.e = this.readText.buildString();
    this.readText.processTxt(4);
    System.out.println(" AA.a(int) al.a(4) ");
  }
  
  public boolean e()
  {
    AARecordStore localh = new AARecordStore();
    if (localh.readRecordStore("Angel", false))
    {
      localh.addScore();
      return true;
    }
    return false;
  }
  
  public void destroyApp(boolean paramBoolean)
  {
    this.game_scrn.b();
  }
  
  public void a(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, 240, 320);
    this.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 300);
  }
  
  public void startApp()
  {
    if (this.as)
    {
      this.game_scrn = new GameScreen(this);
      this.game_scrn.setFullScreenMode(true);
      Display.getDisplay(this).setCurrent(this.game_scrn);
      this.thread = new Thread(this.game_scrn);
      this.thread.start();
      this.ac = 0;
      this.as = false;
    }
  }
  
  public void f()
  {
    AARecordStore localh = new AARecordStore();
    if (localh.readRecordStore("Angel1", true))
    {
      localh.byteCalculate(this.af);
      localh.byteCalculate(this.ag);
      localh.addScore();
    }
  }
}
