package pl.artrix.toniemojaaplikacja;

import androidx.room3.Entity;
import androidx.room3.PrimaryKey;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa, kategoria;
    public int minimalnaliczbaOsob;
    public int maksliczbaOsob;
    public int kategoriaWiekowa;

    public Gra(String nazwa, String kategoria, int minimalnaliczbaOsob, int maksliczbaOsob, int kategoriaWiekowa) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.minimalnaliczbaOsob = minimalnaliczbaOsob;
        this.maksliczbaOsob = maksliczbaOsob;
        this.kategoriaWiekowa = kategoriaWiekowa;
    }
}
