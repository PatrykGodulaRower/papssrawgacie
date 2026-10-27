package pl.artrix.toniemojaaplikacja;

import androidx.room3.Dao;
import androidx.room3.Delete;
import androidx.room3.Insert;
import androidx.room3.Query;
import androidx.room3.Update;

import java.util.List;

@Dao
    public interface GraDAO {
        @Insert
        public void wstawGreDoBazy(Gra gra);

        @Insert
        public void wstawGryDoBazy(Gra ... gra);

        @Delete
        public void uzunzBazy(Gra gra);

        @Update
    public void aktuaGry(Gra gra);

        @Query("SELECT * from gry")
    public List<Gra> zwrocWszystykieGry();
        @Query("SELECT nazwa from gry where minLiczbaOsob = :ile")
    public List<String> zwrocNazwyGierDlaLiczbyOsob(int ile);
    }