import java.io.InputStream;

public class ReadText
{
  public int a = 1;
  public int b = 0;
  public boolean bool_c = false;
  public boolean bool_d = false;
  public boolean bool_e = false;
  public boolean bool_f = false;
  public int g = 1;
  public int h = 1;
  public int i;
  public int j;
  public int k;
  public byte[] byte_arr_l = new byte['?']; // ASCII '?' = 63
  public int[] int_arr_m = new int[9];
  public int n = -1;
  public int o = -1;
  
  public boolean processTxt(int paramInt)
  {
    int i1 = 0;
    if (this.n != paramInt)
    {
      if (this.bool_c) {
        this.a = this.g;
      } else if (this.bool_d) {
        this.a = this.h;
      } else {
        this.a = 1;
      }
      if (this.bool_e) {
        this.a = 5;
      }
      this.b = 0;
      this.n = paramInt;
    }
    this.o = 0;
    for (int i2 = 0; i2 < 9; i2++) {
      this.int_arr_m[i2] = 0;
    }
    this.k = extractValueFromTxt(paramInt); // 1, 2 => infi loop, 3 10 4 ...
    if (this.k == -1)
    {
      this.k = 0;
      return false;
    }
    while (bool_ascii_helper('+')) { // boolean a (String str)
    	// Exception on i1 = 8 or 9
    	// System.out.println(" bool e.a i1= " + i1 + " k= " + this.k);
    	if (i1 <= 8) {
    		this.o = (this.int_arr_m[(i1++)] = calcIntCharFromASCII(this.k));
    	} else {    		
    		break;
    	}
    }
    this.k += 2;
    return true;
  }
  
  /*
   * Guest: Calculate integer value from byte (ASCII)
   */
  public int calcIntCharFromASCII(int paramInt)
  {
    int i2 = 0;
    int i1 = 0; // dungnv
    for (i1 = paramInt; i1 < this.j; i1++) {
      if ((this.byte_arr_l[i1] >= 48) && (this.byte_arr_l[i1] <= 57)) {
        break;
      }
    }
    while (i1 < this.j)
    {
      if ((this.byte_arr_l[i1] >= 48) && (this.byte_arr_l[i1] > 57)) { // ASCII 0-9
        break;
      }
      i2 *= 10;
      i2 += this.byte_arr_l[i1] - 48; // byte - 48 (x48 = 0, x57 = 9)
      i1++;
    }
    this.k = i1;
    return i2;
  }
  
  public void readTextFromStream(String paramString) // Load text seem has problem, it not shown on screen
  {
    String str = "/text/" + paramString + ".txt";
    try
    {
      InputStream localInputStream = getClass().getResourceAsStream(str);
      this.j = localInputStream.read(this.byte_arr_l);
      if(this.j < this.byte_arr_l.length){
    	  this.byte_arr_l[this.j] = 0;
      }
      localInputStream.close();
    }
    catch (Exception localException) {}
    byte_arr_helper();
    this.k = 0;
  }
  
  public String buildString()
  {
    String str = null;
    int i1 = 0; // dungnv
    for (i1 = this.k; i1 < this.j; i1++)
    {
      if (this.byte_arr_l[i1] == 60)
      {
        this.k = i1;
        return null;
      }
      if (this.byte_arr_l[i1] == 10)
      {
        str = new String(this.byte_arr_l, this.k, i1 - this.k);
        break;
      }
    }
    this.k = (i1 + 1);
    return str;
  }
  
  /*
   * l[i1] == '<' && b(i1) == paramInt 
   * Calculate integer value inside <?> mark.
   * Return index i1? i1 is not simple index (increment) it may be has value
   */
  public int extractValueFromTxt(int paramInt)
  {
    for (int i1 = 0; i1 < this.j; i1++) {
      if ((this.byte_arr_l[i1] == 60) && (calcIntCharFromASCII(i1) == paramInt)) {
        return i1;
      }
    }
    return -1;
  }
  
  public void byte_arr_helper()
  {
    this.i = 0;
    for (int i1 = 0; i1 < this.j; i1++) {
      if (this.byte_arr_l[i1] == 10) {
        this.i += 1;
      }
    }
    this.n = -1;
  }
  /**
   * @param paramChar
   * @return
   * eg. + in text "<100>+101 The radar is situated"
   * use : while (a('+'))
   * byte array this.l; &#43 is Dec value of '+' ASCII
   */
  public boolean bool_ascii_helper(char paramChar)
  {
	int i1 = 0; // dungnv
    for (i1 = this.k; i1 < this.j; i1++) // int i1
    {
//      System.out.println(" e this.l arr : " + i1 + " " + this.l[i1]);
      if (this.byte_arr_l[i1] == 10)
      {
        this.k = (i1 - 1);
        return false;
      }
      // this.l is byte array. this.l[i1] is char ? if not then why compare it with paramChar ?
      // if this.l[i1] is char then why it can assigned/compared to 10 ? 
      // May be byte-char conversion here
      // A byte is 8 bits, a char is 16 bits 
      // 60 Dec: '<' 
      // 10: 'NL' new line to 90: 'Z' in AZ-1 (ms1.txt)
      if (this.byte_arr_l[i1] == paramChar) {
        break;
      }
    }
    this.k = i1;
    return true;
  }
}
