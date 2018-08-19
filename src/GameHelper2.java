import javax.microedition.lcdui.Graphics;


public class GameHelper2 {
	public GameHelper2() {
	}
	
	public void save_equipment(Graphics paramGraphics, ArchAngel archAngel)
	{
		paramGraphics.setColor(0);
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 145, "Save equipment");
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 160, "as you are using.");
	}
	
	public void read_text_helper(int paramInt1, int paramInt2, ArchAngel archAngel)
	{
		int i1 = -1;
		if ((paramInt1 >= 49) && (paramInt1 <= 57))
		{
			i1 = paramInt1 - 49 + 1;
			if (archAngel.screen == 13) {
				archAngel.readText.a = i1;
			}
		}
		else if ((paramInt1 != -8) && (paramInt1 != 42) && (paramInt1 != 48) && (paramInt1 != 35))
		{
			switch (paramInt1)
			{
			case -4: 
			case -2: 
				archAngel.readText.a += 1;
				archAngel.x = -1;
				archAngel.bool_g = true;
				break;
			case -3: 
			case -1: 
				archAngel.readText.a += -1;
				archAngel.x = -1;
				archAngel.bool_g = true;
				break;
			default: 
				i1 = archAngel.readText.a;
			}
			if (archAngel.readText.a <= 0) {
				archAngel.readText.a = archAngel.readText.b;
			}
			if (archAngel.readText.a > archAngel.readText.b) {
				archAngel.readText.a = 1;
			}
		}
		if ((i1 > 0) && (archAngel.readText.int_arr_m[(i1 - 1)] > 0))
		{
			archAngel.z = archAngel.readText.int_arr_m[(i1 - 1)];
			archAngel.x = 0;
		}
	}
	
	public void draw_start_option(Graphics paramGraphics, int o, int p, ArchAngel archAngel)
	{
		if ((archAngel.z > 0) && (archAngel.x > 0)) {
			return;
		}
		int i1;
		switch (archAngel.z)
		{
		case 0: 
			if (archAngel.x < 4)
			{
				if (archAngel.x == 0)
				{
					archAngel.playSound("m_briefing", 0);
					archAngel.readMedia.readMediaStream("brief");
				}
				archAngel.readMedia.reloadImageArr(archAngel.x, 17 + archAngel.x);
			}
			if (archAngel.x == 4)
			{
				archAngel.readMedia.closeInputStream();
				archAngel.readMedia.readMediaStream("boss" + archAngel.gameSetting.b);
				archAngel.readMedia.reloadImageArr(8, 21);
				archAngel.readMedia.closeInputStream();
				if (archAngel.bool_k)
				{
					archAngel.readMedia.readMediaStream("menu");
					for (i1 = 0; i1 < 4; i1++) {
						archAngel.readMedia.reloadImageArr(i1, 13 + i1);
					}
					archAngel.readMedia.closeInputStream();
					paramGraphics.setColor(0);
					paramGraphics.fillRect(0, 80, 240, 220);
					archAngel.readMedia.drawImageAnchor20(paramGraphics, 15, 33, 60);
					paramGraphics.setClip(198, 60, 18, 20);
					archAngel.readMedia.drawImageAnchor20(paramGraphics, 16, 198, 60 - archAngel.gameSetting.b * 20);
					paramGraphics.setClip(0, 0, 240, 320);
				}
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
				paramGraphics.setClip(17, 89, 223, 25);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90);
				if (archAngel.gameSetting.b < 4) {
					archAngel.readMedia.readMediaStream("enermy" + archAngel.gameSetting.b);
				} else {
					archAngel.readMedia.readMediaStream("boss" + (archAngel.gameSetting.b - 4));
				}
				archAngel.readMedia.reloadImageArr(8, 22);
				archAngel.readMedia.closeInputStream();
				archAngel.drawImage(paramGraphics);
				if (archAngel.screen == 9) {
					archAngel.a(paramGraphics, "SKIP", true);
				}
				archAngel.a(paramGraphics, "NEXT", false);
				archAngel.z += 1;
				archAngel.p = -1;
				archAngel.bool_h = false;
			}
			return;
		case 1: 
			archAngel.z = 11;
			archAngel.a(archAngel.gameSetting.b + 1);
			paramGraphics.setColor(65280);
			break;
		case 999: 
			if (archAngel.screen == 9) {
				archAngel.screen = 25;
			} else {
				archAngel.screen = 5;
			}
			archAngel.gameSetting.c = archAngel.gameSetting.b;
			for (i1 = 0; i1 < 6; i1++) {
				archAngel.readMedia.destroyImage(17 + i1);
			}
			return;
		}
		if (archAngel.z >= 11) {
			draw_arm(paramGraphics, archAngel.z, 242, o, p, archAngel);
		}
		if (!archAngel.readText.processTxt(archAngel.z + 1))
		{
			if (archAngel.screen == 9)
			{
				archAngel.drawImage(paramGraphics);
				archAngel.a(paramGraphics, "START", false);
			}
			else
			{
				archAngel.drawImage(paramGraphics);
				archAngel.a(paramGraphics, "OPTIONS", false);
			}
			archAngel.aa = (archAngel.z = '?');
		}
	}
	
	public void draw_arm(Graphics paramGraphics, int paramInt1, int paramInt2, int o, int p, ArchAngel archAngel)
	{
			o = paramInt2;
			p = paramInt1;
			draw_arm_detail(paramGraphics, paramInt1, paramInt2, archAngel);
	}
	
	public void draw_arm_detail(Graphics paramGraphics, int paramInt1, int paramInt2, ArchAngel archAngel)
	{
		int i1 = paramInt2;
		paramGraphics.setColor(9605802);
		paramGraphics.fillRect(0, 119, 240, 181);
		if (paramInt1 == 11)
		{
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 17, 10, 126);
		}
		else if ((paramInt1 >= 12) && (paramInt1 < 14))
		{
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 20, 6, 126);
			archAngel.readMedia.drawImageInArr(paramGraphics, 22, 55, 170);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 140, "NAME:", 0);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 150, archAngel.mainGameScreen.str_m, 0);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 160, "DAMAGE:", 0);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 170, archAngel.mainGameScreen.k + "MP", 0);
		}
		else if (paramInt1 >= 14)
		{
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 20, 6, 126);
			archAngel.readMedia.drawImageInArr(paramGraphics, 21, 55, 170);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 140, "NAME:", 0);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 150, archAngel.mainGameScreen.str_q, 0);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 160, "DAMAGE:", 0);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 140, 170, archAngel.mainGameScreen.o + "MP", 0);
		}
		archAngel.readMedia.drawImageAnchor20(paramGraphics, 18, 189, 175);
		archAngel.readMedia.drawImageAnchor20(paramGraphics, 19, 0, 235);
		paramGraphics.setColor(0);
		archAngel.readText.processTxt(paramInt1);
		archAngel.readText.b = 0;
		archAngel.p = archAngel.readText.o;
		String str;
		while ((str = archAngel.readText.buildString()) != null)
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
				if (i2 > archAngel.readText.b) {
					archAngel.readText.b = i2;
				}
			}
			paramGraphics.drawString(str, 11, i1, 20);
			i1 += 17;
		}
		archAngel.bool_g = false;
	}
	
	public void draw_game_play_screen(Graphics paramGraphics, int aa, int ab, int ac, int ad, int ae, int af, 
			int ag, int l, boolean bool_b, boolean bool_z, ArchAngel archAngel)
	{
		archAngel.ac = archAngel.gameSetting.b;
		archAngel.mainGameScreen.z = 0;
		if (archAngel.ac < 3) {
			archAngel.ad = 0;
		} else if ((archAngel.ac == 3) || (archAngel.ac == 4)) {
			archAngel.ad = 1;
		} else if (archAngel.ac > 4) {
			archAngel.ad = 2;
		}
		archAngel.mainGameScreen.bj = 16749568;
		archAngel.mainGameScreen.bk = 16768512;
		int i1;
		switch (archAngel.z)
		{
		case 0: 
			archAngel.bool_m = false;
			archAngel.bool_n = false;
			archAngel.bool_l = false;
			l = 1;
			archAngel.readMedia.destroyImage7_53();
			archAngel.readMedia.destroyImage53_115();
			archAngel.readMedia.destroyImage(2);
			archAngel.readMedia.destroyImage(5);
			archAngel.gameSetting.initGame1();
			archAngel.a(archAngel.gameSetting.b + 1);
			archAngel.mainGameScreen.init_game2();
			archAngel.readMedia.readMediaStream("etc");
			archAngel.readMedia.reloadImageArr(0, 111);
			archAngel.readMedia.closeInputStream();
			archAngel.readMedia.readMediaStream("aa");
			archAngel.readMedia.reloadImageArr(0, 24);
			archAngel.readMedia.reloadImageArr(9, 33);
			archAngel.readMedia.reloadImageArr(10, 34);
			archAngel.readMedia.closeInputStream();
			archAngel.z += 1;
			break;
		case 1: 
			switch (archAngel.x)
			{
			case 0: 
				archAngel.readMedia.readMediaStream("background" + archAngel.ad);
				for (i1 = 0; i1 < 2; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 7 + i1);
				}
				break;
			case 1: 
				for (i1 = 0; i1 < 9; i1++) {
					archAngel.readMedia.reloadImageArr(i1 + 2, 9 + i1);
				}
				if (archAngel.ad == 2) {
					for (i1 = 0; i1 < 3; i1++) {
						archAngel.readMedia.reloadImageArr(i1 + 11, 18 + i1);
					}
				}
				archAngel.readMedia.closeInputStream();
				break;
			case 2: 
				System.gc();
				archAngel.z += 1;
				break;
			}
			draw_rect_clip_helper(paramGraphics, archAngel.x, archAngel);
			break;
		case 2: 
			switch (archAngel.x)
			{
			case 0: 
				archAngel.readMedia.readMediaStream("ui");
				for (i1 = 0; i1 < 3; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 21 + i1);
				}
				archAngel.readMedia.closeInputStream();
				archAngel.readMedia.readMediaStream("effect");
				for (i1 = 0; i1 < 13; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 71 + i1);
				}
				archAngel.readMedia.closeInputStream();
				break;
			case 1: 
				System.gc();
				archAngel.z += 1;
				break;
			}
			draw_rect_clip_helper(paramGraphics, archAngel.x + 3, archAngel);
			break;
		case 3: 
			draw_rect_clip_helper(paramGraphics, archAngel.x + 5, archAngel);
			switch (archAngel.x)
			{
			case 0: 
				archAngel.readMedia.readMediaStream("aa");
				for (i1 = 0; i1 < 11; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 24 + i1);
				}
				archAngel.readMedia.closeInputStream();
				break;
			case 1: 
				if (archAngel.ac < 4) {
					archAngel.readMedia.readMediaStream("enermy" + archAngel.ac);
				} else {
					archAngel.readMedia.readMediaStream("boss" + (archAngel.ac - 4));
				}
				for (i1 = 0; i1 < 8; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 53 + i1);
				}
				archAngel.readMedia.closeInputStream();
				break;
			case 2: 
				archAngel.readMedia.readMediaStream("fence" + archAngel.ad);
				for (i1 = 0; i1 < 8; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 44 + i1);
				}
				archAngel.readMedia.readMediaStream("plasma");
				for (i1 = 18; i1 < 24; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 84 + i1);
				}
				archAngel.readMedia.closeInputStream();
				break;
			case 3: 
				archAngel.stopSound();
				System.gc();
				archAngel.z += 1;
			}
			break;
		case 4: 
			if (archAngel.x == 0)
			{
				archAngel.readMedia.destroyImage(111);
				bool_b = false;
				setting2(paramGraphics, aa, ab, ac, ad, ae, af, ag, bool_z, archAngel);
				archAngel.bool_j = false;
			}
			paramGraphics.setClip(0, 0, 240, 320);
			archAngel.mainGameScreen.main_paint(paramGraphics);
			draw_fighting(paramGraphics, archAngel);
			if ((archAngel.x < 10) && (archAngel.bool_j == true))
			{
				archAngel.readMedia.drawStringGraphic(paramGraphics, 135, 27, "", 0);
				paramGraphics.setColor(16711680);
				paramGraphics.fillRect(80, 194, 80, 10);
				archAngel.readMedia.drawStringGraphic(paramGraphics, 86, 197, "NO MISSILE", 0);
			}
			if (archAngel.ab != 25)
			{
				archAngel.mainGameScreen.bool_bl = true;
				bool_b = true;
				archAngel.z = 5;
			}
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "OPTIONS", false);
			archAngel.a(paramGraphics, "PAUSE", true);
			break;
		case 5: 
			paramGraphics.setClip(0, 0, 240, 300);
			archAngel.mainGameScreen.main_paint(paramGraphics);
			archAngel.mainGameScreen.config2();
			archAngel.z = 6;
			break;
		case 6: 
			archAngel.readMedia.destroyImage7_53();
			archAngel.readMedia.destroyImage53_115();
			archAngel.screen = archAngel.ab;
			break;
		}
	}
	
	public void draw_rect_clip_helper(Graphics paramGraphics, int paramInt, ArchAngel archAngel)
	{
		paramGraphics.setColor(0);
		paramGraphics.fillRect(0, 0, 240, 320);
		archAngel.readMedia.drawImageAnchor20(paramGraphics, 24, 90, 169);
		paramGraphics.setClip(100, 180, 12, 11);
		archAngel.readMedia.drawImageAnchor20(paramGraphics, 33, 100, 180 - 11 * (paramInt % 2));
		paramGraphics.setClip(128, 180, 12, 11);
		archAngel.readMedia.drawImageAnchor20(paramGraphics, 34, 128, 180 - 11 * (paramInt % 2));
		paramGraphics.setColor(16711680);
		paramGraphics.setClip(87, 200, 66, 14);
		paramGraphics.fillRect(87, 217 - paramInt * 3, 66, paramInt * 3);
		archAngel.readMedia.drawImageAnchor20(paramGraphics, 111, 87, 200);
	}
		
	public void setting2(Graphics paramGraphics, int aa, int ab, int ac, int ad, int ae, int af, int ag, boolean bool_z, ArchAngel archAngel)
	{
		bool_z = false;
		aa = 0;
		ab = 0;
		ac = 0;
		ad = 0;
		ae = 0;
		af = -1;
		ag = -1;
		archAngel.readMedia.drawImageAnchor20(paramGraphics, 21, 0, 0);
	}
	
	public void draw_fighting(Graphics paramGraphics, ArchAngel archAngel)
	{
		paramGraphics.setClip(0, 0, 240, 40);
		switch (archAngel.mainGameScreen.aa)
		{
		case 0: 
			if (archAngel.ac < 4) {
				archAngel.readMedia.drawStringGraphic(paramGraphics, 75, 10, "ENERMY:" + archAngel.mainGameScreen.str_m, 0);
			} else {
				archAngel.readMedia.drawStringGraphic(paramGraphics, 75, 10, archAngel.mainGameScreen.str_m, 0);
			}
			archAngel.readMedia.drawStringGraphic(paramGraphics, 75, 20, "N:" + (archAngel.mainGameScreen.y - archAngel.mainGameScreen.u), 0);
			if (archAngel.mainGameScreen.y - archAngel.mainGameScreen.u <= 0)
			{
				archAngel.mainGameScreen.bool_a1 = true;
				archAngel.mainGameScreen.aa = archAngel.mainGameScreen.byte_ac;
			}
			break;
		case 1: 
			paramGraphics.setColor(14408703);
			paramGraphics.drawString(archAngel.mainGameScreen.ca + " m", 120, 3, 17);
			int i1 = archAngel.mainGameScreen.f;
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
						archAngel.readMedia.drawImageAnchor20(paramGraphics, 23, 114 + i3 * 4, 20);
					}
				} else if (i1 < -5) {
					for (i3 = 0; i3 < i2; i3++) {
						archAngel.readMedia.drawImageAnchor20(paramGraphics, 22, 106 - i3 * 4, 20);
					}
				}
			}
			break;
		case 2:
			if (archAngel.ac < 7)
			{
				archAngel.readMedia.drawStringGraphic(paramGraphics, 87, 8, archAngel.mainGameScreen.str_q, 0);
			}
			else
			{
				archAngel.readMedia.drawStringGraphic(paramGraphics, 89, 5, "ARCHANGEL", 0);
				archAngel.readMedia.drawStringGraphic(paramGraphics, 89, 11, "   MK2   ", 0);
			}
			archAngel.readMedia.drawStringGraphic(paramGraphics, 82, 18, "HP:", 0);
			paramGraphics.setColor(9605802);
			paramGraphics.fillRect(102, 17, 42, 7);
			paramGraphics.setColor(14408703);
			paramGraphics.drawRect(102, 17, 41, 6);
			paramGraphics.setColor(16776960);
			paramGraphics.fillRect(103, 18, archAngel.ae, 5);
			break;
		}
		// Hero lose hp with 50 value each time colidate obstacle (EASY mode).
		// Start with 1000, 40 * 1000 >> 9 = 78 then 74, 70, 66 ...
		int i1 = 40 * archAngel.gameSetting.j >> 9;
		if(archAngel.mainGameScreen.j < 100) {
			System.out.println("Fighter HP: " + archAngel.gameSetting.j + " >> 9 i1= " + i1);
		}
		paramGraphics.setColor(255);
		paramGraphics.fillRect(192, 5, i1 / 2, 4);
		if (archAngel.mainGameScreen.bi == 3)
		{
			if (archAngel.mainGameScreen.bool_bh == true)
			{
				if (archAngel.gameSetting.t < archAngel.gameSetting.r) {
					archAngel.gameSetting.t += 3;
				}
				if (archAngel.gameSetting.t == archAngel.gameSetting.r) {
					archAngel.mainGameScreen.bool_bh = false;
				}
			}
			if (archAngel.gameSetting.t <= 0) // may be number of enemies left
			{
			archAngel.gameSetting.t = 3; // Try play flow
				paramGraphics.setColor(16711680);
				if (archAngel.x / 2 % 2 == 0) // boss scene, out of amour 
				{
					paramGraphics.fillRect(80, 194, 80, 19);
					archAngel.readMedia.drawStringGraphic(paramGraphics, 86, 197, "PRESS 0 KEY", 0);
					archAngel.readMedia.drawStringGraphic(paramGraphics, 92, 205, "TO RELOAD", 0);
				}
			}
			if (archAngel.gameSetting.r != 0) {
				i1 = archAngel.gameSetting.t * 40 / archAngel.gameSetting.r;
			}
		}
		else if (archAngel.mainGameScreen.bi == 1)
		{
			if(archAngel.gameSetting.m != 0) {
				i1 = archAngel.gameSetting.o * 40 / archAngel.gameSetting.m;
			} else {
				i1 = 0; // dungnv
			}
		}
		else
		{
			i1 = 40;
		}
		paramGraphics.setColor(16711680);
		paramGraphics.fillRect(192, 17, i1, 4); // Draw red bar (missile)
	}
	
	public void draw_weapon_shop(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2, int t, int u, String[][] str_arr_w, ArchAngel archAngel, ReadText readText)
	{
		int i3 = 170;
		int i4 = 3;
		String str2 = null;
		int i2 = paramInt1 / 100 - 1;
		int i1 = paramInt1 % 100;
		archAngel.drawImage(paramGraphics);
		archAngel.a(paramGraphics, "OK", false);
		paramGraphics.setColor(7171414);
		paramGraphics.fillRect(6, 127, 226, 147);
		paramGraphics.setColor(9605802);
		paramGraphics.drawRect(6, 127, 225, 146);
		paramGraphics.setColor(9605717);
		paramGraphics.fillRect(15, 140, 72, 42);
		paramGraphics.setColor(16777130);
		paramGraphics.drawRect(15, 139, 72, 43);
		archAngel.readMedia.drawImageSwitch(paramGraphics, 18, 141, 60, 40, i1 - 1, paramInt2);
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
		readText.processTxt(i1);
		String str1 = readText.buildString();
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 100, 145, str2);
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 100, 165, str1);
		i3 += 30;
		switch (i2)
		{
		case 0: 
			t = archAngel.gameSetting.q;
			break;
		case 1: 
			i2 = 0;
			t = archAngel.gameSetting.v;
			break;
		case 2: 
			i2 = 1;
			t = archAngel.gameSetting.l;
			i4 = 3;
			break;
		}
		t += archAngel.gameSetting.a;
		for (int i5 = 0; i5 < i4; i5++)
		{
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 20, i3, str_arr_w[i2][i5] + ":" + readText.int_arr_m[i5]);
			i3 += 15;
		}
		u = readText.int_arr_m[i4];
	}
	
	public void goto_menu(Graphics paramGraphics, int o, int p, int q, int t, int x, String[][] str_arr_w, 
			ArchAngel archAngel, ReadText readText, GameHelper helper)
	{
		if (archAngel.x > 0) {
			return;
		}
		switch (archAngel.z)
		{
		case 0: 
			archAngel.stopSound();
			//ai.aq = null;
			archAngel.drawImage(paramGraphics);
			archAngel.readText.readTextFromStream("subm");
			archAngel.z = 1;
			archAngel.readText.bool_c = false;
			break;
		case 1: 
			archAngel.bool_s = true;
			if (archAngel.readText.bool_c) {
				archAngel.readText.g = 4;
			}
			break;
		case 2: 
			archAngel.bool_s = false;
			archAngel.readText.bool_c = true;
			archAngel.readText.g = 1;
			break;
		case 40: 
			archAngel.addScore12();
			archAngel.ab = 5;
		case 10: 
			archAngel.addScore12();
			archAngel.y = (archAngel.screen = 25);
			archAngel.z = 4;
			return;
		case 20: 
			archAngel.af = (1 - archAngel.af);
			if (archAngel.af == 0) {
				archAngel.stopSound();
			}
			archAngel.z = 1;
			return;
		case 30: 
			archAngel.ag = (1 - archAngel.ag);
			if (archAngel.ag == 0) {
				archAngel.mainGameScreen.play_s_plasma(false);
			}
			archAngel.z = 1;
			return;
		case 999: 
			archAngel.stopSound();
			archAngel.addScore12();
			archAngel.addScore();
			archAngel.destroyApp(false);
			archAngel.notifyDestroyed();
			return;
		}
		if (archAngel.bool_t)
		{
			archAngel.mainGameScreen.main_paint(paramGraphics);
			draw_fighting(paramGraphics, archAngel);
			archAngel.bool_t = false;
		}
		setup2(paramGraphics, archAngel.z, 217, o, p, q, t, x, str_arr_w, archAngel, readText, helper);
		archAngel.drawImage(paramGraphics);
		archAngel.a(paramGraphics, "OK", false);
	}
	
	public void setup2(Graphics paramGraphics, int paramInt1, int paramInt2, int o, int p, int q, int t, int x, 
			String[][] str_arr_w, ArchAngel archAngel, ReadText readText, GameHelper helper)
	{
		o = paramInt2;
		p = paramInt1;
		archAngel.bool_w = false;
		helper.draw_arm_shop_menu(paramGraphics, paramInt1, paramInt2, q, t, x, str_arr_w, archAngel, readText);
	}
	 
	public void load_system_txt(Graphics paramGraphics, int l, int o, int p, int q, int t, int x, int y, String[][] str_arr_w, ArchAngel archAngel, ReadText readText, GameHelper helper)
	{
		if ((archAngel.z > 0) && (archAngel.x > 0)) {
			return;
		}
		switch (archAngel.z)
		{
		case 0: 
			if (archAngel.x == 0) {
				archAngel.readText.readTextFromStream("system");
			}
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "PLAY", true);
			archAngel.a(paramGraphics, "OK", false);
			helper.simple_helper(paramGraphics, archAngel);
			return;
		case 1: 
			archAngel.z = 2;
			break;
		case 10: 
			archAngel.screen = 2;
			return;
		}
		helper.draw_system_setin(paramGraphics, l, o, p, q, t, x, y, str_arr_w, archAngel, readText);
	}
	
	public void draw_victory(Graphics paramGraphics, ArchAngel archAngel)
	{
		int i1 = 133;
		int i2 = 0;
		int i3 = 0;
		paramGraphics.setColor(0);
		if (archAngel.mainGameScreen.str_m != null)
		{
			i3 = archAngel.mainGameScreen.h * archAngel.mainGameScreen.u;
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, archAngel.mainGameScreen.str_m + ":" + archAngel.mainGameScreen.h + "x" + archAngel.mainGameScreen.u);
			i1 += 16;
			i2 += i3;
		}
		if (archAngel.mainGameScreen.str_q != null)
		{
			i3 = archAngel.mainGameScreen.i * archAngel.mainGameScreen.t;
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, archAngel.mainGameScreen.str_q + ":" + archAngel.mainGameScreen.i + "x" + archAngel.mainGameScreen.t);
			i1 += 16;
			i2 += i3;
		}
		i3 = -archAngel.gameSetting.i * (archAngel.gameSetting.g - archAngel.gameSetting.j);
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, "Maintenance Fee:");
		i1 += 16;
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 59, i1, "" + i3);
		i1 += 25;
		i2 += i3;
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, i1, "Total:" + i2);
		archAngel.gameSetting.a += i2;
	}
	
	public void draw_warning_etc_menu(Graphics paramGraphics, int l, ArchAngel archAngel)
	{
		switch (archAngel.z)
		{
		case 0: 
			archAngel.bool_k = false;
			archAngel.readMedia.destroyImage53_115();
			archAngel.readMedia.destroyImage7_53();
			archAngel.readMedia.readMediaStream("menu");
			for (int i1 = 0; i1 < 4; i1++) {
				archAngel.readMedia.reloadImageArr(i1, 13 + i1);
			}
			archAngel.readMedia.closeInputStream();
			archAngel.readMedia.readMediaStream("font");
			for (int i1 = 1; i1 < 3; i1++) {
				archAngel.readMedia.reloadImageArr(i1, i1);
			}
			archAngel.readMedia.reloadImageArr(5, 5);
			archAngel.readMedia.closeInputStream();
			archAngel.bool_w = true;
			archAngel.readText.bool_c = false;
			archAngel.readText.bool_d = false;
			archAngel.z += 1;
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
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 0);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 5, 27, 25);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180);
			archAngel.z += 1;
			break;
		case 2: 
			if (archAngel.x < 21)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 80, 240, 200);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160 - 5 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180 + 5 * archAngel.x);
				paramGraphics.setClip(0, 180 - 5 * archAngel.x, 240, 10 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89 + l * 33);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90);
			}
			if (archAngel.x == 20)
			{
				archAngel.readMedia.closeInputStream();
				archAngel.readMedia.readMediaStream("etc");
				archAngel.readMedia.reloadImageArr(3, 114);
				archAngel.z += 1;
			}
			break;
		case 3: 
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 15, 33, 60);
			paramGraphics.setClip(198, 60, 18, 20);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 16, 198, 60 - archAngel.gameSetting.b * 20);
			paramGraphics.setClip(0, 0, 240, 280);
			paramGraphics.setColor(0);
			paramGraphics.fillRect(0, 80, 240, 200);
			paramGraphics.setColor(4802901);
			paramGraphics.fillRect(0, 119, 240, 30);
			paramGraphics.fillRect(0, 171, 240, 10);
			paramGraphics.fillRect(0, 205, 240, 30);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89 + l * 33);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
			break;
		}
		archAngel.drawImage(paramGraphics);
		archAngel.a(paramGraphics, "PLAY", true);
		archAngel.a(paramGraphics, "OK", false);
	}
	
	public void draw_font_result(Graphics paramGraphics, ArchAngel archAngel, GameHelper helper)
	{
		switch (archAngel.z)
		{
		case 0: 
			if (archAngel.x == 0)
			{
				for (int i1 = 11; i1 < 19; i1++) {
					archAngel.readMedia.destroyImage(24 + i1);
				}
				archAngel.readMedia.destroyImage53_115();
				archAngel.readMedia.readMediaStream("font");
				archAngel.readMedia.reloadImageArr(1, 1);
				archAngel.readMedia.closeInputStream();
				archAngel.drawImage(paramGraphics);
				archAngel.a(paramGraphics, "OK", false);
				archAngel.bool_s = false;
				archAngel.bool_m = false;
			}
			helper.simple_helper(paramGraphics, archAngel);
			break;
		case 1: 
			archAngel.playSound("m_win", 1);
			archAngel.readMedia.readMediaStream("result");
			archAngel.readMedia.drawLoadImage(2, paramGraphics, 45, 93);
			archAngel.readMedia.drawLoadImage(1, paramGraphics, 62, 98);
			archAngel.readMedia.closeInputStream();
			paramGraphics.setColor(16777215);
			paramGraphics.fillRect(45, 126, 150, 107);
			if (archAngel.gameSetting.b == 7)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 0, 240, 300);
				archAngel.screen = 27;
			}
			else
			{
				archAngel.z = 4;
			}
			break;
		case 4: 
			if (archAngel.x == 0) {
				draw_victory(paramGraphics, archAngel);
			}
			break;
		case 2: 
		case 3: 
		default: 
			if (archAngel.x < 16)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 0, 240, archAngel.x * 10);
				paramGraphics.fillRect(0, 300 - archAngel.x * 10, 240, archAngel.x * 10);
			}
			if (archAngel.x == 16)
			{
				archAngel.readMedia.destroyImage53_115();
				System.gc();
				archAngel.gameSetting.b += 1;
				archAngel.addScore();
				archAngel.screen = 5;
			}
			break;
		}
	}
	
	public void draw_buy(Graphics paramGraphics, int paramInt1, int paramInt2, int x, ArchAngel archAngel, ReadText readText)
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
			i4 = archAngel.gameSetting.q;
			if (archAngel.gameSetting.d == i2)
			{
				save_equipment(paramGraphics, archAngel);
				return;
			}
			archAngel.gameSetting.d = i2;
			archAngel.gameSetting.loadDataFromReadTxt(readText);
			break;
		case 1: 
			i4 = archAngel.gameSetting.v;
			if (archAngel.gameSetting.e == i2)
			{
				save_equipment(paramGraphics, archAngel);
				return;
			}
			archAngel.gameSetting.e = i2;
			archAngel.gameSetting.loadConfig2(readText);
			break;
		case 2: 
			i4 = archAngel.gameSetting.l;
			if (archAngel.gameSetting.f == i2)
			{
				save_equipment(paramGraphics, archAngel);
				return;
			}
			archAngel.gameSetting.f = i2;
			archAngel.gameSetting.loadConfig3(readText);
			break;
		}
		archAngel.gameSetting.a += i4 - paramInt2;
		switch (x)
		{
		case 0: 
			str1 = "missile";
			str2 = archAngel.gameSetting.str_p;
			break;
		case 1: 
			str1 = "plasma canon";
			str2 = archAngel.gameSetting.str_u;
			break;
		case 2: 
			str1 = "Armor";
			str2 = archAngel.gameSetting.str_k;
			break;
		}
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 135, "You bought the");
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 150, str1);
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 165, str2);
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 195, "My money : " + archAngel.gameSetting.a);
	}
	
	public void draw_intro(Graphics paramGraphics, ArchAngel archAngel)
	{
		switch (archAngel.z)
		{
		case 0: 
			if (archAngel.x == 0)
			{
				paramGraphics.setColor(16777215);
				paramGraphics.fillRect(0, 0, 240, 320);
				archAngel.readMedia.drawStringImage("logo", 0, paramGraphics, 48, 80);
				archAngel.readMedia.drawStringImage("logo", 1, paramGraphics, 46, 161);
				archAngel.readMedia.readMediaStream("intro");
				archAngel.readMedia.reloadImageArr(0, 30);
				archAngel.readMedia.closeInputStream();
				archAngel.readMedia.readMediaStream("select");
				for (int i1 = 0; i1 < 7; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 6 + i1);
				}
				archAngel.readMedia.closeInputStream();
			}
			if (archAngel.x == 8) {
				archAngel.z += 1;
			}
			break;
		case 1: 
			if (archAngel.x == 0)
			{
				archAngel.playSound("m_front", 0);
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
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 0);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 5, 27, 25);
				archAngel.readMedia.drawStringImage("logo", 2, paramGraphics, 0, 300);
			}
			if (archAngel.x % 10 < 5) {
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 30, 0, 80);
			} else {
				archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 62, 264, "Press Any Key");
			}
			break;
		case 2: 
			archAngel.mainGameScreen.bd = 0;
			if (archAngel.x < 21)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 60, 240, 240);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				paramGraphics.setClip(0, 80 + 5 * archAngel.x, 240, 200 - 10 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 30, 0, 80);
				paramGraphics.setClip(0, 0, 240, 320);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * archAngel.x);
			}
			if (archAngel.x == 20)
			{
				archAngel.readMedia.destroyImage(30);
				archAngel.screen = 3;
			}
			break;
		}
	}
	
}
