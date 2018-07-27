
public class KeyPressHelper {
	public KeyPressHelper() {
		
	}
	
	public void handleKeyPressed(int paramInt, int gameAction, int l, int q, boolean bool_v, ArchAngel archAngel)
	{
		if (archAngel.bool_h) {
			return;
		}
		switch (archAngel.screen)
		{
		case 0: 
			if (archAngel.z == 1) {
				archAngel.z += 1;
			}
			break;
		case 3: 
			if (archAngel.z == 2) {
				switch (paramInt)
				{
				case -4: 
				case -2: 
					l += 1;
					if (l > 1) {
						l = 0;
					}
					archAngel.playSound("s_menu_move", 1);
					break;
				case -3: 
				case -1: 
					l += -1;
					if (l < 0) {
						l = 1;
					}
					archAngel.playSound("s_menu_move", 1);
					break;
				case -7: // GAME_B RIGHT_UP
				case -5: 
					if (l == 0)
					{
						archAngel.z += 1;
						l = 0;
					}
					else if (archAngel.bool_w == true)
					{
						if (archAngel.e()) {
							archAngel.z = 7;
						} else {
							archAngel.z = 6;
						}
					}
					break;
				}
			} else if (archAngel.z == 4) {
				switch (paramInt)
				{
				case -4: 
				case -3: 
				case -2: 
				case -1: 
					archAngel.ah = (1 - archAngel.ah);
					archAngel.playSound("s_menu_move", 1);
					break;
				case -7: 
				case -5: 
					archAngel.readMedia.readMediaStream("open");
					archAngel.readMedia.reloadImageArr(0, 29);
					archAngel.readMedia.closeInputStream();
					archAngel.z += 1;
					break;
				}
			}
			archAngel.bool_q = true;
			break;
		case 26: 
			if ((archAngel.z > 1) && (archAngel.z < 18)) {
				switch (paramInt)
				{
				case -7: 
				case -5: 
					archAngel.z += 1;
					break;
				case -6: 
					archAngel.z = 18;
				}
			}
			break;
		case 5: 
			if (archAngel.z == 3) {
				switch (paramInt)
				{
				case -4: 
				case -2: 
				case 56: 
					l += 1;
					if (l > 4) {
						l = 0;
					}
					archAngel.playSound("s_menu_move", 1);
					archAngel.bool_e = true;
					break;
				case -3: 
				case -1: 
				case 50: 
					l += -1;
					if (l < 0) {
						l = 4;
					}
					archAngel.playSound("s_menu_move", 1);
					archAngel.bool_e = true;
					break;
				case -6: 
					archAngel.screen = 9;
					break;
				case -7: 
				case -5: 
					if (l == 5) {
						archAngel.screen = 4;
					} else {
						archAngel.screen = ((byte)(8 + l));
					}
				}
			}
			break;
		case 2: 
			break;
		case 8: 
			if (((paramInt == -7) || (paramInt == -5)) && (archAngel.z > 0)) {
				archAngel.z += 1;
			}
			break;
		case 9: 
			if (archAngel.z >= 11) {
				if ((paramInt == -7) || (paramInt == -5))
				{
					if (archAngel.z > 0) {
						archAngel.z += 1;
					}
				}
				else if (paramInt == -6) {
					archAngel.z = 999;
				}
			}
			break;
		case 25: 
			if ((archAngel.z == 4) && (archAngel.bool_m == true))
			{
				if ((archAngel.mainGameScreen.bi == 1) && (paramInt != 53) && (paramInt != -5))
				{
					archAngel.mainGameScreen.play_s_gun(false);
					archAngel.stopSound();
				}
				if ((archAngel.mainGameScreen.bi == 3) && (archAngel.ag != 1) && (paramInt != 53) && (paramInt != -5))
				{
					keyReleased(53, archAngel);
					archAngel.mainGameScreen.play_s_plasma(false);
					archAngel.stopSound();
				}
				if ((paramInt == 53) || (paramInt == -5))
				{
					keyReleased(50, archAngel);
					archAngel.mainGameScreen.setup3();
					archAngel.mainGameScreen.ba = 0;
					archAngel.mainGameScreen.a9 = 0;
					archAngel.mainGameScreen.bd = 0;
				}
				switch (paramInt)
				{
				case 49: 
					archAngel.mainGameScreen.simple_90(true);
					archAngel.mainGameScreen.ba = 3;
					break;
				case 51: 
					archAngel.mainGameScreen.simple_90(false);
					archAngel.mainGameScreen.ba = 4;
					break;
				case 53: 
					if ((archAngel.mainGameScreen.bi == 1) && (archAngel.bool_m == true)) {
						archAngel.mainGameScreen.play_s_gun(true);
					}
					if ((archAngel.mainGameScreen.bi == 3) && (archAngel.bool_n == true))
					{
						archAngel.mainGameScreen.bool_bh = false;
						archAngel.mainGameScreen.play_s_plasma(true);
					}
					break;
				case 57: 
					if (archAngel.mainGameScreen.bi == 1) {
						archAngel.mainGameScreen.play_missile_sound();
					}
					break;
				case 50: 
					archAngel.mainGameScreen.simple_bool(true);
					archAngel.mainGameScreen.a9 = 1;
					break;
				case 56: 
					archAngel.mainGameScreen.simple_bool(false);
					archAngel.mainGameScreen.a9 = 2;
					break;
				case 52: 
					archAngel.mainGameScreen.left_right(true);
					archAngel.mainGameScreen.ba = 1;
					break;
				case 54: 
					archAngel.mainGameScreen.left_right(false);
					archAngel.mainGameScreen.ba = 2;
					break;
				case 48: 
					if (archAngel.mainGameScreen.bi == 3)
					{
						archAngel.mainGameScreen.bool_az = false;
						if (archAngel.gameSetting.t < archAngel.gameSetting.r) {
							archAngel.playSound("s_reload", 1);
						}
						archAngel.mainGameScreen.bool_bh = true;
					}
					break;
				case 55: 
				default: 
					switch (paramInt)
					{
					case -2: 
						archAngel.mainGameScreen.simple_bool(false);
						archAngel.mainGameScreen.a9 = 2;
						break;
					case -1: 
						archAngel.mainGameScreen.simple_bool(true);
						archAngel.mainGameScreen.a9 = 1;
						break;
					case -4: 
						archAngel.mainGameScreen.left_right(false);
						archAngel.mainGameScreen.ba = 2;
						break;
					case -3: 
						archAngel.mainGameScreen.left_right(true);
						archAngel.mainGameScreen.ba = 1;
						break;
					case -7: 
						if (archAngel.bool_l) {
							archAngel.screen = 13;
						}
						break;
					case -6: 
						if (archAngel.bool_l) {
							archAngel.screen = 14;
						}
						break;
					case -5: 
						if ((archAngel.mainGameScreen.bi == 1) && (archAngel.bool_m == true)) {
							archAngel.mainGameScreen.play_s_gun(true);
						}
						if ((archAngel.mainGameScreen.bi == 3) && (archAngel.bool_n == true))
						{
							archAngel.mainGameScreen.bool_bh = false;
							archAngel.mainGameScreen.play_s_plasma(true);
						}
						break;
					}
				}
			}
			break;
		case 11: 
			if (paramInt == -6)
			{
				if (archAngel.z < 10) {
					archAngel.z = archAngel.p;
				}
			}
			else
			{
				int i2 = -1;
				if ((paramInt >= 49) && (paramInt <= 51))
				{
					if (archAngel.z < 10) {
						i2 = paramInt - 49 + 1;
					}
				}
				else
				{
					switch (paramInt)
					{
					case -3: 
					case -2: 
						if (archAngel.z < 10)
						{
							archAngel.readText.a += 1;
							archAngel.x = -1;
							archAngel.bool_g = true;
						}
						break;
					case -4: 
					case -1: 
						if (archAngel.z < 10)
						{
							archAngel.readText.a += -1;
							archAngel.x = -1;
							archAngel.bool_g = true;
						}
						break;
					case -7: 
					case -5: 
						if (archAngel.z == 5) {
							i2 = archAngel.readText.a;
						} else {
							i2 = 1;
						}
						break;
					}
					if (archAngel.readText.a <= 0) {
						archAngel.readText.a = archAngel.readText.b;
					}
					if (archAngel.readText.a > archAngel.readText.b) {
						archAngel.readText.a = 1;
					}
				}
				if ((i2 > 0) && (archAngel.readText.int_arr_m[(i2 - 1)] > 0))
				{
					archAngel.z = archAngel.readText.int_arr_m[(i2 - 1)];
					archAngel.x = 0;
				}
			}
			break;
		case 12: 
			System.gc();
			if (bool_v == true)
			{
				archAngel.x = -1;
				if ((paramInt == 50) || (paramInt == -5) || (paramInt == 49) || (paramInt == -7)) {
					archAngel.a = 1;
				}
				if (((paramInt == 50) || (paramInt == 49) || (paramInt == -5) || (paramInt == -7) || (paramInt == -6)) && (archAngel.bool_s)) {
					archAngel.bool_s = false;
				}
				if ((archAngel.z == 100) || (archAngel.z == 200) || (archAngel.z == 300)) {
					switch (paramInt)
					{
					case -1: 
						if (archAngel.a == 1)
						{
							archAngel.a = 7;
							archAngel.bool_r = true;
						}
						else
						{
							archAngel.a += 8;
							archAngel.a = ((archAngel.a += -1) % 8);
						}
						break;
					case -2: 
						if (archAngel.a == 7) {
							archAngel.a = 1;
						} else {
							archAngel.a = (++archAngel.a % 8);
						}
						break;
					}
				}
				if (((archAngel.z == 111) || (archAngel.z == 211) || (archAngel.z == 311)) && ((paramInt == -7) || (paramInt == -5)))
				{
					archAngel.a = 1;
					if (archAngel.p > 0) {
						archAngel.z = archAngel.p;
					}
				}
				archAngel.bool_q = true;
			}
			if (bool_v == true) {
				if (paramInt == -6)
				{
					archAngel.a = 1;
					if (archAngel.p > 0) {
						archAngel.z = archAngel.p;
					}
				}
				else if ((archAngel.z != 111) && (archAngel.z != 211) && (archAngel.z != 311))
				{
					read_text_helper(paramInt, gameAction, archAngel);
				}
			}
			break;
		case 7: 
			if ((paramInt == -1) || (paramInt == -2)) {
				archAngel.c = (1 - archAngel.c);
			}
			if ((paramInt == -7) || (paramInt == -5)) {
				if (archAngel.c == 0) {
					archAngel.z = 2;
				} else {
					archAngel.z = 3;
				}
			}
			break;
		case 4: 
			if ((archAngel.z == 1) && (paramInt == -6)) {
				archAngel.screen = 5;
			}
			break;
		case 1: 
		case 10: 
			if (archAngel.z == 1) {
				archAngel.readText.bool_e = false;
			}
			if (paramInt == -6)
			{
				if (archAngel.screen == 1)
				{
					archAngel.z = 10;
				}
				else if ((archAngel.z == 100) || (archAngel.z == 200) || (archAngel.z == 300))
				{
					archAngel.z = 50;
				}
				else if (((archAngel.z >= 101) && (archAngel.z <= 104)) || ((archAngel.z >= 201) && (archAngel.z <= 205)) || ((archAngel.z >= 301) && (archAngel.z <= 304)))
				{
					archAngel.z += -1;
				}
				else if (archAngel.p > 0)
				{
					if (archAngel.z == 61) {
						archAngel.readText.bool_e = true;
					}
					archAngel.z = archAngel.p;
				}
			}
			else if (archAngel.bool_v) {
				read_text_helper(paramInt, gameAction, archAngel);
			}
			archAngel.bool_w = true;
			break;
		case 13: 
			if ((paramInt != -6) && (archAngel.bool_v))
			{
				read_text_helper(paramInt, gameAction, archAngel);
				if ((archAngel.mainGameScreen.bool_az == true) && (q == 1) && (archAngel.readText.a == 1) && ((paramInt == -7) || (paramInt == -5) || (paramInt == 49))) {
					archAngel.playSound("s_plasma", 0);
				}
				if ((archAngel.readText.a == 1) && ((paramInt == -7) || (paramInt == -5) || (paramInt == 49)))
				{
					archAngel.mainGameScreen.setup3();
					archAngel.mainGameScreen.ba = 0;
					archAngel.mainGameScreen.a9 = 0;
					archAngel.mainGameScreen.bd = 0;
				}
			}
			break;
		case 6: 
			if ((paramInt == -7) && ((archAngel.z == 2) || (archAngel.z == 4))) {
				archAngel.z += 1;
			}
			break;
		case 14: 
			if ((paramInt == -7) || (paramInt == -5) || (paramInt == 35))
			{
				archAngel.z += 1;
				if (archAngel.mainGameScreen.bool_az == true) {
					archAngel.playSound("s_plasma", 0);
				}
				archAngel.mainGameScreen.setup3();
				archAngel.mainGameScreen.ba = 0;
				archAngel.mainGameScreen.a9 = 0;
				archAngel.mainGameScreen.bd = 0;
			}
			break;
		case 27: 
			if ((archAngel.z > 1) && (archAngel.z < 15)) {
				switch (paramInt)
				{
				case -7: 
				case -5: 
					archAngel.z += 1;
					break;
				case -6: 
					archAngel.z = 15;
				}
			}
			break;
		}
	}
	
	public void keyReleased(int paramInt, ArchAngel archAngel)
	{
		switch (archAngel.screen)
		{
		case 25: 
			if (archAngel.mainGameScreen.bi == 1)
			{
				if ((paramInt == -5) || (paramInt == 53))
				{
					archAngel.mainGameScreen.play_s_gun(false);
					archAngel.stopSound();
				}
			}
			else if ((archAngel.mainGameScreen.bi == 3) && ((paramInt == -5) || (paramInt == 53)) && (archAngel.ag != 1))
			{
				archAngel.mainGameScreen.play_s_plasma(false);
				archAngel.stopSound();
			}
			if ((paramInt == 49) || (paramInt == 50) || (paramInt == 51) || (paramInt == 52) || (paramInt == 54) || (paramInt == 57) || (paramInt == -1) || (paramInt == -2) || (paramInt == -4) || (paramInt == -3))
			{
				archAngel.mainGameScreen.setup3();
				archAngel.mainGameScreen.ba = 0;
				archAngel.mainGameScreen.a9 = 0;
				archAngel.mainGameScreen.bd = 0;
			}
			break;
		}
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
}
