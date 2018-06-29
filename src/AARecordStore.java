import java.io.PrintStream;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class AARecordStore
{
  private RecordStore recordStore = null;
  private int int_b = 0;
  private boolean flag_c = false;
  public byte[] byte_arr_d = null;
  
  public void addScore()
  {
    try
    {
      if (this.flag_c) {
        this.recordStore.addRecord(this.byte_arr_d, 0, this.byte_arr_d.length);
      }
      this.recordStore.closeRecordStore();
      this.recordStore = null;
    }
    catch (RecordStoreException localRecordStoreException) {}
    this.byte_arr_d = null;
  }
  
  public boolean readRecordStore(String paramString, boolean paramBoolean)
  {
	paramBoolean = true; // Try to create new if not exist
    try
    {
      if (paramBoolean) {
        RecordStore.deleteRecordStore(paramString);
      }
    }
    catch (Exception localException) {}
    this.flag_c = paramBoolean;
    try
    {
      this.recordStore = RecordStore.openRecordStore(paramString, paramBoolean);
      this.int_b = 0;
    }
    catch (RecordStoreException localRecordStoreException1)
    {
      System.out.println("RMS.open():" + localRecordStoreException1.toString());
      return false;
    }
    if (paramBoolean) {
      this.byte_arr_d = new byte[100];
    } else {
      try
      {
        this.byte_arr_d = this.recordStore.getRecord(1);
      }
      catch (RecordStoreException localRecordStoreException2) {}
    }
    return true;
  }
  
  public int returnByteCalc()
  {
    int i = 0;
    i = this.byte_arr_d[this.int_b] & 0xFF;
    i += ((this.byte_arr_d[(this.int_b + 1)] & 0xFF) << 8);
    i += ((this.byte_arr_d[(this.int_b + 2)] & 0xFF) << 16);
    i += ((this.byte_arr_d[(this.int_b + 3)] & 0xFF) << 24);
    this.int_b += 4;
    return i;
  }
  
  public void byteCalculate(int paramInt)
  {
    this.byte_arr_d[this.int_b] = ((byte)(paramInt & 0xFF));
    this.byte_arr_d[(this.int_b + 1)] = ((byte)(paramInt >> 8 & 0xFF));
    this.byte_arr_d[(this.int_b + 2)] = ((byte)(paramInt >> 16 & 0xFF));
    this.byte_arr_d[(this.int_b + 3)] = ((byte)(paramInt >> 24 & 0xFF));
    this.int_b += 4;
  }
}
