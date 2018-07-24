import javax.microedition.lcdui.Graphics;
import java.util.Random;

public class MainGameHelper {
	public MainGameHelper() {
		
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
	public void turn_helper2(GameConfig paramg, GameSettings gameSetting, int paramInt1, int paramInt2, Random rnd, boolean bool_n, int af, int ah, int ag, int al, int am, int an, int av, int bo, int bp, int bq, int br, int cc, int j, int n, int o, int k, int r, int s, int v, int w, byte[] stt_byte_arr_bs, byte[] stt_byte_arr_bt)
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
	      bool_n = true;
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
	      paramg.a = paramg.a; // gameConfigArr[paramInt2]
	      paramg.b = paramg.b;
	      paramg.e = shift_3(paramg.a, paramg.b);
	      i1 = paramg.j = angle_helper(-paramg.a + al, -paramg.b + am, stt_byte_arr_bt);
	      paramg.h = (3 * turn_helper(i1, bo, bp, stt_byte_arr_bs) + al);
	      paramg.i = (3 * turn_helper2(i1, bq, br, stt_byte_arr_bs) + am);
	      paramg.l = 30;
	      paramg.m = (paramg.c == 14 ? o : k);
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
	
	//public void complex_draw_helper(Graphics paramGraphics, GameConfig paramg)
	// These int params is original from this (MainGameScreen)
	public void complex_draw_helper(Graphics paramGraphics, GameConfig paramg, ReadMedia readMedia, int af, int b0, int b1, int b2, int b3, int b4, int b5, int b6, int b7, int bb, int bc, int be, int bf, int bi, int bj, int bk, int by, int bz, boolean aa_bool_n, Random rnd)
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
	  
}
