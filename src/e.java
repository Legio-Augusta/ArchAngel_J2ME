import java.io.InputStream;

public class e
{
  public int a = 1;
  public int b = 0;
  public boolean c = false;
  public boolean d = false;
  public boolean e = false;
  public boolean f = false;
  public int g = 1;
  public int h = 1;
  public int i;
  public int j;
  public int k;
  public byte[] l = new byte['?']; // ASCII '?' = 63
  public int[] m = new int[9];
  public int n = -1;
  public int o = -1;
  
  public boolean a(int paramInt)
  {
    int i1 = 0;
    if (this.n != paramInt)
    {
      if (this.c) {
        this.a = this.g;
      } else if (this.d) {
        this.a = this.h;
      } else {
        this.a = 1;
      }
      if (this.e) {
        this.a = 5;
      }
      this.b = 0;
      this.n = paramInt;
    }
    this.o = 0;
    for (int i2 = 0; i2 < 9; i2++) {
      this.m[i2] = 0;
    }
    this.k = c(paramInt); // 1, 2 => infi loop, 3 10 4 ...
    if (this.k == -1)
    {
      this.k = 0;
      return false;
    }
    while (a('+')) { // boolean a (String str)
    	// Exception on i1 = 8 or 9
    	System.out.println(" bool e.a i1= " + i1 + " k= " + this.k);
    	if (i1 <= 8) {
    		this.o = (this.m[(i1++)] = b(this.k));
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
  public int b(int paramInt)
  {
    int i2 = 0;
    int i1 = 0; // dungnv
    for (i1 = paramInt; i1 < this.j; i1++) {
      if ((this.l[i1] >= 48) && (this.l[i1] <= 57)) {
        break;
      }
    }
    while (i1 < this.j)
    {
      if ((this.l[i1] >= 48) && (this.l[i1] > 57)) { // ASCII 0-9
        break;
      }
      i2 *= 10;
      i2 += this.l[i1] - 48; // byte - 48 (x48 = 0, x57 = 9)
      i1++;
    }
    this.k = i1;
    return i2;
  }
  
  public void a(String paramString) // Load text seem has problem, it not shown on screen
  {
    String str = "/text/" + paramString + ".txt";
    try
    {
      InputStream localInputStream = getClass().getResourceAsStream(str);
      this.j = localInputStream.read(this.l);
      if(this.j < this.l.length){
    	  this.l[this.j] = 0;
      }
      localInputStream.close();
    }
    catch (Exception localException) {}
    b();
    this.k = 0;
  }
  
  public String a()
  {
    String str = null;
    int i1 = 0; // dungnv
    for (i1 = this.k; i1 < this.j; i1++)
    {
      if (this.l[i1] == 60)
      {
        this.k = i1;
        return null;
      }
      if (this.l[i1] == 10)
      {
        str = new String(this.l, this.k, i1 - this.k);
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
  public int c(int paramInt)
  {
    for (int i1 = 0; i1 < this.j; i1++) {
      if ((this.l[i1] == 60) && (b(i1) == paramInt)) {
        return i1;
      }
    }
    return -1;
  }
  
  public void b()
  {
    this.i = 0;
    for (int i1 = 0; i1 < this.j; i1++) {
      if (this.l[i1] == 10) {
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
  public boolean a(char paramChar)
  {
	int i1 = 0; // dungnv
    for (i1 = this.k; i1 < this.j; i1++) // int i1
    {
//      System.out.println(" e this.l arr : " + i1 + " " + this.l[i1]);
      if (this.l[i1] == 10)
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
      if (this.l[i1] == paramChar) {
        break;
      }
    }
    this.k = i1;
    return true;
  }
}
