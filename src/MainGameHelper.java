import javax.microedition.lcdui.Graphics;
import java.util.Random;

public class MainGameHelper {
	public MainGameHelper() {
		
	}
	
	public void init_600(int[][] int_arr_bu)
	{
	    for (int i1 = 0; i1 < 2; i1++)
	    {
	      int_arr_bu[i1][0] = (600 * i1 * 2);
	      int_arr_bu[i1][1] = (600 * (i1 * 2 + 1));
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
	  
	public int angle_helper(int paramInt1, int paramInt2, byte[] stt_byte_arr_bt)
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
	  
	public int random_helper(GameConfig paramg, int paramInt, Random rnd, int af, int al, int am, int an, int ao, int bo, 
			int bp, int bq, int br, byte[] stt_byte_arr_bt, byte[] stt_byte_arr_bs)
	{
	    int i3 = 8;
	    int i4;
	    int i1;
	    if (paramg.e > 4000)
	    {
//	      i4 = angle_helper(-paramg.a, -paramg.b);
	      i4 = angle_helper(-paramg.a, -paramg.b, stt_byte_arr_bt);
	      i1 = 20;
	    }
	    else
	    {
	      i1 = (Math.abs(rnd.nextInt()) & 0x7) + 5;
	      int i2 = Math.abs(rnd.nextInt() & 0x7);
	      i3 = Math.abs(paramg.e - 3500) >> 8;
	      if (i2 >= i3)
	      {
	        if (af < 1) {
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
	    paramg.h = (al - an + turn_helper(i4, bo, bp, stt_byte_arr_bs));
	    paramg.i = (am - ao + turn_helper2(i4, bq, br, stt_byte_arr_bs));
	    paramg.j = i4;
	    return i1;
	}
	
	public void setup2(GameSettings gameSetting, ArchAngel AA, int an, int ao, int aq, int ar, int au, boolean bool_ay, boolean bool_az, boolean bool_a0)
	{
	    au = 1000;
	    gameSetting.j = 0;
	    bool_ay = false;
	    bool_az = false;
	    bool_a0 = false;
	    AA.ab = 7;
	    setup3(an, ao, aq, ar);
	    ar = -20;
	}
	
	public void setup3(int an, int ao, int aq, int ar)
	{
	    aq = 0;
	    ar = 0;
	    an = (ao = 0);
	}
	
	public int shift_byte_6(int paramInt1, int paramInt2, int paramInt3, int bo, int bp, int bq, int br, byte[] stt_byte_arr_bs)
	{
	    return turn_helper(paramInt1, bo, bp, stt_byte_arr_bs) * paramInt2 - turn_helper2(paramInt1, bq, br, stt_byte_arr_bs) * paramInt3 >> 6;
	}
	  
	public void set_color_arr(Graphics paramGraphics, GameConfig paramg, int al, int am, int av, int bo, int bp, int bq, int br, byte[] stt_byte_arr_bs)
	{
	    int[] arrayOfInt = { 255, 16711680, 16776960, 16776960 };
	    int i5 = paramg.c;
	    int i3 = paramg.a;
	    int i4 = paramg.b;
	    int i1 = shift_byte_6(450 - av, i3, i4, bo, bp, bq, br, stt_byte_arr_bs);
	    int i2 = return_turn_helper(450 - av, i3, i4, bo, bp, bq, br, stt_byte_arr_bs);
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
	    paramg.a -= al;
	    paramg.b -= am;
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
	  
	public int turnAngleCalc(int paramInt,  byte[] stt_byte_arr_bs)
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
	 
	public int turn_helper(int paramInt, int bo, int bp, byte[] stt_byte_arr_bs)
	{
	    if (paramInt == bo) {
	      return bp;
	    }
	    bo = paramInt;
	    return bp = turnAngleCalc(paramInt, stt_byte_arr_bs);
	}
	  
	public int turn_helper2(int paramInt, int bq, int br, byte[] stt_byte_arr_bs)
	{
	    if (paramInt == bq) {
	      return br;
	    }
	    bq = paramInt;
	    return br = turnAngleCalc(90 - paramInt, stt_byte_arr_bs);
	}
	  
//	TODO refactor long parameters
//	public void turn_helper2(GameConfig paramg, int paramInt1, int paramInt2)
	public void turn_helper2(GameConfig paramg, GameConfig gameConfig2, GameSettings gameSetting, int paramInt1, int paramInt2, 
			Random rnd, ArchAngel AA, int af, int ah, int ag, int al, int am, int an, 
			int av, int bo, int bp, int bq, int br, int cc, int j, int n, int o, int k, 
			int r, int s, int v, int w, byte[] stt_byte_arr_bs, byte[] stt_byte_arr_bt)
	{
	    paramg.m = 0;
	    int i1;
	    switch (paramInt1)
	    {
	    case 9: 
	      paramg.a = r;
	      paramg.b = s;
	      paramg.e = 99999;
	      paramg.h = 0;
	      paramg.i = 0;
	      break;
	    case 10: 
	      paramg.m = 50;
	      i1 = (rnd.nextInt() & 0x1F) - 15;
	      int i2 = (rnd.nextInt() & 0x7) + 63;
	      paramg.a = (i2 * turn_helper(i1 + av, bo, bp, stt_byte_arr_bs));
	      paramg.b = (i2 * turn_helper2(i1 + av, bq, br, stt_byte_arr_bs));
	      paramg.h = (paramg.i = 0);
	      paramg.e = i1;
	      ah += 1;
	      break;
	    case 14: 
	      paramg.m = n;
	      av = 90;
	      i1 = 0;
	      paramg.a = (60 * turn_helper(i1 + av, bo, bp, stt_byte_arr_bs));
	      paramg.b = (60 * turn_helper2(i1 + av, bq, br, stt_byte_arr_bs));
	      paramg.e = i1;
	      paramg.h = (paramg.i = 0);
	      paramg.j = av;
	      paramg.l = 2;
	      v += 1;
	      paramg.d = 0;
	      AA.bool_n = true;
	      break;
	    case 13: 
	      paramg.m = j;
	      i1 = (rnd.nextInt() & 0x7F) - 63;
	      paramg.a = (60 * turn_helper(i1 + av, bo, bp, stt_byte_arr_bs));
	      paramg.b = (60 * turn_helper2(i1 + av, bq, br, stt_byte_arr_bs));
	      paramg.e = i1;
	      paramg.h = (paramg.i = 0);
	      paramg.j = ((av + 180) % 360);
	      paramg.l = 2;
	      w += 1;
	      ag += 1;
	      break;
	    case 12: 
	      paramg.a = gameConfig2.a;
	      paramg.b = gameConfig2.b;
	      paramg.e = shift_3(paramg.a, paramg.b);
	      i1 = paramg.j = angle_helper(-paramg.a + al, -paramg.b + am, stt_byte_arr_bt);
	      paramg.h = (3 * turn_helper(i1, bo, bp, stt_byte_arr_bs) + al);
	      paramg.i = (3 * turn_helper2(i1, bq, br, stt_byte_arr_bs) + am);
	      paramg.l = 30;
	      paramg.m = (gameConfig2.c == 14 ? o : k); // If miss use ie. paramg => Boss do not die.
	      af += 1;
	      break;
	    case 11: 
	      i1 = paramg.j = av;
	      paramg.h = (6 * turn_helper(i1, bq, br, stt_byte_arr_bs));
	      paramg.i = (6 * turn_helper2(i1, bq, br, stt_byte_arr_bs));
	      paramg.a = (turn_helper(av - 90, bo, bp, stt_byte_arr_bs) + paramg.h);
	      paramg.b = (turn_helper2(av - 90, bq, br, stt_byte_arr_bs) + paramg.i);
	      paramg.e = 64;
	      paramg.k = paramInt2;
	      paramg.l = 30;
	      paramg.m = gameSetting.s;
	      break;
	    case 1: 
	      i1 = paramg.j = av;
	      paramg.h = (6 * turn_helper(i1, bo, bp, stt_byte_arr_bs));
	      paramg.i = (6 * turn_helper2(i1, bq, br, stt_byte_arr_bs));
	      paramg.a = (turn_helper(av - 90, bo, bp, stt_byte_arr_bs) + paramg.h);
	      paramg.b = (turn_helper2(av - 90, bq, br, stt_byte_arr_bs) + paramg.i);
	      paramg.e = 64;
	      paramg.k = paramInt2;
	      paramg.l = 30;
	      paramg.m = gameSetting.n;
	      break;
	    case 6: 
	      i1 = paramg.j = av;
	      paramg.h = (6 * turn_helper(i1, bo, bp, stt_byte_arr_bs));
	      paramg.i = (6 * turn_helper2(i1, bq, br, stt_byte_arr_bs));
	      paramg.a = (turn_helper(av + 90, bo, bp, stt_byte_arr_bs) + paramg.h);
	      paramg.b = (turn_helper2(av + 90, bq, br, stt_byte_arr_bs) + paramg.i);
	      paramg.e = 64;
	      paramg.l = (10 + cc);
	      cc = (1 - cc);
	      paramg.m = (gameSetting.n / 10);
	      break;
	    }
	    paramg.c = paramInt1;
	}
	
//	public void draw_arr_byte_plasma_boss(Graphics paramGraphics)
	public void draw_arr_byte_plasma_boss(Graphics paramGraphics, ReadMedia readMedia, ArchAngel AA, int a8, 
			int a9, int ap, int aw, int ba, int bb, int bc, int bd, int bi, int z, boolean bool_ay, boolean bool_bg)
	{
	    byte[][] arrayOfByte1 = { { 5, -8 }, { 2, -18 }, { 6, -22 }, { 3, -25 } };
	    byte[][] arrayOfByte2 = { new byte[2], { 1, 6 }, { -2, -10 }, { 4, 8 }, { 1, -12 }, { -1, -4 }, { 0, 4 }, { 0, -6 }, { 1, 5 } };
	    int i1 = ap / 3;
	    int i2 = ap / 4 % 8;
	    if (ba < 3)
	    {
	      if (bd < 5) {
	        z = ba;
	      } else {
	        z = (ba + 2);
	      }
	    }
	    else if (bd < 5) {
	      z = (ba + 2);
	    } else {
	      z = (ba + 4);
	    }
	    switch (bi)
	    {
	    case 1: 
	      readMedia.drawImageInArr(paramGraphics, 24 + z, bb + 30, bc + 11);
	      if ((bool_ay == true) && (ap % 2 == 0)) {
	        readMedia.drawImageInArr(paramGraphics, 80, 120, 165);
	      }
	      if (AA.z != 3)
	      {
	        paramGraphics.setClip(bb + 10 + arrayOfByte2[z][0], bc + 11 + arrayOfByte2[z][1], 12, 11);
	        readMedia.drawImageAnchor20(paramGraphics, 33, bb + 10 + arrayOfByte2[z][0], bc + 11 + arrayOfByte2[z][1] - 11 * (ap % 2));
	        paramGraphics.setClip(bb + 38 - arrayOfByte2[z][0], bc + 11 - arrayOfByte2[z][1], 12, 11);
	        readMedia.drawImageAnchor20(paramGraphics, 34, bb + 38 - arrayOfByte2[z][0], bc + 11 - arrayOfByte2[z][1] - 11 * (ap % 2));
	        paramGraphics.setClip(0, 0, 240, 300);
	      }
	      AA.bool_m = true;
	      break;
	    case 2: 
	      AA.stopSound();
	      paramGraphics.setClip(0, 0, 240, 300);
	      if (i1 / 2 % 2 == 0) {
	        readMedia.drawImageAnchor20(paramGraphics, 112, 66, 103);
	      }
	      aw = 10;
	      a8 = 0;
	      bool_ay = false;
	      bool_bg = true;
	      if (i1 < 5) {
	        if (i1 == 0) {
	          readMedia.drawImageAnchor20(paramGraphics, 24, bb, bc);
	        } else {
	          readMedia.drawImageAnchor20(paramGraphics, 24 + i1 + 10, bb + arrayOfByte1[(i1 - 1)][0], bc + arrayOfByte1[(i1 - 1)][1]);
	        }
	      }
	      if (i1 == 5)
	      {
	        readMedia.destroyImage(112);
	        for (int i3 = 0; i3 < 11; i3++) {
	          readMedia.destroyImage(24 + i3);
	        }
	        for (int i3 = 0; i3 < 9; i3++)
	        {
	          readMedia.destroyImage(53 + i3);
	          readMedia.destroyImage(44 + i3);
	        }
	        for (int i3 = 10; i3 < 13; i3++) {
	          readMedia.destroyImage(71 + i3);
	        }
	        for (int i3 = 18; i3 < 24; i3++) {
	          readMedia.destroyImage(84 + i3);
	        }
	        readMedia.drawImageAnchor20(paramGraphics, 38, bb + arrayOfByte1[3][0], bc + arrayOfByte1[3][1]);
	        bb = 93;
	        bc = 144;
	        System.gc();
	        readMedia.readMediaStream("boss" + AA.ac);
	        for (int i3 = 0; i3 < 7; i3++) {
	          readMedia.reloadImageArr(i3, 62 + i3);
	        }
	        readMedia.closeInputStream();
	        readMedia.readMediaStream("plasma");
	        for (int i3 = 0; i3 < 18; i3++) {
	          readMedia.reloadImageArr(i3, 84 + i3);
	        }
	        readMedia.closeInputStream();
	        bi = 3;
	      }
	      break;
	    case 3: 
	      switch (ba)
	      {
	      case 1: 
	        bb -= 10;
	        if (bb < 33) {
	          bb = 33;
	        }
	        break;
	      case 2: 
	        bb += 10;
	        if (bb > 153) {
	          bb = 153;
	        }
	        break;
	      case 3: 
	      case 4: 
	        ba = 0;
	        break;
	      }
	      switch (a9)
	      {
	      case 1: 
	        bc -= 10;
	        if (bc < 104) {
	          bc = 104;
	        }
	        break;
	      case 2: 
	        bc += 10;
	        if (bc > 174) {
	          bc = 174;
	        }
	        break;
	      }
	      readMedia.drawImageAnchor20(paramGraphics, 38 + ba, bb, bc);
	      if (ba == 1)
	      {
	        paramGraphics.setClip(bb + 14, bc + 21, 19, 14);
	        readMedia.drawImageAnchor20(paramGraphics, 42, bb + 14, bc + 7);
	      }
	      else if (ba == 2)
	      {
	        paramGraphics.setClip(bb + 20, bc + 21, 19, 14);
	        readMedia.drawImageAnchor20(paramGraphics, 42, bb + 20, bc + 21);
	      }
	      else
	      {
	        paramGraphics.setClip(bb + 16, bc + 21, 22, 14);
	        readMedia.drawImageAnchor20(paramGraphics, 41, bb + 16, bc + 21 - 15 * (i1 / 3 % 2));
	      }
	      paramGraphics.setClip(0, 0, 240, 300);
	      break;
	    }
	}
	
//	public void follow_boss(int paramInt)
	public void follow_boss(int paramInt, boolean bool_bg, int bd, int bb, int x, int[] int_arr_a5, boolean[] bool_arr_a7 )
	{
	    int i1;
	    if (!bool_bg)
	    {
	      if (paramInt == 2)
	      {
	        bd += 1;
	        int_arr_a5[0] -= 4;
	        if (int_arr_a5[0] < 65296) {
	          int_arr_a5[0] = 0;
	        }
	        if (int_arr_a5[0] < 0) {
	          bool_arr_a7[0] = false;
	        }
	        int_arr_a5[1] -= 6;
	        if (int_arr_a5[1] < 65196) {
	          int_arr_a5[1] = 240;
	        }
	        for (i1 = 0; i1 < 3; i1++)
	        {
	          int_arr_a5[(i1 + 2)] -= 6 - 2 * i1;
	          if (int_arr_a5[(i1 + 2)] < 65296) {
	            int_arr_a5[(i1 + 2)] = 0;
	          }
	          if (int_arr_a5[(i1 + 2)] < 0) {
	            bool_arr_a7[(i1 + 1)] = false;
	          }
	        }
	      }
	      else if (paramInt == 1)
	      {
	        bd += 1;
	        int_arr_a5[0] += 4;
	        if (int_arr_a5[0] > 240) {
	          int_arr_a5[0] = 0;
	        }
	        if (int_arr_a5[0] > 0) {
	          bool_arr_a7[0] = true;
	        }
	        int_arr_a5[1] += 6;
	        if (int_arr_a5[1] > 240) {
	          int_arr_a5[1] = 65196;
	        }
	        for (i1 = 0; i1 < 3; i1++)
	        {
	          int_arr_a5[(i1 + 2)] += 6 - 2 * i1;
	          if (int_arr_a5[(i1 + 2)] > 240) {
	            int_arr_a5[(i1 + 2)] = 0;
	          }
	          if (int_arr_a5[(i1 + 2)] > 0) {
	            bool_arr_a7[(i1 + 1)] = true;
	          }
	        }
	      }
	      if (paramInt == 4)
	      {
	        bd += 1;
	        int_arr_a5[0] -= 4;
	        if (int_arr_a5[0] < 65296) {
	          int_arr_a5[0] = 0;
	        }
	        if (int_arr_a5[0] < 0) {
	          bool_arr_a7[0] = false;
	        }
	        int_arr_a5[1] -= 2;
	        if (int_arr_a5[1] < 65196) {
	          int_arr_a5[1] = 240;
	        }
	        for (i1 = 0; i1 < 3; i1++)
	        {
	          int_arr_a5[(i1 + 2)] -= 2 + 2 * i1;
	          if (int_arr_a5[(i1 + 2)] < 65296) {
	            int_arr_a5[(i1 + 2)] = 0;
	          }
	          if (int_arr_a5[(i1 + 2)] < 0) {
	            bool_arr_a7[(i1 + 1)] = false;
	          }
	        }
	      }
	      else if (paramInt == 3)
	      {
	        bd += 1;
	        int_arr_a5[0] += 4;
	        if (int_arr_a5[0] > 240) {
	          int_arr_a5[0] = 0;
	        }
	        if (int_arr_a5[0] > 0) {
	          bool_arr_a7[0] = true;
	        }
	        int_arr_a5[1] += 2;
	        if (int_arr_a5[1] > 240) {
	          int_arr_a5[1] = 65196;
	        }
	        for (i1 = 0; i1 < 3; i1++)
	        {
	          int_arr_a5[(i1 + 2)] += 2 + 2 * i1;
	          if (int_arr_a5[(i1 + 2)] > 240) {
	            int_arr_a5[(i1 + 2)] = 0;
	          }
	          if (int_arr_a5[(i1 + 2)] > 0) {
	            bool_arr_a7[(i1 + 1)] = true;
	          }
	        }
	      }
	      else if (paramInt > 0)
	      {
	        bd += 1;
	      }
	    }
	    else if (paramInt == 2)
	    {
	      if (bb >= 133)
	      {
	        x -= 2;
	        if (x < -10) {
	          x = -10;
	        }
	        int_arr_a5[0] -= 2;
	        if (int_arr_a5[0] < 65296) {
	          int_arr_a5[0] = 0;
	        }
	        if (int_arr_a5[0] < 0) {
	          bool_arr_a7[0] = false;
	        }
	        int_arr_a5[1] -= 1;
	        if (int_arr_a5[1] < 65196) {
	          int_arr_a5[1] = 240;
	        }
	        for (i1 = 0; i1 < 3; i1++)
	        {
	          int_arr_a5[(i1 + 2)] -= 2 + 1 * i1;
	          if (int_arr_a5[(i1 + 2)] < 65296) {
	            int_arr_a5[(i1 + 2)] = 0;
	          }
	          if (int_arr_a5[(i1 + 2)] < 0) {
	            bool_arr_a7[(i1 + 1)] = false;
	          }
	        }
	      }
	    }
	    else if ((paramInt == 1) && (bb <= 53))
	    {
	      x += 2;
	      if (x > 10) {
	        x = 10;
	      }
	      int_arr_a5[0] += 2;
	      if (int_arr_a5[0] > 240) {
	        int_arr_a5[0] = 0;
	      }
	      if (int_arr_a5[0] > 0) {
	        bool_arr_a7[0] = true;
	      }
	      int_arr_a5[1] += 1;
	      if (int_arr_a5[1] > 240) {
	        int_arr_a5[1] = 65196;
	      }
	      for (i1 = 0; i1 < 3; i1++)
	      {
	        int_arr_a5[(i1 + 2)] += 2 + 1 * i1;
	        if (int_arr_a5[(i1 + 2)] > 240) {
	          int_arr_a5[(i1 + 2)] = 0;
	        }
	        if (int_arr_a5[(i1 + 2)] > 0) {
	          bool_arr_a7[(i1 + 1)] = true;
	        }
	      }
	    }
	}
	
	// FIXME can not change speed of fighter
	public void simple_helper2(int paramInt, int a8, boolean bool_bg)
	{
	    if (!bool_bg) {
	      if (paramInt == 1)
	      {
	        a8 += 1;
	        if (a8 > 4) {
	          a8 = 4;
	        }
	      }
	      else if (paramInt == 2)
	      {
	        a8 += -1;
	        if (a8 < 0) {
	          a8 = 0;
	        }
	      }
	    }
	}
	
	// FIXME
	public boolean setup_18_item(int paramInt1, int paramInt2)
	{
		return true;
	}
	 
//	public void complex_helper()
	public void complex_helper(GameSettings gameSetting, ArchAngel AA, int a3, int a4, int a8, int a9, int ag, int aj, int ak, int al, int am, int an, 
			int ao, int ap, int aq, int ar, int as, int at, int av, int aw, int ba, int bb, int bd, int bn, int bo, int bp, int bq, int br, int db, 
			int x, boolean bool_a0, boolean bool_ay, boolean bool_az, boolean bool_bg, int[] int_arr_a5, boolean[] bool_arr_a7, byte[] stt_byte_arr_bs)
	{
	    simple_helper2(a9, a8, bool_bg);
	    if ((x <= 10) && (x >= -10)) {
	    	follow_boss(ba, bool_bg, bd, bb, x, int_arr_a5, bool_arr_a7); 
	    }
	    as += aq;
	    if (aq == 0)
	    {
	      if (as > 0) {
	        as += -1;
	      }
	      if (as < 0) {
	        as += 1;
	      }
	    }
	    if (as > 4) {
	      as = 4;
	    }
	    if (as < -4) {
	      as = -4;
	    }
	    av -= as;
	    if (av < 0) {
	      av += 360;
	    }
	    if (av >= 360) {
	      av -= 360;
	    }
	    al = ((turn_helper(av, bo, bp, stt_byte_arr_bs) * aw >> 6) + an);
	    am = ((turn_helper2(av, bq, br, stt_byte_arr_bs) * aw >> 6) + ao);
	    at -= am;
	    aw += ar;
	    if (aw > 140) {
	      aw = 140;
	    }
	    if (aw < 20) {
	      aw = 20;
	    }
	    a3 += -1;
	    a4 += -1;
	    if ((bool_ay) && (a4 <= 0) && (setup_18_item(6, 0)) && (bn <= 0)) {
	      bn = 12;
	    }
	    int i1;
	    if ((bool_az) && (AA.x % 5 == 0) && (AA.bool_n == true) && (gameSetting.t > 0))
	    {
	      i1 = aj;
	      if ((aj < 0) || (ak > 0)) {
	        i1 = -1;
	      }
	      if (setup_18_item(11, i1))
	      {
	        gameSetting.t += -1;
	        if (gameSetting.t <= 0)
	        {
	          AA.stopSound();
	          bool_az = false;
	        }
	      }
	    }
	    if (bool_a0)
	    {
	      if (gameSetting.o > 0)
	      {
	        i1 = aj;
	        if ((aj < 0) || (ak > 0)) {
	          i1 = -1;
	        }
	        if (setup_18_item(1, i1))
	        {
	          gameSetting.o += -1;
	          if (gameSetting.o <= 0) {
	            bool_a0 = false;
	          }
	          a3 = 20;
	        }
	      }
	      bool_a0 = false;
	    }
	}
	
	//public void complex_draw_helper(Graphics paramGraphics, GameConfig paramg)
	// These int params is original from this (MainGameScreen)
	// Be careful with param pass by reference ie. aa_bool_n here is not change value, only used for condition
	public void complex_draw_helper(Graphics paramGraphics, GameConfig paramg, ReadMedia readMedia, int af, 
			int b0, int b1, int b2, int b3, int b4, int b5, int b6, int b7, int bb, int bc, int be, int bf, 
			int bi, int bj, int bk, int by, int bz, boolean aa_bool_n, Random rnd)
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
	        readMedia.drawImageInArr(paramGraphics, 44 + i4, i2 + 88 + 32, 163 + i3);
	      }
	      break;
	    case 13: 
	      if (i4 < 8) {
	        readMedia.drawImageInArr(paramGraphics, 53 + i4, i2 + 88 + 32, 158 - i3);
	      }
	      break;
	    case 14: 
	      readMedia.drawImageInArr(paramGraphics, 63 + i4, i2 + 88 + 32, 158 - i3);
	      break;
	    case 12: 
	      if (bi == 3)
	      {
	        if (paramg.l == 29)
	        {
	          b0 = (i2 + 88 + 32);
	          b1 = (i3 + 98 + 50);
	          b2 = (bb + 27);
	          b3 = (bc + 30);
	          draw_anchor_helper(paramGraphics, readMedia, b0, b1, i3 >> 2, paramg.d, true, be, bf);
	        }
	        else
	        {
	          b6 = (b0 + paramg.d * ((b2 - b0) / 10));
	          b7 = (b1 + paramg.d * ((b3 - b1) / 10));
	          draw_anchor_helper(paramGraphics, readMedia, b6, b7, i3 >> 2, paramg.d, true, be, bf);
	        }
	        if (paramg.d == 8) {
	          if ((bb - be > -50) && (bb - be < 27) && (bc - bf > -50) && (bc - bf < 30))
	          {
	            paramg.bool_n = true;
	          }
	          else
	          {
	            paramg.c = 0;
	            af += -1;
	          }
	        }
	      }
	      else if (paramg.d < 8)
	      {
	        fillRect_helper(paramGraphics, i2 + 88 + 32, i3 + 98 + 50, i3 >> 2, 16776960, 8388608);
	      }
	      break;
	    case 11: 
	      if (aa_bool_n == true) // this.AA.bool_n
	      {
	        if (paramg.l == 29)
	        {
	          by = (93 - bb);
	          bz = (144 - bc);
	        }
	        b4 = (i2 + 88 + 32 - by + (7 - paramg.d) * (by / 10));
	        b5 = (i3 + 100 + 50 - bz + (7 - paramg.d) * (bz / 10));
	        draw_anchor_helper(paramGraphics, readMedia, b4, b5, i3 >> 1, paramg.l, false, be, bf);
	      }
	      break;
	    case 1: 
	      draw_img_helper(paramGraphics, readMedia, i2 + 88 + 32, i3 + 100 + 50, i3 >> 1, paramg.d);
	      break;
	    case 6: 
	      graphic_helper(paramGraphics, i2 + 93 + 2 + 32, i3 + 94 + 50, i3 >> 2, paramg.l, bj, bk);
	      break;
	    case 4: 
	    case 7: 
	    case 8: 
	      shift_1(paramGraphics, true, i2 + 88 + 32, 158 - i3, i4 * 4 + 2, i4 + 1, i4 + 1, readMedia, rnd);
	      break;
	    case 5: 
	      shift_1(paramGraphics, true, i2 + 88 + 32, 158 - i3, i4 * 4 + 2, i4 + 1, i4 + 1, readMedia, rnd);
	      break;
	    }
	    
	}
	
	// TODO remove this method in MainGameScreen
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
	
//	public void draw_anchor_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
	public void draw_anchor_helper(Graphics paramGraphics, ReadMedia readMedia, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int be, int bf)
	{
	    if (paramInt3 > 20) {
	      paramInt3 = 20;
	    }
	    int i1 = paramInt1 - (paramInt3 >> 1);
	    int i2 = paramInt2 - (paramInt3 >> 1);
	    if (paramBoolean)
	    {
	      readMedia.drawImageAnchor20(paramGraphics, 93 + paramInt4, i1, i2);
	      be = i1;
	      bf = i2;
	    }
	    else
	    {
	      readMedia.drawImageAnchor20(paramGraphics, 84 + (29 - paramInt4), i1, i2);
	    }
	}
	
	// FIXME outofbound Exception
	public void draw_anchor_helper2(Graphics paramGraphics, GameConfig gameConfig, ReadMedia readMedia, int ai, int aj, int ak, int as, int bi, int bw, int bx)
	{
	    int i6 = 0;
	    paramGraphics.setColor(65280);
	    ai = (85 + as * 7);
	    if ((aj >= 0) && (gameConfig.c == 0)) {
	      aj = -1;
	    }
	    int i1;
	    int i2;
	    for (int i7 = 0; i7 < 18; i7++)
	    {
	      int i4 = gameConfig.c;
	      int i5 = gameConfig.d;
	      if ((i4 >= 13) && (i5 >= 1) && (i5 < 6))
	      {
	        i1 = gameConfig.f + 88 + 32;
	        i2 = 158 - gameConfig.g;
	        bw = i1;
	        bx = i2;
	        if ((i1 > ai) && (i1 < ai + 88) && (i2 > 87) && (i2 < 188)) {
	          if (aj == -1)
	          {
	            i6 = 1;
	            aj = i7;
	            ak = 5;
	          }
	          else if (aj == i7)
	          {
	            i6 = 1;
	            if (ak > 0) {
	              ak += -1;
	            }
	          }
	        }
	      }
	    }
	    if (i6 != 0)
	    {
	      if (aj >= 0)
	      {
	        i1 = gameConfig.f + 88 + 32;
	        i2 = 155 - gameConfig.g;
	        int i3 = gameConfig.d * 8 + 4;
	        if (bi == 1) {
	          if (gameConfig.d < 4) {
	            readMedia.drawImageAnchor20(paramGraphics, 82, i1 - 10, i2 - 6);
	          } else {
	            readMedia.drawImageAnchor20(paramGraphics, 81, i1 - 17, i2 - 12);
	          }
	        }
	      }
	    }
	    else
	    {
	      aj = -1;
	      if (bi == 1) {
	        readMedia.drawImageAnchor20(paramGraphics, 83, ai, 136);
	      }
	    }
	}
	  
	public void draw_img_helper(Graphics paramGraphics, ReadMedia readMedia, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
	{
	    int i1 = paramInt1 - (paramInt3 >> 1);
	    int i2 = paramInt2 - (paramInt3 >> 1);
	    if (paramInt4 < 6) {
	      readMedia.drawImageInArr(paramGraphics, 102 + paramInt4, i1 - 5, i2);
	    }
	}
	
//	public void graphic_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
	public void graphic_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int bj, int bk)
	{
	    paramGraphics.setColor(bj);
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
	    paramGraphics.setColor(bk);
	    paramGraphics.fillRect(paramInt1 - (paramInt3 >> 1), paramInt2 - (paramInt3 >> 1), paramInt3, paramInt3);
	}
	
//	public void shift_1(Graphics paramGraphics, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
	public void shift_1(Graphics paramGraphics, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, ReadMedia readMedia, Random rnd)
	{
	    int i4;
	    int i3;
	    int i1;
	    int i2;
	    if (paramBoolean)
	    {
	      readMedia.drawImageInArr(paramGraphics, 71 + paramInt4, paramInt1, paramInt2);
	      for (i4 = 0; i4 < paramInt5; i4++)
	      {
	        i3 = Math.abs(rnd.nextInt() % 7);
	        i1 = Math.abs(rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
	        i2 = Math.abs(rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
	        if ((i4 & 0x1) == 1) {
	          readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1, paramInt2 + i2);
	        } else {
	          readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1, paramInt2 + i2);
	        }
	      }
	    }
	    else
	    {
	      readMedia.drawImageInArr(paramGraphics, 71 + paramInt4, paramInt1 + 5, paramInt2 - 25);
	      for (i4 = 0; i4 < paramInt5; i4++)
	      {
	        i3 = Math.abs(rnd.nextInt() % 7);
	        i1 = Math.abs(rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
	        i2 = Math.abs(rnd.nextInt() % paramInt3) - (paramInt3 >> 1);
	        if ((i4 & 0x1) == 1) {
	          readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1 + 5, paramInt2 + i2 - 25);
	        } else {
	          readMedia.drawImageInArr(paramGraphics, 71 + i3, paramInt1 + i1 + 5, paramInt2 + i2 - 25);
	        }
	      }
	    }
	}
	
	public int return_turn_helper(int paramInt1, int paramInt2, int paramInt3, int bo, int bp, int bq, int br, byte[] stt_byte_arr_bs)
	{
	    return turn_helper2(paramInt1, bq, br, stt_byte_arr_bs) * paramInt2 + turn_helper(paramInt1, bo, bp, stt_byte_arr_bs) * paramInt3 >> 6;
	}
	
}
