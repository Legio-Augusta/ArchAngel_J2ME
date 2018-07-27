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
  public boolean gameOff;
  public final ArchAngel archAngel;
  
  public GameHelper helper = new GameHelper();
  public GameHelper2 secondHelper = new GameHelper2();
  
  public void keyPressed(int paramInt)
  {
    int i1 = getGameAction(paramInt);
    if (this.archAngel.bool_h) {
      return;
    }
    switch (this.archAngel.screen)
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
          this.archAngel.screen = 9;
          break;
        case -7: 
        case -5: 
          if (this.l == 5) {
            this.archAngel.screen = 4;
          } else {
            this.archAngel.screen = ((byte)(8 + this.l));
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
              this.archAngel.screen = 13;
            }
            break;
          case -6: 
            if (this.archAngel.bool_l) {
              this.archAngel.screen = 14;
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
          this.secondHelper.read_text_helper(paramInt, i1, this.archAngel);
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
        this.archAngel.screen = 5;
      }
      break;
    case 1: 
    case 10: 
      if (this.archAngel.z == 1) {
        this.archAngel.readText.bool_e = false;
      }
      if (paramInt == -6)
      {
        if (this.archAngel.screen == 1)
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
        this.secondHelper.read_text_helper(paramInt, i1, this.archAngel);
      }
      this.archAngel.bool_w = true;
      break;
    case 13: 
      if ((paramInt != -6) && (this.archAngel.bool_v))
      {
        this.secondHelper.read_text_helper(paramInt, i1, this.archAngel);
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
  
  public void empty_func() {}
  
  public void draw_data_helper(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    this.helper.drawDataInTxt(paramGraphics, paramInt1, paramInt2, this.t, this.x, this.str_arr_w, this.archAngel, this.readText);
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
      this.archAngel.y = (this.archAngel.screen = 25);
      this.archAngel.z = 4;
      return;
    }
  }
  
  public void paint(Graphics paramGraphics)
  {
    if (this.gameOff) { // like GameOff, true then stop paint
//      System.out.println(">>>>> paint stop <<<<<");
      // Paint done ? can it just remove return to debug
      return;
    }
    this.gameOff = true;
    this.archAngel.x += 1;
    if (this.archAngel.screen != this.archAngel.y)
    {
      this.archAngel.x = 0;
      this.archAngel.z = 0;
      this.archAngel.aa = 0;
      this.archAngel.p = -1;
      this.bool_b = true;
      this.archAngel.y = this.archAngel.screen;
      this.archAngel.bool_i = false;
    }
    else if (this.archAngel.z != this.archAngel.aa)
    {
      this.archAngel.x = 0;
      this.archAngel.aa = this.archAngel.z;
    }
    switch (this.archAngel.screen)
    {
    case 25: 
      this.secondHelper.draw_game_play_screen(paramGraphics, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.l, 
    		  this.bool_b, this.bool_z, this.archAngel);
      break;
    case 0: 
      this.secondHelper.draw_intro(paramGraphics, this.archAngel);
      break;
    case 3: 
      this.helper.loadSavedGame(paramGraphics, this.l, this.archAngel);
      break;
    case 1: 
      this.secondHelper.load_system_txt(paramGraphics, this.l, this.o, this.p, this.q, this.t, this.x, this.y, this.str_arr_w, this.archAngel, this.readText, this.helper);
      break;
    case 5: 
      this.secondHelper.draw_warning_etc_menu(paramGraphics, this.l, this.archAngel);
      break;
    case 13: 
      this.secondHelper.goto_menu(paramGraphics, this.o, this.p, this.q, this.t, this.x, this.str_arr_w, this.archAngel, this.readText, this.helper);
      break;
    case 14: 
      draw_resume(paramGraphics);
      break;
    case 9: 
      if (this.archAngel.gameSetting.c != this.archAngel.gameSetting.b) {
        this.secondHelper.draw_start_option(paramGraphics, this.o, this.p, this.archAngel);
      } else {
        this.archAngel.screen = 25;
      }
      break;
    case 8: 
      this.secondHelper.draw_start_option(paramGraphics, this.o, this.p, this.archAngel);
      break;
    case 10: 
      this.helper.draw_system_setin(paramGraphics, this.l, this.o, this.p, this.q, this.t, this.x, this.y, this.str_arr_w, this.archAngel, this.readText);
      break;
    case 11: 
      draw_shop_info_arm(paramGraphics);
      break;
    case 12: 
      draw_shop_arm2(paramGraphics);
      break;
    case 4: 
      this.helper.briefAbout(paramGraphics, this.o, this.p, this.l, this.archAngel);
      break;
    case 26: 
      this.helper.briefOpen(paramGraphics, this.o, this.p, this.archAngel);
      break;
    case 2: 
      simple_read_helper(paramGraphics);
      break;
    case 7: 
      this.helper.displayGameOver(paramGraphics, this.archAngel);
      break;
    case 6: 
      this.secondHelper.draw_font_result(paramGraphics, this.archAngel, this.helper);
      break;
    case 27: 
      this.helper.loadBrief1(paramGraphics, this.o, this.p, this.archAngel);
      break;
    }
    this.gameOff = false;
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
    this.gameOff = false;
  }
  
  public void void_empty() {}
  
  public void keyReleased(int paramInt)
  {
    switch (this.archAngel.screen)
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
  
  public void showNotify()
  {
    this.archAngel.bool_t = true;
    this.archAngel.x = -1;
    if (this.archAngel.screen == 25)
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
    this.secondHelper.setup2(paramGraphics, this.archAngel.z, 210, this.o, this.p, this.q, this.t, this.x, this.str_arr_w, this.archAngel, this.readText, this.helper);
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
      this.helper.simple_helper(paramGraphics, this.archAngel);
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
      this.secondHelper.draw_weapon_shop(paramGraphics, 100 + this.archAngel.gameSetting.d, false, 0, this.t, this.u, this.str_arr_w, this.archAngel, this.readText);
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.g = 1;
      break;
    case 20: 
      this.readText.readTextFromStream("plasma");
      this.archAngel.d = 1;
      this.secondHelper.draw_weapon_shop(paramGraphics, 200 + this.archAngel.gameSetting.e, false, 1, this.t, this.u, this.str_arr_w, this.archAngel, this.readText);
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.g = 2;
      break;
    case 30: 
      this.readText.readTextFromStream("arm");
      this.archAngel.d = 2;
      this.secondHelper.draw_weapon_shop(paramGraphics, 300 + this.archAngel.gameSetting.f, false, 2, this.t, this.u, this.str_arr_w, this.archAngel, this.readText);
      this.archAngel.readText.bool_c = true;
      this.archAngel.readText.g = 3;
      break;
    case 999: 
      this.archAngel.screen = 5;
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
      this.helper.simple_helper(paramGraphics, this.archAngel);
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
      this.secondHelper.setup2(paramGraphics, this.archAngel.z, 230, this.o, this.p, this.q, this.t, this.x, this.str_arr_w, this.archAngel, this.readText, this.helper);
      if (this.t >= this.readText.int_arr_m[2]) {
        this.secondHelper.draw_buy(paramGraphics, this.s, this.readText.int_arr_m[2], this.x, this.archAngel, this.readText);
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
      this.secondHelper.setup2(paramGraphics, this.archAngel.z, 230, this.o, this.p, this.q, this.t, this.x, this.str_arr_w, this.archAngel, this.readText, this.helper);
      if (this.t >= this.readText.int_arr_m[2]) {
        this.secondHelper.draw_buy(paramGraphics, this.s, this.readText.int_arr_m[2], this.x, this.archAngel, this.readText);
      } else {
        draw_lack_of(paramGraphics, this.readText.int_arr_m[2]);
      }
      this.bool_v = true;
      return;
    case 999: 
      this.archAngel.screen = 5;
      this.readText = null;
      return;
    default: 
      if ((this.archAngel.z % 100 > 0) && (this.archAngel.z % 100 < 8) && (this.archAngel.z > 100))
      {
        this.helper.b(paramGraphics, this.archAngel.z, this.x, this.t, this.str_arr_w, this.archAngel, this.readText);
        this.archAngel.drawImage(paramGraphics);
        this.archAngel.a(paramGraphics, "BACK", true);
        this.archAngel.a(paramGraphics, "OK", false);
        paramGraphics.setClip(0, 0, 178, 75);
        this.helper.draw_ammunation_buy(paramGraphics, this.archAngel.z, true, this.archAngel.d, this.x, this.t, this.str_arr_w, this.archAngel, this.readText);
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
      this.helper.b(paramGraphics, this.archAngel.z, this.x, this.t, this.str_arr_w, this.archAngel, this.readText);
      draw_data_helper(paramGraphics, this.archAngel.z, 190);
      this.archAngel.drawImage(paramGraphics);
      this.archAngel.a(paramGraphics, "BACK", true);
      this.archAngel.a(paramGraphics, "OK", false);
    }
    else
    {
      this.secondHelper.setup2(paramGraphics, this.archAngel.z, 150, this.o, this.p, this.q, this.t, this.x, this.str_arr_w, this.archAngel, this.readText, this.helper);
    }
  }
  
  public void run()
  {
    for (;;)
    {
      try
      {
        repaint();
        if ((this.archAngel.screen == 25) && (this.archAngel.z == 4))
        {
          this.archAngel.mainGameScreen.complex_helper();
          this.archAngel.mainGameScreen.config2();
        }
        serviceRepaints();
        Thread.sleep((this.archAngel.screen == 25) || (this.archAngel.screen == 1) ? 30 : 30);
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
  
  public void simple_read_helper(Graphics paramGraphics)
  {
    this.archAngel.gameSetting.initSetting();
    this.archAngel.gameSetting.readArmPlasmaMissile(this.archAngel.readText);
    this.archAngel.screen = 5;
  }
}
