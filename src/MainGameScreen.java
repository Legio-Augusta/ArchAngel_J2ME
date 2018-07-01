import java.util.Random;
import javax.microedition.lcdui.Graphics;

public class MainGameScreen
{
  public ArchAngel AA;
  public ReadMedia readMedia;
  public GameSettings gameSetting;
  public Random rnd = new Random();
  public String str_e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l = 0;
  public String str_m;
  public int n;
  public int o;
  public int p = 0;
  public String str_q;
  public int r;
  public int s;
  public int t;
  public int u;
  public int v;
  public int w;
  public int x;
  public int y;
  public int z;
  public int aa;
  public final byte byte_ab = 0;
  public final byte byte_ac = 1;
  public final byte byte_ad = 2;
  public static GameConfig[] gameConfigArr = new GameConfig[18];
  public int af = 0;
  public int ag = 0;
  public int ah = 0;
  public int ai;
  public int aj = -1;
  public int ak = 0;
  public int al = 0;
  public int am = 0;
  public int an = 0;
  public int ao = 0;
  public int ap = 0;
  public int aq = 0;
  public int ar = 0;
  public int as = 0;
  public int at;
  public int au = 0;
  public int av = 90;
  public int aw = 20;
  public int ax = 0;
  public boolean bool_ay = false;
  public boolean bool_az = false;
  public boolean bool_a0 = false;
  public boolean bool_a1 = false;
  public boolean bool_a2 = false;
  public int a3 = 0;
  public int a4 = 0;
  public int[] int_arr_a5 = new int[5];
  public int[] int_arr_a6 = { 187, 232, 304 };
  public boolean[] bool_arr_a7 = new boolean[4];
  public int a8;
  public int a9;
  public int ba;
  public int bb = 90;
  public int bc = 169;
  public int bd;
  public int be;
  public int bf;
  public boolean bool_bg;
  public boolean bool_bh;
  public int bi;
  public int bj;
  public int bk;
  public boolean bool_bl = false;
  public int bm = -1;
  public int bn = 0;
  public int bo = 0;
  public int bp = 64;
  public int bq = 0;
  public int br = 0;
  public static byte[] stt_byte_arr_bs = { 64, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 62, 62, 62, 62, 61, 61, 61, 60, 60, 60, 59, 59, 58, 58, 58, 57, 57, 56, 55, 55, 54, 54, 53, 53, 52, 51, 51, 50, 49, 49, 48, 47, 46, 46, 45, 44, 43, 42, 41, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 31, 30, 29, 28, 27, 26, 25, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 8, 7, 6, 5, 4, 3, 2, 1 };
  public static byte[] stt_byte_arr_bt = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 22, 23, 24, 25, 27, 28, 29, 31, 32, 34, 35, 36, 38, 39, 41, 43, 44, 46, 48, 50, 51, 53, 55, 57, 59, 61, 64 };
  public int[][] int_arr_bu = new int[3][2];
  public int bv;
  public int bw;
  public int bx;
  public int by;
  public int bz;
  public int b0;
  public int b1;
  public int b2;
  public int b3;
  public int b4;
  public int b5;
  public int b6;
  public int b7;
  public int b8;
  public int b9;
  public int ca;
  public int cb = 0;
  public int cc = 0;
  
  public void init_game(GameConfig paramGameCnf, int paramInt)
  {
    int i2;
    if ((i2 = paramGameCnf.c) == 0) {
      return;
    }
    paramGameCnf.l += -1;
    if ((i2 <= 6) && (paramGameCnf.l <= 0))
    {
      paramGameCnf.c = 0;
      return;
    }
    paramGameCnf.a += paramGameCnf.h;
    paramGameCnf.b += paramGameCnf.i;
    int i3;
    int i1;
    switch (i2)
    {
    case 9: 
      if (this.aa == 1)
      {
        if (this.bool_a1 == true)
        {
          paramGameCnf.a = this.r;
          paramGameCnf.b = this.s;
          paramGameCnf.e = 99999;
          paramGameCnf.h = 0;
          paramGameCnf.i = 0;
          this.bool_a1 = false;
        }
        this.f = turn_calc(angle_helper(paramGameCnf.a, paramGameCnf.b), this.av);
        this.ca = (Math.abs(paramGameCnf.a) + Math.abs(paramGameCnf.b) - 200);
      }
      if ((this.ca <= 0) && (this.aa == 1))
      {
        this.ca = 0;
        paramGameCnf.c = 0;
        this.readMedia.readMediaStream("etc");
        this.readMedia.reloadImageArr(1, 112);
        this.readMedia.closeInputStream();
        this.readMedia.readMediaStream("aa");
        for (i3 = 11; i3 < 19; i3++) {
          this.readMedia.reloadImageArr(i3, 24 + i3);
        }
        this.readMedia.closeInputStream();
        this.bi = 2;
        this.aa = 2;
        this.ap = 0;
      }
      break;
    case 10: 
      if (paramGameCnf.d == 8)
      {
        paramGameCnf.c = 0;
        this.ah += -1;
        return;
      }
      if ((paramGameCnf.d >= 7) && (paramGameCnf.f > -20) && (paramGameCnf.f < 20))
      {
        this.au += 2;
        paramGameCnf.c = 0;
        this.ah += -1;
        this.gameSetting.j -= 50;
        play_s_gun(false);
        if (this.gameSetting.j <= 0) {
          setup2();
        }
      }
      if (this.bi == 2)
      {
        paramGameCnf.c = 0;
        this.ah = 2;
      }
      break;
    case 14: 
      if (paramGameCnf.l <= 0) {
        paramGameCnf.l = complex_helper2(paramGameCnf, paramInt);
      }
      break;
    case 13: 
      if (paramGameCnf.l <= 0) {
        paramGameCnf.l = random_helper(paramGameCnf, paramInt);
      }
      if (this.bi == 2)
      {
        this.ag = 2;
        paramGameCnf.c = 0;
      }
      break;
    case 12: 
      if (paramGameCnf.l <= 0)
      {
        paramGameCnf.c = 0;
        this.af += -1;
        return;
      }
      if ((this.bi == 3) && (this.AA.bool_n == true))
      {
        if (paramGameCnf.bool_n == true)
        {
          paramGameCnf.bool_n = false;
          paramGameCnf.c = 0;
          this.af += -1;
          this.au += 3;
          this.gameSetting.loseHP(paramGameCnf.m);
          if (this.gameSetting.j <= 0) {
            setup2();
          }
        }
      }
      else if (paramGameCnf.e < 150)
      {
        paramGameCnf.c = 0;
        this.af += -1;
        this.au += 3;
        this.gameSetting.loseHP(paramGameCnf.m);
        play_s_gun(false);
        if (this.gameSetting.j <= 0) {
          setup2();
        }
      }
      break;
    case 11: 
      if (paramGameCnf.l <= 0)
      {
        paramGameCnf.c = 0;
        return;
      }
      if ((i1 = paramGameCnf.k) == -1) {
        return;
      }
      System.out.println("i1i1i1i1i11i1 " + i1 + " " + gameConfigArr.length + " ii11i1i11i11");
      if (gameConfigArr[i1].c == 0)
      {
        paramGameCnf.c = 0;
        return;
      }
      if (((paramGameCnf.l & 0x1) == 0) && (Math.abs(paramGameCnf.a - gameConfigArr[i1].a) + Math.abs(paramGameCnf.b - gameConfigArr[i1].b) < 300))
      {
        paramGameCnf.c = 4;
        paramGameCnf.l = 2;
        gameConfigArr[i1].m -= this.gameSetting.s;
        this.AA.ae = (40 * gameConfigArr[i1].m / this.n);
        if (gameConfigArr[i1].m <= 0)
        {
          gameConfigArr[i1].c = 7;
          gameConfigArr[i1].l = 4;
        }
      }
      break;
    case 1: 
      if (paramGameCnf.l <= 0)
      {
        paramGameCnf.c = 0;
        return;
      }
      if ((i1 = paramGameCnf.k) == -1) {
        return;
      }
      if (gameConfigArr[i1].c == 0)
      {
        paramGameCnf.c = 0;
        return;
      }
      if (this.gameSetting.o > 0) {
        config2(paramGameCnf, gameConfigArr[i1].a, gameConfigArr[i1].b);
      }
      if (Math.abs(paramGameCnf.a - gameConfigArr[i1].a) + Math.abs(paramGameCnf.b - gameConfigArr[i1].b) < 300)
      {
        paramGameCnf.c = 4;
        paramGameCnf.l = 2;
        gameConfigArr[i1].m -= this.gameSetting.n;
        if (gameConfigArr[i1].m <= 0)
        {
          gameConfigArr[i1].c = 8;
          gameConfigArr[i1].l = 4;
        }
      }
      break;
    case 6: 
      for (i3 = 0; i3 < 18; i3++) {
        if ((gameConfigArr[i3].c >= 13) && (config_helper(paramGameCnf, gameConfigArr[i3])))
        {
          paramGameCnf.c = 5;
          paramGameCnf.l = 2;
          return;
        }
      }
      break;
    case 8: 
      if (paramGameCnf.l <= 0)
      {
        this.ag += -1;
        paramGameCnf.c = 0;
        this.u += 1;
      }
      break;
    case 7: 
      if (paramGameCnf.l <= 0)
      {
        this.ag += -1;
        paramGameCnf.c = 0;
        this.t += 1;
        this.AA.ab = 6;
        this.g = (this.t * this.i + this.u * this.h);
      }
      break;
    }
  }
  
  public int turn_calc(int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 - paramInt1;
    if (i1 > 180) {
      i1 -= 360;
    }
    if (i1 < 65356) {
      i1 = 360 + i1;
    }
    return i1;
  }
  
  public void graphic_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(this.bj);
    switch (paramInt4 & 0x3)
    {
    case 0: 
      paramGraphics.fillRect(paramInt1, paramInt2 - paramInt3, paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1 - paramInt3, paramInt2, paramInt3, paramInt3);
      break;
    case 1: 
      paramGraphics.fillRect(paramInt1 - (paramInt3 >> 1), paramInt2 - paramInt3, paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1 - (paramInt3 >> 1), paramInt2, paramInt3, paramInt3);
      break;
    case 2: 
      paramGraphics.fillRect(paramInt1 - paramInt3, paramInt2 - paramInt3, paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt3);
      break;
    case 3: 
      paramGraphics.fillRect(paramInt1 - paramInt3, paramInt2 - (paramInt3 >> 1), paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1, paramInt2 - (paramInt3 >> 1), paramInt3, paramInt3);
      break;
    }
    paramGraphics.setColor(this.bk);
    paramGraphics.fillRect(paramInt1 - (paramInt3 >> 1), paramInt2 - (paramInt3 >> 1), paramInt3, paramInt3);
  }
  
  public void left_right(boolean paramBoolean)
  {
    if (!this.bool_bg) {
      this.aq = (paramBoolean ? -4 : 4);
    }
  }
  
  public void init_game2()
  {
    this.bb = 90;
    this.bc = 169;
    this.int_arr_a5[1] = -82;
    this.AA.ae = 40;
    this.f = (this.ax = this.al = this.am = this.as = this.aq = this.ar = this.an = this.ao = 0);
    this.aw = 20;
    this.av = 90;
    this.ap = 0;
    this.au = 0;
    this.ba = 0;
    this.a8 = 0;
    this.bd = 0;
    this.aa = 0;
    this.bool_az = (this.bool_ay = this.bool_a0 = this.bool_a2 = false);
    //this.az = (this.ay = this.a0 = this.a2 = 0);
    this.a3 = 20;
    this.a4 = 0;
    this.t = 0;
    this.u = 0;
    this.v = (this.w = 0);
    this.at = 262143;
    this.af = (this.ag = this.ah = 0);
    this.AA.ab = 25;
    this.bool_bl = false;
    this.bm = -1;
    this.bn = 0;
    System.out.println("aeaoeaeeaeaee " + gameConfigArr.length + " aeaeoeoaoe");
    for (int i1 = 0; i1 < 18; i1++) {
      gameConfigArr[i1].c = 0;
    }
    init_600();
    this.bi = 1;
    this.bool_bg = false;
    this.bool_bh = false;
    setup_18_item(9, 0);
  }
  
  public int shift_byte_6(int paramInt1, int paramInt2, int paramInt3)
  {
    return turn_helper(paramInt1) * paramInt2 - turn_helper2(paramInt1) * paramInt3 >> 6;
  }
  
  public void init_600()
  {
    for (int i1 = 0; i1 < 2; i1++)
    {
      this.int_arr_bu[i1][0] = (600 * i1 * 2);
      this.int_arr_bu[i1][1] = (600 * (i1 * 2 + 1));
    }
  }
  
  public void main_paint(Graphics paramGraphics)
  {
    this.AA.bool_l = true; // gameStart, gameOn ?
    shift_14(paramGraphics);
    draw_anchor_helper3(paramGraphics);
    clip_color_arr_helper(paramGraphics);
    draw_anchor_helper2(paramGraphics);
    sound_explode(paramGraphics);
  }
  
  public void set_color_arr(Graphics paramGraphics, GameConfig paramg)
  {
    int[] arrayOfInt = { 255, 16711680, 16776960, 16776960 };
    int i5 = paramg.c;
    int i3 = paramg.a;
    int i4 = paramg.b;
    int i1 = shift_byte_6(450 - this.av, i3, i4);
    int i2 = return_turn_helper(450 - this.av, i3, i4);
    if ((i5 >= 11) && ((paramg.e = shift_3(i3, i4)) < 4284))
    {
      i3 = i1 >> 8;
      i4 = i2 >> 8;
      if( (i5 - 11) < arrayOfInt.length) {
    	  paramGraphics.setColor(arrayOfInt[(i5 - 11)]);
      }
      //System.out.println("-::_:_:_:_:_:__" + i5 + " _______________");
      paramGraphics.fillRect(28 + i3, 21 - i4, 3, 3);
    }
    i2 += 300;
    int i6 = i2 + 151;
    if (i6 > 0)
    {
      paramg.g = (20000 / i6);
      paramg.f = (i1 * 151 / i6);
      paramg.d = (7 - (i2 >> 9));
    }
    else
    {
      paramg.d = 8;
    }
    paramg.a -= this.al;
    paramg.b -= this.am;
  }
  
  public void draw_anchor_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramInt3 > 20) {
      paramInt3 = 20;
    }
    int i1 = paramInt1 - (paramInt3 >> 1);
    int i2 = paramInt2 - (paramInt3 >> 1);
    if (paramBoolean)
    {
      this.readMedia.drawImageAnchor20(paramGraphics, 93 + paramInt4, i1, i2);
      this.be = i1;
      this.bf = i2;
    }
    else
    {
      this.readMedia.drawImageAnchor20(paramGraphics, 84 + (29 - paramInt4), i1, i2);
    }
  }
  
  public void draw_anchor_helper2(Graphics paramGraphics)
  {
    int i6 = 0;
    paramGraphics.setColor(65280);
    this.ai = (85 + this.as * 7);
    if ((this.aj >= 0) && (gameConfigArr[this.aj].c == 0)) {
      this.aj = -1;
    }
    int i1;
    int i2;
    for (int i7 = 0; i7 < 18; i7++)
    {
      int i4 = gameConfigArr[i7].c;
      int i5 = gameConfigArr[i7].d;
      if ((i4 >= 13) && (i5 >= 1) && (i5 < 6))
      {
        i1 = gameConfigArr[i7].f + 88 + 32;
        i2 = 158 - gameConfigArr[i7].g;
        this.bw = i1;
        this.bx = i2;
        if ((i1 > this.ai) && (i1 < this.ai + 88) && (i2 > 87) && (i2 < 188)) {
          if (this.aj == -1)
          {
            i6 = 1;
            this.aj = i7;
            this.ak = 5;
          }
          else if (this.aj == i7)
          {
            i6 = 1;
            if (this.ak > 0) {
              this.ak += -1;
            }
          }
        }
      }
    }
    if (i6 != 0)
    {
      if (this.aj >= 0)
      {
        i1 = gameConfigArr[this.aj].f + 88 + 32;
        i2 = 155 - gameConfigArr[this.aj].g;
        int i3 = gameConfigArr[this.aj].d * 8 + 4;
        if (this.bi == 1) {
          if (gameConfigArr[this.aj].d < 4) {
            this.readMedia.drawImageAnchor20(paramGraphics, 82, i1 - 10, i2 - 6);
          } else {
            this.readMedia.drawImageAnchor20(paramGraphics, 81, i1 - 17, i2 - 12);
          }
        }
      }
    }
    else
    {
      this.aj = -1;
      if (this.bi == 1) {
        this.readMedia.drawImageAnchor20(paramGraphics, 83, this.ai, 136);
      }
    }
  }
  
  public void shift_14(Graphics paramGraphics)
  {
    int i1 = -this.av * 4 + 360;
    int i2 = this.at >> 14;
    if (i2 < 0) {
      i2 = 0;
    }
    this.readMedia.drawImageAnchor20(paramGraphics, 7, this.int_arr_a5[0], 27);
    this.readMedia.drawImageAnchor20(paramGraphics, 7, this.int_arr_a5[0] + (this.bool_arr_a7[0] != false ? 65296 : 240), 27); // != 0
    this.readMedia.drawImageAnchor36(paramGraphics, 8, this.int_arr_a5[1], 166);
  }
  
  public boolean config_helper(GameConfig paramgcnf1, GameConfig paramgcnf2)
  {
    if (Math.abs(paramgcnf1.a - paramgcnf2.a) + Math.abs(paramgcnf1.b - paramgcnf2.b) < 200)
    {
      paramgcnf2.m -= paramgcnf1.m;
      paramgcnf2.l += 5;
      if (paramgcnf2.m <= 0) {
        if (paramgcnf2.c == 14)
        {
          paramgcnf2.c = 7;
          paramgcnf2.l = 4;
        }
        else
        {
          paramgcnf2.c = 8;
          paramgcnf2.l = 2;
        }
      }
      return true;
    }
    return false;
  }
  
  public void draw_anchor_helper3(Graphics paramGraphics)
  {
    this.bv += 1;
    int i2 = this.bv / (5 - this.a8) % 3;
    int[][] arrayOfInt = { new int[3], { 1, 2, 3 }, { 2, 3, 4 } };
    for (int i1 = 0; i1 < 3; i1++)
    {
      this.readMedia.drawImageAnchor36(paramGraphics, 9 + i1 * 3 + i2, this.int_arr_a5[(i1 + 2)], this.int_arr_a6[i1] - arrayOfInt[i1][i2]);
      // this.b.b(paramGraphics, 9 + i1 * 3 + i2, this.a5[(i1 + 2)] + (this.a7[(i1 + 1)] != 0 ? 65296 : 240), this.a6[i1] - arrayOfInt[i1][i2]);
      this.readMedia.drawImageAnchor36(paramGraphics, 9 + i1 * 3 + i2, this.int_arr_a5[(i1 + 2)] + (this.bool_arr_a7[(i1 + 1)] != false ? 65296 : 240), this.int_arr_a6[i1] - arrayOfInt[i1][i2]);
    }
    if ((this.AA.ad == 2) || (this.AA.b == 0)) {
      this.readMedia.drawImageAnchor20(paramGraphics, 18 + i2, 0, 166);
    }
  }
  
  public int angle_helper(int paramInt1, int paramInt2)
  {
    int i4 = 90;
    if (paramInt1 == 0)
    {
      if (paramInt2 > 0) {
        return 90;
      }
      return 270;
    }
    if (paramInt2 == 0)
    {
      if (paramInt1 > 0) {
        return 0;
      }
      return 180;
    }
    int i1 = Math.abs(paramInt1);
    int i2 = Math.abs(paramInt2);
    int i3;
    if (i1 > i2) {
      i3 = (i2 << 6) / i1;
    } else {
      i3 = (i1 << 6) / i2;
    }
    int i5 = 0;
    int i6 = 45;
    if (i3 >= 64) {
      i4 = 45;
    } else {
      for (int i7 = 0; i7 < 5; i7++)
      {
        i4 = i5 + i6 >> 1;
        if (i3 > stt_byte_arr_bt[i4]) {
          i5 = i4;
        } else {
          i6 = i4;
        }
      }
    }
    if (i2 > i1) {
      i4 = 90 - i4;
    }
    if (paramInt1 < 0) {
      i4 = 180 - i4;
    }
    if (paramInt2 < 0) {
      i4 = 360 - i4;
    }
    return i4;
  }
  
  public int shift_3(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (paramInt1 < 0) {
      paramInt1 = -paramInt1;
    }
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2;
    }
    if (paramInt1 + paramInt2 == 0) {
      return 0;
    }
    if (paramInt1 > paramInt2) {
      i1 = (18 - (paramInt1 << 3) / (paramInt1 + paramInt2)) * paramInt1;
    } else {
      i1 = (18 - (paramInt2 << 3) / (paramInt1 + paramInt2)) * paramInt2;
    }
    return i1 / 10;
  }
  
  public void shift_1(Graphics paramGraphics, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i4;
    int i3;
    int i1;
    int i2;
    if (paramBoolean)
    {
      this.readMedia.drawImageInArr(paramGraphics, 71 + paramInt4, paramInt1, paramInt2);
      for (i4 = 0; i4 < paramInt5; i4++)
      {
        i3 = Math.abs(this.rnd.nextInt() % 7);
        i1 = Math.abs(this.rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
        i2 = Math.abs(this.rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
        if ((i4 & 0x1) == 1) {
          this.readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1, paramInt2 + i2);
        } else {
          this.readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1, paramInt2 + i2);
        }
      }
    }
    else
    {
      this.readMedia.drawImageInArr(paramGraphics, 71 + paramInt4, paramInt1 + 5, paramInt2 - 25);
      for (i4 = 0; i4 < paramInt5; i4++)
      {
        i3 = Math.abs(this.rnd.nextInt() % 7);
        i1 = Math.abs(this.rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
        i2 = Math.abs(this.rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
        if ((i4 & 0x1) == 1) {
          this.readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1 + 5, paramInt2 + i2 - 25);
        } else {
          this.readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1 + 5, paramInt2 + i2 - 25);
        }
      }
    }
  }
  
  public int turnAngleCalc(int paramInt)
  {
    if (paramInt < 0) {
      paramInt += 360;
    }
    if (paramInt >= 360) {
      paramInt -= 360;
    }
    if (paramInt < 0) {
      paramInt += 360;
    }
    if (paramInt >= 360) {
      paramInt -= 360;
    }
    if ((paramInt >= 0) && (paramInt < 90)) {
      //System.out.println("bsbsbssbs " + bs.length + " " + paramInt + " bsbsbbsbs");
      if(paramInt < stt_byte_arr_bs.length) {    	  
    	  return stt_byte_arr_bs[paramInt];
      } else {
    	  return stt_byte_arr_bs[89];
      }
    }
   	if ((paramInt > 90) && (paramInt < 180)) { // >=90
    	// Why in some app section, bound of array is out by 1 like in e.java i1++ (line 52)
    	// This bs byte array is 90 in length, so index of it has maximum value equal 89.
    	// May be this way to trick/optimize a custom compiler for old Java mobile devices ?
   		// Or decompiler resulted in defect
      return -stt_byte_arr_bs[(180 - paramInt)];
    }
	if ((paramInt == 90) && (paramInt < 180)) { // dungnv
		return -stt_byte_arr_bs[89];  
	}
   	
    if ((paramInt > 180) && (paramInt < 270)) { // >=180
      return -stt_byte_arr_bs[(paramInt - 180)];
    }
    if ((paramInt == 180) && (paramInt < 270)) { // dungnv
		return -stt_byte_arr_bs[89];  
	}
    if ( (360 - paramInt) < stt_byte_arr_bs.length ) {    	
    	return stt_byte_arr_bs[(360 - paramInt)];
    } else {
    	return stt_byte_arr_bs[89];
    }
  }
  
  public void draw_img_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt1 - (paramInt3 >> 1);
    int i2 = paramInt2 - (paramInt3 >> 1);
    if (paramInt4 < 6) {
      this.readMedia.drawImageInArr(paramGraphics, 102 + paramInt4, i1 - 5, i2);
    }
  }
  
  public void draw_arr_byte_plasma_boss(Graphics paramGraphics)
  {
    byte[][] arrayOfByte1 = { { 5, -8 }, { 2, -18 }, { 6, -22 }, { 3, -25 } };
    byte[][] arrayOfByte2 = { new byte[2], { 1, 6 }, { -2, -10 }, { 4, 8 }, { 1, -12 }, { -1, -4 }, { 0, 4 }, { 0, -6 }, { 1, 5 } };
    int i1 = this.ap / 3;
    int i2 = this.ap / 4 % 8;
    if (this.ba < 3)
    {
      if (this.bd < 5) {
        this.z = this.ba;
      } else {
        this.z = (this.ba + 2);
      }
    }
    else if (this.bd < 5) {
      this.z = (this.ba + 2);
    } else {
      this.z = (this.ba + 4);
    }
    switch (this.bi)
    {
    case 1: 
      this.readMedia.drawImageInArr(paramGraphics, 24 + this.z, this.bb + 30, this.bc + 11);
      if ((this.bool_ay == true) && (this.ap % 2 == 0)) {
        this.readMedia.drawImageInArr(paramGraphics, 80, 120, 165);
      }
      if (this.AA.z != 3)
      {
        paramGraphics.setClip(this.bb + 10 + arrayOfByte2[this.z][0], this.bc + 11 + arrayOfByte2[this.z][1], 12, 11);
        this.readMedia.drawImageAnchor20(paramGraphics, 33, this.bb + 10 + arrayOfByte2[this.z][0], this.bc + 11 + arrayOfByte2[this.z][1] - 11 * (this.ap % 2));
        paramGraphics.setClip(this.bb + 38 - arrayOfByte2[this.z][0], this.bc + 11 - arrayOfByte2[this.z][1], 12, 11);
        this.readMedia.drawImageAnchor20(paramGraphics, 34, this.bb + 38 - arrayOfByte2[this.z][0], this.bc + 11 - arrayOfByte2[this.z][1] - 11 * (this.ap % 2));
        paramGraphics.setClip(0, 0, 240, 300);
      }
      this.AA.bool_m = true;
      break;
    case 2: 
      this.AA.stopSound();
      paramGraphics.setClip(0, 0, 240, 300);
      if (i1 / 2 % 2 == 0) {
        this.readMedia.drawImageAnchor20(paramGraphics, 112, 66, 103);
      }
      this.aw = 10;
      this.a8 = 0;
      this.bool_ay = false;
      this.bool_bg = true;
      if (i1 < 5) {
        if (i1 == 0) {
          this.readMedia.drawImageAnchor20(paramGraphics, 24, this.bb, this.bc);
        } else {
          this.readMedia.drawImageAnchor20(paramGraphics, 24 + i1 + 10, this.bb + arrayOfByte1[(i1 - 1)][0], this.bc + arrayOfByte1[(i1 - 1)][1]);
        }
      }
      if (i1 == 5)
      {
        this.readMedia.destroyImage(112);
        for (int i3 = 0; i3 < 11; i3++) {
          this.readMedia.destroyImage(24 + i3);
        }
        for (int i3 = 0; i3 < 9; i3++)
        {
          this.readMedia.destroyImage(53 + i3);
          this.readMedia.destroyImage(44 + i3);
        }
        for (int i3 = 10; i3 < 13; i3++) {
          this.readMedia.destroyImage(71 + i3);
        }
        for (int i3 = 18; i3 < 24; i3++) {
          this.readMedia.destroyImage(84 + i3);
        }
        this.readMedia.drawImageAnchor20(paramGraphics, 38, this.bb + arrayOfByte1[3][0], this.bc + arrayOfByte1[3][1]);
        this.bb = 93;
        this.bc = 144;
        System.gc();
        this.readMedia.readMediaStream("boss" + this.AA.ac);
        for (int i3 = 0; i3 < 7; i3++) {
          this.readMedia.reloadImageArr(i3, 62 + i3);
        }
        this.readMedia.closeInputStream();
        this.readMedia.readMediaStream("plasma");
        for (int i3 = 0; i3 < 18; i3++) {
          this.readMedia.reloadImageArr(i3, 84 + i3);
        }
        this.readMedia.closeInputStream();
        this.bi = 3;
      }
      break;
    case 3: 
      switch (this.ba)
      {
      case 1: 
        this.bb -= 10;
        if (this.bb < 33) {
          this.bb = 33;
        }
        break;
      case 2: 
        this.bb += 10;
        if (this.bb > 153) {
          this.bb = 153;
        }
        break;
      case 3: 
      case 4: 
        this.ba = 0;
        break;
      }
      switch (this.a9)
      {
      case 1: 
        this.bc -= 10;
        if (this.bc < 104) {
          this.bc = 104;
        }
        break;
      case 2: 
        this.bc += 10;
        if (this.bc > 174) {
          this.bc = 174;
        }
        break;
      }
      this.readMedia.drawImageAnchor20(paramGraphics, 38 + this.ba, this.bb, this.bc);
      if (this.ba == 1)
      {
        paramGraphics.setClip(this.bb + 14, this.bc + 21, 19, 14);
        this.readMedia.drawImageAnchor20(paramGraphics, 42, this.bb + 14, this.bc + 7);
      }
      else if (this.ba == 2)
      {
        paramGraphics.setClip(this.bb + 20, this.bc + 21, 19, 14);
        this.readMedia.drawImageAnchor20(paramGraphics, 42, this.bb + 20, this.bc + 21);
      }
      else
      {
        paramGraphics.setClip(this.bb + 16, this.bc + 21, 22, 14);
        this.readMedia.drawImageAnchor20(paramGraphics, 41, this.bb + 16, this.bc + 21 - 15 * (i1 / 3 % 2));
      }
      paramGraphics.setClip(0, 0, 240, 300);
      break;
    }
  }
  
  public int turn_helper(int paramInt)
  {
    if (paramInt == this.bo) {
      return this.bp;
    }
    this.bo = paramInt;
    return this.bp = turnAngleCalc(paramInt);
  }
  
  public void fillRect_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramGraphics.setColor(paramInt5);
    int i1 = paramInt1 - paramInt3;
    int i2 = paramInt2 - (paramInt3 >> 1);
    paramGraphics.fillRect(i1, i2, paramInt3 << 1, paramInt3);
    i1 = paramInt1 - (paramInt3 >> 1);
    i2 = paramInt2 - paramInt3;
    paramGraphics.fillRect(i1, i2, paramInt3, paramInt3 << 1);
    paramGraphics.setColor(paramInt4);
    i1 = paramInt1 - (paramInt3 >> 1);
    i2 = paramInt2 - (paramInt3 >> 1);
    paramGraphics.fillRect(i1, i2, paramInt3, paramInt3);
  }
  
  public void sound_explode(Graphics paramGraphics)
  {
    draw_arr_byte_plasma_boss(paramGraphics);
    if (this.au > 0)
    {
      this.b8 = (61 - this.bb);
      this.b9 = (94 - this.bc);
      shift_1(paramGraphics, false, 88 - this.b8, 133 - this.b9, 30, 8, 4);
      if ((this.bi == 1) && (!this.bool_ay)) {
        this.AA.playSound("s_explo", 1);
      }
      if ((this.bi == 3) && (!this.bool_az)) {
        this.AA.playSound("s_explo", 1);
      }
      this.au += -1;
      if ((this.AA.bool_n == true) && (this.au == 2) && (this.bool_az == true)) {
        play_s_plasma(false);
      }
    }
  }
  
  public void play_missile_sound()
  {
    if (this.gameSetting.o <= 0)
    {
      this.AA.x = 1;
      this.AA.bool_j = true;
    }
    else
    {
      this.AA.playSound("s_missile", 1);
    }
    this.bool_a0 = true;
  }
  
  public int random_helper(GameConfig paramg, int paramInt)
  {
    int i3 = 8;
    int i4;
    int i1;
    if (paramg.e > 4000)
    {
      i4 = angle_helper(-paramg.a, -paramg.b);
      i1 = 20;
    }
    else
    {
      i1 = (Math.abs(this.rnd.nextInt()) & 0x7) + 5;
      int i2 = Math.abs(this.rnd.nextInt() & 0x7);
      i3 = Math.abs(paramg.e - 3500) >> 8;
      if (i2 >= i3)
      {
        if (this.af < 1) {
          setup_18_item(12, paramInt);
        }
        i1 = 10;
      }
      i4 = paramg.j;
      i4 += (i2 << 2) - 14;
      if (i4 < 0) {
        i4 += 360;
      }
      if (i4 >= 360) {
        i4 -= 360;
      }
    }
    paramg.h = (this.al - this.an + turn_helper(i4));
    paramg.i = (this.am - this.ao + turn_helper2(i4));
    paramg.j = i4;
    return i1;
  }
  
  public void play_s_gun(boolean paramBoolean)
  {
    this.bool_ay = paramBoolean;
    if (this.bool_ay == true) {
      this.AA.playSound("s_gun", 0);
    } else {
      this.AA.stopSound();
    }
  }
  
  public int turn_helper2(int paramInt)
  {
    if (paramInt == this.bq) {
      return this.br;
    }
    this.bq = paramInt;
    return this.br = turnAngleCalc(90 - paramInt);
  }
  
  public void simple_bool(boolean paramBoolean)
  {
    if (!this.bool_bg) {
      this.ar = (paramBoolean ? 20 : -20);
    }
  }
  
  public void simple_helper2(int paramInt)
  {
    if (!this.bool_bg) {
      if (paramInt == 1)
      {
        this.a8 += 1;
        if (this.a8 > 4) {
          this.a8 = 4;
        }
      }
      else if (paramInt == 2)
      {
        this.a8 += -1;
        if (this.a8 < 0) {
          this.a8 = 0;
        }
      }
    }
  }
  
  public MainGameScreen(ArchAngel paramArchAngel, ReadMedia paramd)
  {
    this.AA = paramArchAngel;
    this.readMedia = paramd;
    this.gameSetting = paramArchAngel.gameSetting;
    for (int i1 = 0; i1 < 18; i1++) {
      gameConfigArr[i1] = new GameConfig();
    }
  }
  
  public void config2(GameConfig paramg, int paramInt1, int paramInt2)
  {
    int i1 = paramg.a;
    int i2 = paramg.b;
    int i3 = paramg.h;
    int i4 = paramg.i;
    int i5 = paramg.j;
    int i6 = 10;
    int i7 = i3 * (paramInt2 - i2) - i4 * (paramInt1 - i1);
    if (i7 < 0) {
      i6 = -i6;
    }
    i5 += i6;
    paramg.h = (6 * turn_helper(i5));
    paramg.i = (6 * turn_helper2(i5));
    paramg.j = i5;
  }
  
  public void setup2()
  {
    this.au = 1000;
    this.gameSetting.j = 0;
    this.bool_ay = false;
    this.bool_az = false;
    this.bool_a0 = false;
    this.AA.ab = 7;
    setup3();
    this.ar = -20;
  }
  
  public void follow_boss(int paramInt)
  {
    int i1;
    if (!this.bool_bg)
    {
      if (paramInt == 2)
      {
        this.bd += 1;
        this.int_arr_a5[0] -= 4;
        if (this.int_arr_a5[0] < 65296) {
          this.int_arr_a5[0] = 0;
        }
        if (this.int_arr_a5[0] < 0) {
          this.bool_arr_a7[0] = false;
        }
        this.int_arr_a5[1] -= 6;
        if (this.int_arr_a5[1] < 65196) {
          this.int_arr_a5[1] = 240;
        }
        for (i1 = 0; i1 < 3; i1++)
        {
          this.int_arr_a5[(i1 + 2)] -= 6 - 2 * i1;
          if (this.int_arr_a5[(i1 + 2)] < 65296) {
            this.int_arr_a5[(i1 + 2)] = 0;
          }
          if (this.int_arr_a5[(i1 + 2)] < 0) {
            this.bool_arr_a7[(i1 + 1)] = false;
          }
        }
      }
      else if (paramInt == 1)
      {
        this.bd += 1;
        this.int_arr_a5[0] += 4;
        if (this.int_arr_a5[0] > 240) {
          this.int_arr_a5[0] = 0;
        }
        if (this.int_arr_a5[0] > 0) {
          this.bool_arr_a7[0] = true;
        }
        this.int_arr_a5[1] += 6;
        if (this.int_arr_a5[1] > 240) {
          this.int_arr_a5[1] = 65196;
        }
        for (i1 = 0; i1 < 3; i1++)
        {
          this.int_arr_a5[(i1 + 2)] += 6 - 2 * i1;
          if (this.int_arr_a5[(i1 + 2)] > 240) {
            this.int_arr_a5[(i1 + 2)] = 0;
          }
          if (this.int_arr_a5[(i1 + 2)] > 0) {
            this.bool_arr_a7[(i1 + 1)] = true;
          }
        }
      }
      if (paramInt == 4)
      {
        this.bd += 1;
        this.int_arr_a5[0] -= 4;
        if (this.int_arr_a5[0] < 65296) {
          this.int_arr_a5[0] = 0;
        }
        if (this.int_arr_a5[0] < 0) {
          this.bool_arr_a7[0] = false;
        }
        this.int_arr_a5[1] -= 2;
        if (this.int_arr_a5[1] < 65196) {
          this.int_arr_a5[1] = 240;
        }
        for (i1 = 0; i1 < 3; i1++)
        {
          this.int_arr_a5[(i1 + 2)] -= 2 + 2 * i1;
          if (this.int_arr_a5[(i1 + 2)] < 65296) {
            this.int_arr_a5[(i1 + 2)] = 0;
          }
          if (this.int_arr_a5[(i1 + 2)] < 0) {
            this.bool_arr_a7[(i1 + 1)] = false;
          }
        }
      }
      else if (paramInt == 3)
      {
        this.bd += 1;
        this.int_arr_a5[0] += 4;
        if (this.int_arr_a5[0] > 240) {
          this.int_arr_a5[0] = 0;
        }
        if (this.int_arr_a5[0] > 0) {
          this.bool_arr_a7[0] = true;
        }
        this.int_arr_a5[1] += 2;
        if (this.int_arr_a5[1] > 240) {
          this.int_arr_a5[1] = 65196;
        }
        for (i1 = 0; i1 < 3; i1++)
        {
          this.int_arr_a5[(i1 + 2)] += 2 + 2 * i1;
          if (this.int_arr_a5[(i1 + 2)] > 240) {
            this.int_arr_a5[(i1 + 2)] = 0;
          }
          if (this.int_arr_a5[(i1 + 2)] > 0) {
            this.bool_arr_a7[(i1 + 1)] = true;
          }
        }
      }
      else if (paramInt > 0)
      {
        this.bd += 1;
      }
    }
    else if (paramInt == 2)
    {
      if (this.bb >= 133)
      {
        this.x -= 2;
        if (this.x < -10) {
          this.x = -10;
        }
        this.int_arr_a5[0] -= 2;
        if (this.int_arr_a5[0] < 65296) {
          this.int_arr_a5[0] = 0;
        }
        if (this.int_arr_a5[0] < 0) {
          this.bool_arr_a7[0] = false;
        }
        this.int_arr_a5[1] -= 1;
        if (this.int_arr_a5[1] < 65196) {
          this.int_arr_a5[1] = 240;
        }
        for (i1 = 0; i1 < 3; i1++)
        {
          this.int_arr_a5[(i1 + 2)] -= 2 + 1 * i1;
          if (this.int_arr_a5[(i1 + 2)] < 65296) {
            this.int_arr_a5[(i1 + 2)] = 0;
          }
          if (this.int_arr_a5[(i1 + 2)] < 0) {
            this.bool_arr_a7[(i1 + 1)] = false;
          }
        }
      }
    }
    else if ((paramInt == 1) && (this.bb <= 53))
    {
      this.x += 2;
      if (this.x > 10) {
        this.x = 10;
      }
      this.int_arr_a5[0] += 2;
      if (this.int_arr_a5[0] > 240) {
        this.int_arr_a5[0] = 0;
      }
      if (this.int_arr_a5[0] > 0) {
        this.bool_arr_a7[0] = true;
      }
      this.int_arr_a5[1] += 1;
      if (this.int_arr_a5[1] > 240) {
        this.int_arr_a5[1] = 65196;
      }
      for (i1 = 0; i1 < 3; i1++)
      {
        this.int_arr_a5[(i1 + 2)] += 2 + 1 * i1;
        if (this.int_arr_a5[(i1 + 2)] > 240) {
          this.int_arr_a5[(i1 + 2)] = 0;
        }
        if (this.int_arr_a5[(i1 + 2)] > 0) {
          this.bool_arr_a7[(i1 + 1)] = true;
        }
      }
    }
  }
  
  public void clip_color_arr_helper(Graphics paramGraphics)
  {
    this.readMedia.drawImageAnchor20(paramGraphics, 21, 0, 0);
    for (int i1 = 0; i1 < 18; i1++) {
      if (gameConfigArr[i1].c != 0) {
        set_color_arr(paramGraphics, gameConfigArr[i1]);
      }
    }
    paramGraphics.setClip(0, 50, 240, 250);
    for (int i1 = 0; i1 < 9; i1++) {
      for (int i2 = 0; i2 < 18; i2++) {
        if ((gameConfigArr[i2].c != 0) && (gameConfigArr[i2].d == i1)) {
          complex_draw_helper(paramGraphics, gameConfigArr[i2]);
        }
      }
    }
  }
  
  public void setup3()
  {
    this.aq = 0;
    this.ar = 0;
    this.an = (this.ao = 0);
  }
  
  public void config2()
  {
    int i2 = 0;
    this.ap += 1;
    this.bn += -1;
    for (int i3 = 0; i3 < 18; i3++) {
      init_game(gameConfigArr[i3], i3);
    }
    if ((this.ap & 0x3) == 0)
    {
      if ((this.bi == 3) && (this.v == 0))
      {
        i2 = 14;
        if (i2 > 0) {
          setup_18_item(i2, 0);
        }
      }
      if ((this.ag < 2) && (this.bi == 1))
      {
        i2 = 13;
        if (i2 > 0) {
          setup_18_item(i2, 0);
        }
      }
    }
    int i1 = this.at >> 10;
    if (i1 != this.cb)
    {
      if ((this.ah < 2) && (i2 != 14) && (this.bi == 1)) {
        setup_18_item(10, 0);
      }
      this.cb = i1;
    }
  }
  
  public void complex_helper()
  {
    simple_helper2(this.a9);
    if ((this.x <= 10) && (this.x >= -10)) {
      follow_boss(this.ba);
    }
    this.as += this.aq;
    if (this.aq == 0)
    {
      if (this.as > 0) {
        this.as += -1;
      }
      if (this.as < 0) {
        this.as += 1;
      }
    }
    if (this.as > 4) {
      this.as = 4;
    }
    if (this.as < -4) {
      this.as = -4;
    }
    this.av -= this.as;
    if (this.av < 0) {
      this.av += 360;
    }
    if (this.av >= 360) {
      this.av -= 360;
    }
    this.al = ((turn_helper(this.av) * this.aw >> 6) + this.an);
    this.am = ((turn_helper2(this.av) * this.aw >> 6) + this.ao);
    this.at -= this.am;
    this.aw += this.ar;
    if (this.aw > 140) {
      this.aw = 140;
    }
    if (this.aw < 20) {
      this.aw = 20;
    }
    this.a3 += -1;
    this.a4 += -1;
    if ((this.bool_ay) && (this.a4 <= 0) && (setup_18_item(6, 0)) && (this.bn <= 0)) {
      this.bn = 12;
    }
    int i1;
    if ((this.bool_az) && (this.AA.x % 5 == 0) && (this.AA.bool_n == true) && (this.gameSetting.t > 0))
    {
      i1 = this.aj;
      if ((this.aj < 0) || (this.ak > 0)) {
        i1 = -1;
      }
      if (setup_18_item(11, i1))
      {
        this.gameSetting.t += -1;
        if (this.gameSetting.t <= 0)
        {
          this.AA.stopSound();
          this.bool_az = false;
        }
      }
    }
    if (this.bool_a0)
    {
      if (this.gameSetting.o > 0)
      {
        i1 = this.aj;
        if ((this.aj < 0) || (this.ak > 0)) {
          i1 = -1;
        }
        if (setup_18_item(1, i1))
        {
          this.gameSetting.o += -1;
          if (this.gameSetting.o <= 0) {
            this.bool_a0 = false;
          }
          this.a3 = 20;
        }
      }
      this.bool_a0 = false;
    }
  }
  
  public void play_s_plasma(boolean paramBoolean)
  {
    if (this.AA.ag == 1) {
      this.bool_az = (!this.bool_az);
    } else {
      this.bool_az = paramBoolean;
    }
    if ((this.gameSetting.t > 0) && (this.AA.bool_n == true)) {
      if (this.bool_az == true) {
        this.AA.playSound("s_plasma", 0);
      } else {
        this.AA.stopSound();
      }
    }
  }
  
  public int complex_helper2(GameConfig paramg, int paramInt)
  {
    int i3 = 8;
    int i5;
    if (this.AA.ac < 4) {
      i5 = 1;
    } else {
      i5 = 2;
    }
    int i4;
    int i1;
    if (paramg.e > 4000)
    {
      i4 = angle_helper(-paramg.a, -paramg.b);
      i1 = 20;
    }
    else
    {
      i4 = paramg.j;
      i1 = (Math.abs(this.rnd.nextInt()) & 0x7) + 5;
      int i2 = Math.abs(this.rnd.nextInt() & 0x7);
      i3 = Math.abs(paramg.e - 3500) >> 9;
      if (i2 >= i3)
      {
        if (this.af < i5) {
          setup_18_item(12, paramInt);
        }
        i1 = 4;
      }
      i4 = Math.abs(this.rnd.nextInt() % 18) * 10;
      if (i4 < 80) {
        i4 = 80;
      }
      if (i4 > 100) {
        i4 = 100;
      }
    }
    paramg.h = (this.al - this.an + turn_helper(i4) * 2);
    paramg.i = (this.am - this.ao + turn_helper2(i4) * 2);
    paramg.j = i4;
    return i1;
  }
  
  public boolean setup_18_item(int paramInt1, int paramInt2)
  {
	int i1;
    for (i1 = 0; i1 < 18; i1++) {
      if (gameConfigArr[i1].c == 0) {
        break;
      }
    }
    if (i1 == 18) {
      return false;
    }
    turn_helper2(gameConfigArr[i1], paramInt1, paramInt2);
    return true;
  }
  
  public void turn_helper2(GameConfig paramg, int paramInt1, int paramInt2)
  {
    paramg.m = 0;
    int i1;
    switch (paramInt1)
    {
    case 9: 
      paramg.a = this.r;
      paramg.b = this.s;
      paramg.e = 99999;
      paramg.h = 0;
      paramg.i = 0;
      break;
    case 10: 
      paramg.m = 50;
      i1 = (this.rnd.nextInt() & 0x1F) - 15;
      int i2 = (this.rnd.nextInt() & 0x7) + 63;
      paramg.a = (i2 * turn_helper(i1 + this.av));
      paramg.b = (i2 * turn_helper2(i1 + this.av));
      paramg.h = (paramg.i = 0);
      paramg.e = i1;
      this.ah += 1;
      break;
    case 14: 
      paramg.m = this.n;
      this.av = 90;
      i1 = 0;
      paramg.a = (60 * turn_helper(i1 + this.av));
      paramg.b = (60 * turn_helper2(i1 + this.av));
      paramg.e = i1;
      paramg.h = (paramg.i = 0);
      paramg.j = this.av;
      paramg.l = 2;
      this.v += 1;
      paramg.d = 0;
      this.AA.bool_n = true;
      break;
    case 13: 
      paramg.m = this.j;
      i1 = (this.rnd.nextInt() & 0x7F) - 63;
      paramg.a = (60 * turn_helper(i1 + this.av));
      paramg.b = (60 * turn_helper2(i1 + this.av));
      paramg.e = i1;
      paramg.h = (paramg.i = 0);
      paramg.j = ((this.av + 180) % 360);
      paramg.l = 2;
      this.w += 1;
      this.ag += 1;
      break;
    case 12: 
      paramg.a = gameConfigArr[paramInt2].a;
      paramg.b = gameConfigArr[paramInt2].b;
      paramg.e = shift_3(paramg.a, paramg.b);
      i1 = paramg.j = angle_helper(-paramg.a + this.al, -paramg.b + this.am);
      paramg.h = (3 * turn_helper(i1) + this.al);
      paramg.i = (3 * turn_helper2(i1) + this.am);
      paramg.l = 30;
      paramg.m = (gameConfigArr[paramInt2].c == 14 ? this.o : this.k);
      this.af += 1;
      break;
    case 11: 
      i1 = paramg.j = this.av;
      paramg.h = (6 * turn_helper(i1));
      paramg.i = (6 * turn_helper2(i1));
      paramg.a = (turn_helper(this.av - 90) + paramg.h);
      paramg.b = (turn_helper2(this.av - 90) + paramg.i);
      paramg.e = 64;
      paramg.k = paramInt2;
      paramg.l = 30;
      paramg.m = this.gameSetting.s;
      break;
    case 1: 
      i1 = paramg.j = this.av;
      paramg.h = (6 * turn_helper(i1));
      paramg.i = (6 * turn_helper2(i1));
      paramg.a = (turn_helper(this.av - 90) + paramg.h);
      paramg.b = (turn_helper2(this.av - 90) + paramg.i);
      paramg.e = 64;
      paramg.k = paramInt2;
      paramg.l = 30;
      paramg.m = this.gameSetting.n;
      break;
    case 6: 
      i1 = paramg.j = this.av;
      paramg.h = (6 * turn_helper(i1));
      paramg.i = (6 * turn_helper2(i1));
      paramg.a = (turn_helper(this.av + 90) + paramg.h);
      paramg.b = (turn_helper2(this.av + 90) + paramg.i);
      paramg.e = 64;
      paramg.l = (10 + this.cc);
      this.cc = (1 - this.cc);
      paramg.m = (this.gameSetting.n / 10);
      break;
    }
    paramg.c = paramInt1;
  }
  
  public int return_turn_helper(int paramInt1, int paramInt2, int paramInt3)
  {
    return turn_helper2(paramInt1) * paramInt2 + turn_helper(paramInt1) * paramInt3 >> 6;
  }
  
  public void simple_90(boolean paramBoolean)
  {
    if (!this.bool_bg)
    {
      int i1 = paramBoolean ? 90 : -90;
      this.an = (2 * turn_helper(this.av + i1));
      this.ao = (2 * turn_helper2(this.av + i1));
    }
  }
  
  public void complex_draw_helper(Graphics paramGraphics, GameConfig paramg)
  {
    int i1 = paramg.c;
    int i2 = paramg.f;
    int i3 = paramg.g;
    int i4 = paramg.d;
    paramGraphics.setClip(0, 50, 240, 250);
    switch (i1)
    {
    case 9: 
      break;
    case 10: 
      if (i4 < 8) {
        this.readMedia.drawImageInArr(paramGraphics, 44 + i4, i2 + 88 + 32, 163 + i3);
      }
      break;
    case 13: 
      if (i4 < 8) {
        this.readMedia.drawImageInArr(paramGraphics, 53 + i4, i2 + 88 + 32, 158 - i3);
      }
      break;
    case 14: 
      this.readMedia.drawImageInArr(paramGraphics, 63 + i4, i2 + 88 + 32, 158 - i3);
      break;
    case 12: 
      if (this.bi == 3)
      {
        if (paramg.l == 29)
        {
          this.b0 = (i2 + 88 + 32);
          this.b1 = (i3 + 98 + 50);
          this.b2 = (this.bb + 27);
          this.b3 = (this.bc + 30);
          draw_anchor_helper(paramGraphics, this.b0, this.b1, i3 >> 2, paramg.d, true);
        }
        else
        {
          this.b6 = (this.b0 + paramg.d * ((this.b2 - this.b0) / 10));
          this.b7 = (this.b1 + paramg.d * ((this.b3 - this.b1) / 10));
          draw_anchor_helper(paramGraphics, this.b6, this.b7, i3 >> 2, paramg.d, true);
        }
        if (paramg.d == 8) {
          if ((this.bb - this.be > -50) && (this.bb - this.be < 27) && (this.bc - this.bf > -50) && (this.bc - this.bf < 30))
          {
            paramg.bool_n = true;
          }
          else
          {
            paramg.c = 0;
            this.af += -1;
          }
        }
      }
      else if (paramg.d < 8)
      {
        fillRect_helper(paramGraphics, i2 + 88 + 32, i3 + 98 + 50, i3 >> 2, 16776960, 8388608);
      }
      break;
    case 11: 
      if (this.AA.bool_n == true)
      {
        if (paramg.l == 29)
        {
          this.by = (93 - this.bb);
          this.bz = (144 - this.bc);
        }
        this.b4 = (i2 + 88 + 32 - this.by + (7 - paramg.d) * (this.by / 10));
        this.b5 = (i3 + 100 + 50 - this.bz + (7 - paramg.d) * (this.bz / 10));
        draw_anchor_helper(paramGraphics, this.b4, this.b5, i3 >> 1, paramg.l, false);
      }
      break;
    case 1: 
      draw_img_helper(paramGraphics, i2 + 88 + 32, i3 + 100 + 50, i3 >> 1, paramg.d);
      break;
    case 6: 
      graphic_helper(paramGraphics, i2 + 93 + 2 + 32, i3 + 94 + 50, i3 >> 2, paramg.l);
      break;
    case 4: 
    case 7: 
    case 8: 
      shift_1(paramGraphics, true, i2 + 88 + 32, 158 - i3, i4 * 4 + 2, i4 + 1, i4 + 1);
      break;
    case 5: 
      shift_1(paramGraphics, true, i2 + 88 + 32, 158 - i3, i4 * 4 + 2, i4 + 1, i4 + 1);
      break;
    }
  }
}
