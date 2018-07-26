import javax.microedition.lcdui.Graphics;


public class GameHelper {
	
	public GameHelper() {
	}
	
	public void loadBrief1(Graphics paramGraphics, int o, int p, ArchAngel archAngel)
	{
		int i1;
		switch (archAngel.z)
		{
		case 0: 
			archAngel.readMedia.readMediaStream("font");
			archAngel.readMedia.reloadImageArr(5, 5);
			archAngel.readMedia.closeInputStream();
			archAngel.readMedia.readMediaStream("end");
			for (i1 = 0; i1 < 2; i1++) {
				archAngel.readMedia.reloadImageArr(i1, 31 + i1);
			}
			archAngel.readMedia.closeInputStream();
			archAngel.z += 1;
			break;
		case 1: 
			if (archAngel.x == 0)
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
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 0);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 5, 27, 25);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 31, 0, 80);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 32, 0, 175);
				archAngel.drawImage(paramGraphics);
				archAngel.a(paramGraphics, "SKIP", true);
				archAngel.a(paramGraphics, "NEXT", false);
				archAngel.readText.readTextFromStream("end");
			}
			archAngel.z = 11;
			break;
		case 15: 
			if (archAngel.x < 21)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 60, 240, 240);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				paramGraphics.setClip(0, 80 + 5 * archAngel.x, 240, 200 - 10 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 31, 0, 80);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 32, 0, 175);
				paramGraphics.setClip(0, 0, 240, 320);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * archAngel.x);
			}
			if (archAngel.x == 21)
			{
				archAngel.readMedia.destroyImage(31);
				archAngel.readMedia.destroyImage(32);
				archAngel.readMedia.readMediaStream("select");
				for (i1 = 0; i1 < 7; i1++) {
					archAngel.readMedia.reloadImageArr(i1, 6 + i1);
				}
				archAngel.readMedia.closeInputStream();
				archAngel.b = 3;
			}
			break;
		}
		if (archAngel.z < 15)
		{
			paramGraphics.setColor(0);
			paramGraphics.fillRect(0, 227, 240, 53);
			paramGraphics.setColor(16777130);
			paramGraphics.drawRect(0, 227, 239, 53);
			simple_arm_helper(paramGraphics, archAngel.z, 228, o, p, archAngel);
		}
	}
	
	public void simple_arm_helper(Graphics paramGraphics, int paramInt1, int paramInt2, int o, int p, ArchAngel archAngel)
	{
		o = paramInt2;
		p = paramInt1;
		machineShopLogic(paramGraphics, paramInt1, paramInt2, archAngel);
	}
	
	public void machineShopLogic(Graphics paramGraphics, int paramInt1, int paramInt2, ArchAngel archAngel)
	{
		int i1 = paramInt2;
		int i2 = 14;
		if (archAngel.b == 7) {
			i2 = 30;
		}
		archAngel.readText.processTxt(paramInt1);
		archAngel.readText.b = 0;
		archAngel.p = archAngel.readText.o;
		String str;
		while ((str = archAngel.readText.buildString()) != null)
		{
			if ((archAngel.b == 26) || (archAngel.b == 27)) {
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
				if (i3 > archAngel.readText.b) {
					archAngel.readText.b = i3;
				}
				if (i3 == archAngel.readText.a) {
					paramGraphics.setColor(14361600);
				}
			}
			if (archAngel.b == 13)
			{
				paramGraphics.drawString(str, i2, i1 + 8, 20);
			}
			else
			{
				if (archAngel.b != 7) {
					paramGraphics.drawString(str, i2, i1, 20);
				}
				if ((archAngel.b == 10) && (paramInt1 == 51) && ((archAngel.readText.a <= 2) || (archAngel.readText.a == 4))) {
					paramGraphics.setColor(0);
				}
			}
			if (archAngel.b == 13)
			{
				if (archAngel.readText.a == 2) {
					paramGraphics.setColor(0);
				} else {
					paramGraphics.setColor(40960);
				}
				paramGraphics.drawString(archAngel.on_off[(1 - archAngel.af)], 83, 119, 20);
			}
			i1 += 17;
		}
		if (archAngel.bool_s)
		{
			paramGraphics.setColor(0);
			paramGraphics.drawString("1.YES   2.NO", 88, 105, 17);
		}
		archAngel.bool_g = false;
	}
	
	public void displayGameOver(Graphics paramGraphics, ArchAngel archAngel)
	{
		int i1;
		switch (archAngel.z)
		{
		case 0: 
			if (archAngel.x == 0)
			{
				archAngel.c = 0;
				archAngel.readMedia.readMediaStream("font");
				archAngel.readMedia.reloadImageArr(1, 1);
				archAngel.readMedia.closeInputStream();
				archAngel.drawImage(paramGraphics);
				archAngel.a(paramGraphics, "OK", false);
				archAngel.bool_s = false;
			}
			else
			{
				archAngel.z = 1;
			}
			break;
		case 1: 
			paramGraphics.setColor(107, 222, 255);
			paramGraphics.fillRect(45, 93, 150, 33);
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 62, 103, "YOU ARE DEAD");
			paramGraphics.setColor(16777215);
			paramGraphics.fillRect(45, 126, 150, 107);
			paramGraphics.setColor(16777215);
			paramGraphics.fillRect(45, 126, 150, 107);
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 129, "You have been");
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 144, "hit deadly.");
			paramGraphics.setColor(0);
			paramGraphics.fillRect(49, 172 + archAngel.c * 15, 75, 15);
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 174, "1. Retry");
			archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 50, 189, "2. Back");
			break;
		case 2: 
			for (i1 = 11; i1 < 19; i1++) {
				archAngel.readMedia.destroyImage(24 + i1);
			}
			archAngel.readMedia.destroyImage7_53();
			archAngel.readMedia.destroyImage53_115();
			archAngel.b = 25;
			break;
		case 3: 
			if (archAngel.x < 16)
			{
				if (archAngel.x == 0)
				{
					for (i1 = 11; i1 < 19; i1++) {
						archAngel.readMedia.destroyImage(24 + i1);
					}
					archAngel.readMedia.destroyImage7_53();
					archAngel.readMedia.destroyImage53_115();
				}
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 0, 240, archAngel.x * 10);
				paramGraphics.fillRect(0, 300 - archAngel.x * 10, 240, archAngel.x * 10);
			}
			if (archAngel.x == 16) {
				archAngel.b = 5;
			}
			break;
		}
	}
	
	public void loadSavedGame(Graphics paramGraphics, int l, ArchAngel archAngel)
	{
		int i1;
		switch (archAngel.z)
		{
		case 0: 
			if (archAngel.x < 21)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 60, 240, 240);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160 - 5 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180 + 5 * archAngel.x);
			}
			if (archAngel.x == 20)
			{
				archAngel.drawImage(paramGraphics);
				archAngel.z += 1;
			}
			break;
		case 1: 
			if (archAngel.x < 22)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 80, 240, 200);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 65326 + archAngel.x * 10, 118);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 247 - archAngel.x * 10, 204);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 9, 65388 + archAngel.x * 10, 125);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 10, 266 - archAngel.x * 10, 211);
			}
			if (archAngel.x == 21) {
				archAngel.z += 1;
			}
			break;
		case 2: 
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0, 118);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37, 204);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 8, 41, 122 + l * 86);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 9, 62, 125);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 10, 56, 211);
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "OK", false);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
			archAngel.bool_w = true;
			break;
		case 3: 
			paramGraphics.setColor(0);
			paramGraphics.fillRect(0, 80, 240, 200);
			paramGraphics.setColor(4802901);
			paramGraphics.fillRect(0, 119, 240, 30);
			paramGraphics.fillRect(0, 171, 240, 10);
			paramGraphics.fillRect(0, 205, 240, 30);
			if (archAngel.x < 21)
			{
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0 - archAngel.x * 10, 118);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37 + archAngel.x * 10, 204);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 9, 62 - archAngel.x * 10, 125);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 10, 56 + archAngel.x * 10, 211);
			}
			else if (archAngel.x < 43)
			{
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 65326 + (archAngel.x - 21) * 10, 118);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 247 - (archAngel.x - 21) * 10, 204);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 11, 65381 + (archAngel.x - 21) * 10, 125);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 12, 265 - (archAngel.x - 21) * 10, 211);
			}
			if (archAngel.x == 42) {
				archAngel.z += 1;
			}
			break;
		case 4: 
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0, 118);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37, 204);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 8, 41, 122 + archAngel.ah * 86);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 11, 55, 125);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 12, 55, 211);
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "OK", false);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
			break;
		case 5: 
			if (archAngel.x < 21)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 60, 240, 240);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				paramGraphics.setClip(0, 80 + 5 * archAngel.x, 240, 200 - 10 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 6, 0, 118);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 7, 37, 204);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 8, 41, 122 + archAngel.ah * 86);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 11, 55, 125);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 12, 55, 211);
				paramGraphics.setClip(0, 0, 240, 320);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * archAngel.x);
			}
			if (archAngel.x == 20)
			{
				for (i1 = 0; i1 < 7; i1++) {
					archAngel.readMedia.destroyImage(6 + i1);
				}
				archAngel.b = 26;
			}
			break;
		case 6: 
			if (archAngel.x < 20)
			{
				archAngel.bool_w = false;
				paramGraphics.setColor(0);
				paramGraphics.fillRect(41, 208, 160, 26);
				archAngel.readMedia.drawStringGraphic(paramGraphics, 47, 218, "A SAVED GAME IS NOT FOUND.", 0);
			}
			if (archAngel.x == 20) {
				archAngel.z = 2;
			}
			break;
		case 7: 
			for (i1 = 0; i1 < 7; i1++) {
				archAngel.readMedia.destroyImage(6 + i1);
			}
			archAngel.bool_k = true;
			archAngel.d();
			archAngel.gameSetting.initSetting();
			archAngel.b = 9;
			l = 0;
			break;
		}
	}
	
	public void briefOpen(Graphics paramGraphics, int o, int p, ArchAngel archAngel)
	{
		switch (archAngel.z)
		{
		case 0: 
			if (archAngel.x < 21)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 60, 240, 240);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 160 - 5 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 180 + 5 * archAngel.x);
				paramGraphics.setClip(0, 180 - 5 * archAngel.x, 240, 10 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 29, 0, 80);
			}
			if (archAngel.x == 20) {
				archAngel.z += 1;
			}
			break;
		case 1: 
			if (archAngel.x == 0) {
				archAngel.readText.readTextFromStream("open");
			}
			archAngel.z = 11;
			break;
		case 18: 
			if (archAngel.x < 21)
			{
				paramGraphics.setColor(0);
				paramGraphics.fillRect(0, 60, 240, 240);
				paramGraphics.setColor(4802901);
				paramGraphics.fillRect(0, 119, 240, 30);
				paramGraphics.fillRect(0, 171, 240, 10);
				paramGraphics.fillRect(0, 205, 240, 30);
				paramGraphics.setClip(0, 80 + 5 * archAngel.x, 240, 200 - 10 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 29, 0, 80);
				paramGraphics.setClip(0, 0, 240, 320);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 4, 0, 60 + 5 * archAngel.x);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280 - 5 * archAngel.x);
			}
			if (archAngel.x == 20)
			{
				archAngel.readMedia.destroyImage(29);
				archAngel.b = 2;
			}
			break;
		}
		if (archAngel.z < 18)
		{
			paramGraphics.setColor(0);
			paramGraphics.fillRect(0, 227, 240, 53);
			paramGraphics.setColor(16777130);
			paramGraphics.drawRect(0, 227, 239, 53);
			simple_arm_helper(paramGraphics, archAngel.z, 228, o, p, archAngel);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 3, 0, 280);
		}
		archAngel.drawImage(paramGraphics);
		archAngel.a(paramGraphics, "SKIP", true);
		archAngel.a(paramGraphics, "NEXT", false);
	}
	
	public void briefAbout(Graphics paramGraphics, int o, int p, int l, ArchAngel archAngel)
	{
		switch (archAngel.z)
		{
		case 0: 
			archAngel.readText.readTextFromStream("about");
			archAngel.z += 1;
			break;
		case 1: 
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
			paramGraphics.setClip(17, 89, 223, 25);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90 - l * 33);
			paramGraphics.setClip(0, 0, 240, 320);
			paramGraphics.setColor(7171414);
			paramGraphics.fillRect(2, 119, 238, 181);
			paramGraphics.setColor(9605802);
			paramGraphics.drawRect(2, 119, 237, 180);
			simple_helper2(paramGraphics, archAngel.z, 130, o, p, archAngel);
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "BACK", true);
			break;
		}
	}
	
	public void simple_helper2(Graphics paramGraphics, int paramInt1, int paramInt2, int o, int p, ArchAngel archAngel)
	{
		o = paramInt2;
		p = paramInt1;
		draw_str_helper(paramGraphics, paramInt1, paramInt2, archAngel);
	}
	
	public void draw_str_helper(Graphics paramGraphics, int paramInt1, int paramInt2, ArchAngel archAngel)
	{
		int i1 = paramInt2;
		int i2 = 5;
		archAngel.readText.processTxt(paramInt1);
		String str;
		while ((str = archAngel.readText.buildString()) != null)
		{
			//return; // Avoid draw string error outOfBound
			paramGraphics.setColor(16777215);
			if (archAngel.b == 4) {
				paramGraphics.drawString(str, 120, i1, 17);
			}
			i1 += 17;
		}
	}
	
	public void draw_system_setin(Graphics paramGraphics, int l, int o, int p, int q, int t, int x, int y, String[][] str_arr_w, ArchAngel archAngel, ReadText readText)
	{
		if ((archAngel.z > 0) && (archAngel.x > 0)) {
			return;
		}
		switch (archAngel.z)
		{
		case 0: 
			y = 1;
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 14, 17, 89);
			paramGraphics.setClip(17, 89, 223, 25);
			archAngel.readMedia.drawImageAnchor20(paramGraphics, 13, 60, 90 - l * 33);
			paramGraphics.setClip(0, 0, 240, 320);
			if (archAngel.x == 0) {
				archAngel.readText.readTextFromStream("system");
			}
			simple_helper(paramGraphics, archAngel);
			return;
		case 1: 
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "BACK", true);
			archAngel.a(paramGraphics, "OK", false);
			archAngel.readText.bool_c = true;
			archAngel.readText.bool_d = false;
			archAngel.readText.h = 1;
			archAngel.readText.g = y;
			if (archAngel.bool_u) {
				archAngel.addScore12();
			}
			archAngel.bool_u = false;
			break;
		case 11: 
			archAngel.addScore();
			archAngel.z = 12;
			break;
		case 100: 
		case 200: 
		case 300: 
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "BACK", true);
			archAngel.a(paramGraphics, "NEXT", false);
			break;
		case 101: 
		case 102: 
		case 103: 
		case 201: 
		case 202: 
		case 203: 
		case 204: 
		case 301: 
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "PREV", true);
			archAngel.a(paramGraphics, "NEXT", false);
			break;
		case 104: 
		case 205: 
		case 302: 
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "PREV", true);
			archAngel.a(paramGraphics, "OK", false);
			break;
		case 21: 
			if (archAngel.e())
			{
				archAngel.d();
				archAngel.readText.readTextFromStream("system");
				archAngel.z = 22;
			}
			else
			{
				archAngel.z = 23;
			}
			break;
		case 12: 
		case 22: 
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "OK", false);
			break;
		case 10: 
			archAngel.readText.bool_c = false;
			y = 1;
			break;
		case 20: 
			archAngel.readText.bool_c = false;
			y = 2;
			break;
		case 33: 
			archAngel.af = (1 - archAngel.af);
			if (archAngel.af == 0) {
				archAngel.stopSound();
			}
			archAngel.bool_u = true;
		case 30: 
			archAngel.readText.bool_c = false;
			y = 3;
			archAngel.z = (31 + archAngel.af);
			break;
		case 43: 
			archAngel.ag = (1 - archAngel.ag);
			archAngel.bool_u = true;
		case 40: 
			archAngel.readText.bool_c = false;
			y = 4;
			archAngel.z = (41 + archAngel.ag);
			break;
		case 50: 
			archAngel.readText.bool_c = false;
			y = 5;
			archAngel.readText.readTextFromStream("helpmain");
			archAngel.drawImage(paramGraphics);
			archAngel.a(paramGraphics, "BACK", true);
			archAngel.a(paramGraphics, "OK", false);
			archAngel.readText.bool_d = true;
			archAngel.z = 61;
			break;
		case 99: 
			archAngel.readText.bool_d = false;
			archAngel.readText.h = 1;
			archAngel.readText.readTextFromStream("help0");
			archAngel.z += 1;
			break;
		case 199: 
			archAngel.readText.bool_d = false;
			archAngel.readText.h = 2;
			archAngel.readText.readTextFromStream("help1");
			archAngel.z += 1;
			break;
		case 299: 
			archAngel.readText.bool_d = false;
			archAngel.readText.h = 3;
			archAngel.readText.readTextFromStream("help2");
			archAngel.z += 1;
			break;
		case 399: 
			archAngel.readText.readTextFromStream("help3");
			archAngel.z += 1;
			break;
		case 500: 
			archAngel.readText.readTextFromStream("system");
			archAngel.z = 1;
			if (archAngel.b != 10) {
				return;
			}
			break;
		case 70: 
			archAngel.b = 5;
			return;
		case 999: 
			archAngel.stopSound();
			archAngel.addScore();
			archAngel.destroyApp(false);
			archAngel.notifyDestroyed();
			return;
		}
		if (archAngel.bool_w) {
			setup2(paramGraphics, archAngel.z, 150, o, p, q, t, x, str_arr_w, archAngel, readText);
		}
	}
	
	public void simple_helper(Graphics paramGraphics, ArchAngel archAngel)
	{
		archAngel.z += 1;
		archAngel.p = -1;
		archAngel.bool_h = false;
	}
	
	public void setup2(Graphics paramGraphics, int paramInt1, int paramInt2, int o, int p, int q, int t, int x, String[][] str_arr_w, ArchAngel archAngel, ReadText readText)
	{
		o = paramInt2;
		p = paramInt1;
		archAngel.bool_w = false;
		draw_arm_shop_menu(paramGraphics, paramInt1, paramInt2, q, t, x, str_arr_w, archAngel, readText);
	}
	
	public void draw_arm_shop_menu(Graphics paramGraphics, int paramInt1, int paramInt2, int q, int t, int x, String[][] str_arr_w, ArchAngel archAngel, ReadText readText)
	{
		archAngel.bool_v = false;
		if ((archAngel.b == 12) && ((paramInt1 == 100) || (paramInt1 == 200) || (paramInt1 == 300)))
		{
			drawDataInTxt(paramGraphics, paramInt1, 130, t, x, str_arr_w, archAngel, readText);
		}
		else
		{
			int i1 = paramInt2;
			int i4 = 10;
			if (archAngel.b != 7)
			{
				if (archAngel.b == 13)
				{
					i4 = 5;
					paramGraphics.setColor(4343106);
					paramGraphics.fillRect(0, 217, 140, 83);
					paramGraphics.setColor(14605311);
					paramGraphics.drawRect(0, 217, 139, 82);
					q = paramInt1;
				}
				else
				{
					archAngel.readMedia.drawImageAnchor20(paramGraphics, 2, 2, 120);
				}
			}
			else if (archAngel.b == 7)
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
					if (i2 == archAngel.readText.a) {
						if (archAngel.b == 13)
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
				if (archAngel.b == 13)
				{
					archAngel.readMedia.drawStringGraphic(paramGraphics, i4, i1 + 8, str, 0);
					paramGraphics.setColor(0);
					if (archAngel.bool_s)
					{
						paramGraphics.setColor(0);
						archAngel.readMedia.drawStringGraphic(paramGraphics, i4 + 66, 236, archAngel.on_off[(1 - archAngel.af)], 0);
						archAngel.readMedia.drawStringGraphic(paramGraphics, i4 + 72, 247, archAngel.auto_manual[(1 - archAngel.ag)], 0);
					}
				}
				else
				{
					archAngel.readMedia.drawGraphicStr40_122(paramGraphics, i4, i1, str);
					if ((archAngel.b == 10) && (paramInt1 == 51) && ((archAngel.readText.a <= 2) || (archAngel.readText.a == 4))) {
						paramGraphics.setColor(0);
					}
				}
				if (archAngel.b == 13) {
					i1 += 11;
				} else {
					i1 += 15;
				}
			}
			if (archAngel.b == 11)
			{
				paramGraphics.setColor(9540180);
				paramGraphics.fillRect(10, 135, 70, 42);
				archAngel.readMedia.drawImageAnchor20(paramGraphics, 114, 10, 135);
				paramGraphics.setColor(0);
				archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 12, 180, "My money:" + archAngel.gameSetting.a);
				archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 10, 210, "1.Missile");
				archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 10, 225, "2.Plasma Canon");
				archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 10, 240, "3.Armor");
			}
			archAngel.bool_g = false;
		}
		archAngel.bool_v = true;
	}
	
	/**
		* Data embeded in text file, like inline/custom Database.
		* @param paramGraphics
		* @param paramInt1
		* @param paramInt2
		*/
	public void drawDataInTxt(Graphics paramGraphics, int paramInt1, int paramInt2, int t, int x, String[][] str_arr_w, ArchAngel archAngel, ReadText readText)
	{
		int i1 = paramInt2;
		b(paramGraphics, paramInt1, x, t, str_arr_w, archAngel, readText);
		archAngel.readText.processTxt(paramInt1);
		archAngel.readText.b = 0;
		archAngel.p = archAngel.readText.o;
		switch (x)
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
		while ((str = archAngel.readText.buildString()) != null)
		{
			archAngel.readMedia.drawStringGraphic(paramGraphics, 10, i1, str, x);
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
				if (i2 > archAngel.readText.b) {
					archAngel.readText.b = i2;
				}
				if (i2 == archAngel.readText.a)
				{
					paramGraphics.setColor(0);
					paramGraphics.fillRect(7, i1 - 2, str.length() * 6 + 6, 9);
					archAngel.readMedia.drawStringGraphic(paramGraphics, 10, i1, str, 3);
				}
			}
			i1 += 11;
		}
		archAngel.bool_g = false;
	}
	
	public void b(Graphics paramGraphics, int paramInt, int x, int t, String[][] str_arr_w, ArchAngel archAngel, ReadText readText)
	{
		if (archAngel.bool_q)
		{
			paramGraphics.setColor(7171414);
			paramGraphics.fillRect(6, 127, 226, 147);
			paramGraphics.setColor(9605802);
			paramGraphics.drawRect(6, 127, 225, 146);
			paramGraphics.setColor(9605717);
			paramGraphics.fillRect(10, 130, 72, 42);
			paramGraphics.setColor(16777130);
			paramGraphics.drawRect(10, 129, 72, 43);
			if (archAngel.bool_r)
			{
				draw_ammunation_buy(paramGraphics, 101, true, archAngel.d, x, t, str_arr_w, archAngel, readText);
				archAngel.bool_r = false;
			}
			else if (archAngel.a <= 6)
			{
				draw_ammunation_buy(paramGraphics, archAngel.a + 100, true, archAngel.d, x, t, str_arr_w, archAngel, readText);
			}
			else
			{
				draw_ammunation_buy(paramGraphics, archAngel.a - 1 + 100, true, archAngel.d, x, t, str_arr_w, archAngel, readText);
			}
		}
		archAngel.bool_q = false;
	}
	
	public void draw_ammunation_buy(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2, int x, int t, String[][] str_arr_w, ArchAngel archAngel, ReadText readText)
	{
		int i3 = 190;
		int i4 = 3;
		String str2 = null;
		int i2 = paramInt1 / 100 - 1;
		int i1 = paramInt1 % 100;
		readText.processTxt(i1);
		String str1 = readText.buildString();
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
		archAngel.readMedia.drawImageSwitch(paramGraphics, 13, 131, 60, 40, i1 - 1, paramInt2);
		switch (paramInt2)
		{
		case 0: 
			x = 0;
			str2 = "MISSILE";
			t = archAngel.gameSetting.q;
			break;
		case 1: 
			x = 1;
			i2 = 0;
			str2 = "PLASMA CANON";
			t = archAngel.gameSetting.v;
			break;
		case 2: 
			x = 2;
			i2 = 1;
			str2 = "ARMOR";
			t = archAngel.gameSetting.l;
			break;
		}
		t += archAngel.gameSetting.a;
		archAngel.readMedia.drawGraphicStr40_122(paramGraphics, 100, 140, str2);
		for (int i5 = 0; i5 < i4; i5++)
		{
			archAngel.readMedia.drawStringGraphic(paramGraphics, 130, i3, str_arr_w[i2][i5] + ":" + readText.int_arr_m[i5], x);
			i3 += 11;
		}
		if (paramBoolean)
		{
			archAngel.readMedia.drawStringGraphic(paramGraphics, 130, 235, "MY MONEY:", x);
			archAngel.readMedia.drawStringGraphic(paramGraphics, 130, 245, "" + archAngel.gameSetting.a, x);
		}
	}
	
}
