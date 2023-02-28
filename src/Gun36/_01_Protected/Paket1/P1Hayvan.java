package Gun36._01_Protected.Paket1;

public class P1Hayvan {

    public String ad;//her paketten, her yerden erişilebilir
    int yas;//default, sadece kendi paketinden
    protected String cinsi;//default gibi çalışır, extra bir durumda diğer paketten de erişilebilir
    private String renk; //sadece kendi classından


}
