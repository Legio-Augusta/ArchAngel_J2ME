import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public class GameScreen
  extends Canvas
  implements Runnable
{
  public int a;
  public boolean bool_b;
  public final byte byte_c;
  public final byte byte_d;
  public final byte byte_e;
  public final byte byte_f;
  public final byte byte_g;
  public final byte byte_h;
  public final byte byte_i;
  public final byte byte_j;
  public int k;
  public int l;
  public int m;
  public int n;
  public int o;
  public int p;
  public int q;
  public ReadText readText;
  public int s;
  public int t;
  public int u;
  public boolean bool_v;
  public String[][] str_arr_w;
  public int x;
  public int y;
  public boolean bool_z;
  public int aa;
  public int ab;
  public int ac;
  public int ad;
  public int ae;
  public int af;
  public int ag;
  public boolean bool_ah;
  public final ArchAngel archAngel;
  
  public void loadBrief1(Graphics paramGraphics)
  {
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.readMedia.readMediaStream("font");
      this.archAngel.readMedia.reloadImageArr(5, 5);
      this.archAngel.readMedia.closeInputStream();
      this.archAngel.readMedia.readMediaStream("end");
      for (i1 = 0; i1 < 2; i1++) {
        this.archAngel.readMedia.reloadImageArr(i1, 31 + i1);
      }
      this.archAngel.readMedia.closeInputStream();
      this.archAngel.z += 1;
      break;
    case 1: 
      if (this.archAngel.x == 0)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, 320);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 0, 240, 40);
        paramGraphics.drawLine(0, 42, 240, 42);
        paramGraphics.drawLine(0, 45, 240, 45);
        paramGraphics.fillRect(0, 50, 240, 6);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 0);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 5, 27, 25);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 31, 0, 80);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 32, 0, 175);
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "SKIP", true);
        this.archAngel.a(paramGraphics, "NEXT", false);
        this.archAngel.readText.readTextFromStream("end");
      }
      this.archAngel.z = 11;
      break;
    case 15: 
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.archAngel.x, 240, 200 - 10 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 31, 0, 80);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 32, 0, 175);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 21)
      {
        this.archAngel.readMedia.destroyImage(31);
        this.archAngel.readMedia.destroyImage(32);
        this.archAngel.readMedia.readMediaStream("select");
        for (i1 = 0; i1 < 7; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 6 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.b = 3;
      }
      break;
    }
    if (this.archAngel.z < 15)
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 227, 240, 53);
      paramGraphics.setColor(16777130);
      paramGraphics.drawRect(0, 227, 239, 53);
      simple_arm_helper(paramGraphics, this.archAngel.z, 228);
    }
  }
  
  public void displayGameOver(Graphics paramGraphics)
  {
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.c = 0;
        this.archAngel.readMedia.readMediaStream("font");
        this.archAngel.readMedia.reloadImageArr(1, 1);
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "OK", false);
        this.archAngel.bool_s = false;
      }
      else
      {
        this.archAngel.z = 1;
      }
      break;
    case 1: 
      paramGraphics.setColor(107, 222, 255);
      paramGraphics.fillRect(45, 93, 150, 33);
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 62, 103, "YOU ARE DEAD");
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 129, "You have been");
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 144, "hit deadly.");
      paramGraphics.setColor(0);
      paramGraphics.fillRect(49, 172 + this.archAngel.c * 15, 75, 15);
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 174, "1. Retry");
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 189, "2. Back");
      break;
    case 2: 
      for (i1 = 11; i1 < 19; i1++) {
        this.archAngel.readMedia.destroyImage(24 + i1);
      }
      this.archAngel.readMedia.destroyImage7_53();
      this.archAngel.readMedia.destroyImage53_115();
      this.archAngel.b = 25;
      break;
    case 3: 
      if (this.archAngel.x < 16)
      {
        if (this.archAngel.x == 0)
        {
          for (i1 = 11; i1 < 19; i1++) {
            this.archAngel.readMedia.destroyImage(24 + i1);
          }
          this.archAngel.readMedia.destroyImage7_53();
          this.archAngel.readMedia.destroyImage53_115();
        }
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, this.archAngel.x * 10);
        paramGraphics.fillRect(0, 300 - this.archAngel.x * 10, 240, this.archAngel.x * 10);
      }
      if (this.archAngel.x == 16) {
        this.archAngel.b = 5;
      }
      break;
    }
  }
  
  public void loadSavedGame(Graphics paramGraphics)
  {
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160 - 5 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180 + 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.z += 1;
      }
      break;
    case 1: 
      if (this.archAngel.x < 22)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 80, 240, 200);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 65326 + this.archAngel.x * 10, 118);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 247 - this.archAngel.x * 10, 204);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 9, 65388 + this.archAngel.x * 10, 125);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 10, 266 - this.archAngel.x * 10, 211);
      }
      if (this.archAngel.x == 21) {
        this.archAngel.z += 1;
      }
      break;
    case 2: 
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0, 118);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37, 204);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 8, 41, 122 + this.l * 86);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 9, 62, 125);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 10, 56, 211);
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
      this.archAngel.bool_w = true;
      break;
    case 3: 
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 80, 240, 200);
      paramGraphics.setColor(4802901);
      paramGraphics.fillRect(0, 119, 240, 30);
      paramGraphics.fillRect(0, 171, 240, 10);
      paramGraphics.fillRect(0, 205, 240, 30);
      if (this.archAngel.x < 21)
      {
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0 - this.archAngel.x * 10, 118);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37 + this.archAngel.x * 10, 204);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 9, 62 - this.archAngel.x * 10, 125);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 10, 56 + this.archAngel.x * 10, 211);
      }
      else if (this.archAngel.x < 43)
      {
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 65326 + (this.archAngel.x - 21) * 10, 118);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 247 - (this.archAngel.x - 21) * 10, 204);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 11, 65381 + (this.archAngel.x - 21) * 10, 125);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 12, 265 - (this.archAngel.x - 21) * 10, 211);
      }
      if (this.archAngel.x == 42) {
        this.archAngel.z += 1;
      }
      break;
    case 4: 
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0, 118);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37, 204);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 8, 41, 122 + this.archAngel.ah * 86);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 11, 55, 125);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 12, 55, 211);
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
      break;
    case 5: 
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.archAngel.x, 240, 200 - 10 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0, 118);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37, 204);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 8, 41, 122 + this.archAngel.ah * 86);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 11, 55, 125);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 12, 55, 211);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        for (i1 = 0; i1 < 7; i1++) {
          this.archAngel.readMedia.destroyImage(6 + i1);
        }
        this.archAngel.b = 26;
      }
      break;
    case 6: 
      if (this.archAngel.x < 20)
      {
        this.archAngel.bool_w = false;
        paramGraphics.setColor(0);
        paramGraphics.fillRect(41, 208, 160, 26);
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 47, 218, "A SAVED GAME IS NOT FOUND.", 0);
      }
      if (this.archAngel.x == 20) {
        this.archAngel.z = 2;
      }
      break;
    case 7: 
      for (i1 = 0; i1 < 7; i1++) {
        this.archAngel.readMedia.destroyImage(6 + i1);
      }
      this.archAngel.bool_k = true;
      this.archAngel.d();
      this.archAngel.gameSetting.initSetting();
      this.archAngel.b = 9;
      this.l = 0;
      break;
    }
  }
  
  public void briefOpen(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160 - 5 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180 + 5 * this.archAngel.x);
        paramGraphics.setClip(0, 180 - 5 * this.archAngel.x, 240, 10 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 29, 0, 80);
      }
      if (this.archAngel.x == 20) {
        this.archAngel.z += 1;
      }
      break;
    case 1: 
      if (this.archAngel.x == 0) {
        this.archAngel.readText.readTextFromStream("open");
      }
      this.archAngel.z = 11;
      break;
    case 18: 
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.archAngel.x, 240, 200 - 10 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 29, 0, 80);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.readMedia.destroyImage(29);
        this.archAngel.b = 2;
      }
      break;
    }
    if (this.archAngel.z < 18)
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 227, 240, 53);
      paramGraphics.setColor(16777130);
      paramGraphics.drawRect(0, 227, 239, 53);
      simple_arm_helper(paramGraphics, this.archAngel.z, 228);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
    }
    this.archAngel.drawImage(paramGraphics);
    this.archAngel.a(paramGraphics, "SKIP", true);
    this.archAngel.a(paramGraphics, "NEXT", false);
  }
  
  public void briefAbout(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.readText.readTextFromStream("about");
      this.archAngel.z += 1;
      break;
    case 1: 
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
      paramGraphics.setClip(17, 89, 223, 25);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90 - this.l * 33);
      paramGraphics.setClip(0, 0, 240, 320);
      paramGraphics.setColor(7171414);
      paramGraphics.fillRect(2, 119, 238, 181);
      paramGraphics.setColor(9605802);
      paramGraphics.drawRect(2, 119, 237, 180);
      simple_helper2(paramGraphics, this.archAngel.z, 130);
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      break;
    }
  }
  
  public void machineShopLogic(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    int i2 = 14;
    if (this.archAngel.b == 7) {
      i2 = 30;
    }
    this.archAngel.readText.processTxt(paramInt1);
    this.archAngel.readText.b = 0;
    this.archAngel.p = this.archAngel.readText.o;
    String str;
    while ((str = this.archAngel.readText.buildString()) != null)
    {
      if ((this.archAngel.b == 26) || (this.archAngel.b == 27)) {
        paramGraphics.setColor(16777215);
      } else {
        paramGraphics.setColor(0);
      }
      int i4 = str.indexOf(".");
      if (i4 == 1)
      {
        int i3;
        try
        {
          i3 = Integer.parseInt(str.substring(0, i4));
        }
        catch (Exception localException)
        {
          i3 = -1;
        }
        if (i3 > this.archAngel.readText.b) {
          this.archAngel.readText.b = i3;
        }
        if (i3 == this.archAngel.readText.a) {
          paramGraphics.setColor(14361600);
        }
      }
      if (this.archAngel.b == 13)
      {
        paramGraphics.drawString(str, i2, i1 + 8, 20);
      }
      else
      {
        if (this.archAngel.b != 7) {
          paramGraphics.drawString(str, i2, i1, 20);
        }
        if ((this.archAngel.b == 10) && (paramInt1 == 51) && ((this.archAngel.readText.a <= 2) || (this.archAngel.readText.a == 4))) {
          paramGraphics.setColor(0);
        }
      }
      if (this.archAngel.b == 13)
      {
        if (this.archAngel.readText.a == 2) {
          paramGraphics.setColor(0);
        } else {
          paramGraphics.setColor(40960);
        }
        paramGraphics.drawString(this.archAngel.on_off[(1 - this.archAngel.af)], 83, 119, 20);
      }
      i1 += 17;
    }
    if (this.archAngel.bool_s)
    {
      paramGraphics.setColor(0);
      paramGraphics.drawString("1.YES   2.NO", 88, 105, 17);
    }
    this.archAngel.bool_g = false;
  }
  
  public void keyPressed(int paramInt)
  {
    int i1 = getGameAction(paramInt);
    if (this.archAngel.bool_h) {
      return;
    }
    switch (this.archAngel.b)
    {
    case 0: 
      if (this.archAngel.z == 1) {
        this.archAngel.z += 1;
      }
      break;
    case 3: 
      if (this.archAngel.z == 2) {
        switch (paramInt)
        {
        case -4: 
        case -2: 
          this.l += 1;
          if (this.l > 1) {
            this.l = 0;
          }
          this.archAngel.playSound("s_menu_move", 1);
          break;
        case -3: 
        case -1: 
          this.l += -1;
          if (this.l < 0) {
            this.l = 1;
          }
          this.archAngel.playSound("s_menu_move", 1);
          break;
        case -7: // GAME_B RIGHT_UP
        case -5: 
          if (this.l == 0)
          {
            this.archAngel.z += 1;
            this.l = 0;
          }
          else if (this.archAngel.bool_w == true)
          {
            if (this.archAngel.e()) {
              this.archAngel.z = 7;
            } else {
              this.archAngel.z = 6;
            }
          }
          break;
        }
      } else if (this.archAngel.z == 4) {
        switch (paramInt)
        {
        case -4: 
        case -3: 
        case -2: 
        case -1: 
          this.archAngel.ah = (1 - this.archAngel.ah);
          this.archAngel.playSound("s_menu_move", 1);
          break;
        case -7: 
        case -5: 
          this.archAngel.readMedia.readMediaStream("open");
          this.archAngel.readMedia.reloadImageArr(0, 29);
          this.archAngel.readMedia.closeInputStream();
          this.archAngel.z += 1;
          break;
        }
      }
      this.archAngel.bool_q = true;
      break;
    case 26: 
      if ((this.archAngel.z > 1) && (this.archAngel.z < 18)) {
        switch (paramInt)
        {
        case -7: 
        case -5: 
          this.archAngel.z += 1;
          break;
        case -6: 
          this.archAngel.z = 18;
        }
      }
      break;
    case 5: 
      if (this.archAngel.z == 3) {
        switch (paramInt)
        {
        case -4: 
        case -2: 
        case 56: 
          this.l += 1;
          if (this.l > 4) {
            this.l = 0;
          }
          this.archAngel.playSound("s_menu_move", 1);
          this.archAngel.bool_e = true;
          break;
        case -3: 
        case -1: 
        case 50: 
          this.l += -1;
          if (this.l < 0) {
            this.l = 4;
          }
          this.archAngel.playSound("s_menu_move", 1);
          this.archAngel.bool_e = true;
          break;
        case -6: 
          this.archAngel.b = 9;
          break;
        case -7: 
        case -5: 
          if (this.l == 5) {
            this.archAngel.b = 4;
          } else {
            this.archAngel.b = ((byte)(8 + this.l));
          }
        }
      }
      break;
    case 2: 
      break;
    case 8: 
      if (((paramInt == -7) || (paramInt == -5)) && (this.archAngel.z > 0)) {
        this.archAngel.z += 1;
      }
      break;
    case 9: 
      if (this.archAngel.z >= 11) {
        if ((paramInt == -7) || (paramInt == -5))
        {
          if (this.archAngel.z > 0) {
            this.archAngel.z += 1;
          }
        }
        else if (paramInt == -6) {
          this.archAngel.z = 999;
        }
      }
      break;
    case 25: 
      if ((this.archAngel.z == 4) && (this.archAngel.bool_m == true))
      {
        if ((this.archAngel.mainGameScreen.bi == 1) && (paramInt != 53) && (paramInt != -5))
        {
          this.archAngel.mainGameScreen.play_s_gun(false);
          this.archAngel.stopSound();
        }
        if ((this.archAngel.mainGameScreen.bi == 3) && (this.archAngel.ag != 1) && (paramInt != 53) && (paramInt != -5))
        {
          keyReleased(53);
          this.archAngel.mainGameScreen.play_s_plasma(false);
          this.archAngel.stopSound();
        }
        if ((paramInt == 53) || (paramInt == -5))
        {
          keyReleased(50);
          this.archAngel.mainGameScreen.setup3();
          this.archAngel.mainGameScreen.ba = 0;
          this.archAngel.mainGameScreen.a9 = 0;
          this.archAngel.mainGameScreen.bd = 0;
        }
        switch (paramInt)
        {
        case 49: 
          this.archAngel.mainGameScreen.simple_90(true);
          this.archAngel.mainGameScreen.ba = 3;
          break;
        case 51: 
          this.archAngel.mainGameScreen.simple_90(false);
          this.archAngel.mainGameScreen.ba = 4;
          break;
        case 53: 
          if ((this.archAngel.mainGameScreen.bi == 1) && (this.archAngel.bool_m == true)) {
            this.archAngel.mainGameScreen.play_s_gun(true);
          }
          if ((this.archAngel.mainGameScreen.bi == 3) && (this.archAngel.bool_n == true))
          {
            this.archAngel.mainGameScreen.bool_bh = false;
            this.archAngel.mainGameScreen.play_s_plasma(true);
          }
          break;
        case 57: 
          if (this.archAngel.mainGameScreen.bi == 1) {
            this.archAngel.mainGameScreen.play_missile_sound();
          }
          break;
        case 50: 
          this.archAngel.mainGameScreen.simple_bool(true);
          this.archAngel.mainGameScreen.a9 = 1;
          break;
        case 56: 
          this.archAngel.mainGameScreen.simple_bool(false);
          this.archAngel.mainGameScreen.a9 = 2;
          break;
        case 52: 
          this.archAngel.mainGameScreen.left_right(true);
          this.archAngel.mainGameScreen.ba = 1;
          break;
        case 54: 
          this.archAngel.mainGameScreen.left_right(false);
          this.archAngel.mainGameScreen.ba = 2;
          break;
        case 48: 
          if (this.archAngel.mainGameScreen.bi == 3)
          {
            this.archAngel.mainGameScreen.bool_az = false;
            if (this.archAngel.gameSetting.t < this.archAngel.gameSetting.r) {
              this.archAngel.playSound("s_reload", 1);
            }
            this.archAngel.mainGameScreen.bool_bh = true;
          }
          break;
        case 55: 
        default: 
          switch (paramInt)
          {
          case -2: 
            this.archAngel.mainGameScreen.simple_bool(false);
            this.archAngel.mainGameScreen.a9 = 2;
            break;
          case -1: 
            this.archAngel.mainGameScreen.simple_bool(true);
            this.archAngel.mainGameScreen.a9 = 1;
            break;
          case -4: 
            this.archAngel.mainGameScreen.left_right(false);
            this.archAngel.mainGameScreen.ba = 2;
            break;
          case -3: 
            this.archAngel.mainGameScreen.left_right(true);
            this.archAngel.mainGameScreen.ba = 1;
            break;
          case -7: 
            if (this.archAngel.bool_l) {
              this.archAngel.b = 13;
            }
            break;
          case -6: 
            if (this.archAngel.bool_l) {
              this.archAngel.b = 14;
            }
            break;
          case -5: 
            if ((this.archAngel.mainGameScreen.bi == 1) && (this.archAngel.bool_m == true)) {
              this.archAngel.mainGameScreen.play_s_gun(true);
            }
            if ((this.archAngel.mainGameScreen.bi == 3) && (this.archAngel.bool_n == true))
            {
              this.archAngel.mainGameScreen.bool_bh = false;
              this.archAngel.mainGameScreen.play_s_plasma(true);
            }
            break;
          }
        }
      }
      break;
    case 11: 
      if (paramInt == -6)
      {
        if (this.archAngel.z < 10) {
          this.archAngel.z = this.archAngel.p;
        }
      }
      else
      {
        int i2 = -1;
        if ((paramInt >= 49) && (paramInt <= 51))
        {
          if (this.archAngel.z < 10) {
            i2 = paramInt - 49 + 1;
          }
        }
        else
        {
          switch (paramInt)
          {
          case -3: 
          case -2: 
            if (this.archAngel.z < 10)
            {
              this.archAngel.readText.a += 1;
              this.archAngel.x = -1;
              this.archAngel.bool_g = true;
            }
            break;
          case -4: 
          case -1: 
            if (this.archAngel.z < 10)
            {
              this.archAngel.readText.a += -1;
              this.archAngel.x = -1;
              this.archAngel.bool_g = true;
            }
            break;
          case -7: 
          case -5: 
            if (this.archAngel.z == 5) {
              i2 = this.archAngel.readText.a;
            } else {
              i2 = 1;
            }
            break;
          }
          if (this.archAngel.readText.a <= 0) {
            this.archAngel.readText.a = this.archAngel.readText.b;
          }
          if (this.archAngel.readText.a > this.archAngel.readText.b) {
            this.archAngel.readText.a = 1;
          }
        }
        if ((i2 > 0) && (this.archAngel.readText.int_arr_m[(i2 - 1)] > 0))
        {
          this.archAngel.z = this.archAngel.readText.int_arr_m[(i2 - 1)];
          this.archAngel.x = 0;
        }
      }
      break;
    case 12: 
      System.gc();
      if (this.bool_v == true)
      {
        this.archAngel.x = -1;
        if ((paramInt == 50) || (paramInt == -5) || (paramInt == 49) || (paramInt == -7)) {
          this.archAngel.a = 1;
        }
        if (((paramInt == 50) || (paramInt == 49) || (paramInt == -5) || (paramInt == -7) || (paramInt == -6)) && (this.archAngel.bool_s)) {
          this.archAngel.bool_s = false;
        }
        if ((this.archAngel.z == 100) || (this.archAngel.z == 200) || (this.archAngel.z == 300)) {
          switch (paramInt)
          {
          case -1: 
            if (this.archAngel.a == 1)
            {
              this.archAngel.a = 7;
              this.archAngel.bool_r = true;
            }
            else
            {
              this.archAngel.a += 8;
              this.archAngel.a = ((this.archAngel.a += -1) % 8);
            }
            break;
          case -2: 
            if (this.archAngel.a == 7) {
              this.archAngel.a = 1;
            } else {
              this.archAngel.a = (++this.archAngel.a % 8);
            }
            break;
          }
        }
        if (((this.archAngel.z == 111) || (this.archAngel.z == 211) || (this.archAngel.z == 311)) && ((paramInt == -7) || (paramInt == -5)))
        {
          this.archAngel.a = 1;
          if (this.archAngel.p > 0) {
            this.archAngel.z = this.archAngel.p;
          }
        }
        this.archAngel.bool_q = true;
      }
      if (this.bool_v == true) {
        if (paramInt == -6)
        {
          this.archAngel.a = 1;
          if (this.archAngel.p > 0) {
            this.archAngel.z = this.archAngel.p;
          }
        }
        else if ((this.archAngel.z != 111) && (this.archAngel.z != 211) && (this.archAngel.z != 311))
        {
          read_text_helper(paramInt, i1);
        }
      }
      break;
    case 7: 
      if ((paramInt == -1) || (paramInt == -2)) {
        this.archAngel.c = (1 - this.archAngel.c);
      }
      if ((paramInt == -7) || (paramInt == -5)) {
        if (this.archAngel.c == 0) {
          this.archAngel.z = 2;
        } else {
          this.archAngel.z = 3;
        }
      }
      break;
    case 4: 
      if ((this.archAngel.z == 1) && (paramInt == -6)) {
        this.archAngel.b = 5;
      }
      break;
    case 1: 
    case 10: 
      if (this.archAngel.z == 1) {
        this.archAngel.readText.bool_e = false;
      }
      if (paramInt == -6)
      {
        if (this.archAngel.b == 1)
        {
          this.archAngel.z = 10;
        }
        else if ((this.archAngel.z == 100) || (this.archAngel.z == 200) || (this.archAngel.z == 300))
        {
          this.archAngel.z = 50;
        }
        else if (((this.archAngel.z >= 101) && (this.archAngel.z <= 104)) || ((this.archAngel.z >= 201) && (this.archAngel.z <= 205)) || ((this.archAngel.z >= 301) && (this.archAngel.z <= 304)))
        {
          this.archAngel.z += -1;
        }
        else if (this.archAngel.p > 0)
        {
          if (this.archAngel.z == 61) {
            this.archAngel.readText.bool_e = true;
          }
          this.archAngel.z = this.archAngel.p;
        }
      }
      else if (this.archAngel.bool_v) {
        read_text_helper(paramInt, i1);
      }
      this.archAngel.bool_w = true;
      break;
    case 13: 
      if ((paramInt != -6) && (this.archAngel.bool_v))
      {
        read_text_helper(paramInt, i1);
        if ((this.archAngel.mainGameScreen.bool_az == true) && (this.q == 1) && (this.archAngel.readText.a == 1) && ((paramInt == -7) || (paramInt == -5) || (paramInt == 49))) {
          this.archAngel.playSound("s_plasma", 0);
        }
        if ((this.archAngel.readText.a == 1) && ((paramInt == -7) || (paramInt == -5) || (paramInt == 49)))
        {
          this.archAngel.mainGameScreen.setup3();
          this.archAngel.mainGameScreen.ba = 0;
          this.archAngel.mainGameScreen.a9 = 0;
          this.archAngel.mainGameScreen.bd = 0;
        }
      }
      break;
    case 6: 
      if ((paramInt == -7) && ((this.archAngel.z == 2) || (this.archAngel.z == 4))) {
        this.archAngel.z += 1;
      }
      break;
    case 14: 
      if ((paramInt == -7) || (paramInt == -5) || (paramInt == 35))
      {
        this.archAngel.z += 1;
        if (this.archAngel.mainGameScreen.bool_az == true) {
          this.archAngel.playSound("s_plasma", 0);
        }
        this.archAngel.mainGameScreen.setup3();
        this.archAngel.mainGameScreen.ba = 0;
        this.archAngel.mainGameScreen.a9 = 0;
        this.archAngel.mainGameScreen.bd = 0;
      }
      break;
    case 27: 
      if ((this.archAngel.z > 1) && (this.archAngel.z < 15)) {
        switch (paramInt)
        {
        case -7: 
        case -5: 
          this.archAngel.z += 1;
          break;
        case -6: 
          this.archAngel.z = 15;
        }
      }
      break;
    }
  }
  
  public void draw_system_setin(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      this.y = 1;
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
      paramGraphics.setClip(17, 89, 223, 25);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90 - this.l * 33);
      paramGraphics.setClip(0, 0, 240, 320);
      if (this.archAngel.x == 0) {
        this.archAngel.readText.readTextFromStream("system");
      }
      simple_helper(paramGraphics);
      return;
    case 1: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.bool_d = false;
      this.archAngel.readText.h = 1;
      this.archAngel.readText.g = this.y;
      if (this.archAngel.bool_u) {
        this.archAngel.addScore12();
      }
      this.archAngel.bool_u = false;
      break;
    case 11: 
      this.archAngel.addScore();
      this.archAngel.z = 12;
      break;
    case 100: 
    case 200: 
    case 300: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "NEXT", false);
      break;
    case 101: 
    case 102: 
    case 103: 
    case 201: 
    case 202: 
    case 203: 
    case 204: 
    case 301: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "PREV", true);
      this.archAngel.a(paramGraphics, "NEXT", false);
      break;
    case 104: 
    case 205: 
    case 302: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "PREV", true);
      this.archAngel.a(paramGraphics, "OK", false);
      break;
    case 21: 
      if (this.archAngel.e())
      {
        this.archAngel.d();
        this.archAngel.readText.readTextFromStream("system");
        this.archAngel.z = 22;
      }
      else
      {
        this.archAngel.z = 23;
      }
      break;
    case 12: 
    case 22: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "OK", false);
      break;
    case 10: 
      this.archAngel.readText.bool_c = false;
      this.y = 1;
      break;
    case 20: 
      this.archAngel.readText.bool_c = false;
      this.y = 2;
      break;
    case 33: 
      this.archAngel.af = (1 - this.archAngel.af);
      if (this.archAngel.af == 0) {
        this.archAngel.stopSound();
      }
      this.archAngel.bool_u = true;
    case 30: 
      this.archAngel.readText.bool_c = false;
      this.y = 3;
      this.archAngel.z = (31 + this.archAngel.af);
      break;
    case 43: 
      this.archAngel.ag = (1 - this.archAngel.ag);
      this.archAngel.bool_u = true;
    case 40: 
      this.archAngel.readText.bool_c = false;
      this.y = 4;
      this.archAngel.z = (41 + this.archAngel.ag);
      break;
    case 50: 
      this.archAngel.readText.bool_c = false;
      this.y = 5;
      this.archAngel.readText.readTextFromStream("helpmain");
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.readText.bool_d = true;
      this.archAngel.z = 61;
      break;
    case 99: 
      this.archAngel.readText.bool_d = false;
      this.archAngel.readText.h = 1;
      this.archAngel.readText.readTextFromStream("help0");
      this.archAngel.z += 1;
      break;
    case 199: 
      this.archAngel.readText.bool_d = false;
      this.archAngel.readText.h = 2;
      this.archAngel.readText.readTextFromStream("help1");
      this.archAngel.z += 1;
      break;
    case 299: 
      this.archAngel.readText.bool_d = false;
      this.archAngel.readText.h = 3;
      this.archAngel.readText.readTextFromStream("help2");
      this.archAngel.z += 1;
      break;
    case 399: 
      this.archAngel.readText.readTextFromStream("help3");
      this.archAngel.z += 1;
      break;
    case 500: 
      this.archAngel.readText.readTextFromStream("system");
      this.archAngel.z = 1;
      if (this.archAngel.b != 10) {
        return;
      }
      break;
    case 70: 
      this.archAngel.b = 5;
      return;
    case 999: 
      this.archAngel.stopSound();
      this.archAngel.addScore();
      this.archAngel.destroyApp(false);
      this.archAngel.notifyDestroyed();
      return;
    }
    if (this.archAngel.bool_w) {
      setup2(paramGraphics, this.archAngel.z, 150);
    }
  }
  
  /**
   * Data embeded in text file, like inline/custom Database.
   * @param paramGraphics
   * @param paramInt1
   * @param paramInt2
   */
  public void drawDataInTxt(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    b(paramGraphics, paramInt1);
    this.archAngel.readText.processTxt(paramInt1);
    this.archAngel.readText.b = 0;
    this.archAngel.p = this.archAngel.readText.o;
    switch (this.x)
    {
    case 0: 
      paramGraphics.setColor(430330);
      break;
    case 1: 
      paramGraphics.setColor(65280);
      break;
    case 2: 
      paramGraphics.setColor(16776960);
      break;
    }
    String str;
    while ((str = this.archAngel.readText.buildString()) != null)
    {
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 10, i1, str, this.x);
      paramGraphics.setClip(0, 0, 240, 300);
      int i3 = str.indexOf("=");
      if (i3 == 1)
      {
        int i2;
        try
        {
          i2 = Integer.parseInt(str.substring(0, i3));
        }
        catch (Exception localException)
        {
          i2 = -1;
        }
        if (i2 > this.archAngel.readText.b) {
          this.archAngel.readText.b = i2;
        }
        if (i2 == this.archAngel.readText.a)
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(7, i1 - 2, str.length() * 6 + 6, 9);
          this.archAngel.readMedia.drawStringGraphic(paramGraphics, 10, i1, str, 3);
        }
      }
      i1 += 11;
    }
    this.archAngel.bool_g = false;
  }
  
  public void save_equipment(Graphics paramGraphics)
  {
    paramGraphics.setColor(0);
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 145, "Save equipment");
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 160, "as you are using.");
  }
  
  public void read_text_helper(int paramInt1, int paramInt2)
  {
    int i1 = -1;
    if ((paramInt1 >= 49) && (paramInt1 <= 57))
    {
      i1 = paramInt1 - 49 + 1;
      if (this.archAngel.b == 13) {
        this.archAngel.readText.a = i1;
      }
    }
    else if ((paramInt1 != -8) && (paramInt1 != 42) && (paramInt1 != 48) && (paramInt1 != 35))
    {
      switch (paramInt1)
      {
      case -4: 
      case -2: 
        this.archAngel.readText.a += 1;
        this.archAngel.x = -1;
        this.archAngel.bool_g = true;
        break;
      case -3: 
      case -1: 
        this.archAngel.readText.a += -1;
        this.archAngel.x = -1;
        this.archAngel.bool_g = true;
        break;
      default: 
        i1 = this.archAngel.readText.a;
      }
      if (this.archAngel.readText.a <= 0) {
        this.archAngel.readText.a = this.archAngel.readText.b;
      }
      if (this.archAngel.readText.a > this.archAngel.readText.b) {
        this.archAngel.readText.a = 1;
      }
    }
    if ((i1 > 0) && (this.archAngel.readText.int_arr_m[(i1 - 1)] > 0))
    {
      this.archAngel.z = this.archAngel.readText.int_arr_m[(i1 - 1)];
      this.archAngel.x = 0;
    }
  }
  
  public void draw_start_option(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x < 4)
      {
        if (this.archAngel.x == 0)
        {
          this.archAngel.playSound("m_briefing", 0);
          this.archAngel.readMedia.readMediaStream("brief");
        }
        this.archAngel.readMedia.reloadImageArr(this.archAngel.x, 17 + this.archAngel.x);
      }
      if (this.archAngel.x == 4)
      {
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.readMedia.readMediaStream("boss" + this.archAngel.gameSetting.b);
        this.archAngel.readMedia.reloadImageArr(8, 21);
        this.archAngel.readMedia.closeInputStream();
        if (this.archAngel.bool_k)
        {
          this.archAngel.readMedia.readMediaStream("menu");
          for (i1 = 0; i1 < 4; i1++) {
            this.archAngel.readMedia.reloadImageArr(i1, 13 + i1);
          }
          this.archAngel.readMedia.closeInputStream();
          paramGraphics.setColor(0);
          paramGraphics.fillRect(0, 80, 240, 220);
          this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 15, 33, 60);
          paramGraphics.setClip(198, 60, 18, 20);
          this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 16, 198, 60 - this.archAngel.gameSetting.b * 20);
          paramGraphics.setClip(0, 0, 240, 320);
        }
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90);
        if (this.archAngel.gameSetting.b < 4) {
          this.archAngel.readMedia.readMediaStream("enermy" + this.archAngel.gameSetting.b);
        } else {
          this.archAngel.readMedia.readMediaStream("boss" + (this.archAngel.gameSetting.b - 4));
        }
        this.archAngel.readMedia.reloadImageArr(8, 22);
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.drawImage(paramGraphics);
        if (this.archAngel.b == 9) {
          this.archAngel.a(paramGraphics, "SKIP", true);
        }
        this.archAngel.a(paramGraphics, "NEXT", false);
        this.archAngel.z += 1;
        this.archAngel.p = -1;
        this.archAngel.bool_h = false;
      }
      return;
    case 1: 
      this.archAngel.z = 11;
      this.archAngel.a(this.archAngel.gameSetting.b + 1);
      paramGraphics.setColor(65280);
      break;
    case 999: 
      if (this.archAngel.b == 9) {
        this.archAngel.b = 25;
      } else {
        this.archAngel.b = 5;
      }
      this.archAngel.gameSetting.c = this.archAngel.gameSetting.b;
      for (i1 = 0; i1 < 6; i1++) {
        this.archAngel.readMedia.destroyImage(17 + i1);
      }
      return;
    }
    if (this.archAngel.z >= 11) {
      draw_arm(paramGraphics, this.archAngel.z, 242);
    }
    if (!this.archAngel.readText.processTxt(this.archAngel.z + 1))
    {
      if (this.archAngel.b == 9)
      {
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "START", false);
      }
      else
      {
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "OPTIONS", false);
      }
      this.archAngel.aa = (this.archAngel.z = '?');
    }
  }
  
  public void load_system_txt(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0) {
        this.archAngel.readText.readTextFromStream("system");
      }
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "PLAY", true);
      this.archAngel.a(paramGraphics, "OK", false);
      simple_helper(paramGraphics);
      return;
    case 1: 
      this.archAngel.z = 2;
      break;
    case 10: 
      this.archAngel.b = 2;
      return;
    }
    draw_system_setin(paramGraphics);
  }
  
  public void empty_func() {}
  
  public void setup2(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    this.archAngel.bool_w = false;
    draw_arm_shop_menu(paramGraphics, paramInt1, paramInt2);
  }
  
  public void draw_game_play_screen(Graphics paramGraphics)
  {
    this.archAngel.ac = this.archAngel.gameSetting.b;
    this.archAngel.mainGameScreen.z = 0;
    if (this.archAngel.ac < 3) {
      this.archAngel.ad = 0;
    } else if ((this.archAngel.ac == 3) || (this.archAngel.ac == 4)) {
      this.archAngel.ad = 1;
    } else if (this.archAngel.ac > 4) {
      this.archAngel.ad = 2;
    }
    this.archAngel.mainGameScreen.bj = 16749568;
    this.archAngel.mainGameScreen.bk = 16768512;
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.bool_m = false;
      this.archAngel.bool_n = false;
      this.archAngel.bool_l = false;
      this.l = 1;
      this.archAngel.readMedia.destroyImage7_53();
      this.archAngel.readMedia.destroyImage53_115();
      this.archAngel.readMedia.destroyImage(2);
      this.archAngel.readMedia.destroyImage(5);
      this.archAngel.gameSetting.initGame1();
      this.archAngel.a(this.archAngel.gameSetting.b + 1);
      this.archAngel.mainGameScreen.init_game2();
      this.archAngel.readMedia.readMediaStream("etc");
      this.archAngel.readMedia.reloadImageArr(0, 111);
      this.archAngel.readMedia.closeInputStream();
      this.archAngel.readMedia.readMediaStream("aa");
      this.archAngel.readMedia.reloadImageArr(0, 24);
      this.archAngel.readMedia.reloadImageArr(9, 33);
      this.archAngel.readMedia.reloadImageArr(10, 34);
      this.archAngel.readMedia.closeInputStream();
      this.archAngel.z += 1;
      break;
    case 1: 
      switch (this.archAngel.x)
      {
      case 0: 
        this.archAngel.readMedia.readMediaStream("background" + this.archAngel.ad);
        for (i1 = 0; i1 < 2; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 7 + i1);
        }
        break;
      case 1: 
        for (i1 = 0; i1 < 9; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1 + 2, 9 + i1);
        }
        if (this.archAngel.ad == 2) {
          for (i1 = 0; i1 < 3; i1++) {
            this.archAngel.readMedia.reloadImageArr(i1 + 11, 18 + i1);
          }
        }
        this.archAngel.readMedia.closeInputStream();
        break;
      case 2: 
        System.gc();
        this.archAngel.z += 1;
        break;
      }
      draw_rect_clip_helper(paramGraphics, this.archAngel.x);
      break;
    case 2: 
      switch (this.archAngel.x)
      {
      case 0: 
        this.archAngel.readMedia.readMediaStream("ui");
        for (i1 = 0; i1 < 3; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 21 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.readMedia.readMediaStream("effect");
        for (i1 = 0; i1 < 13; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 71 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        break;
      case 1: 
        System.gc();
        this.archAngel.z += 1;
        break;
      }
      draw_rect_clip_helper(paramGraphics, this.archAngel.x + 3);
      break;
    case 3: 
      draw_rect_clip_helper(paramGraphics, this.archAngel.x + 5);
      switch (this.archAngel.x)
      {
      case 0: 
        this.archAngel.readMedia.readMediaStream("aa");
        for (i1 = 0; i1 < 11; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 24 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        break;
      case 1: 
        if (this.archAngel.ac < 4) {
          this.archAngel.readMedia.readMediaStream("enermy" + this.archAngel.ac);
        } else {
          this.archAngel.readMedia.readMediaStream("boss" + (this.archAngel.ac - 4));
        }
        for (i1 = 0; i1 < 8; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 53 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        break;
      case 2: 
        this.archAngel.readMedia.readMediaStream("fence" + this.archAngel.ad);
        for (i1 = 0; i1 < 8; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 44 + i1);
        }
        this.archAngel.readMedia.readMediaStream("plasma");
        for (i1 = 18; i1 < 24; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 84 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        break;
      case 3: 
        this.archAngel.stopSound();
        System.gc();
        this.archAngel.z += 1;
      }
      break;
    case 4: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.readMedia.destroyImage(111);
        this.bool_b = false;
        setting2(paramGraphics);
        this.archAngel.bool_j = false;
      }
      paramGraphics.setClip(0, 0, 240, 320);
      this.archAngel.mainGameScreen.main_paint(paramGraphics);
      draw_fighting(paramGraphics);
      if ((this.archAngel.x < 10) && (this.archAngel.bool_j == true))
      {
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 135, 27, "", 0);
        paramGraphics.setColor(16711680);
        paramGraphics.fillRect(80, 194, 80, 10);
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 86, 197, "NO MISSILE", 0);
      }
      if (this.archAngel.ab != 25)
      {
        this.archAngel.mainGameScreen.bool_bl = true;
        this.bool_b = true;
        this.archAngel.z = 5;
      }
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "OPTIONS", false);
      this.archAngel.a(paramGraphics, "PAUSE", true);
      break;
    case 5: 
      paramGraphics.setClip(0, 0, 240, 300);
      this.archAngel.mainGameScreen.main_paint(paramGraphics);
      this.archAngel.mainGameScreen.config2();
      this.archAngel.z = 6;
      break;
    case 6: 
      this.archAngel.readMedia.destroyImage7_53();
      this.archAngel.readMedia.destroyImage53_115();
      this.archAngel.b = this.archAngel.ab;
      break;
    }
  }
  
  public void draw_weapon_shop(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i3 = 170;
    int i4 = 3;
    String str2 = null;
    int i2 = paramInt1 / 100 - 1;
    int i1 = paramInt1 % 100;
    this.archAngel.drawImage(paramGraphics);
    this.archAngel.a(paramGraphics, "OK", false);
    paramGraphics.setColor(7171414);
    paramGraphics.fillRect(6, 127, 226, 147);
    paramGraphics.setColor(9605802);
    paramGraphics.drawRect(6, 127, 225, 146);
    paramGraphics.setColor(9605717);
    paramGraphics.fillRect(15, 140, 72, 42);
    paramGraphics.setColor(16777130);
    paramGraphics.drawRect(15, 139, 72, 43);
    this.archAngel.readMedia.drawImageSwitch(paramGraphics, 18, 141, 60, 40, i1 - 1, paramInt2);
    switch (paramInt2)
    {
    case 0: 
      str2 = "MISSILE";
      break;
    case 1: 
      str2 = "PLASMA CANON";
      break;
    case 2: 
      str2 = "ARMOR";
      break;
    }
    this.readText.processTxt(i1);
    String str1 = this.readText.buildString();
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 100, 145, str2);
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 100, 165, str1);
    i3 += 30;
    switch (i2)
    {
    case 0: 
      this.t = this.archAngel.gameSetting.q;
      break;
    case 1: 
      i2 = 0;
      this.t = this.archAngel.gameSetting.v;
      break;
    case 2: 
      i2 = 1;
      this.t = this.archAngel.gameSetting.l;
      i4 = 3;
      break;
    }
    this.t += this.archAngel.gameSetting.a;
    for (int i5 = 0; i5 < i4; i5++)
    {
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 20, i3, this.str_arr_w[i2][i5] + ":" + this.readText.int_arr_m[i5]);
      i3 += 15;
    }
    this.u = this.readText.int_arr_m[i4];
  }
  
  public void goto_meto(Graphics paramGraphics)
  {
    if (this.archAngel.x > 0) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.stopSound();
      //this.ai.aq = null;
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.readText.readTextFromStream("subm");
      this.archAngel.z = 1;
      this.archAngel.readText.bool_c = false;
      break;
    case 1: 
      this.archAngel.bool_s = true;
      if (this.archAngel.readText.bool_c) {
        this.archAngel.readText.g = 4;
      }
      break;
    case 2: 
      this.archAngel.bool_s = false;
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.g = 1;
      break;
    case 40: 
      this.archAngel.addScore12();
      this.archAngel.ab = 5;
    case 10: 
      this.archAngel.addScore12();
      this.archAngel.y = (this.archAngel.b = 25);
      this.archAngel.z = 4;
      return;
    case 20: 
      this.archAngel.af = (1 - this.archAngel.af);
      if (this.archAngel.af == 0) {
        this.archAngel.stopSound();
      }
      this.archAngel.z = 1;
      return;
    case 30: 
      this.archAngel.ag = (1 - this.archAngel.ag);
      if (this.archAngel.ag == 0) {
        this.archAngel.mainGameScreen.play_s_plasma(false);
      }
      this.archAngel.z = 1;
      return;
    case 999: 
      this.archAngel.stopSound();
      this.archAngel.addScore12();
      this.archAngel.addScore();
      this.archAngel.destroyApp(false);
      this.archAngel.notifyDestroyed();
      return;
    }
    if (this.archAngel.bool_t)
    {
      this.archAngel.mainGameScreen.main_paint(paramGraphics);
      draw_fighting(paramGraphics);
      this.archAngel.bool_t = false;
    }
    setup2(paramGraphics, this.archAngel.z, 217);
    this.archAngel.drawImage(paramGraphics);
    this.archAngel.a(paramGraphics, "OK", false);
  }
  
  public void draw_victory(Graphics paramGraphics)
  {
    int i1 = 133;
    int i2 = 0;
    int i3 = 0;
    paramGraphics.setColor(0);
    if (this.archAngel.mainGameScreen.str_m != null)
    {
      i3 = this.archAngel.mainGameScreen.h * this.archAngel.mainGameScreen.u;
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, this.archAngel.mainGameScreen.str_m + ":" + this.archAngel.mainGameScreen.h + "x" + this.archAngel.mainGameScreen.u);
      i1 += 16;
      i2 += i3;
    }
    if (this.archAngel.mainGameScreen.str_q != null)
    {
      i3 = this.archAngel.mainGameScreen.i * this.archAngel.mainGameScreen.t;
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, this.archAngel.mainGameScreen.str_q + ":" + this.archAngel.mainGameScreen.i + "x" + this.archAngel.mainGameScreen.t);
      i1 += 16;
      i2 += i3;
    }
    i3 = -this.archAngel.gameSetting.i * (this.archAngel.gameSetting.g - this.archAngel.gameSetting.j);
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, "Maintenance Fee:");
    i1 += 16;
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 59, i1, "" + i3);
    i1 += 25;
    i2 += i3;
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, "Total:" + i2);
    this.archAngel.gameSetting.a += i2;
  }
  
  public void draw_warning_etc_menu(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.bool_k = false;
      this.archAngel.readMedia.destroyImage53_115();
      this.archAngel.readMedia.destroyImage7_53();
      this.archAngel.readMedia.readMediaStream("menu");
      for (int i1 = 0; i1 < 4; i1++) {
        this.archAngel.readMedia.reloadImageArr(i1, 13 + i1);
      }
      this.archAngel.readMedia.closeInputStream();
      this.archAngel.readMedia.readMediaStream("font");
      for (int i1 = 1; i1 < 3; i1++) {
        this.archAngel.readMedia.reloadImageArr(i1, i1);
      }
      this.archAngel.readMedia.reloadImageArr(5, 5);
      this.archAngel.readMedia.closeInputStream();
      this.archAngel.bool_w = true;
      this.archAngel.readText.bool_c = false;
      this.archAngel.readText.bool_d = false;
      this.archAngel.z += 1;
      break;
    case 1: 
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, 240, 320);
      paramGraphics.setColor(4802901);
      paramGraphics.fillRect(0, 0, 240, 40);
      paramGraphics.drawLine(0, 42, 240, 42);
      paramGraphics.drawLine(0, 45, 240, 45);
      paramGraphics.fillRect(0, 50, 240, 6);
      paramGraphics.fillRect(0, 119, 240, 30);
      paramGraphics.fillRect(0, 171, 240, 10);
      paramGraphics.fillRect(0, 205, 240, 30);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 0);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 5, 27, 25);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180);
      this.archAngel.z += 1;
      break;
    case 2: 
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 80, 240, 200);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160 - 5 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180 + 5 * this.archAngel.x);
        paramGraphics.setClip(0, 180 - 5 * this.archAngel.x, 240, 10 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89 + this.l * 33);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.readMedia.readMediaStream("etc");
        this.archAngel.readMedia.reloadImageArr(3, 114);
        this.archAngel.z += 1;
      }
      break;
    case 3: 
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 15, 33, 60);
      paramGraphics.setClip(198, 60, 18, 20);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 16, 198, 60 - this.archAngel.gameSetting.b * 20);
      paramGraphics.setClip(0, 0, 240, 280);
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 80, 240, 200);
      paramGraphics.setColor(4802901);
      paramGraphics.fillRect(0, 119, 240, 30);
      paramGraphics.fillRect(0, 171, 240, 10);
      paramGraphics.fillRect(0, 205, 240, 30);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89 + this.l * 33);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90);
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
      break;
    }
    this.archAngel.drawImage(paramGraphics);
    this.archAngel.a(paramGraphics, "PLAY", true);
    this.archAngel.a(paramGraphics, "OK", false);
  }
  
  public void draw_str_helper(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    int i2 = 5;
    this.archAngel.readText.processTxt(paramInt1);
    String str;
    while ((str = this.archAngel.readText.buildString()) != null)
    {
    	//return; // Avoid draw string error outOfBound
    	/**/
      paramGraphics.setColor(16777215);
      if (this.archAngel.b == 4) {
        paramGraphics.drawString(str, 120, i1, 17);
      }
      i1 += 17;
      /**/
    }
  }
  
  public void draw_data_helper(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    drawDataInTxt(paramGraphics, paramInt1, paramInt2);
  }
  
  public void draw_resume(Graphics paramGraphics)
  {
    if (this.archAngel.x > 0) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.stopSound();
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 150, 240, 15);
      this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 98, 152, "PAUSE");
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "RESUME", false);
      break;
    case 1: 
      this.archAngel.y = (this.archAngel.b = 25);
      this.archAngel.z = 4;
      return;
    }
  }
  
  public void draw_ammunation_buy(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i3 = 190;
    int i4 = 3;
    String str2 = null;
    int i2 = paramInt1 / 100 - 1;
    int i1 = paramInt1 % 100;
    this.readText.processTxt(i1);
    String str1 = this.readText.buildString();
    paramGraphics.setClip(0, 0, 176, 80);
    switch (paramInt2)
    {
    case 0: 
      paramGraphics.setColor(430330);
      break;
    case 1: 
      paramGraphics.setColor(65280);
      break;
    case 2: 
      paramGraphics.setColor(16776960);
      break;
    }
    paramGraphics.setClip(0, 0, 240, 320);
    this.archAngel.readMedia.drawImageSwitch(paramGraphics, 13, 131, 60, 40, i1 - 1, paramInt2);
    switch (paramInt2)
    {
    case 0: 
      this.x = 0;
      str2 = "MISSILE";
      this.t = this.archAngel.gameSetting.q;
      break;
    case 1: 
      this.x = 1;
      i2 = 0;
      str2 = "PLASMA CANON";
      this.t = this.archAngel.gameSetting.v;
      break;
    case 2: 
      this.x = 2;
      i2 = 1;
      str2 = "ARMOR";
      this.t = this.archAngel.gameSetting.l;
      break;
    }
    this.t += this.archAngel.gameSetting.a;
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 100, 140, str2);
    for (int i5 = 0; i5 < i4; i5++)
    {
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 130, i3, this.str_arr_w[i2][i5] + ":" + this.readText.int_arr_m[i5], this.x);
      i3 += 11;
    }
    if (paramBoolean)
    {
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 130, 235, "MY MONEY:", this.x);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 130, 245, "" + this.archAngel.gameSetting.a, this.x);
    }
  }
  
  public void draw_arm(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    draw_arm_detail(paramGraphics, paramInt1, paramInt2);
  }
  
  public void draw_rect_clip_helper(Graphics paramGraphics, int paramInt)
  {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, 240, 320);
    this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 24, 90, 169);
    paramGraphics.setClip(100, 180, 12, 11);
    this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 33, 100, 180 - 11 * (paramInt % 2));
    paramGraphics.setClip(128, 180, 12, 11);
    this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 34, 128, 180 - 11 * (paramInt % 2));
    paramGraphics.setColor(16711680);
    paramGraphics.setClip(87, 200, 66, 14);
    paramGraphics.fillRect(87, 217 - paramInt * 3, 66, paramInt * 3);
    this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 111, 87, 200);
  }
  
  public void paint(Graphics paramGraphics)
  {
    if (this.bool_ah) { // like GameOff, true then stop paint
//      System.out.println(">>>>> paint stop <<<<<");
      // Paint done ? can it just remove return to debug
      return;
    }
    this.bool_ah = true;
    this.archAngel.x += 1;
    if (this.archAngel.b != this.archAngel.y)
    {
      this.archAngel.x = 0;
      this.archAngel.z = 0;
      this.archAngel.aa = 0;
      this.archAngel.p = -1;
      this.bool_b = true;
      this.archAngel.y = this.archAngel.b;
      this.archAngel.bool_i = false;
    }
    else if (this.archAngel.z != this.archAngel.aa)
    {
      this.archAngel.x = 0;
      this.archAngel.aa = this.archAngel.z;
    }
    switch (this.archAngel.b)
    {
    case 25: 
      draw_game_play_screen(paramGraphics);
      break;
    case 0: 
      draw_intro(paramGraphics);
      break;
    case 3: 
      loadSavedGame(paramGraphics);
      break;
    case 1: 
      load_system_txt(paramGraphics);
      break;
    case 5: 
      draw_warning_etc_menu(paramGraphics);
      break;
    case 13: 
      goto_meto(paramGraphics);
      break;
    case 14: 
      draw_resume(paramGraphics);
      break;
    case 9: 
      if (this.archAngel.gameSetting.c != this.archAngel.gameSetting.b) {
        draw_start_option(paramGraphics);
      } else {
        this.archAngel.b = 25;
      }
      break;
    case 8: 
      draw_start_option(paramGraphics);
      break;
    case 10: 
      draw_system_setin(paramGraphics);
      break;
    case 11: 
      draw_shop_info_arm(paramGraphics);
      break;
    case 12: 
      draw_shop_arm2(paramGraphics);
      break;
    case 4: 
      briefAbout(paramGraphics);
      break;
    case 26: 
      briefOpen(paramGraphics);
      break;
    case 2: 
      simple_read_helper(paramGraphics);
      break;
    case 7: 
      displayGameOver(paramGraphics);
      break;
    case 6: 
      draw_font_result(paramGraphics);
      break;
    case 27: 
      loadBrief1(paramGraphics);
      break;
    }
    this.bool_ah = false;
  }
  
  public GameScreen(ArchAngel paramArchAngel)
  {
    (this.archAngel = paramArchAngel).getClass();
    this.a = 0;
    this.bool_b = true;
    this.byte_c = -1;
    this.byte_d = -2;
    this.byte_e = -3;
    this.byte_f = -4;
    this.byte_g = -5;
    this.byte_h = -6;
    this.byte_i = -7;
    this.byte_j = -8;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.o = -1;
    this.p = -1;
    this.bool_v = true;
    this.str_arr_w = new String[][] { { "DAMAGE", "BULLET/M", "PRICE" }, { "DEFENCE", "REPAIR", "PRICE" } };
    this.y = 1;
    this.bool_z = false;
    this.aa = 0;
    this.ab = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.af = 0;
    this.ag = 0;
    this.bool_ah = false;
  }
  
  public void void_empty() {}
  
  public void draw_fighting(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, 240, 40);
    switch (this.archAngel.mainGameScreen.aa)
    {
    case 0: 
      if (this.archAngel.ac < 4) {
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 75, 10, "ENERMY:" + this.archAngel.mainGameScreen.str_m, 0);
      } else {
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 75, 10, this.archAngel.mainGameScreen.str_m, 0);
      }
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 75, 20, "N:" + (this.archAngel.mainGameScreen.y - this.archAngel.mainGameScreen.u), 0);
      if (this.archAngel.mainGameScreen.y - this.archAngel.mainGameScreen.u <= 0)
      {
        this.archAngel.mainGameScreen.bool_a1 = true;
        this.archAngel.mainGameScreen.aa = this.archAngel.mainGameScreen.byte_ac;
      }
      break;
    case 1: 
      paramGraphics.setColor(14408703);
      paramGraphics.drawString(this.archAngel.mainGameScreen.ca + " m", 120, 3, 17);
      int i1 = this.archAngel.mainGameScreen.f;
      int i2 = Math.abs(i1) / 60 + 1;
      if ((i1 <= 5) && (i1 >= -5))
      {
        paramGraphics.fillRect(112, 20, 1, 7);
      }
      else
      {
        int i3;
        if (i1 > 5) {
          for (i3 = 0; i3 < i2; i3++) {
            this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 23, 114 + i3 * 4, 20);
          }
        } else if (i1 < -5) {
          for (i3 = 0; i3 < i2; i3++) {
            this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 22, 106 - i3 * 4, 20);
          }
        }
      }
      break;
    case 2: 
      if (this.archAngel.ac < 7)
      {
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 87, 8, this.archAngel.mainGameScreen.str_q, 0);
      }
      else
      {
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 89, 5, "ARCHANGEL", 0);
        this.archAngel.readMedia.drawStringGraphic(paramGraphics, 89, 11, "   MK2   ", 0);
      }
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 82, 18, "HP:", 0);
      paramGraphics.setColor(9605802);
      paramGraphics.fillRect(102, 17, 42, 7);
      paramGraphics.setColor(14408703);
      paramGraphics.drawRect(102, 17, 41, 6);
      paramGraphics.setColor(16776960);
      paramGraphics.fillRect(103, 18, this.archAngel.ae, 5);
      break;
    }
    int i1 = 40 * this.archAngel.gameSetting.j >> 9;
    paramGraphics.setColor(255);
    paramGraphics.fillRect(192, 5, i1 / 2, 4);
    if (this.archAngel.mainGameScreen.bi == 3)
    {
      if (this.archAngel.mainGameScreen.bool_bh == true)
      {
        if (this.archAngel.gameSetting.t < this.archAngel.gameSetting.r) {
          this.archAngel.gameSetting.t += 3;
        }
        if (this.archAngel.gameSetting.t == this.archAngel.gameSetting.r) {
          this.archAngel.mainGameScreen.bool_bh = false;
        }
      }
      System.out.println(":):):):):) " + this.archAngel.gameSetting.t + " :(:(:(:(:(");
      if (this.archAngel.gameSetting.t <= 0) // may be number of enemies left
      {
    	this.archAngel.gameSetting.t = 3; // Try play flow
        paramGraphics.setColor(16711680);
        if (this.archAngel.x / 2 % 2 == 0) // boss scene, out of amour 
        {
          paramGraphics.fillRect(80, 194, 80, 19);
          this.archAngel.readMedia.drawStringGraphic(paramGraphics, 86, 197, "PRESS 0 KEY", 0);
          this.archAngel.readMedia.drawStringGraphic(paramGraphics, 92, 205, "TO RELOAD", 0);
        }
      }
      if (this.archAngel.gameSetting.r != 0) {
    	  i1 = this.archAngel.gameSetting.t * 40 / this.archAngel.gameSetting.r;
      }
    }
    else if (this.archAngel.mainGameScreen.bi == 1)
    {
    	//System.out.println(">>>>> "+this.ai.aj.m + " <<<<<");
    	if(this.archAngel.gameSetting.m != 0) {
    		i1 = this.archAngel.gameSetting.o * 40 / this.archAngel.gameSetting.m;
    	} else {
    		i1 = 0; // dungnv
    	}
    }
    else
    {
      i1 = 40;
    }
    //System.out.println(":(:(:(:(:(:(:( "+i1 + " "+ this.ai.aj.o + " <<<<<");
    paramGraphics.setColor(16711680);
    paramGraphics.fillRect(192, 17, i1, 4);
  }
  
  public void draw_font_result(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        for (int i1 = 11; i1 < 19; i1++) {
          this.archAngel.readMedia.destroyImage(24 + i1);
        }
        this.archAngel.readMedia.destroyImage53_115();
        this.archAngel.readMedia.readMediaStream("font");
        this.archAngel.readMedia.reloadImageArr(1, 1);
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "OK", false);
        this.archAngel.bool_s = false;
        this.archAngel.bool_m = false;
      }
      simple_helper(paramGraphics);
      break;
    case 1: 
      this.archAngel.playSound("m_win", 1);
      this.archAngel.readMedia.readMediaStream("result");
      this.archAngel.readMedia.drawLoadImage(2, paramGraphics, 45, 93);
      this.archAngel.readMedia.drawLoadImage(1, paramGraphics, 62, 98);
      this.archAngel.readMedia.closeInputStream();
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      if (this.archAngel.gameSetting.b == 7)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, 300);
        this.archAngel.b = 27;
      }
      else
      {
        this.archAngel.z = 4;
      }
      break;
    case 4: 
      if (this.archAngel.x == 0) {
        draw_victory(paramGraphics);
      }
      break;
    case 2: 
    case 3: 
    default: 
      if (this.archAngel.x < 16)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, this.archAngel.x * 10);
        paramGraphics.fillRect(0, 300 - this.archAngel.x * 10, 240, this.archAngel.x * 10);
      }
      if (this.archAngel.x == 16)
      {
        this.archAngel.readMedia.destroyImage53_115();
        System.gc();
        this.archAngel.gameSetting.b += 1;
        this.archAngel.addScore();
        this.archAngel.b = 5;
      }
      break;
    }
  }
  
  public void draw_buy(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i3 = 93;
    int i4 = 0;
    String str1 = null;
    String str2 = null;
    int i1 = paramInt1 / 100 - 1;
    int i2 = paramInt1 % 100;
    switch (i1)
    {
    case 0: 
      i4 = this.archAngel.gameSetting.q;
      if (this.archAngel.gameSetting.d == i2)
      {
        save_equipment(paramGraphics);
        return;
      }
      this.archAngel.gameSetting.d = i2;
      this.archAngel.gameSetting.loadDataFromReadTxt(this.readText);
      break;
    case 1: 
      i4 = this.archAngel.gameSetting.v;
      if (this.archAngel.gameSetting.e == i2)
      {
        save_equipment(paramGraphics);
        return;
      }
      this.archAngel.gameSetting.e = i2;
      this.archAngel.gameSetting.loadConfig2(this.readText);
      break;
    case 2: 
      i4 = this.archAngel.gameSetting.l;
      if (this.archAngel.gameSetting.f == i2)
      {
        save_equipment(paramGraphics);
        return;
      }
      this.archAngel.gameSetting.f = i2;
      this.archAngel.gameSetting.loadConfig3(this.readText);
      break;
    }
    this.archAngel.gameSetting.a += i4 - paramInt2;
    switch (this.x)
    {
    case 0: 
      str1 = "missile";
      str2 = this.archAngel.gameSetting.str_p;
      break;
    case 1: 
      str1 = "plasma canon";
      str2 = this.archAngel.gameSetting.str_u;
      break;
    case 2: 
      str1 = "Armor";
      str2 = this.archAngel.gameSetting.str_k;
      break;
    }
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 135, "You bought the");
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 150, str1);
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 165, str2);
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 195, "My money : " + this.archAngel.gameSetting.a);
  }
  
  public void simple_helper(Graphics paramGraphics)
  {
    this.archAngel.z += 1;
    this.archAngel.p = -1;
    this.archAngel.bool_h = false;
  }
  
  public void keyReleased(int paramInt)
  {
    switch (this.archAngel.b)
    {
    case 25: 
      if (this.archAngel.mainGameScreen.bi == 1)
      {
        if ((paramInt == -5) || (paramInt == 53))
        {
          this.archAngel.mainGameScreen.play_s_gun(false);
          this.archAngel.stopSound();
        }
      }
      else if ((this.archAngel.mainGameScreen.bi == 3) && ((paramInt == -5) || (paramInt == 53)) && (this.archAngel.ag != 1))
      {
        this.archAngel.mainGameScreen.play_s_plasma(false);
        this.archAngel.stopSound();
      }
      if ((paramInt == 49) || (paramInt == 50) || (paramInt == 51) || (paramInt == 52) || (paramInt == 54) || (paramInt == 57) || (paramInt == -1) || (paramInt == -2) || (paramInt == -4) || (paramInt == -3))
      {
        this.archAngel.mainGameScreen.setup3();
        this.archAngel.mainGameScreen.ba = 0;
        this.archAngel.mainGameScreen.a9 = 0;
        this.archAngel.mainGameScreen.bd = 0;
      }
      break;
    }
  }
  
  public void draw_arm_detail(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    paramGraphics.setColor(9605802);
    paramGraphics.fillRect(0, 119, 240, 181);
    if (paramInt1 == 11)
    {
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 17, 10, 126);
    }
    else if ((paramInt1 >= 12) && (paramInt1 < 14))
    {
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 20, 6, 126);
      this.archAngel.readMedia.drawImageInArr(paramGraphics, 22, 55, 170);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 140, "NAME:", 0);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 150, this.archAngel.mainGameScreen.str_m, 0);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 160, "DAMAGE:", 0);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 170, this.archAngel.mainGameScreen.k + "MP", 0);
    }
    else if (paramInt1 >= 14)
    {
      this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 20, 6, 126);
      this.archAngel.readMedia.drawImageInArr(paramGraphics, 21, 55, 170);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 140, "NAME:", 0);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 150, this.archAngel.mainGameScreen.str_q, 0);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 160, "DAMAGE:", 0);
      this.archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 170, this.archAngel.mainGameScreen.o + "MP", 0);
    }
    this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 18, 189, 175);
    this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 19, 0, 235);
    paramGraphics.setColor(0);
    this.archAngel.readText.processTxt(paramInt1);
    this.archAngel.readText.b = 0;
    this.archAngel.p = this.archAngel.readText.o;
    String str;
    while ((str = this.archAngel.readText.buildString()) != null)
    {
      paramGraphics.setColor(0);
      int i3 = str.indexOf(".");
      if (i3 == 1)
      {
        int i2;
        try
        {
          i2 = Integer.parseInt(str.substring(0, i3));
        }
        catch (Exception localException)
        {
          i2 = -1;
        }
        if (i2 > this.archAngel.readText.b) {
          this.archAngel.readText.b = i2;
        }
      }
      paramGraphics.drawString(str, 11, i1, 20);
      i1 += 17;
    }
    this.archAngel.bool_g = false;
  }
  
  public void draw_arm_shop_menu(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.archAngel.bool_v = false;
    if ((this.archAngel.b == 12) && ((paramInt1 == 100) || (paramInt1 == 200) || (paramInt1 == 300)))
    {
      drawDataInTxt(paramGraphics, paramInt1, 130);
    }
    else
    {
      int i1 = paramInt2;
      int i4 = 10;
      if (this.archAngel.b != 7)
      {
        if (this.archAngel.b == 13)
        {
          i4 = 5;
          paramGraphics.setColor(4343106);
          paramGraphics.fillRect(0, 217, 140, 83);
          paramGraphics.setColor(14605311);
          paramGraphics.drawRect(0, 217, 139, 82);
          this.q = paramInt1;
        }
        else
        {
          this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 2, 2, 120);
        }
      }
      else if (this.archAngel.b == 7)
      {
        i4 = 18;
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(13, 76, 150, 107);
      }
      else
      {
        i4 = 30;
      }
      paramGraphics.setColor(40960);
      this.archAngel.readText.processTxt(paramInt1);
      this.archAngel.readText.b = 0;
      this.archAngel.p = this.archAngel.readText.o;
      String str;
      while ((str = this.archAngel.readText.buildString()) != null)
      {
        paramGraphics.setColor(0);
        int i3 = str.indexOf(".");
        if (i3 == 1)
        {
          int i2;
          try
          {
            i2 = Integer.parseInt(str.substring(0, i3));
          }
          catch (Exception localException)
          {
            i2 = -1;
          }
          if (i2 > this.archAngel.readText.b) {
            this.archAngel.readText.b = i2;
          }
          if (i2 == this.archAngel.readText.a) {
            if (this.archAngel.b == 13)
            {
              paramGraphics.setColor(83967);
              paramGraphics.fillRect(i4 + 15, i1 + 6, str.length() * 5 + 3, 9);
            }
            else
            {
              paramGraphics.setColor(0);
              paramGraphics.fillRect(i4 - 2, i1 - 2, str.length() * 9 + 3, 15);
            }
          }
        }
        if (this.archAngel.b == 13)
        {
          this.archAngel.readMedia.drawStringGraphic(paramGraphics, i4, i1 + 8, str, 0);
          paramGraphics.setColor(0);
          if (this.archAngel.bool_s)
          {
            paramGraphics.setColor(0);
            this.archAngel.readMedia.drawStringGraphic(paramGraphics, i4 + 66, 236, this.archAngel.on_off[(1 - this.archAngel.af)], 0);
            this.archAngel.readMedia.drawStringGraphic(paramGraphics, i4 + 72, 247, this.archAngel.auto_manual[(1 - this.archAngel.ag)], 0);
          }
        }
        else
        {
          this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, i4, i1, str);
          if ((this.archAngel.b == 10) && (paramInt1 == 51) && ((this.archAngel.readText.a <= 2) || (this.archAngel.readText.a == 4))) {
            paramGraphics.setColor(0);
          }
        }
        if (this.archAngel.b == 13) {
          i1 += 11;
        } else {
          i1 += 15;
        }
      }
      if (this.archAngel.b == 11)
      {
        paramGraphics.setColor(9540180);
        paramGraphics.fillRect(10, 135, 70, 42);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 114, 10, 135);
        paramGraphics.setColor(0);
        this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 180, "My money:" + this.archAngel.gameSetting.a);
        this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 10, 210, "1.Missile");
        this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 10, 225, "2.Plasma Canon");
        this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 10, 240, "3.Armor");
      }
      this.archAngel.bool_g = false;
    }
    this.archAngel.bool_v = true;
  }
  
  public void showNotify()
  {
    this.archAngel.bool_t = true;
    this.archAngel.x = -1;
    if (this.archAngel.b == 25)
    {
      this.archAngel.mainGameScreen.setup3();
      this.archAngel.mainGameScreen.ba = 0;
      this.archAngel.mainGameScreen.a9 = 0;
      this.archAngel.mainGameScreen.bd = 0;
    }
  }
  
  public void draw_shop_info_arm(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    setup2(paramGraphics, this.archAngel.z, 210);
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.readText.readTextFromStream("info");
        this.readText = new ReadText();
        this.o = 186;
        this.p = 5;
        this.archAngel.readMedia.readMediaStream("shop");
        for (int i1 = 0; i1 < 3; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 26 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90 - this.l * 33);
        paramGraphics.setClip(0, 0, 240, 320);
      }
      simple_helper(paramGraphics);
      return;
    case 1: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.d = 2;
      this.archAngel.z = 5;
      break;
    case 10: 
      this.readText.readTextFromStream("missile");
      this.archAngel.d = 0;
      draw_weapon_shop(paramGraphics, 100 + this.archAngel.gameSetting.d, false, 0);
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.g = 1;
      break;
    case 20: 
      this.readText.readTextFromStream("plasma");
      this.archAngel.d = 1;
      draw_weapon_shop(paramGraphics, 200 + this.archAngel.gameSetting.e, false, 1);
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.g = 2;
      break;
    case 30: 
      this.readText.readTextFromStream("arm");
      this.archAngel.d = 2;
      draw_weapon_shop(paramGraphics, 300 + this.archAngel.gameSetting.f, false, 2);
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.g = 3;
      break;
    case 999: 
      this.archAngel.b = 5;
      this.readText = null;
      return;
    }
  }
  
  public void draw_shop_arm2(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    this.bool_v = false;
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.readMedia.readMediaStream("shop");
        for (int i1 = 0; i1 < 3; i1++)
        {
          this.archAngel.readMedia.destroyImage(26 + i1);
          this.archAngel.readMedia.reloadImageArr(i1, 26 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90 - this.l * 33);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "BACK", true);
        this.archAngel.a(paramGraphics, "OK", false);
        this.archAngel.readText.readTextFromStream("shop");
        this.readText = new ReadText();
        this.archAngel.readText.g = 1;
      }
      simple_helper(paramGraphics);
      return;
    case 2: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.z = 1;
      break;
    case 1: 
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.readText.bool_c = true;
      this.bool_v = true;
      break;
    case 99: 
      this.archAngel.z += 1;
      this.readText.readTextFromStream("missile");
      this.archAngel.d = 0;
      this.archAngel.readText.g = 1;
      break;
    case 111: 
    case 211: 
      this.archAngel.a = 1;
      setup2(paramGraphics, this.archAngel.z, 230);
      if (this.t >= this.readText.int_arr_m[2]) {
        draw_buy(paramGraphics, this.s, this.readText.int_arr_m[2]);
      } else {
        draw_lack_of(paramGraphics, this.readText.int_arr_m[2]);
      }
      this.bool_v = true;
      return;
    case 199: 
      this.archAngel.z += 1;
      this.readText.readTextFromStream("plasma");
      this.archAngel.d = 1;
      this.archAngel.readText.g = 2;
      break;
    case 299: 
      this.archAngel.z += 1;
      this.readText.readTextFromStream("arm");
      this.archAngel.d = 2;
      this.archAngel.readText.g = 3;
      break;
    case 311: 
      this.archAngel.a = 1;
      setup2(paramGraphics, this.archAngel.z, 230);
      if (this.t >= this.readText.int_arr_m[2]) {
        draw_buy(paramGraphics, this.s, this.readText.int_arr_m[2]);
      } else {
        draw_lack_of(paramGraphics, this.readText.int_arr_m[2]);
      }
      this.bool_v = true;
      return;
    case 999: 
      this.archAngel.b = 5;
      this.readText = null;
      return;
    default: 
      if ((this.archAngel.z % 100 > 0) && (this.archAngel.z % 100 < 8) && (this.archAngel.z > 100))
      {
        b(paramGraphics, this.archAngel.z);
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "BACK", true);
        this.archAngel.a(paramGraphics, "OK", false);
        paramGraphics.setClip(0, 0, 178, 75);
        draw_ammunation_buy(paramGraphics, this.archAngel.z, true, this.archAngel.d);
        this.s = this.archAngel.z;
        switch (this.archAngel.d)
        {
        case 0: 
          this.archAngel.z = 110;
          break;
        case 1: 
          this.archAngel.z = 210;
          break;
        case 2: 
          this.archAngel.z = 310;
          break;
        }
        paramGraphics.setColor(0);
        this.archAngel.bool_s = true;
        paramGraphics.setColor(65280);
        String str = "";
        if (this.t - this.archAngel.gameSetting.a > this.u) {
          str = "[+";
        } else {
          str = "[";
        }
        str = str + (this.t - this.archAngel.gameSetting.a - this.u) + "]"; // String 
        this.bool_v = true;
        return;
      }
      this.bool_v = true;
    }
    if ((this.archAngel.z == 100) || (this.archAngel.z == 200) || (this.archAngel.z == 300))
    {
      if (this.archAngel.x == 0) {
        this.archAngel.bool_q = true;
      }
      this.archAngel.readText.bool_c = false;
      b(paramGraphics, this.archAngel.z);
      draw_data_helper(paramGraphics, this.archAngel.z, 190);
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
    }
    else
    {
      setup2(paramGraphics, this.archAngel.z, 150);
    }
  }
  
  public void b(Graphics paramGraphics, int paramInt)
  {
    if (this.archAngel.bool_q)
    {
      paramGraphics.setColor(7171414);
      paramGraphics.fillRect(6, 127, 226, 147);
      paramGraphics.setColor(9605802);
      paramGraphics.drawRect(6, 127, 225, 146);
      paramGraphics.setColor(9605717);
      paramGraphics.fillRect(10, 130, 72, 42);
      paramGraphics.setColor(16777130);
      paramGraphics.drawRect(10, 129, 72, 43);
      if (this.archAngel.bool_r)
      {
        draw_ammunation_buy(paramGraphics, 101, true, this.archAngel.d);
        this.archAngel.bool_r = false;
      }
      else if (this.archAngel.a <= 6)
      {
        draw_ammunation_buy(paramGraphics, this.archAngel.a + 100, true, this.archAngel.d);
      }
      else
      {
        draw_ammunation_buy(paramGraphics, this.archAngel.a - 1 + 100, true, this.archAngel.d);
      }
    }
    this.archAngel.bool_q = false;
  }
  
  public void run()
  {
    for (;;)
    {
      try
      {
        repaint();
        if ((this.archAngel.b == 25) && (this.archAngel.z == 4))
        {
          this.archAngel.mainGameScreen.complex_helper();
          this.archAngel.mainGameScreen.config2();
        }
        serviceRepaints();
        Thread.sleep((this.archAngel.b == 25) || (this.archAngel.b == 1) ? 30 : 30);
      }
      catch (Exception localException) {
    	  System.out.println(">>>>> run exception <<<<<");
      }
    }
  }
  
  public void draw_lack_of(Graphics paramGraphics, int paramInt)
  {
    this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 145, "Lack of " + (paramInt - this.t));
  }
  
  public void setting2(Graphics paramGraphics)
  {
    this.bool_z = false;
    this.aa = 0;
    this.ab = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.af = -1;
    this.ag = -1;
    this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 21, 0, 0);
  }
  
  public void simple_helper2(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    draw_str_helper(paramGraphics, paramInt1, paramInt2);
  }
  
  public void draw_intro(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(0, 0, 240, 320);
        this.archAngel.readMedia.drawStringImage("logo", 0, paramGraphics, 48, 80);
        this.archAngel.readMedia.drawStringImage("logo", 1, paramGraphics, 46, 161);
        this.archAngel.readMedia.readMediaStream("intro");
        this.archAngel.readMedia.reloadImageArr(0, 30);
        this.archAngel.readMedia.closeInputStream();
        this.archAngel.readMedia.readMediaStream("select");
        for (int i1 = 0; i1 < 7; i1++) {
          this.archAngel.readMedia.reloadImageArr(i1, 6 + i1);
        }
        this.archAngel.readMedia.closeInputStream();
      }
      if (this.archAngel.x == 8) {
        this.archAngel.z += 1;
      }
      break;
    case 1: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.playSound("m_front", 0);
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, 320);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 0, 240, 40);
        paramGraphics.drawLine(0, 42, 240, 42);
        paramGraphics.drawLine(0, 45, 240, 45);
        paramGraphics.fillRect(0, 50, 240, 6);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 0);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 5, 27, 25);
        this.archAngel.readMedia.drawStringImage("logo", 2, paramGraphics, 0, 300);
      }
      if (this.archAngel.x % 10 < 5) {
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 30, 0, 80);
      } else {
        this.archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 62, 264, "Press Any Key");
      }
      break;
    case 2: 
      this.archAngel.mainGameScreen.bd = 0;
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.archAngel.x, 240, 200 - 10 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 30, 0, 80);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.readMedia.destroyImage(30);
        this.archAngel.b = 3;
      }
      break;
    }
  }
  
  public void simple_arm_helper(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    machineShopLogic(paramGraphics, paramInt1, paramInt2);
  }
  
  public void simple_read_helper(Graphics paramGraphics)
  {
    this.archAngel.gameSetting.initSetting();
    this.archAngel.gameSetting.readArmPlasmaMissile(this.archAngel.readText);
    this.archAngel.b = 5;
  }
}
