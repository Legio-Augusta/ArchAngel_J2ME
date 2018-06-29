public class GameSettings
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public String k;
  public int l;
  public int m;
  public int n;
  public int o;
  public String p;
  public int q;
  public int r;
  public int s;
  public int t;
  public String u;
  public int v;
  
  public void a()
  {
    this.j = this.g;
    this.o = this.m;
    this.t = this.r;
  }
  
  public void readRSSetting(AARecordStore recordStore)
  {
    this.a = recordStore.returnByteCalc();
    this.b = recordStore.returnByteCalc();
    this.d = recordStore.returnByteCalc();
    this.e = recordStore.returnByteCalc();
    this.f = recordStore.returnByteCalc();
  }
  
  public void loadDataFromReadTxt(ReadText readText)
  {
    readText.processTxt(this.d);
    this.n = readText.int_arr_m[0];
    this.m = readText.int_arr_m[1];
    this.q = readText.int_arr_m[2];
    this.p = readText.buildString();
  }
  
  public void readArmPlasmaMissile(ReadText readText)
  {
    readText.readTextFromStream("arm");
    d(readText);
    readText.readTextFromStream("plasma");
    c(readText);
    readText.readTextFromStream("missile");
    loadDataFromReadTxt(readText);
  }
  
  public void a(int paramInt)
  {
    this.j -= (paramInt - this.h < 1 ? 1 : paramInt - this.h);
  }
  
  public void c(ReadText readText)
  {
    readText.processTxt(this.e);
    this.s = readText.int_arr_m[0];
    this.r = readText.int_arr_m[1];
    this.v = readText.int_arr_m[2];
    this.u = readText.buildString();
  }
  
  public void d(ReadText readText)
  {
    readText.processTxt(this.f);
    this.g = 1000;
    this.h = readText.int_arr_m[0];
    this.i = readText.int_arr_m[1];
    this.l = readText.int_arr_m[2];
    this.k = readText.buildString();
  }
  
  public void b()
  {
    this.a = 0;
    this.c = -1;
    this.b = 0;
    this.d = (this.e = this.f = 1);
  }
  
  public void calcFromRecord(AARecordStore recordStore)
  {
    recordStore.byteCalculate(this.a);
    recordStore.byteCalculate(this.b);
    recordStore.byteCalculate(this.d);
    recordStore.byteCalculate(this.e);
    recordStore.byteCalculate(this.f);
  }
}
