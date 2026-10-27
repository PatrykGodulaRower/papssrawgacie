package pl.artrix.toniemojaaplikacja;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

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
        @Query("SELECT nazwa from gry where minimalnaliczbaOsob = :ile")
    public List<String> zwrocNazwyGierDlaLiczbyOsob(int ile);
    }