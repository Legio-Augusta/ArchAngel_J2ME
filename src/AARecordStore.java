import java.io.PrintStream;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class AARecordStore
{
  private RecordStore a = null;
  private int b = 0;
  private boolean c = false;
  public byte[] d = null;
  
  public void a()
  {
    try
    {
      if (this.c) {
        this.a.addRecord(this.d, 0, this.d.length);
      }
      this.a.closeRecordStore();
      this.a = null;
    }
    catch (RecordStoreException localRecordStoreException) {}
    this.d = null;
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
	paramBoolean = true; // Try to create new if not exist
    try
    {
      if (paramBoolean) {
        RecordStore.deleteRecordStore(paramString);
      }
    }
    catch (Exception localException) {}
    this.c = paramBoolean;
    try
    {
      this.a = RecordStore.openRecordStore(paramString, paramBoolean);
      this.b = 0;
    }
    catch (RecordStoreException localRecordStoreException1)
    {
      System.out.println("RMS.open():" + localRecordStoreException1.toString());
      return false;
    }
    if (paramBoolean) {
      this.d = new byte[100];
    } else {
      try
      {
        this.d = this.a.getRecord(1);
      }
      catch (RecordStoreException localRecordStoreException2) {}
    }
    return true;
  }
  
  public int b()
  {
    int i = 0;
    i = this.d[this.b] & 0xFF;
    i += ((this.d[(this.b + 1)] & 0xFF) << 8);
    i += ((this.d[(this.b + 2)] & 0xFF) << 16);
    i += ((this.d[(this.b + 3)] & 0xFF) << 24);
    this.b += 4;
    return i;
  }
  
  public void a(int paramInt)
  {
    this.d[this.b] = ((byte)(paramInt & 0xFF));
    this.d[(this.b + 1)] = ((byte)(paramInt >> 8 & 0xFF));
    this.d[(this.b + 2)] = ((byte)(paramInt >> 16 & 0xFF));
    this.d[(this.b + 3)] = ((byte)(paramInt >> 24 & 0xFF));
    this.b += 4;
  }
}
