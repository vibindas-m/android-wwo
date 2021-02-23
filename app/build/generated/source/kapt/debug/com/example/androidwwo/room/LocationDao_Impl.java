package com.example.androidwwo.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LocationDao_Impl implements LocationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LocationData> __insertionAdapterOfLocationData;

  private final EntityDeletionOrUpdateAdapter<LocationData> __deletionAdapterOfLocationData;

  public LocationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocationData = new EntityInsertionAdapter<LocationData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `location_data` (`areaName`,`country`,`region`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationData value) {
        if (value.getAreaName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAreaName());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountry());
        }
        if (value.getRegion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRegion());
        }
      }
    };
    this.__deletionAdapterOfLocationData = new EntityDeletionOrUpdateAdapter<LocationData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `location_data` WHERE `areaName` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationData value) {
        if (value.getAreaName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAreaName());
        }
      }
    };
  }

  @Override
  public void insertAll(final LocationData... locationData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLocationData.insert(locationData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final LocationData locationData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfLocationData.handle(locationData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<LocationData> getAll() {
    final String _sql = "SELECT * FROM location_data";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAreaName = CursorUtil.getColumnIndexOrThrow(_cursor, "areaName");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
      final List<LocationData> _result = new ArrayList<LocationData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LocationData _item;
        final String _tmpAreaName;
        _tmpAreaName = _cursor.getString(_cursorIndexOfAreaName);
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        final String _tmpRegion;
        _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
        _item = new LocationData(_tmpAreaName,_tmpCountry,_tmpRegion);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
