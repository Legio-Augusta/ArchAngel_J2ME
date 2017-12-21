import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public class b
  extends Canvas
  implements Runnable
{
  public int a;
  public boolean b;
  public final byte c;
  public final byte d;
  public final byte e;
  public final byte f;
  public final byte g;
  public final byte h;
  public final byte i;
  public final byte j;
  public int k;
  public int l;
  public int m;
  public int n;
  public int o;
  public int p;
  public int q;
  public e r;
  public int s;
  public int t;
  public int u;
  public boolean v;
  public String[][] w;
  public int x;
  public int y;
  public boolean z;
  public int aa;
  public int ab;
  public int ac;
  public int ad;
  public int ae;
  public int af;
  public int ag;
  public boolean ah;
  public final ArchAngel archAngel; // ai
  
  public void a(Graphics paramGraphics)
  {
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.ak.a("font");
      this.archAngel.ak.a(5, 5);
      this.archAngel.ak.d();
      this.archAngel.ak.a("end");
      for (i1 = 0; i1 < 2; i1++) {
        this.archAngel.ak.a(i1, 31 + i1);
      }
      this.archAngel.ak.d();
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
        this.archAngel.ak.a(paramGraphics, 3, 0, 0);
        this.archAngel.ak.a(paramGraphics, 5, 27, 25);
        this.archAngel.ak.a(paramGraphics, 4, 0, 60);
        this.archAngel.ak.a(paramGraphics, 3, 0, 280);
        this.archAngel.ak.a(paramGraphics, 31, 0, 80);
        this.archAngel.ak.a(paramGraphics, 32, 0, 175);
        this.archAngel.a(paramGraphics);
        this.archAngel.a(paramGraphics, "SKIP", true);
        this.archAngel.a(paramGraphics, "NEXT", false);
        this.archAngel.al.a("end");
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
        this.archAngel.ak.a(paramGraphics, 31, 0, 80);
        this.archAngel.ak.a(paramGraphics, 32, 0, 175);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.ak.a(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 21)
      {
        this.archAngel.ak.a(31);
        this.archAngel.ak.a(32);
        this.archAngel.ak.a("select");
        for (i1 = 0; i1 < 7; i1++) {
          this.archAngel.ak.a(i1, 6 + i1);
        }
        this.archAngel.ak.d();
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
      k(paramGraphics, this.archAngel.z, 228);
    }
  }
  
  public void b(Graphics paramGraphics)
  {
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.c = 0;
        this.archAngel.ak.a("font");
        this.archAngel.ak.a(1, 1);
        this.archAngel.ak.d();
        this.archAngel.a(paramGraphics);
        this.archAngel.a(paramGraphics, "OK", false);
        this.archAngel.s = false;
      }
      else
      {
        this.archAngel.z = 1;
      }
      break;
    case 1: 
      paramGraphics.setColor(107, 222, 255);
      paramGraphics.fillRect(45, 93, 150, 33);
      this.archAngel.ak.a(paramGraphics, 62, 103, "YOU ARE DEAD");
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      this.archAngel.ak.a(paramGraphics, 50, 129, "You have been");
      this.archAngel.ak.a(paramGraphics, 50, 144, "hit deadly.");
      paramGraphics.setColor(0);
      paramGraphics.fillRect(49, 172 + this.archAngel.c * 15, 75, 15);
      this.archAngel.ak.a(paramGraphics, 50, 174, "1. Retry");
      this.archAngel.ak.a(paramGraphics, 50, 189, "2. Back");
      break;
    case 2: 
      for (i1 = 11; i1 < 19; i1++) {
        this.archAngel.ak.a(24 + i1);
      }
      this.archAngel.ak.b();
      this.archAngel.ak.a();
      this.archAngel.b = 25;
      break;
    case 3: 
      if (this.archAngel.x < 16)
      {
        if (this.archAngel.x == 0)
        {
          for (i1 = 11; i1 < 19; i1++) {
            this.archAngel.ak.a(24 + i1);
          }
          this.archAngel.ak.b();
          this.archAngel.ak.a();
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
  
  public void c(Graphics paramGraphics)
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
        this.archAngel.ak.a(paramGraphics, 4, 0, 160 - 5 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 3, 0, 180 + 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.a(paramGraphics);
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
        this.archAngel.ak.a(paramGraphics, 6, 65326 + this.archAngel.x * 10, 118);
        this.archAngel.ak.a(paramGraphics, 7, 247 - this.archAngel.x * 10, 204);
        this.archAngel.ak.a(paramGraphics, 9, 65388 + this.archAngel.x * 10, 125);
        this.archAngel.ak.a(paramGraphics, 10, 266 - this.archAngel.x * 10, 211);
      }
      if (this.archAngel.x == 21) {
        this.archAngel.z += 1;
      }
      break;
    case 2: 
      this.archAngel.ak.a(paramGraphics, 6, 0, 118);
      this.archAngel.ak.a(paramGraphics, 7, 37, 204);
      this.archAngel.ak.a(paramGraphics, 8, 41, 122 + this.l * 86);
      this.archAngel.ak.a(paramGraphics, 9, 62, 125);
      this.archAngel.ak.a(paramGraphics, 10, 56, 211);
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.ak.a(paramGraphics, 3, 0, 280);
      this.archAngel.w = true;
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
        this.archAngel.ak.a(paramGraphics, 6, 0 - this.archAngel.x * 10, 118);
        this.archAngel.ak.a(paramGraphics, 7, 37 + this.archAngel.x * 10, 204);
        this.archAngel.ak.a(paramGraphics, 9, 62 - this.archAngel.x * 10, 125);
        this.archAngel.ak.a(paramGraphics, 10, 56 + this.archAngel.x * 10, 211);
      }
      else if (this.archAngel.x < 43)
      {
        this.archAngel.ak.a(paramGraphics, 6, 65326 + (this.archAngel.x - 21) * 10, 118);
        this.archAngel.ak.a(paramGraphics, 7, 247 - (this.archAngel.x - 21) * 10, 204);
        this.archAngel.ak.a(paramGraphics, 11, 65381 + (this.archAngel.x - 21) * 10, 125);
        this.archAngel.ak.a(paramGraphics, 12, 265 - (this.archAngel.x - 21) * 10, 211);
      }
      if (this.archAngel.x == 42) {
        this.archAngel.z += 1;
      }
      break;
    case 4: 
      this.archAngel.ak.a(paramGraphics, 6, 0, 118);
      this.archAngel.ak.a(paramGraphics, 7, 37, 204);
      this.archAngel.ak.a(paramGraphics, 8, 41, 122 + this.archAngel.ah * 86);
      this.archAngel.ak.a(paramGraphics, 11, 55, 125);
      this.archAngel.ak.a(paramGraphics, 12, 55, 211);
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.ak.a(paramGraphics, 3, 0, 280);
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
        this.archAngel.ak.a(paramGraphics, 6, 0, 118);
        this.archAngel.ak.a(paramGraphics, 7, 37, 204);
        this.archAngel.ak.a(paramGraphics, 8, 41, 122 + this.archAngel.ah * 86);
        this.archAngel.ak.a(paramGraphics, 11, 55, 125);
        this.archAngel.ak.a(paramGraphics, 12, 55, 211);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.ak.a(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        for (i1 = 0; i1 < 7; i1++) {
          this.archAngel.ak.a(6 + i1);
        }
        this.archAngel.b = 26;
      }
      break;
    case 6: 
      if (this.archAngel.x < 20)
      {
        this.archAngel.w = false;
        paramGraphics.setColor(0);
        paramGraphics.fillRect(41, 208, 160, 26);
        this.archAngel.ak.a(paramGraphics, 47, 218, "A SAVED GAME IS NOT FOUND.", 0);
      }
      if (this.archAngel.x == 20) {
        this.archAngel.z = 2;
      }
      break;
    case 7: 
      for (i1 = 0; i1 < 7; i1++) {
        this.archAngel.ak.a(6 + i1);
      }
      this.archAngel.k = true;
      this.archAngel.d();
      this.archAngel.aj.b();
      this.archAngel.b = 9;
      this.l = 0;
      break;
    }
  }
  
  public void d(Graphics paramGraphics)
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
        this.archAngel.ak.a(paramGraphics, 4, 0, 160 - 5 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 3, 0, 180 + 5 * this.archAngel.x);
        paramGraphics.setClip(0, 180 - 5 * this.archAngel.x, 240, 10 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 29, 0, 80);
      }
      if (this.archAngel.x == 20) {
        this.archAngel.z += 1;
      }
      break;
    case 1: 
      if (this.archAngel.x == 0) {
        this.archAngel.al.a("open");
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
        this.archAngel.ak.a(paramGraphics, 29, 0, 80);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.ak.a(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.ak.a(29);
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
      k(paramGraphics, this.archAngel.z, 228);
      this.archAngel.ak.a(paramGraphics, 3, 0, 280);
    }
    this.archAngel.a(paramGraphics);
    this.archAngel.a(paramGraphics, "SKIP", true);
    this.archAngel.a(paramGraphics, "NEXT", false);
  }
  
  public void e(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.al.a("about");
      this.archAngel.z += 1;
      break;
    case 1: 
      this.archAngel.ak.a(paramGraphics, 14, 17, 89);
      paramGraphics.setClip(17, 89, 223, 25);
      this.archAngel.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
      paramGraphics.setClip(0, 0, 240, 320);
      paramGraphics.setColor(7171414);
      paramGraphics.fillRect(2, 119, 238, 181);
      paramGraphics.setColor(9605802);
      paramGraphics.drawRect(2, 119, 237, 180);
      j(paramGraphics, this.archAngel.z, 130);
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      break;
    }
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    int i2 = 14;
    if (this.archAngel.b == 7) {
      i2 = 30;
    }
    this.archAngel.al.a(paramInt1);
    this.archAngel.al.b = 0;
    this.archAngel.p = this.archAngel.al.o;
    String str;
    while ((str = this.archAngel.al.a()) != null)
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
        if (i3 > this.archAngel.al.b) {
          this.archAngel.al.b = i3;
        }
        if (i3 == this.archAngel.al.a) {
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
        if ((this.archAngel.b == 10) && (paramInt1 == 51) && ((this.archAngel.al.a <= 2) || (this.archAngel.al.a == 4))) {
          paramGraphics.setColor(0);
        }
      }
      if (this.archAngel.b == 13)
      {
        if (this.archAngel.al.a == 2) {
          paramGraphics.setColor(0);
        } else {
          paramGraphics.setColor(40960);
        }
        paramGraphics.drawString(this.archAngel.an[(1 - this.archAngel.af)], 83, 119, 20);
      }
      i1 += 17;
    }
    if (this.archAngel.s)
    {
      paramGraphics.setColor(0);
      paramGraphics.drawString("1.YES   2.NO", 88, 105, 17);
    }
    this.archAngel.g = false;
  }
  
  public void keyPressed(int paramInt)
  {
    int i1 = getGameAction(paramInt);
    if (this.archAngel.h) {
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
          this.archAngel.MPlay("s_menu_move", 1);
          break;
        case -3: 
        case -1: 
          this.l += -1;
          if (this.l < 0) {
            this.l = 1;
          }
          this.archAngel.MPlay("s_menu_move", 1);
          break;
        case -7: 
        case -5: 
          if (this.l == 0)
          {
            this.archAngel.z += 1;
            this.l = 0;
          }
          else if (this.archAngel.w == true)
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
          this.archAngel.MPlay("s_menu_move", 1);
          break;
        case -7: 
        case -5: 
          this.archAngel.ak.a("open");
          this.archAngel.ak.a(0, 29);
          this.archAngel.ak.d();
          this.archAngel.z += 1;
          break;
        }
      }
      this.archAngel.q = true;
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
          this.archAngel.MPlay("s_menu_move", 1);
          this.archAngel.e = true;
          break;
        case -3: 
        case -1: 
        case 50: 
          this.l += -1;
          if (this.l < 0) {
            this.l = 4;
          }
          this.archAngel.MPlay("s_menu_move", 1);
          this.archAngel.e = true;
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
      if ((this.archAngel.z == 4) && (this.archAngel.m == true))
      {
        if ((this.archAngel.am.bi == 1) && (paramInt != 53) && (paramInt != -5))
        {
          this.archAngel.am.b(false);
          this.archAngel.c();
        }
        if ((this.archAngel.am.bi == 3) && (this.archAngel.ag != 1) && (paramInt != 53) && (paramInt != -5))
        {
          keyReleased(53);
          this.archAngel.am.d(false);
          this.archAngel.c();
        }
        if ((paramInt == 53) || (paramInt == -5))
        {
          keyReleased(50);
          this.archAngel.am.e();
          this.archAngel.am.ba = 0;
          this.archAngel.am.a9 = 0;
          this.archAngel.am.bd = 0;
        }
        switch (paramInt)
        {
        case 49: 
          this.archAngel.am.e(true);
          this.archAngel.am.ba = 3;
          break;
        case 51: 
          this.archAngel.am.e(false);
          this.archAngel.am.ba = 4;
          break;
        case 53: 
          if ((this.archAngel.am.bi == 1) && (this.archAngel.m == true)) {
            this.archAngel.am.b(true);
          }
          if ((this.archAngel.am.bi == 3) && (this.archAngel.n == true))
          {
            this.archAngel.am.bh = false;
            this.archAngel.am.d(true);
          }
          break;
        case 57: 
          if (this.archAngel.am.bi == 1) {
            this.archAngel.am.c();
          }
          break;
        case 50: 
          this.archAngel.am.c(true);
          this.archAngel.am.a9 = 1;
          break;
        case 56: 
          this.archAngel.am.c(false);
          this.archAngel.am.a9 = 2;
          break;
        case 52: 
          this.archAngel.am.a(true);
          this.archAngel.am.ba = 1;
          break;
        case 54: 
          this.archAngel.am.a(false);
          this.archAngel.am.ba = 2;
          break;
        case 48: 
          if (this.archAngel.am.bi == 3)
          {
            this.archAngel.am.az = false;
            if (this.archAngel.aj.t < this.archAngel.aj.r) {
              this.archAngel.MPlay("s_reload", 1);
            }
            this.archAngel.am.bh = true;
          }
          break;
        case 55: 
        default: 
          switch (paramInt)
          {
          case -2: 
            this.archAngel.am.c(false);
            this.archAngel.am.a9 = 2;
            break;
          case -1: 
            this.archAngel.am.c(true);
            this.archAngel.am.a9 = 1;
            break;
          case -4: 
            this.archAngel.am.a(false);
            this.archAngel.am.ba = 2;
            break;
          case -3: 
            this.archAngel.am.a(true);
            this.archAngel.am.ba = 1;
            break;
          case -7: 
            if (this.archAngel.l) {
              this.archAngel.b = 13;
            }
            break;
          case -6: 
            if (this.archAngel.l) {
              this.archAngel.b = 14;
            }
            break;
          case -5: 
            if ((this.archAngel.am.bi == 1) && (this.archAngel.m == true)) {
              this.archAngel.am.b(true);
            }
            if ((this.archAngel.am.bi == 3) && (this.archAngel.n == true))
            {
              this.archAngel.am.bh = false;
              this.archAngel.am.d(true);
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
              this.archAngel.al.a += 1;
              this.archAngel.x = -1;
              this.archAngel.g = true;
            }
            break;
          case -4: 
          case -1: 
            if (this.archAngel.z < 10)
            {
              this.archAngel.al.a += -1;
              this.archAngel.x = -1;
              this.archAngel.g = true;
            }
            break;
          case -7: 
          case -5: 
            if (this.archAngel.z == 5) {
              i2 = this.archAngel.al.a;
            } else {
              i2 = 1;
            }
            break;
          }
          if (this.archAngel.al.a <= 0) {
            this.archAngel.al.a = this.archAngel.al.b;
          }
          if (this.archAngel.al.a > this.archAngel.al.b) {
            this.archAngel.al.a = 1;
          }
        }
        if ((i2 > 0) && (this.archAngel.al.m[(i2 - 1)] > 0))
        {
          this.archAngel.z = this.archAngel.al.m[(i2 - 1)];
          this.archAngel.x = 0;
        }
      }
      break;
    case 12: 
      System.gc();
      if (this.v == true)
      {
        this.archAngel.x = -1;
        if ((paramInt == 50) || (paramInt == -5) || (paramInt == 49) || (paramInt == -7)) {
          this.archAngel.a = 1;
        }
        if (((paramInt == 50) || (paramInt == 49) || (paramInt == -5) || (paramInt == -7) || (paramInt == -6)) && (this.archAngel.s)) {
          this.archAngel.s = false;
        }
        if ((this.archAngel.z == 100) || (this.archAngel.z == 200) || (this.archAngel.z == 300)) {
          switch (paramInt)
          {
          case -1: 
            if (this.archAngel.a == 1)
            {
              this.archAngel.a = 7;
              this.archAngel.r = true;
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
        this.archAngel.q = true;
      }
      if (this.v == true) {
        if (paramInt == -6)
        {
          this.archAngel.a = 1;
          if (this.archAngel.p > 0) {
            this.archAngel.z = this.archAngel.p;
          }
        }
        else if ((this.archAngel.z != 111) && (this.archAngel.z != 211) && (this.archAngel.z != 311))
        {
          a(paramInt, i1);
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
        this.archAngel.al.e = false;
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
            this.archAngel.al.e = true;
          }
          this.archAngel.z = this.archAngel.p;
        }
      }
      else if (this.archAngel.v) {
        a(paramInt, i1);
      }
      this.archAngel.w = true;
      break;
    case 13: 
      if ((paramInt != -6) && (this.archAngel.v))
      {
        a(paramInt, i1);
        if ((this.archAngel.am.az == true) && (this.q == 1) && (this.archAngel.al.a == 1) && ((paramInt == -7) || (paramInt == -5) || (paramInt == 49))) {
          this.archAngel.MPlay("s_plasma", 0);
        }
        if ((this.archAngel.al.a == 1) && ((paramInt == -7) || (paramInt == -5) || (paramInt == 49)))
        {
          this.archAngel.am.e();
          this.archAngel.am.ba = 0;
          this.archAngel.am.a9 = 0;
          this.archAngel.am.bd = 0;
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
        if (this.archAngel.am.az == true) {
          this.archAngel.MPlay("s_plasma", 0);
        }
        this.archAngel.am.e();
        this.archAngel.am.ba = 0;
        this.archAngel.am.a9 = 0;
        this.archAngel.am.bd = 0;
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
  
  public void f(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      this.y = 1;
      this.archAngel.ak.a(paramGraphics, 14, 17, 89);
      paramGraphics.setClip(17, 89, 223, 25);
      this.archAngel.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
      paramGraphics.setClip(0, 0, 240, 320);
      if (this.archAngel.x == 0) {
        this.archAngel.al.a("system");
      }
      q(paramGraphics);
      return;
    case 1: 
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.al.c = true;
      this.archAngel.al.d = false;
      this.archAngel.al.h = 1;
      this.archAngel.al.g = this.y;
      if (this.archAngel.u) {
        this.archAngel.f();
      }
      this.archAngel.u = false;
      break;
    case 11: 
      this.archAngel.b();
      this.archAngel.z = 12;
      break;
    case 100: 
    case 200: 
    case 300: 
      this.archAngel.a(paramGraphics);
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
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "PREV", true);
      this.archAngel.a(paramGraphics, "NEXT", false);
      break;
    case 104: 
    case 205: 
    case 302: 
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "PREV", true);
      this.archAngel.a(paramGraphics, "OK", false);
      break;
    case 21: 
      if (this.archAngel.e())
      {
        this.archAngel.d();
        this.archAngel.al.a("system");
        this.archAngel.z = 22;
      }
      else
      {
        this.archAngel.z = 23;
      }
      break;
    case 12: 
    case 22: 
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "OK", false);
      break;
    case 10: 
      this.archAngel.al.c = false;
      this.y = 1;
      break;
    case 20: 
      this.archAngel.al.c = false;
      this.y = 2;
      break;
    case 33: 
      this.archAngel.af = (1 - this.archAngel.af);
      if (this.archAngel.af == 0) {
        this.archAngel.c();
      }
      this.archAngel.u = true;
    case 30: 
      this.archAngel.al.c = false;
      this.y = 3;
      this.archAngel.z = (31 + this.archAngel.af);
      break;
    case 43: 
      this.archAngel.ag = (1 - this.archAngel.ag);
      this.archAngel.u = true;
    case 40: 
      this.archAngel.al.c = false;
      this.y = 4;
      this.archAngel.z = (41 + this.archAngel.ag);
      break;
    case 50: 
      this.archAngel.al.c = false;
      this.y = 5;
      this.archAngel.al.a("helpmain");
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.al.d = true;
      this.archAngel.z = 61;
      break;
    case 99: 
      this.archAngel.al.d = false;
      this.archAngel.al.h = 1;
      this.archAngel.al.a("help0");
      this.archAngel.z += 1;
      break;
    case 199: 
      this.archAngel.al.d = false;
      this.archAngel.al.h = 2;
      this.archAngel.al.a("help1");
      this.archAngel.z += 1;
      break;
    case 299: 
      this.archAngel.al.d = false;
      this.archAngel.al.h = 3;
      this.archAngel.al.a("help2");
      this.archAngel.z += 1;
      break;
    case 399: 
      this.archAngel.al.a("help3");
      this.archAngel.z += 1;
      break;
    case 500: 
      this.archAngel.al.a("system");
      this.archAngel.z = 1;
      if (this.archAngel.b != 10) {
        return;
      }
      break;
    case 70: 
      this.archAngel.b = 5;
      return;
    case 999: 
      this.archAngel.c();
      this.archAngel.b();
      this.archAngel.destroyApp(false);
      this.archAngel.notifyDestroyed();
      return;
    }
    if (this.archAngel.w) {
      c(paramGraphics, this.archAngel.z, 150);
    }
  }
  
  public void b(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    b(paramGraphics, paramInt1);
    this.archAngel.al.a(paramInt1);
    this.archAngel.al.b = 0;
    this.archAngel.p = this.archAngel.al.o;
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
    while ((str = this.archAngel.al.a()) != null)
    {
      this.archAngel.ak.a(paramGraphics, 10, i1, str, this.x);
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
        if (i2 > this.archAngel.al.b) {
          this.archAngel.al.b = i2;
        }
        if (i2 == this.archAngel.al.a)
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(7, i1 - 2, str.length() * 6 + 6, 9);
          this.archAngel.ak.a(paramGraphics, 10, i1, str, 3);
        }
      }
      i1 += 11;
    }
    this.archAngel.g = false;
  }
  
  public void g(Graphics paramGraphics)
  {
    paramGraphics.setColor(0);
    this.archAngel.ak.a(paramGraphics, 12, 145, "Save equipment");
    this.archAngel.ak.a(paramGraphics, 12, 160, "as you are using.");
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = -1;
    if ((paramInt1 >= 49) && (paramInt1 <= 57))
    {
      i1 = paramInt1 - 49 + 1;
      if (this.archAngel.b == 13) {
        this.archAngel.al.a = i1;
      }
    }
    else if ((paramInt1 != -8) && (paramInt1 != 42) && (paramInt1 != 48) && (paramInt1 != 35))
    {
      switch (paramInt1)
      {
      case -4: 
      case -2: 
        this.archAngel.al.a += 1;
        this.archAngel.x = -1;
        this.archAngel.g = true;
        break;
      case -3: 
      case -1: 
        this.archAngel.al.a += -1;
        this.archAngel.x = -1;
        this.archAngel.g = true;
        break;
      default: 
        i1 = this.archAngel.al.a;
      }
      if (this.archAngel.al.a <= 0) {
        this.archAngel.al.a = this.archAngel.al.b;
      }
      if (this.archAngel.al.a > this.archAngel.al.b) {
        this.archAngel.al.a = 1;
      }
    }
    if ((i1 > 0) && (this.archAngel.al.m[(i1 - 1)] > 0))
    {
      this.archAngel.z = this.archAngel.al.m[(i1 - 1)];
      this.archAngel.x = 0;
    }
  }
  
  public void h(Graphics paramGraphics)
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
          this.archAngel.MPlay("m_briefing", 0);
          this.archAngel.ak.a("brief");
        }
        this.archAngel.ak.a(this.archAngel.x, 17 + this.archAngel.x);
      }
      if (this.archAngel.x == 4)
      {
        this.archAngel.ak.d();
        this.archAngel.ak.a("boss" + this.archAngel.aj.b);
        this.archAngel.ak.a(8, 21);
        this.archAngel.ak.d();
        if (this.archAngel.k)
        {
          this.archAngel.ak.a("menu");
          for (i1 = 0; i1 < 4; i1++) {
            this.archAngel.ak.a(i1, 13 + i1);
          }
          this.archAngel.ak.d();
          paramGraphics.setColor(0);
          paramGraphics.fillRect(0, 80, 240, 220);
          this.archAngel.ak.a(paramGraphics, 15, 33, 60);
          paramGraphics.setClip(198, 60, 18, 20);
          this.archAngel.ak.a(paramGraphics, 16, 198, 60 - this.archAngel.aj.b * 20);
          paramGraphics.setClip(0, 0, 240, 320);
        }
        this.archAngel.ak.a(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.archAngel.ak.a(paramGraphics, 13, 60, 90);
        if (this.archAngel.aj.b < 4) {
          this.archAngel.ak.a("enermy" + this.archAngel.aj.b);
        } else {
          this.archAngel.ak.a("boss" + (this.archAngel.aj.b - 4));
        }
        this.archAngel.ak.a(8, 22);
        this.archAngel.ak.d();
        this.archAngel.a(paramGraphics);
        if (this.archAngel.b == 9) {
          this.archAngel.a(paramGraphics, "SKIP", true);
        }
        this.archAngel.a(paramGraphics, "NEXT", false);
        this.archAngel.z += 1;
        this.archAngel.p = -1;
        this.archAngel.h = false;
      }
      return;
    case 1: 
      this.archAngel.z = 11;
      this.archAngel.a(this.archAngel.aj.b + 1);
      paramGraphics.setColor(65280);
      break;
    case 999: 
      if (this.archAngel.b == 9) {
        this.archAngel.b = 25;
      } else {
        this.archAngel.b = 5;
      }
      this.archAngel.aj.c = this.archAngel.aj.b;
      for (i1 = 0; i1 < 6; i1++) {
        this.archAngel.ak.a(17 + i1);
      }
      return;
    }
    if (this.archAngel.z >= 11) {
      f(paramGraphics, this.archAngel.z, 242);
    }
    if (!this.archAngel.al.a(this.archAngel.z + 1))
    {
      if (this.archAngel.b == 9)
      {
        this.archAngel.a(paramGraphics);
        this.archAngel.a(paramGraphics, "START", false);
      }
      else
      {
        this.archAngel.a(paramGraphics);
        this.archAngel.a(paramGraphics, "OPTIONS", false);
      }
      this.archAngel.aa = (this.archAngel.z = '?');
    }
  }
  
  public void i(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0) {
        this.archAngel.al.a("system");
      }
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "PLAY", true);
      this.archAngel.a(paramGraphics, "OK", false);
      q(paramGraphics);
      return;
    case 1: 
      this.archAngel.z = 2;
      break;
    case 10: 
      this.archAngel.b = 2;
      return;
    }
    f(paramGraphics);
  }
  
  public void a() {}
  
  public void c(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    this.archAngel.w = false;
    i(paramGraphics, paramInt1, paramInt2);
  }
  
  public void j(Graphics paramGraphics)
  {
    this.archAngel.ac = this.archAngel.aj.b;
    this.archAngel.am.z = 0;
    if (this.archAngel.ac < 3) {
      this.archAngel.ad = 0;
    } else if ((this.archAngel.ac == 3) || (this.archAngel.ac == 4)) {
      this.archAngel.ad = 1;
    } else if (this.archAngel.ac > 4) {
      this.archAngel.ad = 2;
    }
    this.archAngel.am.bj = 16749568;
    this.archAngel.am.bk = 16768512;
    int i1;
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.m = false;
      this.archAngel.n = false;
      this.archAngel.l = false;
      this.l = 1;
      this.archAngel.ak.b();
      this.archAngel.ak.a();
      this.archAngel.ak.a(2);
      this.archAngel.ak.a(5);
      this.archAngel.aj.a();
      this.archAngel.a(this.archAngel.aj.b + 1);
      this.archAngel.am.a();
      this.archAngel.ak.a("etc");
      this.archAngel.ak.a(0, 111);
      this.archAngel.ak.d();
      this.archAngel.ak.a("aa");
      this.archAngel.ak.a(0, 24);
      this.archAngel.ak.a(9, 33);
      this.archAngel.ak.a(10, 34);
      this.archAngel.ak.d();
      this.archAngel.z += 1;
      break;
    case 1: 
      switch (this.archAngel.x)
      {
      case 0: 
        this.archAngel.ak.a("background" + this.archAngel.ad);
        for (i1 = 0; i1 < 2; i1++) {
          this.archAngel.ak.a(i1, 7 + i1);
        }
        break;
      case 1: 
        for (i1 = 0; i1 < 9; i1++) {
          this.archAngel.ak.a(i1 + 2, 9 + i1);
        }
        if (this.archAngel.ad == 2) {
          for (i1 = 0; i1 < 3; i1++) {
            this.archAngel.ak.a(i1 + 11, 18 + i1);
          }
        }
        this.archAngel.ak.d();
        break;
      case 2: 
        System.gc();
        this.archAngel.z += 1;
        break;
      }
      a(paramGraphics, this.archAngel.x);
      break;
    case 2: 
      switch (this.archAngel.x)
      {
      case 0: 
        this.archAngel.ak.a("ui");
        for (i1 = 0; i1 < 3; i1++) {
          this.archAngel.ak.a(i1, 21 + i1);
        }
        this.archAngel.ak.d();
        this.archAngel.ak.a("effect");
        for (i1 = 0; i1 < 13; i1++) {
          this.archAngel.ak.a(i1, 71 + i1);
        }
        this.archAngel.ak.d();
        break;
      case 1: 
        System.gc();
        this.archAngel.z += 1;
        break;
      }
      a(paramGraphics, this.archAngel.x + 3);
      break;
    case 3: 
      a(paramGraphics, this.archAngel.x + 5);
      switch (this.archAngel.x)
      {
      case 0: 
        this.archAngel.ak.a("aa");
        for (i1 = 0; i1 < 11; i1++) {
          this.archAngel.ak.a(i1, 24 + i1);
        }
        this.archAngel.ak.d();
        break;
      case 1: 
        if (this.archAngel.ac < 4) {
          this.archAngel.ak.a("enermy" + this.archAngel.ac);
        } else {
          this.archAngel.ak.a("boss" + (this.archAngel.ac - 4));
        }
        for (i1 = 0; i1 < 8; i1++) {
          this.archAngel.ak.a(i1, 53 + i1);
        }
        this.archAngel.ak.d();
        break;
      case 2: 
        this.archAngel.ak.a("fence" + this.archAngel.ad);
        for (i1 = 0; i1 < 8; i1++) {
          this.archAngel.ak.a(i1, 44 + i1);
        }
        this.archAngel.ak.a("plasma");
        for (i1 = 18; i1 < 24; i1++) {
          this.archAngel.ak.a(i1, 84 + i1);
        }
        this.archAngel.ak.d();
        break;
      case 3: 
        this.archAngel.c();
        System.gc();
        this.archAngel.z += 1;
      }
      break;
    case 4: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.ak.a(111);
        this.b = false;
        t(paramGraphics);
        this.archAngel.j = false;
      }
      paramGraphics.setClip(0, 0, 240, 320);
      this.archAngel.am.a(paramGraphics);
      o(paramGraphics);
      if ((this.archAngel.x < 10) && (this.archAngel.j == true))
      {
        this.archAngel.ak.a(paramGraphics, 135, 27, "", 0);
        paramGraphics.setColor(16711680);
        paramGraphics.fillRect(80, 194, 80, 10);
        this.archAngel.ak.a(paramGraphics, 86, 197, "NO MISSILE", 0);
      }
      if (this.archAngel.ab != 25)
      {
        this.archAngel.am.bl = true;
        this.b = true;
        this.archAngel.z = 5;
      }
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "OPTIONS", false);
      this.archAngel.a(paramGraphics, "PAUSE", true);
      break;
    case 5: 
      paramGraphics.setClip(0, 0, 240, 300);
      this.archAngel.am.a(paramGraphics);
      this.archAngel.am.f();
      this.archAngel.z = 6;
      break;
    case 6: 
      this.archAngel.ak.b();
      this.archAngel.ak.a();
      this.archAngel.b = this.archAngel.ab;
      break;
    }
  }
  
  public void a(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i3 = 170;
    int i4 = 3;
    String str2 = null;
    int i2 = paramInt1 / 100 - 1;
    int i1 = paramInt1 % 100;
    this.archAngel.a(paramGraphics);
    this.archAngel.a(paramGraphics, "OK", false);
    paramGraphics.setColor(7171414);
    paramGraphics.fillRect(6, 127, 226, 147);
    paramGraphics.setColor(9605802);
    paramGraphics.drawRect(6, 127, 225, 146);
    paramGraphics.setColor(9605717);
    paramGraphics.fillRect(15, 140, 72, 42);
    paramGraphics.setColor(16777130);
    paramGraphics.drawRect(15, 139, 72, 43);
    this.archAngel.ak.a(paramGraphics, 18, 141, 60, 40, i1 - 1, paramInt2);
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
    this.r.a(i1);
    String str1 = this.r.a();
    this.archAngel.ak.a(paramGraphics, 100, 145, str2);
    this.archAngel.ak.a(paramGraphics, 100, 165, str1);
    i3 += 30;
    switch (i2)
    {
    case 0: 
      this.t = this.archAngel.aj.q;
      break;
    case 1: 
      i2 = 0;
      this.t = this.archAngel.aj.v;
      break;
    case 2: 
      i2 = 1;
      this.t = this.archAngel.aj.l;
      i4 = 3;
      break;
    }
    this.t += this.archAngel.aj.a;
    for (int i5 = 0; i5 < i4; i5++)
    {
      this.archAngel.ak.a(paramGraphics, 20, i3, this.w[i2][i5] + ":" + this.r.m[i5]);
      i3 += 15;
    }
    this.u = this.r.m[i4];
  }
  
  public void k(Graphics paramGraphics)
  {
    if (this.archAngel.x > 0) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.c();
      //this.archAngel.audioClip = null;
      this.archAngel.a(paramGraphics);
      this.archAngel.al.a("subm");
      this.archAngel.z = 1;
      this.archAngel.al.c = false;
      break;
    case 1: 
      this.archAngel.s = true;
      if (this.archAngel.al.c) {
        this.archAngel.al.g = 4;
      }
      break;
    case 2: 
      this.archAngel.s = false;
      this.archAngel.al.c = true;
      this.archAngel.al.g = 1;
      break;
    case 40: 
      this.archAngel.f();
      this.archAngel.ab = 5;
    case 10: 
      this.archAngel.f();
      this.archAngel.y = (this.archAngel.b = 25);
      this.archAngel.z = 4;
      return;
    case 20: 
      this.archAngel.af = (1 - this.archAngel.af);
      if (this.archAngel.af == 0) {
        this.archAngel.c();
      }
      this.archAngel.z = 1;
      return;
    case 30: 
      this.archAngel.ag = (1 - this.archAngel.ag);
      if (this.archAngel.ag == 0) {
        this.archAngel.am.d(false);
      }
      this.archAngel.z = 1;
      return;
    case 999: 
      this.archAngel.c();
      this.archAngel.f();
      this.archAngel.b();
      this.archAngel.destroyApp(false);
      this.archAngel.notifyDestroyed();
      return;
    }
    if (this.archAngel.t)
    {
      this.archAngel.am.a(paramGraphics);
      o(paramGraphics);
      this.archAngel.t = false;
    }
    c(paramGraphics, this.archAngel.z, 217);
    this.archAngel.a(paramGraphics);
    this.archAngel.a(paramGraphics, "OK", false);
  }
  
  public void l(Graphics paramGraphics)
  {
    int i1 = 133;
    int i2 = 0;
    int i3 = 0;
    paramGraphics.setColor(0);
    if (this.archAngel.am.m != null)
    {
      i3 = this.archAngel.am.h * this.archAngel.am.u;
      this.archAngel.ak.a(paramGraphics, 50, i1, this.archAngel.am.m + ":" + this.archAngel.am.h + "x" + this.archAngel.am.u);
      i1 += 16;
      i2 += i3;
    }
    if (this.archAngel.am.q != null)
    {
      i3 = this.archAngel.am.i * this.archAngel.am.t;
      this.archAngel.ak.a(paramGraphics, 50, i1, this.archAngel.am.q + ":" + this.archAngel.am.i + "x" + this.archAngel.am.t);
      i1 += 16;
      i2 += i3;
    }
    i3 = -this.archAngel.aj.i * (this.archAngel.aj.g - this.archAngel.aj.j);
    this.archAngel.ak.a(paramGraphics, 50, i1, "Maintenance Fee:");
    i1 += 16;
    this.archAngel.ak.a(paramGraphics, 59, i1, "" + i3);
    i1 += 25;
    i2 += i3;
    this.archAngel.ak.a(paramGraphics, 50, i1, "Total:" + i2);
    this.archAngel.aj.a += i2;
  }
  
  public void m(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.k = false;
      this.archAngel.ak.a();
      this.archAngel.ak.b();
      this.archAngel.ak.a("menu");
      for (int i1 = 0; i1 < 4; i1++) {
        this.archAngel.ak.a(i1, 13 + i1);
      }
      this.archAngel.ak.d();
      this.archAngel.ak.a("font");
      for (int i1 = 1; i1 < 3; i1++) { // int
        this.archAngel.ak.a(i1, i1);
      }
      this.archAngel.ak.a(5, 5);
      this.archAngel.ak.d();
      this.archAngel.w = true;
      this.archAngel.al.c = false;
      this.archAngel.al.d = false;
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
      this.archAngel.ak.a(paramGraphics, 3, 0, 0);
      this.archAngel.ak.a(paramGraphics, 5, 27, 25);
      this.archAngel.ak.a(paramGraphics, 4, 0, 160);
      this.archAngel.ak.a(paramGraphics, 3, 0, 180);
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
        this.archAngel.ak.a(paramGraphics, 4, 0, 160 - 5 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 3, 0, 180 + 5 * this.archAngel.x);
        paramGraphics.setClip(0, 180 - 5 * this.archAngel.x, 240, 10 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 14, 17, 89 + this.l * 33);
        this.archAngel.ak.a(paramGraphics, 13, 60, 90);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.ak.d();
        this.archAngel.ak.a("etc");
        this.archAngel.ak.a(3, 114);
        this.archAngel.z += 1;
      }
      break;
    case 3: 
      this.archAngel.ak.a(paramGraphics, 15, 33, 60);
      paramGraphics.setClip(198, 60, 18, 20);
      this.archAngel.ak.a(paramGraphics, 16, 198, 60 - this.archAngel.aj.b * 20);
      paramGraphics.setClip(0, 0, 240, 280);
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 80, 240, 200);
      paramGraphics.setColor(4802901);
      paramGraphics.fillRect(0, 119, 240, 30);
      paramGraphics.fillRect(0, 171, 240, 10);
      paramGraphics.fillRect(0, 205, 240, 30);
      this.archAngel.ak.a(paramGraphics, 14, 17, 89 + this.l * 33);
      this.archAngel.ak.a(paramGraphics, 13, 60, 90);
      this.archAngel.ak.a(paramGraphics, 3, 0, 280);
      break;
    }
    this.archAngel.a(paramGraphics);
    this.archAngel.a(paramGraphics, "PLAY", true);
    this.archAngel.a(paramGraphics, "OK", false);
  }
  
  public void d(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    int i2 = 5;
    this.archAngel.al.a(paramInt1);
    String str;
    while ((str = this.archAngel.al.a()) != null)
    {
      paramGraphics.setColor(16777215);
      if (this.archAngel.b == 4) {
        paramGraphics.drawString(str, 120, i1, 17);
      }
      i1 += 17;
    }
  }
  
  public void e(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    b(paramGraphics, paramInt1, paramInt2);
  }
  
  public void n(Graphics paramGraphics)
  {
    if (this.archAngel.x > 0) {
      return;
    }
    switch (this.archAngel.z)
    {
    case 0: 
      this.archAngel.c();
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 150, 240, 15);
      this.archAngel.ak.a(paramGraphics, 98, 152, "PAUSE");
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "RESUME", false);
      break;
    case 1: 
      this.archAngel.y = (this.archAngel.b = 25);
      this.archAngel.z = 4;
      return;
    }
  }
  
  public void b(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i3 = 190;
    int i4 = 3;
    String str2 = null;
    int i2 = paramInt1 / 100 - 1;
    int i1 = paramInt1 % 100;
    this.r.a(i1);
    String str1 = this.r.a();
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
    this.archAngel.ak.a(paramGraphics, 13, 131, 60, 40, i1 - 1, paramInt2);
    switch (paramInt2)
    {
    case 0: 
      this.x = 0;
      str2 = "MISSILE";
      this.t = this.archAngel.aj.q;
      break;
    case 1: 
      this.x = 1;
      i2 = 0;
      str2 = "PLASMA CANON";
      this.t = this.archAngel.aj.v;
      break;
    case 2: 
      this.x = 2;
      i2 = 1;
      str2 = "ARMOR";
      this.t = this.archAngel.aj.l;
      break;
    }
    this.t += this.archAngel.aj.a;
    this.archAngel.ak.a(paramGraphics, 100, 140, str2);
    for (int i5 = 0; i5 < i4; i5++)
    {
      this.archAngel.ak.a(paramGraphics, 130, i3, this.w[i2][i5] + ":" + this.r.m[i5], this.x);
      i3 += 11;
    }
    if (paramBoolean)
    {
      this.archAngel.ak.a(paramGraphics, 130, 235, "MY MONEY:", this.x);
      this.archAngel.ak.a(paramGraphics, 130, 245, "" + this.archAngel.aj.a, this.x);
    }
  }
  
  public void f(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    h(paramGraphics, paramInt1, paramInt2);
  }
  
  public void a(Graphics paramGraphics, int paramInt)
  {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, 240, 320);
    this.archAngel.ak.a(paramGraphics, 24, 90, 169);
    paramGraphics.setClip(100, 180, 12, 11);
    this.archAngel.ak.a(paramGraphics, 33, 100, 180 - 11 * (paramInt % 2));
    paramGraphics.setClip(128, 180, 12, 11);
    this.archAngel.ak.a(paramGraphics, 34, 128, 180 - 11 * (paramInt % 2));
    paramGraphics.setColor(16711680);
    paramGraphics.setClip(87, 200, 66, 14);
    paramGraphics.fillRect(87, 217 - paramInt * 3, 66, paramInt * 3);
    this.archAngel.ak.a(paramGraphics, 111, 87, 200);
  }
  
  public void paint(Graphics paramGraphics)
  {
    if (this.ah) {
      return;
    }
    this.ah = true;
    this.archAngel.x += 1;
    if (this.archAngel.b != this.archAngel.y)
    {
      this.archAngel.x = 0;
      this.archAngel.z = 0;
      this.archAngel.aa = 0;
      this.archAngel.p = -1;
      this.b = true;
      this.archAngel.y = this.archAngel.b;
      this.archAngel.i = false;
    }
    else if (this.archAngel.z != this.archAngel.aa)
    {
      this.archAngel.x = 0;
      this.archAngel.aa = this.archAngel.z;
    }
    switch (this.archAngel.b)
    {
    case 25: 
      j(paramGraphics);
      break;
    case 0: 
      u(paramGraphics);
      break;
    case 3: 
      c(paramGraphics);
      break;
    case 1: 
      i(paramGraphics);
      break;
    case 5: 
      m(paramGraphics);
      break;
    case 13: 
      k(paramGraphics);
      break;
    case 14: 
      n(paramGraphics);
      break;
    case 9: 
      if (this.archAngel.aj.c != this.archAngel.aj.b) {
        h(paramGraphics);
      } else {
        this.archAngel.b = 25;
      }
      break;
    case 8: 
      h(paramGraphics);
      break;
    case 10: 
      f(paramGraphics);
      break;
    case 11: 
      r(paramGraphics);
      break;
    case 12: 
      s(paramGraphics);
      break;
    case 4: 
      e(paramGraphics);
      break;
    case 26: 
      d(paramGraphics);
      break;
    case 2: 
      v(paramGraphics);
      break;
    case 7: 
      b(paramGraphics);
      break;
    case 6: 
      p(paramGraphics);
      break;
    case 27: 
      a(paramGraphics);
      break;
    }
    this.ah = false;
  }
  
  public b(ArchAngel paramArchAngel)
  {
    (this.archAngel = paramArchAngel).getClass();
    this.a = 0;
    this.b = true;
    this.c = -1;
    this.d = -2;
    this.e = -3;
    this.f = -4;
    this.g = -5;
    this.h = -6;
    this.i = -7;
    this.j = -8;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.o = -1;
    this.p = -1;
    this.v = true;
    this.w = new String[][] { { "DAMAGE", "BULLET/M", "PRICE" }, { "DEFENCE", "REPAIR", "PRICE" } };
    this.y = 1;
    this.z = false;
    this.aa = 0;
    this.ab = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.af = 0;
    this.ag = 0;
    this.ah = false;
  }
  
  public void b() {}
  
  public void o(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, 240, 40);
    switch (this.archAngel.am.aa)
    {
    case 0: 
      if (this.archAngel.ac < 4) {
        this.archAngel.ak.a(paramGraphics, 75, 10, "ENERMY:" + this.archAngel.am.m, 0);
      } else {
        this.archAngel.ak.a(paramGraphics, 75, 10, this.archAngel.am.m, 0);
      }
      this.archAngel.ak.a(paramGraphics, 75, 20, "N:" + (this.archAngel.am.y - this.archAngel.am.u), 0);
      if (this.archAngel.am.y - this.archAngel.am.u <= 0)
      {
        this.archAngel.am.a1 = true;
        this.archAngel.am.aa = this.archAngel.am.ac;
      }
      break;
    case 1: 
      paramGraphics.setColor(14408703);
      paramGraphics.drawString(this.archAngel.am.ca + " m", 120, 3, 17);
      int i1 = this.archAngel.am.f;
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
            this.archAngel.ak.a(paramGraphics, 23, 114 + i3 * 4, 20);
          }
        } else if (i1 < -5) {
          for (i3 = 0; i3 < i2; i3++) {
            this.archAngel.ak.a(paramGraphics, 22, 106 - i3 * 4, 20);
          }
        }
      }
      break;
    case 2: 
      if (this.archAngel.ac < 7)
      {
        this.archAngel.ak.a(paramGraphics, 87, 8, this.archAngel.am.q, 0);
      }
      else
      {
        this.archAngel.ak.a(paramGraphics, 89, 5, "ARCHANGEL", 0);
        this.archAngel.ak.a(paramGraphics, 89, 11, "   MK2   ", 0);
      }
      this.archAngel.ak.a(paramGraphics, 82, 18, "HP:", 0);
      paramGraphics.setColor(9605802);
      paramGraphics.fillRect(102, 17, 42, 7);
      paramGraphics.setColor(14408703);
      paramGraphics.drawRect(102, 17, 41, 6);
      paramGraphics.setColor(16776960);
      paramGraphics.fillRect(103, 18, this.archAngel.ae, 5);
      break;
    }
    int i1 = 40 * this.archAngel.aj.j >> 9;
    paramGraphics.setColor(255);
    paramGraphics.fillRect(192, 5, i1 / 2, 4);
    if (this.archAngel.am.bi == 3)
    {
      if (this.archAngel.am.bh == true)
      {
        if (this.archAngel.aj.t < this.archAngel.aj.r) {
          this.archAngel.aj.t += 3;
        }
        if (this.archAngel.aj.t == this.archAngel.aj.r) {
          this.archAngel.am.bh = false;
        }
      }
      if (this.archAngel.aj.t <= 0)
      {
        paramGraphics.setColor(16711680);
        if (this.archAngel.x / 2 % 2 == 0)
        {
          paramGraphics.fillRect(80, 194, 80, 19);
          this.archAngel.ak.a(paramGraphics, 86, 197, "PRESS 0 KEY", 0);
          this.archAngel.ak.a(paramGraphics, 92, 205, "TO RELOAD", 0);
        }
      }
      i1 = this.archAngel.aj.t * 40 / this.archAngel.aj.r;
    }
    else if (this.archAngel.am.bi == 1)
    {
      i1 = this.archAngel.aj.o * 40 / this.archAngel.aj.m;
    }
    else
    {
      i1 = 40;
    }
    paramGraphics.setColor(16711680);
    paramGraphics.fillRect(192, 17, i1, 4);
  }
  
  public void p(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        for (int i1 = 11; i1 < 19; i1++) {
          this.archAngel.ak.a(24 + i1);
        }
        this.archAngel.ak.a();
        this.archAngel.ak.a("font");
        this.archAngel.ak.a(1, 1);
        this.archAngel.ak.d();
        this.archAngel.a(paramGraphics);
        this.archAngel.a(paramGraphics, "OK", false);
        this.archAngel.s = false;
        this.archAngel.m = false;
      }
      q(paramGraphics);
      break;
    case 1: 
      this.archAngel.MPlay("m_win", 1);
      this.archAngel.ak.a("result");
      this.archAngel.ak.a(2, paramGraphics, 45, 93);
      this.archAngel.ak.a(1, paramGraphics, 62, 98);
      this.archAngel.ak.d();
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      if (this.archAngel.aj.b == 7)
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
        l(paramGraphics);
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
        this.archAngel.ak.a();
        System.gc();
        this.archAngel.aj.b += 1;
        this.archAngel.b();
        this.archAngel.b = 5;
      }
      break;
    }
  }
  
  public void g(Graphics paramGraphics, int paramInt1, int paramInt2)
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
      i4 = this.archAngel.aj.q;
      if (this.archAngel.aj.d == i2)
      {
        g(paramGraphics);
        return;
      }
      this.archAngel.aj.d = i2;
      this.archAngel.aj.a(this.r);
      break;
    case 1: 
      i4 = this.archAngel.aj.v;
      if (this.archAngel.aj.e == i2)
      {
        g(paramGraphics);
        return;
      }
      this.archAngel.aj.e = i2;
      this.archAngel.aj.c(this.r);
      break;
    case 2: 
      i4 = this.archAngel.aj.l;
      if (this.archAngel.aj.f == i2)
      {
        g(paramGraphics);
        return;
      }
      this.archAngel.aj.f = i2;
      this.archAngel.aj.d(this.r);
      break;
    }
    this.archAngel.aj.a += i4 - paramInt2;
    switch (this.x)
    {
    case 0: 
      str1 = "missile";
      str2 = this.archAngel.aj.p;
      break;
    case 1: 
      str1 = "plasma canon";
      str2 = this.archAngel.aj.u;
      break;
    case 2: 
      str1 = "Armor";
      str2 = this.archAngel.aj.k;
      break;
    }
    this.archAngel.ak.a(paramGraphics, 12, 135, "You bought the");
    this.archAngel.ak.a(paramGraphics, 12, 150, str1);
    this.archAngel.ak.a(paramGraphics, 12, 165, str2);
    this.archAngel.ak.a(paramGraphics, 12, 195, "My money : " + this.archAngel.aj.a);
  }
  
  public void q(Graphics paramGraphics)
  {
    this.archAngel.z += 1;
    this.archAngel.p = -1;
    this.archAngel.h = false;
  }
  
  public void keyReleased(int paramInt)
  {
    switch (this.archAngel.b)
    {
    case 25: 
      if (this.archAngel.am.bi == 1)
      {
        if ((paramInt == -5) || (paramInt == 53))
        {
          this.archAngel.am.b(false);
          this.archAngel.c();
        }
      }
      else if ((this.archAngel.am.bi == 3) && ((paramInt == -5) || (paramInt == 53)) && (this.archAngel.ag != 1))
      {
        this.archAngel.am.d(false);
        this.archAngel.c();
      }
      if ((paramInt == 49) || (paramInt == 50) || (paramInt == 51) || (paramInt == 52) || (paramInt == 54) || (paramInt == 57) || (paramInt == -1) || (paramInt == -2) || (paramInt == -4) || (paramInt == -3))
      {
        this.archAngel.am.e();
        this.archAngel.am.ba = 0;
        this.archAngel.am.a9 = 0;
        this.archAngel.am.bd = 0;
      }
      break;
    }
  }
  
  public void h(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    paramGraphics.setColor(9605802);
    paramGraphics.fillRect(0, 119, 240, 181);
    if (paramInt1 == 11)
    {
      this.archAngel.ak.a(paramGraphics, 17, 10, 126);
    }
    else if ((paramInt1 >= 12) && (paramInt1 < 14))
    {
      this.archAngel.ak.a(paramGraphics, 20, 6, 126);
      this.archAngel.ak.c(paramGraphics, 22, 55, 170);
      this.archAngel.ak.a(paramGraphics, 140, 140, "NAME:", 0);
      this.archAngel.ak.a(paramGraphics, 140, 150, this.archAngel.am.m, 0);
      this.archAngel.ak.a(paramGraphics, 140, 160, "DAMAGE:", 0);
      this.archAngel.ak.a(paramGraphics, 140, 170, this.archAngel.am.k + "MP", 0);
    }
    else if (paramInt1 >= 14)
    {
      this.archAngel.ak.a(paramGraphics, 20, 6, 126);
      this.archAngel.ak.c(paramGraphics, 21, 55, 170);
      this.archAngel.ak.a(paramGraphics, 140, 140, "NAME:", 0);
      this.archAngel.ak.a(paramGraphics, 140, 150, this.archAngel.am.q, 0);
      this.archAngel.ak.a(paramGraphics, 140, 160, "DAMAGE:", 0);
      this.archAngel.ak.a(paramGraphics, 140, 170, this.archAngel.am.o + "MP", 0);
    }
    this.archAngel.ak.a(paramGraphics, 18, 189, 175);
    this.archAngel.ak.a(paramGraphics, 19, 0, 235);
    paramGraphics.setColor(0);
    this.archAngel.al.a(paramInt1);
    this.archAngel.al.b = 0;
    this.archAngel.p = this.archAngel.al.o;
    String str;
    while ((str = this.archAngel.al.a()) != null)
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
        if (i2 > this.archAngel.al.b) {
          this.archAngel.al.b = i2;
        }
      }
      paramGraphics.drawString(str, 11, i1, 20);
      i1 += 17;
    }
    this.archAngel.g = false;
  }
  
  public void i(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.archAngel.v = false;
    if ((this.archAngel.b == 12) && ((paramInt1 == 100) || (paramInt1 == 200) || (paramInt1 == 300)))
    {
      b(paramGraphics, paramInt1, 130);
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
          this.archAngel.ak.a(paramGraphics, 2, 2, 120);
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
      this.archAngel.al.a(paramInt1);
      this.archAngel.al.b = 0;
      this.archAngel.p = this.archAngel.al.o;
      String str;
      while ((str = this.archAngel.al.a()) != null)
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
          if (i2 > this.archAngel.al.b) {
            this.archAngel.al.b = i2;
          }
          if (i2 == this.archAngel.al.a) {
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
          this.archAngel.ak.a(paramGraphics, i4, i1 + 8, str, 0);
          paramGraphics.setColor(0);
          if (this.archAngel.s)
          {
            paramGraphics.setColor(0);
            this.archAngel.ak.a(paramGraphics, i4 + 66, 236, this.archAngel.an[(1 - this.archAngel.af)], 0);
            this.archAngel.ak.a(paramGraphics, i4 + 72, 247, this.archAngel.ao[(1 - this.archAngel.ag)], 0);
          }
        }
        else
        {
          this.archAngel.ak.a(paramGraphics, i4, i1, str);
          if ((this.archAngel.b == 10) && (paramInt1 == 51) && ((this.archAngel.al.a <= 2) || (this.archAngel.al.a == 4))) {
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
        this.archAngel.ak.a(paramGraphics, 114, 10, 135);
        paramGraphics.setColor(0);
        this.archAngel.ak.a(paramGraphics, 12, 180, "My money:" + this.archAngel.aj.a);
        this.archAngel.ak.a(paramGraphics, 10, 210, "1.Missile");
        this.archAngel.ak.a(paramGraphics, 10, 225, "2.Plasma Canon");
        this.archAngel.ak.a(paramGraphics, 10, 240, "3.Armor");
      }
      this.archAngel.g = false;
    }
    this.archAngel.v = true;
  }
  
  public void showNotify()
  {
    this.archAngel.t = true;
    this.archAngel.x = -1;
    if (this.archAngel.b == 25)
    {
      this.archAngel.am.e();
      this.archAngel.am.ba = 0;
      this.archAngel.am.a9 = 0;
      this.archAngel.am.bd = 0;
    }
  }
  
  public void r(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    c(paramGraphics, this.archAngel.z, 210);
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.al.a("info");
        this.r = new e();
        this.o = 186;
        this.p = 5;
        this.archAngel.ak.a("shop");
        for (int i1 = 0; i1 < 3; i1++) {
          this.archAngel.ak.a(i1, 26 + i1);
        }
        this.archAngel.ak.d();
        this.archAngel.ak.a(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.archAngel.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
        paramGraphics.setClip(0, 0, 240, 320);
      }
      q(paramGraphics);
      return;
    case 1: 
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.d = 2;
      this.archAngel.z = 5;
      break;
    case 10: 
      this.r.a("missile");
      this.archAngel.d = 0;
      a(paramGraphics, 100 + this.archAngel.aj.d, false, 0);
      this.archAngel.al.c = true;
      this.archAngel.al.g = 1;
      break;
    case 20: 
      this.r.a("plasma");
      this.archAngel.d = 1;
      a(paramGraphics, 200 + this.archAngel.aj.e, false, 1);
      this.archAngel.al.c = true;
      this.archAngel.al.g = 2;
      break;
    case 30: 
      this.r.a("arm");
      this.archAngel.d = 2;
      a(paramGraphics, 300 + this.archAngel.aj.f, false, 2);
      this.archAngel.al.c = true;
      this.archAngel.al.g = 3;
      break;
    case 999: 
      this.archAngel.b = 5;
      this.r = null;
      return;
    }
  }
  
  public void s(Graphics paramGraphics)
  {
    if ((this.archAngel.z > 0) && (this.archAngel.x > 0)) {
      return;
    }
    this.v = false;
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.ak.a("shop");
        for (int i1 = 0; i1 < 3; i1++)
        {
          this.archAngel.ak.a(26 + i1);
          this.archAngel.ak.a(i1, 26 + i1);
        }
        this.archAngel.ak.d();
        this.archAngel.ak.a(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.archAngel.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.a(paramGraphics);
        this.archAngel.a(paramGraphics, "BACK", true);
        this.archAngel.a(paramGraphics, "OK", false);
        this.archAngel.al.a("shop");
        this.r = new e();
        this.archAngel.al.g = 1;
      }
      q(paramGraphics);
      return;
    case 2: 
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.z = 1;
      break;
    case 1: 
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
      this.archAngel.al.c = true;
      this.v = true;
      break;
    case 99: 
      this.archAngel.z += 1;
      this.r.a("missile");
      this.archAngel.d = 0;
      this.archAngel.al.g = 1;
      break;
    case 111: 
    case 211: 
      this.archAngel.a = 1;
      c(paramGraphics, this.archAngel.z, 230);
      if (this.t >= this.r.m[2]) {
        g(paramGraphics, this.s, this.r.m[2]);
      } else {
        c(paramGraphics, this.r.m[2]);
      }
      this.v = true;
      return;
    case 199: 
      this.archAngel.z += 1;
      this.r.a("plasma");
      this.archAngel.d = 1;
      this.archAngel.al.g = 2;
      break;
    case 299: 
      this.archAngel.z += 1;
      this.r.a("arm");
      this.archAngel.d = 2;
      this.archAngel.al.g = 3;
      break;
    case 311: 
      this.archAngel.a = 1;
      c(paramGraphics, this.archAngel.z, 230);
      if (this.t >= this.r.m[2]) {
        g(paramGraphics, this.s, this.r.m[2]);
      } else {
        c(paramGraphics, this.r.m[2]);
      }
      this.v = true;
      return;
    case 999: 
      this.archAngel.b = 5;
      this.r = null;
      return;
    default: 
      if ((this.archAngel.z % 100 > 0) && (this.archAngel.z % 100 < 8) && (this.archAngel.z > 100))
      {
        b(paramGraphics, this.archAngel.z);
        this.archAngel.a(paramGraphics);
        this.archAngel.a(paramGraphics, "BACK", true);
        this.archAngel.a(paramGraphics, "OK", false);
        paramGraphics.setClip(0, 0, 178, 75);
        b(paramGraphics, this.archAngel.z, true, this.archAngel.d);
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
        this.archAngel.s = true;
        paramGraphics.setColor(65280);
        String str;
        if (this.t - this.archAngel.aj.a > this.u) {
          str = "[+";
        } else {
          str = "[";
        }
        str = str + (this.t - this.archAngel.aj.a - this.u) + "]";
        this.v = true;
        return;
      }
      this.v = true;
    }
    if ((this.archAngel.z == 100) || (this.archAngel.z == 200) || (this.archAngel.z == 300))
    {
      if (this.archAngel.x == 0) {
        this.archAngel.q = true;
      }
      this.archAngel.al.c = false;
      b(paramGraphics, this.archAngel.z);
      e(paramGraphics, this.archAngel.z, 190);
      this.archAngel.a(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
    }
    else
    {
      c(paramGraphics, this.archAngel.z, 150);
    }
  }
  
  public void b(Graphics paramGraphics, int paramInt)
  {
    if (this.archAngel.q)
    {
      paramGraphics.setColor(7171414);
      paramGraphics.fillRect(6, 127, 226, 147);
      paramGraphics.setColor(9605802);
      paramGraphics.drawRect(6, 127, 225, 146);
      paramGraphics.setColor(9605717);
      paramGraphics.fillRect(10, 130, 72, 42);
      paramGraphics.setColor(16777130);
      paramGraphics.drawRect(10, 129, 72, 43);
      if (this.archAngel.r)
      {
        b(paramGraphics, 101, true, this.archAngel.d);
        this.archAngel.r = false;
      }
      else if (this.archAngel.a <= 6)
      {
        b(paramGraphics, this.archAngel.a + 100, true, this.archAngel.d);
      }
      else
      {
        b(paramGraphics, this.archAngel.a - 1 + 100, true, this.archAngel.d);
      }
    }
    this.archAngel.q = false;
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
          this.archAngel.am.g();
          this.archAngel.am.f();
        }
        serviceRepaints();
        Thread.sleep((this.archAngel.b == 25) || (this.archAngel.b == 1) ? 30 : 30);
      }
      catch (Exception localException) {}
    }
  }
  
  public void c(Graphics paramGraphics, int paramInt)
  {
    this.archAngel.ak.a(paramGraphics, 12, 145, "Lack of " + (paramInt - this.t));
  }
  
  public void t(Graphics paramGraphics)
  {
    this.z = false;
    this.aa = 0;
    this.ab = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.af = -1;
    this.ag = -1;
    this.archAngel.ak.a(paramGraphics, 21, 0, 0);
  }
  
  public void j(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    d(paramGraphics, paramInt1, paramInt2);
  }
  
  public void u(Graphics paramGraphics)
  {
    switch (this.archAngel.z)
    {
    case 0: 
      if (this.archAngel.x == 0)
      {
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(0, 0, 240, 320);
        this.archAngel.ak.a("logo", 0, paramGraphics, 48, 80);
        this.archAngel.ak.a("logo", 1, paramGraphics, 46, 161);
        this.archAngel.ak.a("intro");
        this.archAngel.ak.a(0, 30);
        this.archAngel.ak.d();
        this.archAngel.ak.a("select");
        for (int i1 = 0; i1 < 7; i1++) {
          this.archAngel.ak.a(i1, 6 + i1);
        }
        this.archAngel.ak.d();
      }
      if (this.archAngel.x == 8) {
        this.archAngel.z += 1;
      }
      break;
    case 1: 
      if (this.archAngel.x == 0)
      {
        this.archAngel.MPlay("m_front", 0);
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
        this.archAngel.ak.a(paramGraphics, 3, 0, 0);
        this.archAngel.ak.a(paramGraphics, 3, 0, 280);
        this.archAngel.ak.a(paramGraphics, 4, 0, 60);
        this.archAngel.ak.a(paramGraphics, 5, 27, 25);
        this.archAngel.ak.a("logo", 2, paramGraphics, 0, 300);
      }
      if (this.archAngel.x % 10 < 5) {
        this.archAngel.ak.a(paramGraphics, 30, 0, 80);
      } else {
        this.archAngel.ak.a(paramGraphics, 62, 264, "Press Any Key");
      }
      break;
    case 2: 
      this.archAngel.am.bd = 0;
      if (this.archAngel.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.archAngel.x, 240, 200 - 10 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 30, 0, 80);
        paramGraphics.setClip(0, 0, 240, 320);
        this.archAngel.ak.a(paramGraphics, 4, 0, 60 + 5 * this.archAngel.x);
        this.archAngel.ak.a(paramGraphics, 3, 0, 280 - 5 * this.archAngel.x);
      }
      if (this.archAngel.x == 20)
      {
        this.archAngel.ak.a(30);
        this.archAngel.b = 3;
      }
      break;
    }
  }
  
  public void k(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    a(paramGraphics, paramInt1, paramInt2);
  }
  
  public void v(Graphics paramGraphics)
  {
    this.archAngel.aj.b();
    this.archAngel.aj.b(this.archAngel.al);
    this.archAngel.b = 5;
  }
}
