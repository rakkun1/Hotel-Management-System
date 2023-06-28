class Storage
{
    public String Name;
    public String Phoneno;
    public String Password;
    public long Days;
    public int RoomNo;
    public double FinalLunch;
    public int NoLunch;
    public double FinalDinner;
    public int NoDinner;
    public double FinalSpa;
    public int NoSpa;
    public double FinalMini;
    public int NoMini;
    public double FinalGames;
    public int NoGames;    
    Booking ret=new Booking();
    Update_Stay ret2=new Update_Stay();
    Check_Out ret3=new Check_Out();
    public void Name(String s)
   {
        ret.Name=s;
  }
    public String returnname()
  {return  ret.Name;}
  
    public void Phoneno(String pn)
    {
        ret.Phoneno=pn;;
  }
  public String returnphoneno()
  {return  ret.Phoneno;}
  
  public void Password(String pw)
   {
        ret2.Password=pw;
  }
    public String returnpassword()
  {return  ret2.Password;}
  
  public void Days(long nd)
   {
        ret2.Days=nd;
  }
    public long returndays()
  {return  ret2.Days;}
  
    public void RoomNo(int rn)
   {
        ret2.RoomNo=rn;
  }
    public int returnroomno()
  {return  ret2.RoomNo;}
  
   public void FinalLunch(double fl)
   {
        ret3.FinalLunch=fl;
  }
    public double returnflunch()
  {return  ret3.FinalLunch;}
  
  public void NoLunch(int nl)
    {
        ret3.NoLunch=nl;;
  }
  public int returnnlunch()
  {return  ret3.NoLunch;}
  
    public void FinalDinner(double fd)
    {
        ret3.FinalDinner=fd;;
  }
  public double returnfdinner()
  {return  ret3.FinalDinner;}
  
  public void NoDinner(int nd)
   {
        ret3.NoDinner=nd;
  }
    public int returnndinner()
  {return  ret3.NoDinner;}
  
  public void FinalSpa(double fs)
   {
        ret3.FinalSpa=fs;
  }
    public double returnfspa()
  {return  ret3.FinalSpa;}
  
    public void NoSpa(int ns)
   {
        ret3.NoSpa=ns;
  }
    public int returnnspa()
  {return  ret3.NoSpa;}
  
    public void FinalGames(double fg)
   {
        ret3.FinalGames=fg;
  }
    public double returnfgames()
  {return  ret3.FinalGames;}
  
      public void NoGames(int ng)
   {
        ret3.NoGames=ng;
  }
    public int returnngames()
  {return  ret3.NoGames;}
  
    public void FinalMini(double fm)
   {
        ret3.FinalMini=fm;
  }
    public double returnfmini()
  {return  ret3.FinalMini;}
  
      public void NoMini(int nm)
   {
        ret3.NoMini=nm;
  }
    public int returnnmini()
  {return  ret3.NoMini;}
  
      public void ftotal(double ft)
   {
        ret3.ftotal=ft;
  }
    public double returnftotal()
  {return  ret3.ftotal;}
  
      public void amtotal(double amit)
   {
        ret3.amtotal=amit;
  }
    public double returnamtotal()
  {return  ret3.amtotal;}
}